/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.tables.records;


import javax.annotation.Generated;

import jooq.postgresql.gen.pg_catalog.tables.PgPltemplate;

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
public class PgPltemplateRecord extends TableRecordImpl<PgPltemplateRecord> implements Record8<String, Boolean, Boolean, String, String, String, String, String[]> {

    private static final long serialVersionUID = -1847869136;

    /**
     * Setter for <code>pg_catalog.pg_pltemplate.tmplname</code>.
     */
    public void setTmplname(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_pltemplate.tmplname</code>.
     */
    public String getTmplname() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_pltemplate.tmpltrusted</code>.
     */
    public void setTmpltrusted(Boolean value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_pltemplate.tmpltrusted</code>.
     */
    public Boolean getTmpltrusted() {
        return (Boolean) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_pltemplate.tmpldbacreate</code>.
     */
    public void setTmpldbacreate(Boolean value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_pltemplate.tmpldbacreate</code>.
     */
    public Boolean getTmpldbacreate() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_pltemplate.tmplhandler</code>.
     */
    public void setTmplhandler(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_pltemplate.tmplhandler</code>.
     */
    public String getTmplhandler() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_pltemplate.tmplinline</code>.
     */
    public void setTmplinline(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_pltemplate.tmplinline</code>.
     */
    public String getTmplinline() {
        return (String) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_pltemplate.tmplvalidator</code>.
     */
    public void setTmplvalidator(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_pltemplate.tmplvalidator</code>.
     */
    public String getTmplvalidator() {
        return (String) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_pltemplate.tmpllibrary</code>.
     */
    public void setTmpllibrary(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_pltemplate.tmpllibrary</code>.
     */
    public String getTmpllibrary() {
        return (String) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_pltemplate.tmplacl</code>.
     */
    public void setTmplacl(String... value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_pltemplate.tmplacl</code>.
     */
    public String[] getTmplacl() {
        return (String[]) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, Boolean, Boolean, String, String, String, String, String[]> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, Boolean, Boolean, String, String, String, String, String[]> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgPltemplate.PG_PLTEMPLATE.TMPLNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field2() {
        return PgPltemplate.PG_PLTEMPLATE.TMPLTRUSTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return PgPltemplate.PG_PLTEMPLATE.TMPLDBACREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return PgPltemplate.PG_PLTEMPLATE.TMPLHANDLER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return PgPltemplate.PG_PLTEMPLATE.TMPLINLINE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return PgPltemplate.PG_PLTEMPLATE.TMPLVALIDATOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return PgPltemplate.PG_PLTEMPLATE.TMPLLIBRARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field8() {
        return PgPltemplate.PG_PLTEMPLATE.TMPLACL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getTmplname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component2() {
        return getTmpltrusted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component3() {
        return getTmpldbacreate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTmplhandler();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getTmplinline();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getTmplvalidator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getTmpllibrary();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component8() {
        return getTmplacl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getTmplname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value2() {
        return getTmpltrusted();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value3() {
        return getTmpldbacreate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTmplhandler();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTmplinline();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTmplvalidator();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getTmpllibrary();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value8() {
        return getTmplacl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPltemplateRecord value1(String value) {
        setTmplname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPltemplateRecord value2(Boolean value) {
        setTmpltrusted(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPltemplateRecord value3(Boolean value) {
        setTmpldbacreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPltemplateRecord value4(String value) {
        setTmplhandler(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPltemplateRecord value5(String value) {
        setTmplinline(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPltemplateRecord value6(String value) {
        setTmplvalidator(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPltemplateRecord value7(String value) {
        setTmpllibrary(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPltemplateRecord value8(String... value) {
        setTmplacl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPltemplateRecord values(String value1, Boolean value2, Boolean value3, String value4, String value5, String value6, String value7, String[] value8) {
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
     * Create a detached PgPltemplateRecord
     */
    public PgPltemplateRecord() {
        super(PgPltemplate.PG_PLTEMPLATE);
    }

    /**
     * Create a detached, initialised PgPltemplateRecord
     */
    public PgPltemplateRecord(String tmplname, Boolean tmpltrusted, Boolean tmpldbacreate, String tmplhandler, String tmplinline, String tmplvalidator, String tmpllibrary, String[] tmplacl) {
        super(PgPltemplate.PG_PLTEMPLATE);

        set(0, tmplname);
        set(1, tmpltrusted);
        set(2, tmpldbacreate);
        set(3, tmplhandler);
        set(4, tmplinline);
        set(5, tmplvalidator);
        set(6, tmpllibrary);
        set(7, tmplacl);
    }
}