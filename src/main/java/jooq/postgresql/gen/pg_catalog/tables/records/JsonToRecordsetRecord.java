/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.tables.records;


import javax.annotation.Generated;

import jooq.postgresql.gen.pg_catalog.tables.JsonToRecordset;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Record1;
import org.jooq.Row1;
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
public class JsonToRecordsetRecord extends TableRecordImpl<JsonToRecordsetRecord> implements Record1<Record> {

    private static final long serialVersionUID = 1130083724;

    /**
     * Setter for <code>pg_catalog.json_to_recordset.json_to_recordset</code>.
     */
    public void setJsonToRecordset(Record value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.json_to_recordset.json_to_recordset</code>.
     */
    public Record getJsonToRecordset() {
        return (Record) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Record> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<Record> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Record> field1() {
        return JsonToRecordset.JSON_TO_RECORDSET.JSON_TO_RECORDSET_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record component1() {
        return getJsonToRecordset();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Record value1() {
        return getJsonToRecordset();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonToRecordsetRecord value1(Record value) {
        setJsonToRecordset(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonToRecordsetRecord values(Record value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JsonToRecordsetRecord
     */
    public JsonToRecordsetRecord() {
        super(JsonToRecordset.JSON_TO_RECORDSET);
    }

    /**
     * Create a detached, initialised JsonToRecordsetRecord
     */
    public JsonToRecordsetRecord(Record jsonToRecordset) {
        super(JsonToRecordset.JSON_TO_RECORDSET);

        set(0, jsonToRecordset);
    }
}
