/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.information_schema.tables.records;


import javax.annotation.Generated;

import jooq.postgresql.gen.information_schema.tables.ReferentialConstraints;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;


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
public class ReferentialConstraintsRecord extends TableRecordImpl<ReferentialConstraintsRecord> implements Record9<String, String, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = -103330051;

    /**
     * Setter for <code>information_schema.referential_constraints.constraint_catalog</code>.
     */
    public void setConstraintCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.referential_constraints.constraint_catalog</code>.
     */
    public String getConstraintCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.referential_constraints.constraint_schema</code>.
     */
    public void setConstraintSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.referential_constraints.constraint_schema</code>.
     */
    public String getConstraintSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.referential_constraints.constraint_name</code>.
     */
    public void setConstraintName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.referential_constraints.constraint_name</code>.
     */
    public String getConstraintName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.referential_constraints.unique_constraint_catalog</code>.
     */
    public void setUniqueConstraintCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.referential_constraints.unique_constraint_catalog</code>.
     */
    public String getUniqueConstraintCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.referential_constraints.unique_constraint_schema</code>.
     */
    public void setUniqueConstraintSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.referential_constraints.unique_constraint_schema</code>.
     */
    public String getUniqueConstraintSchema() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.referential_constraints.unique_constraint_name</code>.
     */
    public void setUniqueConstraintName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.referential_constraints.unique_constraint_name</code>.
     */
    public String getUniqueConstraintName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.referential_constraints.match_option</code>.
     */
    public void setMatchOption(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.referential_constraints.match_option</code>.
     */
    public String getMatchOption() {
        return (String) get(6);
    }

    /**
     * Setter for <code>information_schema.referential_constraints.update_rule</code>.
     */
    public void setUpdateRule(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>information_schema.referential_constraints.update_rule</code>.
     */
    public String getUpdateRule() {
        return (String) get(7);
    }

    /**
     * Setter for <code>information_schema.referential_constraints.delete_rule</code>.
     */
    public void setDeleteRule(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>information_schema.referential_constraints.delete_rule</code>.
     */
    public String getDeleteRule() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<String, String, String, String, String, String, String, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.CONSTRAINT_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.CONSTRAINT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.CONSTRAINT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.UNIQUE_CONSTRAINT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.MATCH_OPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.UPDATE_RULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return ReferentialConstraints.REFERENTIAL_CONSTRAINTS.DELETE_RULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getConstraintCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getConstraintSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getConstraintName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getUniqueConstraintCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getUniqueConstraintSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getUniqueConstraintName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getMatchOption();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getUpdateRule();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getDeleteRule();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getConstraintCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getConstraintSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getConstraintName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getUniqueConstraintCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUniqueConstraintSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getUniqueConstraintName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getMatchOption();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getUpdateRule();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getDeleteRule();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferentialConstraintsRecord value1(String value) {
        setConstraintCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferentialConstraintsRecord value2(String value) {
        setConstraintSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferentialConstraintsRecord value3(String value) {
        setConstraintName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferentialConstraintsRecord value4(String value) {
        setUniqueConstraintCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferentialConstraintsRecord value5(String value) {
        setUniqueConstraintSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferentialConstraintsRecord value6(String value) {
        setUniqueConstraintName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferentialConstraintsRecord value7(String value) {
        setMatchOption(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferentialConstraintsRecord value8(String value) {
        setUpdateRule(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferentialConstraintsRecord value9(String value) {
        setDeleteRule(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReferentialConstraintsRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReferentialConstraintsRecord
     */
    public ReferentialConstraintsRecord() {
        super(ReferentialConstraints.REFERENTIAL_CONSTRAINTS);
    }

    /**
     * Create a detached, initialised ReferentialConstraintsRecord
     */
    public ReferentialConstraintsRecord(String constraintCatalog, String constraintSchema, String constraintName, String uniqueConstraintCatalog, String uniqueConstraintSchema, String uniqueConstraintName, String matchOption, String updateRule, String deleteRule) {
        super(ReferentialConstraints.REFERENTIAL_CONSTRAINTS);

        set(0, constraintCatalog);
        set(1, constraintSchema);
        set(2, constraintName);
        set(3, uniqueConstraintCatalog);
        set(4, uniqueConstraintSchema);
        set(5, uniqueConstraintName);
        set(6, matchOption);
        set(7, updateRule);
        set(8, deleteRule);
    }
}