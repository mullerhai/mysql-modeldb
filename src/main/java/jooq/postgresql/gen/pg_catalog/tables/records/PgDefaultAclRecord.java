/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.tables.records;


import javax.annotation.Generated;

import jooq.postgresql.gen.pg_catalog.tables.PgDefaultAcl;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class PgDefaultAclRecord extends TableRecordImpl<PgDefaultAclRecord> implements Record4<Long, Long, String, String[]> {

    private static final long serialVersionUID = 1306078988;

    /**
     * Setter for <code>pg_catalog.pg_default_acl.defaclrole</code>.
     */
    public void setDefaclrole(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_default_acl.defaclrole</code>.
     */
    public Long getDefaclrole() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_default_acl.defaclnamespace</code>.
     */
    public void setDefaclnamespace(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_default_acl.defaclnamespace</code>.
     */
    public Long getDefaclnamespace() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_default_acl.defaclobjtype</code>.
     */
    public void setDefaclobjtype(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_default_acl.defaclobjtype</code>.
     */
    public String getDefaclobjtype() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_default_acl.defaclacl</code>.
     */
    public void setDefaclacl(String... value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_default_acl.defaclacl</code>.
     */
    public String[] getDefaclacl() {
        return (String[]) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, String, String[]> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, Long, String, String[]> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgDefaultAcl.PG_DEFAULT_ACL.DEFACLROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgDefaultAcl.PG_DEFAULT_ACL.DEFACLNAMESPACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PgDefaultAcl.PG_DEFAULT_ACL.DEFACLOBJTYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field4() {
        return PgDefaultAcl.PG_DEFAULT_ACL.DEFACLACL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getDefaclrole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getDefaclnamespace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDefaclobjtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component4() {
        return getDefaclacl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getDefaclrole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getDefaclnamespace();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDefaclobjtype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value4() {
        return getDefaclacl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDefaultAclRecord value1(Long value) {
        setDefaclrole(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDefaultAclRecord value2(Long value) {
        setDefaclnamespace(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDefaultAclRecord value3(String value) {
        setDefaclobjtype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDefaultAclRecord value4(String... value) {
        setDefaclacl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgDefaultAclRecord values(Long value1, Long value2, String value3, String[] value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgDefaultAclRecord
     */
    public PgDefaultAclRecord() {
        super(PgDefaultAcl.PG_DEFAULT_ACL);
    }

    /**
     * Create a detached, initialised PgDefaultAclRecord
     */
    public PgDefaultAclRecord(Long defaclrole, Long defaclnamespace, String defaclobjtype, String[] defaclacl) {
        super(PgDefaultAcl.PG_DEFAULT_ACL);

        set(0, defaclrole);
        set(1, defaclnamespace);
        set(2, defaclobjtype);
        set(3, defaclacl);
    }
}
