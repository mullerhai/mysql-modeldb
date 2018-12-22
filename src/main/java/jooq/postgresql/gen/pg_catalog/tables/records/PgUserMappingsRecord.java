/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.tables.records;


import javax.annotation.Generated;

import jooq.postgresql.gen.pg_catalog.tables.PgUserMappings;

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
public class PgUserMappingsRecord extends TableRecordImpl<PgUserMappingsRecord> implements Record6<Long, Long, String, Long, String, String[]> {

    private static final long serialVersionUID = 421440750;

    /**
     * Setter for <code>pg_catalog.pg_user_mappings.umid</code>.
     */
    public void setUmid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user_mappings.umid</code>.
     */
    public Long getUmid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_user_mappings.srvid</code>.
     */
    public void setSrvid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user_mappings.srvid</code>.
     */
    public Long getSrvid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_user_mappings.srvname</code>.
     */
    public void setSrvname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user_mappings.srvname</code>.
     */
    public String getSrvname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_user_mappings.umuser</code>.
     */
    public void setUmuser(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user_mappings.umuser</code>.
     */
    public Long getUmuser() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_user_mappings.usename</code>.
     */
    public void setUsename(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user_mappings.usename</code>.
     */
    public String getUsename() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_user_mappings.umoptions</code>.
     */
    public void setUmoptions(String... value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_user_mappings.umoptions</code>.
     */
    public String[] getUmoptions() {
        return (String[]) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Long, String, Long, String, String[]> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Long, String, Long, String, String[]> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgUserMappings.PG_USER_MAPPINGS.UMID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgUserMappings.PG_USER_MAPPINGS.SRVID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PgUserMappings.PG_USER_MAPPINGS.SRVNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return PgUserMappings.PG_USER_MAPPINGS.UMUSER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return PgUserMappings.PG_USER_MAPPINGS.USENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field6() {
        return PgUserMappings.PG_USER_MAPPINGS.UMOPTIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getUmid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getSrvid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSrvname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getUmuser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getUsename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component6() {
        return getUmoptions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getUmid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getSrvid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSrvname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getUmuser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUsename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value6() {
        return getUmoptions();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgUserMappingsRecord value1(Long value) {
        setUmid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgUserMappingsRecord value2(Long value) {
        setSrvid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgUserMappingsRecord value3(String value) {
        setSrvname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgUserMappingsRecord value4(Long value) {
        setUmuser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgUserMappingsRecord value5(String value) {
        setUsename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgUserMappingsRecord value6(String... value) {
        setUmoptions(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgUserMappingsRecord values(Long value1, Long value2, String value3, Long value4, String value5, String[] value6) {
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
     * Create a detached PgUserMappingsRecord
     */
    public PgUserMappingsRecord() {
        super(PgUserMappings.PG_USER_MAPPINGS);
    }

    /**
     * Create a detached, initialised PgUserMappingsRecord
     */
    public PgUserMappingsRecord(Long umid, Long srvid, String srvname, Long umuser, String usename, String[] umoptions) {
        super(PgUserMappings.PG_USER_MAPPINGS);

        set(0, umid);
        set(1, srvid);
        set(2, srvname);
        set(3, umuser);
        set(4, usename);
        set(5, umoptions);
    }
}
