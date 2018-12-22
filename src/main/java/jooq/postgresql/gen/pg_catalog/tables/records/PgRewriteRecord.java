/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.tables.records;


import javax.annotation.Generated;

import jooq.postgresql.gen.pg_catalog.tables.PgRewrite;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
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
public class PgRewriteRecord extends TableRecordImpl<PgRewriteRecord> implements Record7<String, Long, String, String, Boolean, Object, Object> {

    private static final long serialVersionUID = 310195105;

    /**
     * Setter for <code>pg_catalog.pg_rewrite.rulename</code>.
     */
    public void setRulename(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_rewrite.rulename</code>.
     */
    public String getRulename() {
        return (String) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_rewrite.ev_class</code>.
     */
    public void setEvClass(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_rewrite.ev_class</code>.
     */
    public Long getEvClass() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_rewrite.ev_type</code>.
     */
    public void setEvType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_rewrite.ev_type</code>.
     */
    public String getEvType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_rewrite.ev_enabled</code>.
     */
    public void setEvEnabled(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_rewrite.ev_enabled</code>.
     */
    public String getEvEnabled() {
        return (String) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_rewrite.is_instead</code>.
     */
    public void setIsInstead(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_rewrite.is_instead</code>.
     */
    public Boolean getIsInstead() {
        return (Boolean) get(4);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setEvQual(Object value) {
        set(5, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getEvQual() {
        return get(5);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setEvAction(Object value) {
        set(6, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getEvAction() {
        return get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, Long, String, String, Boolean, Object, Object> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, Long, String, String, Boolean, Object, Object> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgRewrite.PG_REWRITE.RULENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgRewrite.PG_REWRITE.EV_CLASS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return PgRewrite.PG_REWRITE.EV_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return PgRewrite.PG_REWRITE.EV_ENABLED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return PgRewrite.PG_REWRITE.IS_INSTEAD;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field6() {
        return PgRewrite.PG_REWRITE.EV_QUAL;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field7() {
        return PgRewrite.PG_REWRITE.EV_ACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getRulename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getEvClass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getEvType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getEvEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getIsInstead();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object component6() {
        return getEvQual();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object component7() {
        return getEvAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getRulename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getEvClass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getEvType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getEvEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getIsInstead();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object value6() {
        return getEvQual();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object value7() {
        return getEvAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRewriteRecord value1(String value) {
        setRulename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRewriteRecord value2(Long value) {
        setEvClass(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRewriteRecord value3(String value) {
        setEvType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRewriteRecord value4(String value) {
        setEvEnabled(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRewriteRecord value5(Boolean value) {
        setIsInstead(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public PgRewriteRecord value6(Object value) {
        setEvQual(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public PgRewriteRecord value7(Object value) {
        setEvAction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgRewriteRecord values(String value1, Long value2, String value3, String value4, Boolean value5, Object value6, Object value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgRewriteRecord
     */
    public PgRewriteRecord() {
        super(PgRewrite.PG_REWRITE);
    }

    /**
     * Create a detached, initialised PgRewriteRecord
     */
    public PgRewriteRecord(String rulename, Long evClass, String evType, String evEnabled, Boolean isInstead, Object evQual, Object evAction) {
        super(PgRewrite.PG_REWRITE);

        set(0, rulename);
        set(1, evClass);
        set(2, evType);
        set(3, evEnabled);
        set(4, isInstead);
        set(5, evQual);
        set(6, evAction);
    }
}
