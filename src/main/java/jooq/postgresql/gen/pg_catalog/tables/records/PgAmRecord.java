/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.tables.records;


import javax.annotation.Generated;

import jooq.postgresql.gen.pg_catalog.tables.PgAm;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class PgAmRecord extends TableRecordImpl<PgAmRecord> implements Record3<String, String, String> {

    private static final long serialVersionUID = -19450119;

    /**
     * Setter for <code>pg_catalog.pg_am.amname</code>.
     */
    public void setAmname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_am.amname</code>.
     */
    public String getAmname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_am.amhandler</code>.
     */
    public void setAmhandler(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_am.amhandler</code>.
     */
    public String getAmhandler() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_am.amtype</code>.
     */
    public void setAmtype(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_am.amtype</code>.
     */
    public String getAmtype() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<String, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgAm.PG_AM.AMNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgAm.PG_AM.AMHANDLER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PgAm.PG_AM.AMTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getAmname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getAmhandler();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getAmtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getAmname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAmhandler();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getAmtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAmRecord value1(String value) {
        setAmname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAmRecord value2(String value) {
        setAmhandler(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAmRecord value3(String value) {
        setAmtype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgAmRecord values(String value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgAmRecord
     */
    public PgAmRecord() {
        super(PgAm.PG_AM);
    }

    /**
     * Create a detached, initialised PgAmRecord
     */
    public PgAmRecord(String amname, String amhandler, String amtype) {
        super(PgAm.PG_AM);

        set(0, amname);
        set(1, amhandler);
        set(2, amtype);
    }
}
