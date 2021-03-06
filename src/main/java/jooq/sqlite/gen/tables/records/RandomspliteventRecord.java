/*
 * This file is generated by jOOQ.
 */
package jooq.sqlite.gen.tables.records;


import javax.annotation.Generated;

import jooq.sqlite.gen.tables.Randomsplitevent;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class RandomspliteventRecord extends UpdatableRecordImpl<RandomspliteventRecord> implements Record4<Integer, Integer, Long, Integer> {

    private static final long serialVersionUID = 1383825379;

    /**
     * Setter for <code>modeldb_test.RandomSplitEvent.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>modeldb_test.RandomSplitEvent.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>modeldb_test.RandomSplitEvent.inputDataFrameId</code>.
     */
    public void setInputdataframeid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>modeldb_test.RandomSplitEvent.inputDataFrameId</code>.
     */
    public Integer getInputdataframeid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>modeldb_test.RandomSplitEvent.randomSeed</code>.
     */
    public void setRandomseed(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>modeldb_test.RandomSplitEvent.randomSeed</code>.
     */
    public Long getRandomseed() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>modeldb_test.RandomSplitEvent.experimentRun</code>.
     */
    public void setExperimentrun(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>modeldb_test.RandomSplitEvent.experimentRun</code>.
     */
    public Integer getExperimentrun() {
        return (Integer) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Long, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Long, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Randomsplitevent.RANDOMSPLITEVENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Randomsplitevent.RANDOMSPLITEVENT.INPUTDATAFRAMEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Randomsplitevent.RANDOMSPLITEVENT.RANDOMSEED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Randomsplitevent.RANDOMSPLITEVENT.EXPERIMENTRUN;
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
        return getInputdataframeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getRandomseed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getExperimentrun();
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
        return getInputdataframeid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getRandomseed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getExperimentrun();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RandomspliteventRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RandomspliteventRecord value2(Integer value) {
        setInputdataframeid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RandomspliteventRecord value3(Long value) {
        setRandomseed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RandomspliteventRecord value4(Integer value) {
        setExperimentrun(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RandomspliteventRecord values(Integer value1, Integer value2, Long value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RandomspliteventRecord
     */
    public RandomspliteventRecord() {
        super(Randomsplitevent.RANDOMSPLITEVENT);
    }

    /**
     * Create a detached, initialised RandomspliteventRecord
     */
    public RandomspliteventRecord(Integer id, Integer inputdataframeid, Long randomseed, Integer experimentrun) {
        super(Randomsplitevent.RANDOMSPLITEVENT);

        set(0, id);
        set(1, inputdataframeid);
        set(2, randomseed);
        set(3, experimentrun);
    }
}
