/**
 * This class is generated by jOOQ
 */
package jooq.sqlite.gen.tables.daos;


import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;

import jooq.sqlite.gen.tables.Experiment;
import jooq.sqlite.gen.tables.records.ExperimentRecord;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExperimentDao extends DAOImpl<ExperimentRecord, jooq.sqlite.gen.tables.pojos.Experiment, Integer> {

    /**
     * Create a new ExperimentDao without any configuration
     */
    public ExperimentDao() {
        super(Experiment.EXPERIMENT, jooq.sqlite.gen.tables.pojos.Experiment.class);
    }

    /**
     * Create a new ExperimentDao with an attached configuration
     */
    public ExperimentDao(Configuration configuration) {
        super(Experiment.EXPERIMENT, jooq.sqlite.gen.tables.pojos.Experiment.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(jooq.sqlite.gen.tables.pojos.Experiment object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Experiment> fetchById(Integer... values) {
        return fetch(Experiment.EXPERIMENT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public jooq.sqlite.gen.tables.pojos.Experiment fetchOneById(Integer value) {
        return fetchOne(Experiment.EXPERIMENT.ID, value);
    }

    /**
     * Fetch records that have <code>project IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Experiment> fetchByProject(Integer... values) {
        return fetch(Experiment.EXPERIMENT.PROJECT, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Experiment> fetchByName(String... values) {
        return fetch(Experiment.EXPERIMENT.NAME, values);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Experiment> fetchByDescription(String... values) {
        return fetch(Experiment.EXPERIMENT.DESCRIPTION, values);
    }

    /**
     * Fetch records that have <code>created IN (values)</code>
     */
    public List<jooq.sqlite.gen.tables.pojos.Experiment> fetchByCreated(Timestamp... values) {
        return fetch(Experiment.EXPERIMENT.CREATED, values);
    }
}