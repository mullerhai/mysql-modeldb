/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.public_.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import jooq.postgresql.gen.public_.tables.Feature;
import jooq.postgresql.gen.public_.tables.records.FeatureRecord;

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
public class FeatureDao extends DAOImpl<FeatureRecord, jooq.postgresql.gen.public_.tables.pojos.Feature, Integer> {

    /**
     * Create a new FeatureDao without any configuration
     */
    public FeatureDao() {
        super(Feature.FEATURE, jooq.postgresql.gen.public_.tables.pojos.Feature.class);
    }

    /**
     * Create a new FeatureDao with an attached configuration
     */
    public FeatureDao(Configuration configuration) {
        super(Feature.FEATURE, jooq.postgresql.gen.public_.tables.pojos.Feature.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(jooq.postgresql.gen.public_.tables.pojos.Feature object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<jooq.postgresql.gen.public_.tables.pojos.Feature> fetchById(Integer... values) {
        return fetch(Feature.FEATURE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public jooq.postgresql.gen.public_.tables.pojos.Feature fetchOneById(Integer value) {
        return fetchOne(Feature.FEATURE.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<jooq.postgresql.gen.public_.tables.pojos.Feature> fetchByName(String... values) {
        return fetch(Feature.FEATURE.NAME, values);
    }

    /**
     * Fetch records that have <code>featureindex IN (values)</code>
     */
    public List<jooq.postgresql.gen.public_.tables.pojos.Feature> fetchByFeatureindex(Integer... values) {
        return fetch(Feature.FEATURE.FEATUREINDEX, values);
    }

    /**
     * Fetch records that have <code>importance IN (values)</code>
     */
    public List<jooq.postgresql.gen.public_.tables.pojos.Feature> fetchByImportance(Double... values) {
        return fetch(Feature.FEATURE.IMPORTANCE, values);
    }

    /**
     * Fetch records that have <code>transformer IN (values)</code>
     */
    public List<jooq.postgresql.gen.public_.tables.pojos.Feature> fetchByTransformer(Integer... values) {
        return fetch(Feature.FEATURE.TRANSFORMER, values);
    }
}