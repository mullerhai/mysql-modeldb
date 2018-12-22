/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.public_.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import jooq.postgresql.gen.public_.tables.Treemodel;
import jooq.postgresql.gen.public_.tables.records.TreemodelRecord;

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
public class TreemodelDao extends DAOImpl<TreemodelRecord, jooq.postgresql.gen.public_.tables.pojos.Treemodel, Integer> {

    /**
     * Create a new TreemodelDao without any configuration
     */
    public TreemodelDao() {
        super(Treemodel.TREEMODEL, jooq.postgresql.gen.public_.tables.pojos.Treemodel.class);
    }

    /**
     * Create a new TreemodelDao with an attached configuration
     */
    public TreemodelDao(Configuration configuration) {
        super(Treemodel.TREEMODEL, jooq.postgresql.gen.public_.tables.pojos.Treemodel.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(jooq.postgresql.gen.public_.tables.pojos.Treemodel object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<jooq.postgresql.gen.public_.tables.pojos.Treemodel> fetchById(Integer... values) {
        return fetch(Treemodel.TREEMODEL.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public jooq.postgresql.gen.public_.tables.pojos.Treemodel fetchOneById(Integer value) {
        return fetchOne(Treemodel.TREEMODEL.ID, value);
    }

    /**
     * Fetch records that have <code>model IN (values)</code>
     */
    public List<jooq.postgresql.gen.public_.tables.pojos.Treemodel> fetchByModel(Integer... values) {
        return fetch(Treemodel.TREEMODEL.MODEL, values);
    }

    /**
     * Fetch records that have <code>modeltype IN (values)</code>
     */
    public List<jooq.postgresql.gen.public_.tables.pojos.Treemodel> fetchByModeltype(String... values) {
        return fetch(Treemodel.TREEMODEL.MODELTYPE, values);
    }
}