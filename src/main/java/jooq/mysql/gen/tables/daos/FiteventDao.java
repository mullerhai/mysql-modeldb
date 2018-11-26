/*
 * This file is generated by jOOQ.
 */
package jooq.mysql.gen.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import jooq.mysql.gen.tables.Fitevent;
import jooq.mysql.gen.tables.records.FiteventRecord;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FiteventDao extends DAOImpl<FiteventRecord, jooq.mysql.gen.tables.pojos.Fitevent, Integer> {

    /**
     * Create a new FiteventDao without any configuration
     */
    public FiteventDao() {
        super(Fitevent.FITEVENT, jooq.mysql.gen.tables.pojos.Fitevent.class);
    }

    /**
     * Create a new FiteventDao with an attached configuration
     */
    public FiteventDao(Configuration configuration) {
        super(Fitevent.FITEVENT, jooq.mysql.gen.tables.pojos.Fitevent.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(jooq.mysql.gen.tables.pojos.Fitevent object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<jooq.mysql.gen.tables.pojos.Fitevent> fetchById(Integer... values) {
        return fetch(Fitevent.FITEVENT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public jooq.mysql.gen.tables.pojos.Fitevent fetchOneById(Integer value) {
        return fetchOne(Fitevent.FITEVENT.ID, value);
    }

    /**
     * Fetch records that have <code>transformerSpec IN (values)</code>
     */
    public List<jooq.mysql.gen.tables.pojos.Fitevent> fetchByTransformerspec(Integer... values) {
        return fetch(Fitevent.FITEVENT.TRANSFORMERSPEC, values);
    }

    /**
     * Fetch records that have <code>transformer IN (values)</code>
     */
    public List<jooq.mysql.gen.tables.pojos.Fitevent> fetchByTransformer(Integer... values) {
        return fetch(Fitevent.FITEVENT.TRANSFORMER, values);
    }

    /**
     * Fetch records that have <code>df IN (values)</code>
     */
    public List<jooq.mysql.gen.tables.pojos.Fitevent> fetchByDf(Integer... values) {
        return fetch(Fitevent.FITEVENT.DF, values);
    }

    /**
     * Fetch records that have <code>predictionColumns IN (values)</code>
     */
    public List<jooq.mysql.gen.tables.pojos.Fitevent> fetchByPredictioncolumns(String... values) {
        return fetch(Fitevent.FITEVENT.PREDICTIONCOLUMNS, values);
    }

    /**
     * Fetch records that have <code>labelColumns IN (values)</code>
     */
    public List<jooq.mysql.gen.tables.pojos.Fitevent> fetchByLabelcolumns(String... values) {
        return fetch(Fitevent.FITEVENT.LABELCOLUMNS, values);
    }

    /**
     * Fetch records that have <code>experimentRun IN (values)</code>
     */
    public List<jooq.mysql.gen.tables.pojos.Fitevent> fetchByExperimentrun(Integer... values) {
        return fetch(Fitevent.FITEVENT.EXPERIMENTRUN, values);
    }

    /**
     * Fetch records that have <code>problemType IN (values)</code>
     */
    public List<jooq.mysql.gen.tables.pojos.Fitevent> fetchByProblemtype(String... values) {
        return fetch(Fitevent.FITEVENT.PROBLEMTYPE, values);
    }
}