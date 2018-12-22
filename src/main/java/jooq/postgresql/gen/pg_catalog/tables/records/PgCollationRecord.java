/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.tables.records;


import javax.annotation.Generated;

import jooq.postgresql.gen.pg_catalog.tables.PgCollation;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
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
public class PgCollationRecord extends TableRecordImpl<PgCollationRecord> implements Record8<String, Long, Long, String, Integer, String, String, String> {

    private static final long serialVersionUID = -91539410;

    /**
     * Setter for <code>pg_catalog.pg_collation.collname</code>.
     */
    public void setCollname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_collation.collname</code>.
     */
    public String getCollname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_collation.collnamespace</code>.
     */
    public void setCollnamespace(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_collation.collnamespace</code>.
     */
    public Long getCollnamespace() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_collation.collowner</code>.
     */
    public void setCollowner(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_collation.collowner</code>.
     */
    public Long getCollowner() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_collation.collprovider</code>.
     */
    public void setCollprovider(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_collation.collprovider</code>.
     */
    public String getCollprovider() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_collation.collencoding</code>.
     */
    public void setCollencoding(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_collation.collencoding</code>.
     */
    public Integer getCollencoding() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_collation.collcollate</code>.
     */
    public void setCollcollate(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_collation.collcollate</code>.
     */
    public String getCollcollate() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_collation.collctype</code>.
     */
    public void setCollctype(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_collation.collctype</code>.
     */
    public String getCollctype() {
        return (String) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_collation.collversion</code>.
     */
    public void setCollversion(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_collation.collversion</code>.
     */
    public String getCollversion() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, Long, Long, String, Integer, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, Long, Long, String, Integer, String, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgCollation.PG_COLLATION.COLLNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgCollation.PG_COLLATION.COLLNAMESPACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return PgCollation.PG_COLLATION.COLLOWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return PgCollation.PG_COLLATION.COLLPROVIDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return PgCollation.PG_COLLATION.COLLENCODING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return PgCollation.PG_COLLATION.COLLCOLLATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return PgCollation.PG_COLLATION.COLLCTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return PgCollation.PG_COLLATION.COLLVERSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getCollname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getCollnamespace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getCollowner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCollprovider();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getCollencoding();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getCollcollate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getCollctype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getCollversion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getCollname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getCollnamespace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getCollowner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCollprovider();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getCollencoding();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCollcollate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getCollctype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCollversion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgCollationRecord value1(String value) {
        setCollname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgCollationRecord value2(Long value) {
        setCollnamespace(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgCollationRecord value3(Long value) {
        setCollowner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgCollationRecord value4(String value) {
        setCollprovider(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgCollationRecord value5(Integer value) {
        setCollencoding(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgCollationRecord value6(String value) {
        setCollcollate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgCollationRecord value7(String value) {
        setCollctype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgCollationRecord value8(String value) {
        setCollversion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgCollationRecord values(String value1, Long value2, Long value3, String value4, Integer value5, String value6, String value7, String value8) {
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
     * Create a detached PgCollationRecord
     */
    public PgCollationRecord() {
        super(PgCollation.PG_COLLATION);
    }

    /**
     * Create a detached, initialised PgCollationRecord
     */
    public PgCollationRecord(String collname, Long collnamespace, Long collowner, String collprovider, Integer collencoding, String collcollate, String collctype, String collversion) {
        super(PgCollation.PG_COLLATION);

        set(0, collname);
        set(1, collnamespace);
        set(2, collowner);
        set(3, collprovider);
        set(4, collencoding);
        set(5, collcollate);
        set(6, collctype);
        set(7, collversion);
    }
}
