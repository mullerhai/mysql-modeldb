/*
 * This file is generated by jOOQ.
 */
package jooq.sqlite.gen.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import jooq.sqlite.gen.tables.Metricevent;
import jooq.sqlite.gen.tables.records.MetriceventRecord;

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
public class MetriceventDao extends DAOImpl<MetriceventRecord, jooq.sqlite.gen.tables.pojos.Metricevent, Integer> {

    /**
     * Create a new MetriceventDao without any configuration
     */
    public MetriceventDao() {
        super(Metricevent.METRICEVENT, jooq.sqlite.gen.tables.pojos.Metricevent.class);
    }

    /**
     * Create a new MetriceventDao with an attached configuration
     */
    public MetriceventDao(Configuration configuration) {
        super(Metricevent.METRICEVENT, jooq.sqlite.gen.tables.pojos.Metricevent.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(jooq.sqlite.gen.tables.pojos.Metricevent object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Metricevent> fetchById(Integer... values) {
        return fetch(Metricevent.METRICEVENT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public jooq.sqlite.gen.tables.pojos.Metricevent fetchOneById(Integer value) {
        return fetchOne(Metricevent.METRICEVENT.ID, value);
    }

    /**
     * Fetch records that have <code>transformer IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Metricevent> fetchByTransformer(Integer... values) {
        return fetch(Metricevent.METRICEVENT.TRANSFORMER, values);
    }

    /**
     * Fetch records that have <code>df IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Metricevent> fetchByDf(Integer... values) {
        return fetch(Metricevent.METRICEVENT.DF, values);
    }

    /**
     * Fetch records that have <code>metricType IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Metricevent> fetchByMetrictype(String... values) {
        return fetch(Metricevent.METRICEVENT.METRICTYPE, values);
    }

    /**
     * Fetch records that have <code>metricValue IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Metricevent> fetchByMetricvalue(Double... values) {
        return fetch(Metricevent.METRICEVENT.METRICVALUE, values);
    }

    /**
     * Fetch records that have <code>experimentRun IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Metricevent> fetchByExperimentrun(Integer... values) {
        return fetch(Metricevent.METRICEVENT.EXPERIMENTRUN, values);
    }
}