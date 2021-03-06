/*
 * This file is generated by jOOQ.
 */
package jooq.sqlite.gen.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import jooq.sqlite.gen.tables.Gridcellcrossvalidation;
import jooq.sqlite.gen.tables.records.GridcellcrossvalidationRecord;

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
public class GridcellcrossvalidationDao extends DAOImpl<GridcellcrossvalidationRecord, jooq.sqlite.gen.tables.pojos.Gridcellcrossvalidation, Integer> {

    /**
     * Create a new GridcellcrossvalidationDao without any configuration
     */
    public GridcellcrossvalidationDao() {
        super(Gridcellcrossvalidation.GRIDCELLCROSSVALIDATION, jooq.sqlite.gen.tables.pojos.Gridcellcrossvalidation.class);
    }

    /**
     * Create a new GridcellcrossvalidationDao with an attached configuration
     */
    public GridcellcrossvalidationDao(Configuration configuration) {
        super(Gridcellcrossvalidation.GRIDCELLCROSSVALIDATION, jooq.sqlite.gen.tables.pojos.Gridcellcrossvalidation.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(jooq.sqlite.gen.tables.pojos.Gridcellcrossvalidation object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Gridcellcrossvalidation> fetchById(Integer... values) {
        return fetch(Gridcellcrossvalidation.GRIDCELLCROSSVALIDATION.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public jooq.sqlite.gen.tables.pojos.Gridcellcrossvalidation fetchOneById(Integer value) {
        return fetchOne(Gridcellcrossvalidation.GRIDCELLCROSSVALIDATION.ID, value);
    }

    /**
     * Fetch records that have <code>gridSearch IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Gridcellcrossvalidation> fetchByGridsearch(Integer... values) {
        return fetch(Gridcellcrossvalidation.GRIDCELLCROSSVALIDATION.GRIDSEARCH, values);
    }

    /**
     * Fetch records that have <code>crossValidation IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Gridcellcrossvalidation> fetchByCrossvalidation(Integer... values) {
        return fetch(Gridcellcrossvalidation.GRIDCELLCROSSVALIDATION.CROSSVALIDATION, values);
    }

    /**
     * Fetch records that have <code>experimentRun IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Gridcellcrossvalidation> fetchByExperimentrun(Integer... values) {
        return fetch(Gridcellcrossvalidation.GRIDCELLCROSSVALIDATION.EXPERIMENTRUN, values);
    }
}
