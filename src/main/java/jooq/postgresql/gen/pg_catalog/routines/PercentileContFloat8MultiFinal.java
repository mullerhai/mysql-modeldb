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
public class PercentileContFloat8MultiFinal extends AbstractRoutine<Double[]> {

    private static final long serialVersionUID = -1375700090;

    /**
     * The parameter <code>pg_catalog.percentile_cont_float8_multi_final.RETURN_VALUE</code>.
     */
    public static final Parameter<Double[]> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.FLOAT.getArrayDataType(), false, false);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> _1 = createParameter("_1", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"internal\""), false, true);

    /**
     * The parameter <code>pg_catalog.percentile_cont_float8_multi_final._2</code>.
     */
    public static final Parameter<Double[]> _2 = createParameter("_2", org.jooq.impl.SQLDataType.FLOAT.getArrayDataType(), false, true);

    /**
     * Create a new routine call instance
     */
    public PercentileContFloat8MultiFinal() {
        super("percentile_cont_float8_multi_final", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.FLOAT.getArrayDataType());

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Object value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Object> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Double... value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<Double[]> field) {
        setField(_2, field);
    }
}
