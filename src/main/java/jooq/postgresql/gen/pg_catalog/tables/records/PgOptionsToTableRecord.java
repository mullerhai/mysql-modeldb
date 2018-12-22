/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.tables.records;


import javax.annotation.Generated;

import jooq.postgresql.gen.pg_catalog.tables.PgOptionsToTable;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class PgOptionsToTableRecord extends TableRecordImpl<PgOptionsToTableRecord> implements Record2<String, String> {

    private static final long serialVersionUID = -395672288;

    /**
     * Setter for <code>pg_catalog.pg_options_to_table.option_name</code>.
     */
    public void setOptionName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_options_to_table.option_name</code>.
     */
    public String getOptionName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_options_to_table.option_value</code>.
     */
    public void setOptionValue(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_options_to_table.option_value</code>.
     */
    public String getOptionValue() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgOptionsToTable.PG_OPTIONS_TO_TABLE.OPTION_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgOptionsToTable.PG_OPTIONS_TO_TABLE.OPTION_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getOptionName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getOptionValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getOptionName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getOptionValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgOptionsToTableRecord value1(String value) {
        setOptionName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgOptionsToTableRecord value2(String value) {
        setOptionValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgOptionsToTableRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgOptionsToTableRecord
     */
    public PgOptionsToTableRecord() {
        super(PgOptionsToTable.PG_OPTIONS_TO_TABLE);
    }

    /**
     * Create a detached, initialised PgOptionsToTableRecord
     */
    public PgOptionsToTableRecord(String optionName, String optionValue) {
        super(PgOptionsToTable.PG_OPTIONS_TO_TABLE);

        set(0, optionName);
        set(1, optionValue);
    }
}