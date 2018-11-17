/*
 * This file is generated by jOOQ.
 */
package jooq.sqlite.gen.tables.records;


import javax.annotation.Generated;

import jooq.sqlite.gen.tables.Hyperparameter;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class HyperparameterRecord extends UpdatableRecordImpl<HyperparameterRecord> implements Record8<Integer, Integer, String, String, String, Double, Double, Integer> {

    private static final long serialVersionUID = 118442191;

    /**
     * Setter for <code>modeldb_test.HyperParameter.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>modeldb_test.HyperParameter.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>modeldb_test.HyperParameter.spec</code>.
     */
    public void setSpec(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>modeldb_test.HyperParameter.spec</code>.
     */
    public Integer getSpec() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>modeldb_test.HyperParameter.paramName</code>.
     */
    public void setParamname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>modeldb_test.HyperParameter.paramName</code>.
     */
    public String getParamname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>modeldb_test.HyperParameter.paramType</code>.
     */
    public void setParamtype(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>modeldb_test.HyperParameter.paramType</code>.
     */
    public String getParamtype() {
        return (String) get(3);
    }

    /**
     * Setter for <code>modeldb_test.HyperParameter.paramValue</code>.
     */
    public void setParamvalue(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>modeldb_test.HyperParameter.paramValue</code>.
     */
    public String getParamvalue() {
        return (String) get(4);
    }

    /**
     * Setter for <code>modeldb_test.HyperParameter.paramMinValue</code>.
     */
    public void setParamminvalue(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>modeldb_test.HyperParameter.paramMinValue</code>.
     */
    public Double getParamminvalue() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>modeldb_test.HyperParameter.paramMaxValue</code>.
     */
    public void setParammaxvalue(Double value) {
        set(6, value);
    }

    /**
     * Getter for <code>modeldb_test.HyperParameter.paramMaxValue</code>.
     */
    public Double getParammaxvalue() {
        return (Double) get(6);
    }

    /**
     * Setter for <code>modeldb_test.HyperParameter.experimentRun</code>.
     */
    public void setExperimentrun(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>modeldb_test.HyperParameter.experimentRun</code>.
     */
    public Integer getExperimentrun() {
        return (Integer) get(7);
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
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, String, String, String, Double, Double, Integer> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Integer, Integer, String, String, String, Double, Double, Integer> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Hyperparameter.HYPERPARAMETER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Hyperparameter.HYPERPARAMETER.SPEC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Hyperparameter.HYPERPARAMETER.PARAMNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Hyperparameter.HYPERPARAMETER.PARAMTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Hyperparameter.HYPERPARAMETER.PARAMVALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field6() {
        return Hyperparameter.HYPERPARAMETER.PARAMMINVALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field7() {
        return Hyperparameter.HYPERPARAMETER.PARAMMAXVALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Hyperparameter.HYPERPARAMETER.EXPERIMENTRUN;
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
        return getSpec();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getParamname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getParamtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getParamvalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component6() {
        return getParamminvalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component7() {
        return getParammaxvalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
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
        return getSpec();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getParamname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getParamtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getParamvalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value6() {
        return getParamminvalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value7() {
        return getParammaxvalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getExperimentrun();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HyperparameterRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HyperparameterRecord value2(Integer value) {
        setSpec(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HyperparameterRecord value3(String value) {
        setParamname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HyperparameterRecord value4(String value) {
        setParamtype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HyperparameterRecord value5(String value) {
        setParamvalue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HyperparameterRecord value6(Double value) {
        setParamminvalue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HyperparameterRecord value7(Double value) {
        setParammaxvalue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HyperparameterRecord value8(Integer value) {
        setExperimentrun(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HyperparameterRecord values(Integer value1, Integer value2, String value3, String value4, String value5, Double value6, Double value7, Integer value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached HyperparameterRecord
     */
    public HyperparameterRecord() {
        super(Hyperparameter.HYPERPARAMETER);
    }

    /**
     * Create a detached, initialised HyperparameterRecord
     */
    public HyperparameterRecord(Integer id, Integer spec, String paramname, String paramtype, String paramvalue, Double paramminvalue, Double parammaxvalue, Integer experimentrun) {
        super(Hyperparameter.HYPERPARAMETER);

        set(0, id);
        set(1, spec);
        set(2, paramname);
        set(3, paramtype);
        set(4, paramvalue);
        set(5, paramminvalue);
        set(6, parammaxvalue);
        set(7, experimentrun);
    }
}
