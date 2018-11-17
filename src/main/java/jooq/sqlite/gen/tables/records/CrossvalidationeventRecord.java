/*
 * This file is generated by jOOQ.
 */
package jooq.sqlite.gen.tables.records;


import javax.annotation.Generated;

import jooq.sqlite.gen.tables.Crossvalidationevent;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class CrossvalidationeventRecord extends UpdatableRecordImpl<CrossvalidationeventRecord> implements Record7<Integer, Integer, Integer, Integer, Long, String, Integer> {

    private static final long serialVersionUID = -1004017203;

    /**
     * Setter for <code>modeldb_test.CrossValidationEvent.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>modeldb_test.CrossValidationEvent.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>modeldb_test.CrossValidationEvent.df</code>.
     */
    public void setDf(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>modeldb_test.CrossValidationEvent.df</code>.
     */
    public Integer getDf() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>modeldb_test.CrossValidationEvent.spec</code>.
     */
    public void setSpec(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>modeldb_test.CrossValidationEvent.spec</code>.
     */
    public Integer getSpec() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>modeldb_test.CrossValidationEvent.numFolds</code>.
     */
    public void setNumfolds(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>modeldb_test.CrossValidationEvent.numFolds</code>.
     */
    public Integer getNumfolds() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>modeldb_test.CrossValidationEvent.randomSeed</code>.
     */
    public void setRandomseed(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>modeldb_test.CrossValidationEvent.randomSeed</code>.
     */
    public Long getRandomseed() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>modeldb_test.CrossValidationEvent.evaluator</code>.
     */
    public void setEvaluator(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>modeldb_test.CrossValidationEvent.evaluator</code>.
     */
    public String getEvaluator() {
        return (String) get(5);
    }

    /**
     * Setter for <code>modeldb_test.CrossValidationEvent.experimentRun</code>.
     */
    public void setExperimentrun(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>modeldb_test.CrossValidationEvent.experimentRun</code>.
     */
    public Integer getExperimentrun() {
        return (Integer) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, Integer, Long, String, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, Integer, Integer, Long, String, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Crossvalidationevent.CROSSVALIDATIONEVENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Crossvalidationevent.CROSSVALIDATIONEVENT.DF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Crossvalidationevent.CROSSVALIDATIONEVENT.SPEC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Crossvalidationevent.CROSSVALIDATIONEVENT.NUMFOLDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return Crossvalidationevent.CROSSVALIDATIONEVENT.RANDOMSEED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Crossvalidationevent.CROSSVALIDATIONEVENT.EVALUATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Crossvalidationevent.CROSSVALIDATIONEVENT.EXPERIMENTRUN;
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
        return getDf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getSpec();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getNumfolds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getRandomseed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getEvaluator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
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
        return getDf();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getSpec();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getNumfolds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getRandomseed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getEvaluator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getExperimentrun();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrossvalidationeventRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrossvalidationeventRecord value2(Integer value) {
        setDf(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrossvalidationeventRecord value3(Integer value) {
        setSpec(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrossvalidationeventRecord value4(Integer value) {
        setNumfolds(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrossvalidationeventRecord value5(Long value) {
        setRandomseed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrossvalidationeventRecord value6(String value) {
        setEvaluator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrossvalidationeventRecord value7(Integer value) {
        setExperimentrun(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CrossvalidationeventRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Long value5, String value6, Integer value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CrossvalidationeventRecord
     */
    public CrossvalidationeventRecord() {
        super(Crossvalidationevent.CROSSVALIDATIONEVENT);
    }

    /**
     * Create a detached, initialised CrossvalidationeventRecord
     */
    public CrossvalidationeventRecord(Integer id, Integer df, Integer spec, Integer numfolds, Long randomseed, String evaluator, Integer experimentrun) {
        super(Crossvalidationevent.CROSSVALIDATIONEVENT);

        set(0, id);
        set(1, df);
        set(2, spec);
        set(3, numfolds);
        set(4, randomseed);
        set(5, evaluator);
        set(6, experimentrun);
    }
}
