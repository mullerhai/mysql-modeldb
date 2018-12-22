/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.routines;


import javax.annotation.Generated;

import jooq.postgresql.gen.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.impl.AbstractRoutine;



/**
 * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
 */
@java.lang.Deprecated
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CursorToXmlschema extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 92999236;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"xml\""), false, false);

    /**
     * The parameter <code>pg_catalog.cursor_to_xmlschema.cursor</code>.
     */
    public static final Parameter<Result<Record>> CURSOR = createParameter("cursor", org.jooq.impl.SQLDataType.RESULT, false, false);

    /**
     * The parameter <code>pg_catalog.cursor_to_xmlschema.nulls</code>.
     */
    public static final Parameter<Boolean> NULLS = createParameter("nulls", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>pg_catalog.cursor_to_xmlschema.tableforest</code>.
     */
    public static final Parameter<Boolean> TABLEFOREST = createParameter("tableforest", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>pg_catalog.cursor_to_xmlschema.targetns</code>.
     */
    public static final Parameter<String> TARGETNS = createParameter("targetns", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public CursorToXmlschema() {
        super("cursor_to_xmlschema", PgCatalog.PG_CATALOG, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"xml\""));

        setReturnParameter(RETURN_VALUE);
        addInParameter(CURSOR);
        addInParameter(NULLS);
        addInParameter(TABLEFOREST);
        addInParameter(TARGETNS);
    }

    /**
     * Set the <code>cursor</code> parameter IN value to the routine
     */
    public void setCursor(Result<Record> value) {
        setValue(CURSOR, value);
    }

    /**
     * Set the <code>cursor</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setCursor(Field<Result<Record>> field) {
        setField(CURSOR, field);
    }

    /**
     * Set the <code>nulls</code> parameter IN value to the routine
     */
    public void setNulls(Boolean value) {
        setValue(NULLS, value);
    }

    /**
     * Set the <code>nulls</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setNulls(Field<Boolean> field) {
        setField(NULLS, field);
    }

    /**
     * Set the <code>tableforest</code> parameter IN value to the routine
     */
    public void setTableforest(Boolean value) {
        setValue(TABLEFOREST, value);
    }

    /**
     * Set the <code>tableforest</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setTableforest(Field<Boolean> field) {
        setField(TABLEFOREST, field);
    }

    /**
     * Set the <code>targetns</code> parameter IN value to the routine
     */
    public void setTargetns(String value) {
        setValue(TARGETNS, value);
    }

    /**
     * Set the <code>targetns</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setTargetns(Field<String> field) {
        setField(TARGETNS, field);
    }
}
