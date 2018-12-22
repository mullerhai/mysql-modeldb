/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.tables.records;


import javax.annotation.Generated;

import jooq.postgresql.gen.pg_catalog.tables.PgConstraint;

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
public class PgConstraintRecord extends TableRecordImpl<PgConstraintRecord> {

    private static final long serialVersionUID = -900307861;

    /**
     * Setter for <code>pg_catalog.pg_constraint.conname</code>.
     */
    public void setConname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.conname</code>.
     */
    public String getConname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.connamespace</code>.
     */
    public void setConnamespace(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.connamespace</code>.
     */
    public Long getConnamespace() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.contype</code>.
     */
    public void setContype(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.contype</code>.
     */
    public String getContype() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.condeferrable</code>.
     */
    public void setCondeferrable(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.condeferrable</code>.
     */
    public Boolean getCondeferrable() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.condeferred</code>.
     */
    public void setCondeferred(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.condeferred</code>.
     */
    public Boolean getCondeferred() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.convalidated</code>.
     */
    public void setConvalidated(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.convalidated</code>.
     */
    public Boolean getConvalidated() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.conrelid</code>.
     */
    public void setConrelid(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.conrelid</code>.
     */
    public Long getConrelid() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.contypid</code>.
     */
    public void setContypid(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.contypid</code>.
     */
    public Long getContypid() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.conindid</code>.
     */
    public void setConindid(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.conindid</code>.
     */
    public Long getConindid() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.confrelid</code>.
     */
    public void setConfrelid(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.confrelid</code>.
     */
    public Long getConfrelid() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.confupdtype</code>.
     */
    public void setConfupdtype(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.confupdtype</code>.
     */
    public String getConfupdtype() {
        return (String) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.confdeltype</code>.
     */
    public void setConfdeltype(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.confdeltype</code>.
     */
    public String getConfdeltype() {
        return (String) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.confmatchtype</code>.
     */
    public void setConfmatchtype(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.confmatchtype</code>.
     */
    public String getConfmatchtype() {
        return (String) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.conislocal</code>.
     */
    public void setConislocal(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.conislocal</code>.
     */
    public Boolean getConislocal() {
        return (Boolean) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.coninhcount</code>.
     */
    public void setConinhcount(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.coninhcount</code>.
     */
    public Integer getConinhcount() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.connoinherit</code>.
     */
    public void setConnoinherit(Boolean value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.connoinherit</code>.
     */
    public Boolean getConnoinherit() {
        return (Boolean) get(15);
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.conkey</code>.
     */
    public void setConkey(Short... value) {
        set(16, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.conkey</code>.
     */
    public Short[] getConkey() {
        return (Short[]) get(16);
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.confkey</code>.
     */
    public void setConfkey(Short... value) {
        set(17, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.confkey</code>.
     */
    public Short[] getConfkey() {
        return (Short[]) get(17);
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.conpfeqop</code>.
     */
    public void setConpfeqop(Long... value) {
        set(18, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.conpfeqop</code>.
     */
    public Long[] getConpfeqop() {
        return (Long[]) get(18);
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.conppeqop</code>.
     */
    public void setConppeqop(Long... value) {
        set(19, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.conppeqop</code>.
     */
    public Long[] getConppeqop() {
        return (Long[]) get(19);
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.conffeqop</code>.
     */
    public void setConffeqop(Long... value) {
        set(20, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.conffeqop</code>.
     */
    public Long[] getConffeqop() {
        return (Long[]) get(20);
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.conexclop</code>.
     */
    public void setConexclop(Long... value) {
        set(21, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.conexclop</code>.
     */
    public Long[] getConexclop() {
        return (Long[]) get(21);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setConbin(Object value) {
        set(22, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getConbin() {
        return get(22);
    }

    /**
     * Setter for <code>pg_catalog.pg_constraint.consrc</code>.
     */
    public void setConsrc(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_constraint.consrc</code>.
     */
    public String getConsrc() {
        return (String) get(23);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgConstraintRecord
     */
    public PgConstraintRecord() {
        super(PgConstraint.PG_CONSTRAINT);
    }

    /**
     * Create a detached, initialised PgConstraintRecord
     */
    public PgConstraintRecord(String conname, Long connamespace, String contype, Boolean condeferrable, Boolean condeferred, Boolean convalidated, Long conrelid, Long contypid, Long conindid, Long confrelid, String confupdtype, String confdeltype, String confmatchtype, Boolean conislocal, Integer coninhcount, Boolean connoinherit, Short[] conkey, Short[] confkey, Long[] conpfeqop, Long[] conppeqop, Long[] conffeqop, Long[] conexclop, Object conbin, String consrc) {
        super(PgConstraint.PG_CONSTRAINT);

        set(0, conname);
        set(1, connamespace);
        set(2, contype);
        set(3, condeferrable);
        set(4, condeferred);
        set(5, convalidated);
        set(6, conrelid);
        set(7, contypid);
        set(8, conindid);
        set(9, confrelid);
        set(10, confupdtype);
        set(11, confdeltype);
        set(12, confmatchtype);
        set(13, conislocal);
        set(14, coninhcount);
        set(15, connoinherit);
        set(16, conkey);
        set(17, confkey);
        set(18, conpfeqop);
        set(19, conppeqop);
        set(20, conffeqop);
        set(21, conexclop);
        set(22, conbin);
        set(23, consrc);
    }
}
