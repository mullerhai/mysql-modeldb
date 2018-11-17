package edu.mit.csail.db.ml.server.algorithm.similarity.comparators;

import edu.mit.csail.db.ml.server.algorithm.similarity.ModelComparator;
import jooq.mysql.gen.Tables;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Record1;

import java.util.List;
import java.util.stream.Collectors;

/**
 * This comparator finds models with the same transformerType (e.g. LinearRegressionModel) as the given model.
 */
public class TransformerTypeComparator implements ModelComparator {
  /**
   * @param modelId - We seek models that are similar to the model with the given ID.
   * @param similarModels - If this is an empty list, then we will read the database and
   *                      find similar models there. Otherwise, the given list of model IDs
   *                      will be re-ordered such that the most similar model is first and
   *                      the least similar model will be last.
   * @param limit - The maximum number of model IDs to return.
   * @param ctx - The context for interacting with the database.
   * @return Similar models are the ones who have the same transformerType as the model with ID modelID.
   */
  @Override
  public List<Integer> similarModels(int modelId, List<Integer> similarModels, int limit, DSLContext ctx) {
    // Fetch the problem type of the model.
    Record1<String> rec = ctx
      .select(Tables.TRANSFORMER.TRANSFORMERTYPE)
      .from(Tables.TRANSFORMER)
      .where(Tables.TRANSFORMER.ID.eq(modelId))
      .fetchOne();
    if (rec == null) {
      return similarModels;
    }
    String transformerType = rec.value1();

    // Apply the correct WHERE condition.
    Condition whereCondition = Tables.TRANSFORMER.TRANSFORMERTYPE.eq(transformerType);
    if (!similarModels.isEmpty()) {
      whereCondition = whereCondition.and(Tables.TRANSFORMER.TRANSFORMERTYPE.in(similarModels));
    }

    // Filter down to models with the same project ID.
    return merge(
      ctx
        .select(Tables.TRANSFORMER.ID)
        .from(Tables.TRANSFORMER)
        .where(whereCondition)
        .limit(limit)
        .stream()
        .distinct()
        .map(Record1::value1)
        .collect(Collectors.toList()),
      similarModels
    );
  }

}
