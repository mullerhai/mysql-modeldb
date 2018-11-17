package edu.mit.csail.db.ml.server.storage;

import jooq.mysql.gen.Tables;
import jooq.mysql.gen.tables.records.HyperparameterRecord;
import jooq.mysql.gen.tables.records.TransformerspecRecord;
import modeldb.HyperParameter;
import modeldb.ResourceNotFoundException;
import modeldb.TransformerSpec;
import org.jooq.DSLContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class TransformerSpecDao {
  protected  final static Logger logger =LoggerFactory.getLogger(TransformerSpecDao.class);
  public static TransformerspecRecord store(TransformerSpec s, int experimentId, DSLContext ctx) {
    TransformerspecRecord rec = ctx
      .selectFrom(Tables.TRANSFORMERSPEC)
      .where(Tables.TRANSFORMERSPEC.ID.eq(s.id))
      .fetchOne();

    if (rec != null) {
      return rec;
    }

    TransformerspecRecord sRec = ctx.newRecord(Tables.TRANSFORMERSPEC);
    sRec.setId(null);
    sRec.setExperimentrun(experimentId);
    sRec.setTag(s.tag);
    sRec.setTransformertype(s.transformerType);
    sRec.store();

    s.hyperparameters.forEach(hp -> {
      logger.info(hp.toString());
      HyperparameterRecord hpRec = ctx.newRecord(Tables.HYPERPARAMETER);
      hpRec.setId(null);
      hpRec.setSpec(sRec.getId());
      hpRec.setParamname(hp.name);
      hpRec.setParamtype(hp.type);
      hpRec.setParamvalue(hp.value);
      hpRec.setParamminvalue(Double.valueOf(hp.min));
      hpRec.setParammaxvalue(Double.valueOf(hp.max/1000));
      hpRec.setExperimentrun(experimentId);
      hpRec.store();
      hpRec.getId();
    });

    sRec.getId();
    return sRec;
  }

  public static TransformerSpec read(int sId, DSLContext ctx) throws ResourceNotFoundException {
    TransformerspecRecord rec =
      ctx.selectFrom(Tables.TRANSFORMERSPEC).where(Tables.TRANSFORMERSPEC.ID.eq(sId)).fetchOne();
    List<HyperParameter> hps = ctx.selectFrom(Tables.HYPERPARAMETER)
      .where(Tables.HYPERPARAMETER.SPEC.eq(sId))
      .fetch()
      .map(hp -> new HyperParameter(
        hp.getParamname(),
        hp.getParamvalue(),
        hp.getParamtype(),
        hp.getParamminvalue() == null ? 0 : hp.getParamminvalue(),
        hp.getParammaxvalue() == null ? Float.MAX_VALUE : hp.getParammaxvalue())
      );

    if (rec == null) {
      throw new ResourceNotFoundException(String.format(
        "Could not read TransformerSpec %d, it doesn't exist",
        sId
      ));
    }

    return new TransformerSpec(
      rec.getId(),
      rec.getTransformertype(),
      hps,
      rec.getTag()
    );
  }
}
