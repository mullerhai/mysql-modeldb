/*
 * This file is generated by jOOQ.
 */
package jooq.sqlite.gen.tables.records;


import javax.annotation.Generated;

import jooq.sqlite.gen.tables.Treemodelcomponent;

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
public class TreemodelcomponentRecord extends UpdatableRecordImpl<TreemodelcomponentRecord> implements Record5<Integer, Integer, Integer, Double, Integer> {

    private static final long serialVersionUID = -1459069046;

    /**
     * Setter for <code>modeldb_test.TreeModelComponent.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>modeldb_test.TreeModelComponent.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>modeldb_test.TreeModelComponent.model</code>.
     */
    public void setModel(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>modeldb_test.TreeModelComponent.model</code>.
     */
    public Integer getModel() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>modeldb_test.TreeModelComponent.componentIndex</code>.
     */
    public void setComponentindex(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>modeldb_test.TreeModelComponent.componentIndex</code>.
     */
    public Integer getComponentindex() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>modeldb_test.TreeModelComponent.componentWeight</code>.
     */
    public void setComponentweight(Double value) {
        set(3, value);
    }

    /**
     * Getter for <code>modeldb_test.TreeModelComponent.componentWeight</code>.
     */
    public Double getComponentweight() {
        return (Double) get(3);
    }

    /**
     * Setter for <code>modeldb_test.TreeModelComponent.rootNode</code>.
     */
    public void setRootnode(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>modeldb_test.TreeModelComponent.rootNode</code>.
     */
    public Integer getRootnode() {
        return (Integer) get(4);
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
    public Row5<Integer, Integer, Integer, Double, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, Double, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Treemodelcomponent.TREEMODELCOMPONENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Treemodelcomponent.TREEMODELCOMPONENT.MODEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Treemodelcomponent.TREEMODELCOMPONENT.COMPONENTINDEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field4() {
        return Treemodelcomponent.TREEMODELCOMPONENT.COMPONENTWEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Treemodelcomponent.TREEMODELCOMPONENT.ROOTNODE;
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
        return getModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getComponentindex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double component4() {
        return getComponentweight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getRootnode();
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
        return getModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getComponentindex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value4() {
        return getComponentweight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getRootnode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TreemodelcomponentRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TreemodelcomponentRecord value2(Integer value) {
        setModel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TreemodelcomponentRecord value3(Integer value) {
        setComponentindex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TreemodelcomponentRecord value4(Double value) {
        setComponentweight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TreemodelcomponentRecord value5(Integer value) {
        setRootnode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TreemodelcomponentRecord values(Integer value1, Integer value2, Integer value3, Double value4, Integer value5) {
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
     * Create a detached TreemodelcomponentRecord
     */
    public TreemodelcomponentRecord() {
        super(Treemodelcomponent.TREEMODELCOMPONENT);
    }

    /**
     * Create a detached, initialised TreemodelcomponentRecord
     */
    public TreemodelcomponentRecord(Integer id, Integer model, Integer componentindex, Double componentweight, Integer rootnode) {
        super(Treemodelcomponent.TREEMODELCOMPONENT);

        set(0, id);
        set(1, model);
        set(2, componentindex);
        set(3, componentweight);
        set(4, rootnode);
    }
}
