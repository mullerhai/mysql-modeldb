/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.tables.records;


import javax.annotation.Generated;

import jooq.postgresql.gen.pg_catalog.tables.PgRange;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class PgRangeRecord extends TableRecordImpl<PgRangeRecord> implements Record6<Long, Long, Long, Long, String, String> {

    private static final long serialVersionUID = 1571475380;

    /**
     * Setter for <code>pg_catalog.pg_range.rngtypid</code>.
     */
    public void setRngtypid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_range.rngtypid</code>.
     */
    public Long getRngtypid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_range.rngsubtype</code>.
     */
    public void setRngsubtype(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_range.rngsubtype</code>.
     */
    public Long getRngsubtype() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_range.rngcollation</code>.
     */
    public void setRngcollation(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_range.rngcollation</code>.
     */
    public Long getRngcollation() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_range.rngsubopc</code>.
     */
    public void setRngsubopc(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_range.rngsubopc</code>.
     */
    public Long getRngsubopc() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_range.rngcanonical</code>.
     */
    public void setRngcanonical(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_range.rngcanonical</code>.
     */
    public String getRngcanonical() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_range.rngsubdiff</code>.
     */
    public void setRngsubdiff(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_range.rngsubdiff</code>.
     */
    public String getRngsubdiff() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Long, Long, Long, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Long, Long, Long, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgRange.PG_RANGE.RNGTYPID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgRange.PG_RANGE.RNGSUBTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return PgRange.PG_RANGE.RNGCOLLATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return PgRange.PG_RANGE.RNGSUBOPC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return PgRange.PG_RANGE.RNGCANONICAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return PgRange.PG_RANGE.RNGSUBDIFF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getRngtypid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getRngsubtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getRngcollation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getRngsubopc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getRngcanonical();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getRngsubdiff();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getRngtypid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getRngsubtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getRngcollation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getRngsubopc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getRngcanonical();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getRngsubdiff();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRangeRecord value1(Long value) {
        setRngtypid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRangeRecord value2(Long value) {
        setRngsubtype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRangeRecord value3(Long value) {
        setRngcollation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRangeRecord value4(Long value) {
        setRngsubopc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRangeRecord value5(String value) {
        setRngcanonical(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRangeRecord value6(String value) {
        setRngsubdiff(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRangeRecord values(Long value1, Long value2, Long value3, Long value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgRangeRecord
     */
    public PgRangeRecord() {
        super(PgRange.PG_RANGE);
    }

    /**
     * Create a detached, initialised PgRangeRecord
     */
    public PgRangeRecord(Long rngtypid, Long rngsubtype, Long rngcollation, Long rngsubopc, String rngcanonical, String rngsubdiff) {
        super(PgRange.PG_RANGE);

        set(0, rngtypid);
        set(1, rngsubtype);
        set(2, rngcollation);
        set(3, rngsubopc);
        set(4, rngcanonical);
        set(5, rngsubdiff);
    }
}
