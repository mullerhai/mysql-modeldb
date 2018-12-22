/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.routines;


import javax.annotation.Generated;

import jooq.postgresql.gen.pg_catalog.PgCatalog;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


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
public class JsonbObjectFieldText extends AbstractRoutine<String> {

    private static final long serialVersionUID = -909051009;

    /**
     * The parameter <code>pg_catalog.jsonb_object_field_text.RETURN_VALUE</code>.
     */
    public static final Parameter<String> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> FROM_JSON = createParameter("from_json", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"jsonb\""), false, false);

    /**
     * The parameter <code>pg_catalog.jsonb_object_field_text.field_name</code>.
     */
    public static final Parameter<String> FIELD_NAME = createParameter("field_name", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * Create a new routine call instance
     */
    public JsonbObjectFieldText() {
        super("jsonb_object_field_text", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.CLOB);

        setReturnParameter(RETURN_VALUE);
        addInParameter(FROM_JSON);
        addInParameter(FIELD_NAME);
    }

    /**
     * Set the <code>from_json</code> parameter IN value to the routine
     */
    public void setFromJson(Object value) {
        setValue(FROM_JSON, value);
    }

    /**
     * Set the <code>from_json</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setFromJson(Field<Object> field) {
        setField(FROM_JSON, field);
    }

    /**
     * Set the <code>field_name</code> parameter IN value to the routine
     */
    public void setFieldName(String value) {
        setValue(FIELD_NAME, value);
    }

    /**
     * Set the <code>field_name</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setFieldName(Field<String> field) {
        setField(FIELD_NAME, field);
    }
}
