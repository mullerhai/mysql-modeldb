/*
 * This file is generated by jOOQ.
 */
package jooq.mysql.gen.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.mysql.gen.tables.Experimentrun;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ExperimentrunRecord extends UpdatableRecordImpl<ExperimentrunRecord> implements Record5<Integer, Integer, String, String, Timestamp> {

    private static final long serialVersionUID = -1873265758;

    /**
     * Setter for <code>modeldb_test.ExperimentRun.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>modeldb_test.ExperimentRun.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>modeldb_test.ExperimentRun.experiment</code>.
     */
    public void setExperiment(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>modeldb_test.ExperimentRun.experiment</code>.
     */
    public Integer getExperiment() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>modeldb_test.ExperimentRun.description</code>.
     */
    public void setDescription(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>modeldb_test.ExperimentRun.description</code>.
     */
    public String getDescription() {
        return (String) get(2);
    }

    /**
     * Setter for <code>modeldb_test.ExperimentRun.sha</code>.
     */
    public void setSha(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>modeldb_test.ExperimentRun.sha</code>.
     */
    public String getSha() {
        return (String) get(3);
    }

    /**
     * Setter for <code>modeldb_test.ExperimentRun.created</code>.
     */
    public void setCreated(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>modeldb_test.ExperimentRun.created</code>.
     */
    public Timestamp getCreated() {
        return (Timestamp) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, String, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, String, String, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Experimentrun.EXPERIMENTRUN.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Experimentrun.EXPERIMENTRUN.EXPERIMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Experimentrun.EXPERIMENTRUN.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Experimentrun.EXPERIMENTRUN.SHA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Experimentrun.EXPERIMENTRUN.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getExperiment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getSha();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getExperiment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getSha();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExperimentrunRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExperimentrunRecord value2(Integer value) {
        setExperiment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExperimentrunRecord value3(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExperimentrunRecord value4(String value) {
        setSha(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExperimentrunRecord value5(Timestamp value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExperimentrunRecord values(Integer value1, Integer value2, String value3, String value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ExperimentrunRecord
     */
    public ExperimentrunRecord() {
        super(Experimentrun.EXPERIMENTRUN);
    }

    /**
     * Create a detached, initialised ExperimentrunRecord
     */
    public ExperimentrunRecord(Integer id, Integer experiment, String description, String sha, Timestamp created) {
        super(Experimentrun.EXPERIMENTRUN);

        set(0, id);
        set(1, experiment);
        set(2, description);
        set(3, sha);
        set(4, created);
    }
}