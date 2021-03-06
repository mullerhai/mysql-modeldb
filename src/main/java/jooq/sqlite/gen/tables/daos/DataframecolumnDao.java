/*
 * This file is generated by jOOQ.
 */
package jooq.sqlite.gen.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import jooq.sqlite.gen.tables.Dataframecolumn;
import jooq.sqlite.gen.tables.records.DataframecolumnRecord;

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
public class DataframecolumnDao extends DAOImpl<DataframecolumnRecord, jooq.sqlite.gen.tables.pojos.Dataframecolumn, Integer> {

    /**
     * Create a new DataframecolumnDao without any configuration
     */
    public DataframecolumnDao() {
        super(Dataframecolumn.DATAFRAMECOLUMN, jooq.sqlite.gen.tables.pojos.Dataframecolumn.class);
    }

    /**
     * Create a new DataframecolumnDao with an attached configuration
     */
    public DataframecolumnDao(Configuration configuration) {
        super(Dataframecolumn.DATAFRAMECOLUMN, jooq.sqlite.gen.tables.pojos.Dataframecolumn.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(jooq.sqlite.gen.tables.pojos.Dataframecolumn object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Dataframecolumn> fetchById(Integer... values) {
        return fetch(Dataframecolumn.DATAFRAMECOLUMN.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public jooq.sqlite.gen.tables.pojos.Dataframecolumn fetchOneById(Integer value) {
        return fetchOne(Dataframecolumn.DATAFRAMECOLUMN.ID, value);
    }

    /**
     * Fetch records that have <code>dfId IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Dataframecolumn> fetchByDfid(Integer... values) {
        return fetch(Dataframecolumn.DATAFRAMECOLUMN.DFID, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Dataframecolumn> fetchByName(String... values) {
        return fetch(Dataframecolumn.DATAFRAMECOLUMN.NAME, values);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Dataframecolumn> fetchByType(String... values) {
        return fetch(Dataframecolumn.DATAFRAMECOLUMN.TYPE, values);
    }
}
