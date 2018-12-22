/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.tables.records;


import javax.annotation.Generated;

import jooq.postgresql.gen.pg_catalog.tables.PgOpclass;

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
public class PgOpclassRecord extends TableRecordImpl<PgOpclassRecord> implements Record8<Long, String, Long, Long, Long, Long, Boolean, Long> {

    private static final long serialVersionUID = 1937601784;

    /**
     * Setter for <code>pg_catalog.pg_opclass.opcmethod</code>.
     */
    public void setOpcmethod(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opclass.opcmethod</code>.
     */
    public Long getOpcmethod() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_opclass.opcname</code>.
     */
    public void setOpcname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opclass.opcname</code>.
     */
    public String getOpcname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_opclass.opcnamespace</code>.
     */
    public void setOpcnamespace(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opclass.opcnamespace</code>.
     */
    public Long getOpcnamespace() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_opclass.opcowner</code>.
     */
    public void setOpcowner(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opclass.opcowner</code>.
     */
    public Long getOpcowner() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_opclass.opcfamily</code>.
     */
    public void setOpcfamily(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opclass.opcfamily</code>.
     */
    public Long getOpcfamily() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_opclass.opcintype</code>.
     */
    public void setOpcintype(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opclass.opcintype</code>.
     */
    public Long getOpcintype() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_opclass.opcdefault</code>.
     */
    public void setOpcdefault(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opclass.opcdefault</code>.
     */
    public Boolean getOpcdefault() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_opclass.opckeytype</code>.
     */
    public void setOpckeytype(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_opclass.opckeytype</code>.
     */
    public Long getOpckeytype() {
        return (Long) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, Long, Long, Long, Long, Boolean, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<Long, String, Long, Long, Long, Long, Boolean, Long> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgOpclass.PG_OPCLASS.OPCMETHOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgOpclass.PG_OPCLASS.OPCNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return PgOpclass.PG_OPCLASS.OPCNAMESPACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return PgOpclass.PG_OPCLASS.OPCOWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return PgOpclass.PG_OPCLASS.OPCFAMILY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return PgOpclass.PG_OPCLASS.OPCINTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return PgOpclass.PG_OPCLASS.OPCDEFAULT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return PgOpclass.PG_OPCLASS.OPCKEYTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getOpcmethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getOpcname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getOpcnamespace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getOpcowner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getOpcfamily();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getOpcintype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getOpcdefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
        return getOpckeytype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getOpcmethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getOpcname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getOpcnamespace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getOpcowner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getOpcfamily();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getOpcintype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getOpcdefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getOpckeytype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgOpclassRecord value1(Long value) {
        setOpcmethod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgOpclassRecord value2(String value) {
        setOpcname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgOpclassRecord value3(Long value) {
        setOpcnamespace(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgOpclassRecord value4(Long value) {
        setOpcowner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgOpclassRecord value5(Long value) {
        setOpcfamily(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgOpclassRecord value6(Long value) {
        setOpcintype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgOpclassRecord value7(Boolean value) {
        setOpcdefault(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgOpclassRecord value8(Long value) {
        setOpckeytype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgOpclassRecord values(Long value1, String value2, Long value3, Long value4, Long value5, Long value6, Boolean value7, Long value8) {
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
     * Create a detached PgOpclassRecord
     */
    public PgOpclassRecord() {
        super(PgOpclass.PG_OPCLASS);
    }

    /**
     * Create a detached, initialised PgOpclassRecord
     */
    public PgOpclassRecord(Long opcmethod, String opcname, Long opcnamespace, Long opcowner, Long opcfamily, Long opcintype, Boolean opcdefault, Long opckeytype) {
        super(PgOpclass.PG_OPCLASS);

        set(0, opcmethod);
        set(1, opcname);
        set(2, opcnamespace);
        set(3, opcowner);
        set(4, opcfamily);
        set(5, opcintype);
        set(6, opcdefault);
        set(7, opckeytype);
    }
}
