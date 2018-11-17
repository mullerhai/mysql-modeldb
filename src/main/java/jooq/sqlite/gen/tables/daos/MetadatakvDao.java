/*
 * This file is generated by jOOQ.
 */
package jooq.sqlite.gen.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import jooq.sqlite.gen.tables.Metadatakv;
import jooq.sqlite.gen.tables.records.MetadatakvRecord;

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
public class MetadatakvDao extends DAOImpl<MetadatakvRecord, jooq.sqlite.gen.tables.pojos.Metadatakv, Integer> {

    /**
     * Create a new MetadatakvDao without any configuration
     */
    public MetadatakvDao() {
        super(Metadatakv.METADATAKV, jooq.sqlite.gen.tables.pojos.Metadatakv.class);
    }

    /**
     * Create a new MetadatakvDao with an attached configuration
     */
    public MetadatakvDao(Configuration configuration) {
        super(Metadatakv.METADATAKV, jooq.sqlite.gen.tables.pojos.Metadatakv.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(jooq.sqlite.gen.tables.pojos.Metadatakv object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Metadatakv> fetchById(Integer... values) {
        return fetch(Metadatakv.METADATAKV.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public jooq.sqlite.gen.tables.pojos.Metadatakv fetchOneById(Integer value) {
        return fetchOne(Metadatakv.METADATAKV.ID, value);
    }

    /**
     * Fetch records that have <code>key IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Metadatakv> fetchByKey(String... values) {
        return fetch(Metadatakv.METADATAKV.KEY, values);
    }

    /**
     * Fetch records that have <code>value IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Metadatakv> fetchByValue(String... values) {
        return fetch(Metadatakv.METADATAKV.VALUE, values);
    }

    /**
     * Fetch records that have <code>valueType IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Metadatakv> fetchByValuetype(String... values) {
        return fetch(Metadatakv.METADATAKV.VALUETYPE, values);
    }
}
