/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.public_.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import jooq.postgresql.gen.public_.tables.Treelink;
import jooq.postgresql.gen.public_.tables.records.TreelinkRecord;

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
public class TreelinkDao extends DAOImpl<TreelinkRecord, jooq.postgresql.gen.public_.tables.pojos.Treelink, Integer> {

    /**
     * Create a new TreelinkDao without any configuration
     */
    public TreelinkDao() {
        super(Treelink.TREELINK, jooq.postgresql.gen.public_.tables.pojos.Treelink.class);
    }

    /**
     * Create a new TreelinkDao with an attached configuration
     */
    public TreelinkDao(Configuration configuration) {
        super(Treelink.TREELINK, jooq.postgresql.gen.public_.tables.pojos.Treelink.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(jooq.postgresql.gen.public_.tables.pojos.Treelink object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<jooq.postgresql.gen.public_.tables.pojos.Treelink> fetchById(Integer... values) {
        return fetch(Treelink.TREELINK.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public jooq.postgresql.gen.public_.tables.pojos.Treelink fetchOneById(Integer value) {
        return fetchOne(Treelink.TREELINK.ID, value);
    }

    /**
     * Fetch records that have <code>parent IN (values)</code>
     */
    public List<jooq.postgresql.gen.public_.tables.pojos.Treelink> fetchByParent(Integer... values) {
        return fetch(Treelink.TREELINK.PARENT, values);
    }

    /**
     * Fetch records that have <code>child IN (values)</code>
     */
    public List<jooq.postgresql.gen.public_.tables.pojos.Treelink> fetchByChild(Integer... values) {
        return fetch(Treelink.TREELINK.CHILD, values);
    }

    /**
     * Fetch records that have <code>isleft IN (values)</code>
     */
    public List<jooq.postgresql.gen.public_.tables.pojos.Treelink> fetchByIsleft(Integer... values) {
        return fetch(Treelink.TREELINK.ISLEFT, values);
    }
}