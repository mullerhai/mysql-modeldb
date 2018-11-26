/*
 * This file is generated by jOOQ.
 */
package jooq.mysql.gen.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import jooq.mysql.gen.tables.Project;
import jooq.mysql.gen.tables.records.ProjectRecord;

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
public class ProjectDao extends DAOImpl<ProjectRecord, jooq.mysql.gen.tables.pojos.Project, Integer> {

    /**
     * Create a new ProjectDao without any configuration
     */
    public ProjectDao() {
        super(Project.PROJECT, jooq.mysql.gen.tables.pojos.Project.class);
    }

    /**
     * Create a new ProjectDao with an attached configuration
     */
    public ProjectDao(Configuration configuration) {
        super(Project.PROJECT, jooq.mysql.gen.tables.pojos.Project.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(jooq.mysql.gen.tables.pojos.Project object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<jooq.mysql.gen.tables.pojos.Project> fetchById(Integer... values) {
        return fetch(Project.PROJECT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public jooq.mysql.gen.tables.pojos.Project fetchOneById(Integer value) {
        return fetchOne(Project.PROJECT.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<jooq.mysql.gen.tables.pojos.Project> fetchByName(String... values) {
        return fetch(Project.PROJECT.NAME, values);
    }

    /**
     * Fetch records that have <code>author IN (values)</code>
     */
    public List<jooq.mysql.gen.tables.pojos.Project> fetchByAuthor(String... values) {
        return fetch(Project.PROJECT.AUTHOR, values);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<jooq.mysql.gen.tables.pojos.Project> fetchByDescription(String... values) {
        return fetch(Project.PROJECT.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>created IN (values)</code>
     */
    public List<jooq.mysql.gen.tables.pojos.Project> fetchByCreated(Timestamp... values) {
        return fetch(Project.PROJECT.CREATED, values);
    }
}