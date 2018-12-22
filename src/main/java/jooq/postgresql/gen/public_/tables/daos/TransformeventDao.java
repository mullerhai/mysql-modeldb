/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.public_.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import jooq.postgresql.gen.public_.tables.Transformevent;
import jooq.postgresql.gen.public_.tables.records.TransformeventRecord;

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
public class TransformeventDao extends DAOImpl<TransformeventRecord, jooq.postgresql.gen.public_.tables.pojos.Transformevent, Integer> {

    /**
     * Create a new TransformeventDao without any configuration
     */
    public TransformeventDao() {
        super(Transformevent.TRANSFORMEVENT, jooq.postgresql.gen.public_.tables.pojos.Transformevent.class);
    }

    /**
     * Create a new TransformeventDao with an attached configuration
     */
    public TransformeventDao(Configuration configuration) {
        super(Transformevent.TRANSFORMEVENT, jooq.postgresql.gen.public_.tables.pojos.Transformevent.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(jooq.postgresql.gen.public_.tables.pojos.Transformevent object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<jooq.postgresql.gen.public_.tables.pojos.Transformevent> fetchById(Integer... values) {
        return fetch(Transformevent.TRANSFORMEVENT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public jooq.postgresql.gen.public_.tables.pojos.Transformevent fetchOneById(Integer value) {
        return fetchOne(Transformevent.TRANSFORMEVENT.ID, value);
    }

    /**
     * Fetch records that have <code>olddf IN (values)</code>
     */
    public List<jooq.postgresql.gen.public_.tables.pojos.Transformevent> fetchByOlddf(Integer... values) {
        return fetch(Transformevent.TRANSFORMEVENT.OLDDF, values);
    }

    /**
     * Fetch records that have <code>newdf IN (values)</code>
     */
    public List<jooq.postgresql.gen.public_.tables.pojos.Transformevent> fetchByNewdf(Integer... values) {
        return fetch(Transformevent.TRANSFORMEVENT.NEWDF, values);
    }

    /**
     * Fetch records that have <code>transformer IN (values)</code>
     */
    public List<jooq.postgresql.gen.public_.tables.pojos.Transformevent> fetchByTransformer(Integer... values) {
        return fetch(Transformevent.TRANSFORMEVENT.TRANSFORMER, values);
    }

    /**
     * Fetch records that have <code>inputcolumns IN (values)</code>
     */
    public List<jooq.postgresql.gen.public_.tables.pojos.Transformevent> fetchByInputcolumns(String... values) {
        return fetch(Transformevent.TRANSFORMEVENT.INPUTCOLUMNS, values);
    }

    /**
     * Fetch records that have <code>outputcolumns IN (values)</code>
     */
    public List<jooq.postgresql.gen.public_.tables.pojos.Transformevent> fetchByOutputcolumns(String... values) {
        return fetch(Transformevent.TRANSFORMEVENT.OUTPUTCOLUMNS, values);
    }

    /**
     * Fetch records that have <code>experimentrun IN (values)</code>
     */
    public List<jooq.postgresql.gen.public_.tables.pojos.Transformevent> fetchByExperimentrun(Integer... values) {
        return fetch(Transformevent.TRANSFORMEVENT.EXPERIMENTRUN, values);
    }
}
