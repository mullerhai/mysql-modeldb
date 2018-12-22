/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.tables.records;


import java.time.OffsetDateTime;

import javax.annotation.Generated;

import jooq.postgresql.gen.pg_catalog.tables.PgPreparedXact;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class PgPreparedXactRecord extends TableRecordImpl<PgPreparedXactRecord> implements Record5<Long, String, OffsetDateTime, Long, Long> {

    private static final long serialVersionUID = -1601631144;

    /**
     * Setter for <code>pg_catalog.pg_prepared_xact.transaction</code>.
     */
    public void setTransaction(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_xact.transaction</code>.
     */
    public Long getTransaction() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_xact.gid</code>.
     */
    public void setGid(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_xact.gid</code>.
     */
    public String getGid() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_xact.prepared</code>.
     */
    public void setPrepared(OffsetDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_xact.prepared</code>.
     */
    public OffsetDateTime getPrepared() {
        return (OffsetDateTime) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_xact.ownerid</code>.
     */
    public void setOwnerid(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_xact.ownerid</code>.
     */
    public Long getOwnerid() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_prepared_xact.dbid</code>.
     */
    public void setDbid(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_prepared_xact.dbid</code>.
     */
    public Long getDbid() {
        return (Long) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, String, OffsetDateTime, Long, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, String, OffsetDateTime, Long, Long> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgPreparedXact.PG_PREPARED_XACT.TRANSACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgPreparedXact.PG_PREPARED_XACT.GID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field3() {
        return PgPreparedXact.PG_PREPARED_XACT.PREPARED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return PgPreparedXact.PG_PREPARED_XACT.OWNERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return PgPreparedXact.PG_PREPARED_XACT.DBID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getTransaction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getGid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component3() {
        return getPrepared();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getOwnerid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getDbid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getTransaction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getGid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value3() {
        return getPrepared();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getOwnerid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getDbid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPreparedXactRecord value1(Long value) {
        setTransaction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPreparedXactRecord value2(String value) {
        setGid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPreparedXactRecord value3(OffsetDateTime value) {
        setPrepared(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPreparedXactRecord value4(Long value) {
        setOwnerid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPreparedXactRecord value5(Long value) {
        setDbid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPreparedXactRecord values(Long value1, String value2, OffsetDateTime value3, Long value4, Long value5) {
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
     * Create a detached PgPreparedXactRecord
     */
    public PgPreparedXactRecord() {
        super(PgPreparedXact.PG_PREPARED_XACT);
    }

    /**
     * Create a detached, initialised PgPreparedXactRecord
     */
    public PgPreparedXactRecord(Long transaction, String gid, OffsetDateTime prepared, Long ownerid, Long dbid) {
        super(PgPreparedXact.PG_PREPARED_XACT);

        set(0, transaction);
        set(1, gid);
        set(2, prepared);
        set(3, ownerid);
        set(4, dbid);
    }
}
