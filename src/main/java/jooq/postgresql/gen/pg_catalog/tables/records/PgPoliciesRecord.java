/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.tables.records;


import javax.annotation.Generated;

import jooq.postgresql.gen.pg_catalog.tables.PgPolicies;

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
public class PgPoliciesRecord extends TableRecordImpl<PgPoliciesRecord> implements Record8<String, String, String, String, String[], String, String, String> {

    private static final long serialVersionUID = -1427401969;

    /**
     * Setter for <code>pg_catalog.pg_policies.schemaname</code>.
     */
    public void setSchemaname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_policies.schemaname</code>.
     */
    public String getSchemaname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_policies.tablename</code>.
     */
    public void setTablename(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_policies.tablename</code>.
     */
    public String getTablename() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_policies.policyname</code>.
     */
    public void setPolicyname(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_policies.policyname</code>.
     */
    public String getPolicyname() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_policies.permissive</code>.
     */
    public void setPermissive(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_policies.permissive</code>.
     */
    public String getPermissive() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_policies.roles</code>.
     */
    public void setRoles(String... value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_policies.roles</code>.
     */
    public String[] getRoles() {
        return (String[]) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_policies.cmd</code>.
     */
    public void setCmd(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_policies.cmd</code>.
     */
    public String getCmd() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_policies.qual</code>.
     */
    public void setQual(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_policies.qual</code>.
     */
    public String getQual() {
        return (String) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_policies.with_check</code>.
     */
    public void setWithCheck(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_policies.with_check</code>.
     */
    public String getWithCheck() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, String, String[], String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, String, String[], String, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgPolicies.PG_POLICIES.SCHEMANAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgPolicies.PG_POLICIES.TABLENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PgPolicies.PG_POLICIES.POLICYNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return PgPolicies.PG_POLICIES.PERMISSIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field5() {
        return PgPolicies.PG_POLICIES.ROLES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return PgPolicies.PG_POLICIES.CMD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return PgPolicies.PG_POLICIES.QUAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return PgPolicies.PG_POLICIES.WITH_CHECK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getSchemaname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTablename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPolicyname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getPermissive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component5() {
        return getRoles();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getCmd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getQual();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getWithCheck();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getSchemaname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTablename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPolicyname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPermissive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value5() {
        return getRoles();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCmd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getQual();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getWithCheck();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPoliciesRecord value1(String value) {
        setSchemaname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPoliciesRecord value2(String value) {
        setTablename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPoliciesRecord value3(String value) {
        setPolicyname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPoliciesRecord value4(String value) {
        setPermissive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPoliciesRecord value5(String... value) {
        setRoles(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPoliciesRecord value6(String value) {
        setCmd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPoliciesRecord value7(String value) {
        setQual(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPoliciesRecord value8(String value) {
        setWithCheck(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPoliciesRecord values(String value1, String value2, String value3, String value4, String[] value5, String value6, String value7, String value8) {
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
     * Create a detached PgPoliciesRecord
     */
    public PgPoliciesRecord() {
        super(PgPolicies.PG_POLICIES);
    }

    /**
     * Create a detached, initialised PgPoliciesRecord
     */
    public PgPoliciesRecord(String schemaname, String tablename, String policyname, String permissive, String[] roles, String cmd, String qual, String withCheck) {
        super(PgPolicies.PG_POLICIES);

        set(0, schemaname);
        set(1, tablename);
        set(2, policyname);
        set(3, permissive);
        set(4, roles);
        set(5, cmd);
        set(6, qual);
        set(7, withCheck);
    }
}
