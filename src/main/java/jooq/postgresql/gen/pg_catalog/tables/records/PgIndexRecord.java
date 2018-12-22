/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.tables.records;


import javax.annotation.Generated;

import jooq.postgresql.gen.pg_catalog.tables.PgIndex;

import org.jooq.Field;
import org.jooq.Record19;
import org.jooq.Row19;
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
public class PgIndexRecord extends TableRecordImpl<PgIndexRecord> implements Record19<Long, Long, Short, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Object[], Long[], Long[], Object[], Object, Object> {

    private static final long serialVersionUID = 1393967328;

    /**
     * Setter for <code>pg_catalog.pg_index.indexrelid</code>.
     */
    public void setIndexrelid(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indexrelid</code>.
     */
    public Long getIndexrelid() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indrelid</code>.
     */
    public void setIndrelid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indrelid</code>.
     */
    public Long getIndrelid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indnatts</code>.
     */
    public void setIndnatts(Short value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indnatts</code>.
     */
    public Short getIndnatts() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indisunique</code>.
     */
    public void setIndisunique(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indisunique</code>.
     */
    public Boolean getIndisunique() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indisprimary</code>.
     */
    public void setIndisprimary(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indisprimary</code>.
     */
    public Boolean getIndisprimary() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indisexclusion</code>.
     */
    public void setIndisexclusion(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indisexclusion</code>.
     */
    public Boolean getIndisexclusion() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indimmediate</code>.
     */
    public void setIndimmediate(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indimmediate</code>.
     */
    public Boolean getIndimmediate() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indisclustered</code>.
     */
    public void setIndisclustered(Boolean value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indisclustered</code>.
     */
    public Boolean getIndisclustered() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indisvalid</code>.
     */
    public void setIndisvalid(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indisvalid</code>.
     */
    public Boolean getIndisvalid() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indcheckxmin</code>.
     */
    public void setIndcheckxmin(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indcheckxmin</code>.
     */
    public Boolean getIndcheckxmin() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indisready</code>.
     */
    public void setIndisready(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indisready</code>.
     */
    public Boolean getIndisready() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indislive</code>.
     */
    public void setIndislive(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indislive</code>.
     */
    public Boolean getIndislive() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indisreplident</code>.
     */
    public void setIndisreplident(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indisreplident</code>.
     */
    public Boolean getIndisreplident() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indkey</code>.
     */
    public void setIndkey(Object... value) {
        set(13, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indkey</code>.
     */
    public Object[] getIndkey() {
        return (Object[]) get(13);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indcollation</code>.
     */
    public void setIndcollation(Long... value) {
        set(14, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indcollation</code>.
     */
    public Long[] getIndcollation() {
        return (Long[]) get(14);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indclass</code>.
     */
    public void setIndclass(Long... value) {
        set(15, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indclass</code>.
     */
    public Long[] getIndclass() {
        return (Long[]) get(15);
    }

    /**
     * Setter for <code>pg_catalog.pg_index.indoption</code>.
     */
    public void setIndoption(Object... value) {
        set(16, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_index.indoption</code>.
     */
    public Object[] getIndoption() {
        return (Object[]) get(16);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setIndexprs(Object value) {
        set(17, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getIndexprs() {
        return get(17);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setIndpred(Object value) {
        set(18, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getIndpred() {
        return get(18);
    }

    // -------------------------------------------------------------------------
    // Record19 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Long, Long, Short, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Object[], Long[], Long[], Object[], Object, Object> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Long, Long, Short, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Boolean, Object[], Long[], Long[], Object[], Object, Object> valuesRow() {
        return (Row19) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgIndex.PG_INDEX.INDEXRELID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PgIndex.PG_INDEX.INDRELID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return PgIndex.PG_INDEX.INDNATTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return PgIndex.PG_INDEX.INDISUNIQUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return PgIndex.PG_INDEX.INDISPRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field6() {
        return PgIndex.PG_INDEX.INDISEXCLUSION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return PgIndex.PG_INDEX.INDIMMEDIATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return PgIndex.PG_INDEX.INDISCLUSTERED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return PgIndex.PG_INDEX.INDISVALID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return PgIndex.PG_INDEX.INDCHECKXMIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return PgIndex.PG_INDEX.INDISREADY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return PgIndex.PG_INDEX.INDISLIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field13() {
        return PgIndex.PG_INDEX.INDISREPLIDENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object[]> field14() {
        return PgIndex.PG_INDEX.INDKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long[]> field15() {
        return PgIndex.PG_INDEX.INDCOLLATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long[]> field16() {
        return PgIndex.PG_INDEX.INDCLASS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Object[]> field17() {
        return PgIndex.PG_INDEX.INDOPTION;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field18() {
        return PgIndex.PG_INDEX.INDEXPRS;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field19() {
        return PgIndex.PG_INDEX.INDPRED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getIndexrelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getIndrelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
        return getIndnatts();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getIndisunique();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getIndisprimary();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component6() {
        return getIndisexclusion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getIndimmediate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component8() {
        return getIndisclustered();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component9() {
        return getIndisvalid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getIndcheckxmin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component11() {
        return getIndisready();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component12() {
        return getIndislive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component13() {
        return getIndisreplident();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object[] component14() {
        return getIndkey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long[] component15() {
        return getIndcollation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long[] component16() {
        return getIndclass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object[] component17() {
        return getIndoption();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object component18() {
        return getIndexprs();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object component19() {
        return getIndpred();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getIndexrelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getIndrelid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getIndnatts();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getIndisunique();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getIndisprimary();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value6() {
        return getIndisexclusion();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getIndimmediate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getIndisclustered();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getIndisvalid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getIndcheckxmin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getIndisready();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getIndislive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value13() {
        return getIndisreplident();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object[] value14() {
        return getIndkey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long[] value15() {
        return getIndcollation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long[] value16() {
        return getIndclass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object[] value17() {
        return getIndoption();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object value18() {
        return getIndexprs();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object value19() {
        return getIndpred();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgIndexRecord value1(Long value) {
        setIndexrelid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgIndexRecord value2(Long value) {
        setIndrelid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgIndexRecord value3(Short value) {
        setIndnatts(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgIndexRecord value4(Boolean value) {
        setIndisunique(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgIndexRecord value5(Boolean value) {
        setIndisprimary(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgIndexRecord value6(Boolean value) {
        setIndisexclusion(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgIndexRecord value7(Boolean value) {
        setIndimmediate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgIndexRecord value8(Boolean value) {
        setIndisclustered(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgIndexRecord value9(Boolean value) {
        setIndisvalid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgIndexRecord value10(Boolean value) {
        setIndcheckxmin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgIndexRecord value11(Boolean value) {
        setIndisready(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgIndexRecord value12(Boolean value) {
        setIndislive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgIndexRecord value13(Boolean value) {
        setIndisreplident(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgIndexRecord value14(Object... value) {
        setIndkey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgIndexRecord value15(Long... value) {
        setIndcollation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgIndexRecord value16(Long... value) {
        setIndclass(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgIndexRecord value17(Object... value) {
        setIndoption(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public PgIndexRecord value18(Object value) {
        setIndexprs(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public PgIndexRecord value19(Object value) {
        setIndpred(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgIndexRecord values(Long value1, Long value2, Short value3, Boolean value4, Boolean value5, Boolean value6, Boolean value7, Boolean value8, Boolean value9, Boolean value10, Boolean value11, Boolean value12, Boolean value13, Object[] value14, Long[] value15, Long[] value16, Object[] value17, Object value18, Object value19) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgIndexRecord
     */
    public PgIndexRecord() {
        super(PgIndex.PG_INDEX);
    }

    /**
     * Create a detached, initialised PgIndexRecord
     */
    public PgIndexRecord(Long indexrelid, Long indrelid, Short indnatts, Boolean indisunique, Boolean indisprimary, Boolean indisexclusion, Boolean indimmediate, Boolean indisclustered, Boolean indisvalid, Boolean indcheckxmin, Boolean indisready, Boolean indislive, Boolean indisreplident, Object[] indkey, Long[] indcollation, Long[] indclass, Object[] indoption, Object indexprs, Object indpred) {
        super(PgIndex.PG_INDEX);

        set(0, indexrelid);
        set(1, indrelid);
        set(2, indnatts);
        set(3, indisunique);
        set(4, indisprimary);
        set(5, indisexclusion);
        set(6, indimmediate);
        set(7, indisclustered);
        set(8, indisvalid);
        set(9, indcheckxmin);
        set(10, indisready);
        set(11, indislive);
        set(12, indisreplident);
        set(13, indkey);
        set(14, indcollation);
        set(15, indclass);
        set(16, indoption);
        set(17, indexprs);
        set(18, indpred);
    }
}
