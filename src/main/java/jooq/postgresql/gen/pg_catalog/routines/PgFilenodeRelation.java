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
public class PgFilenodeRelation extends AbstractRoutine<Object> {

    private static final long serialVersionUID = 1744212786;

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""), false, false);

    /**
     * The parameter <code>pg_catalog.pg_filenode_relation._1</code>.
     */
    public static final Parameter<Long> _1 = createParameter("_1", org.jooq.impl.SQLDataType.BIGINT, false, true);

    /**
     * The parameter <code>pg_catalog.pg_filenode_relation._2</code>.
     */
    public static final Parameter<Long> _2 = createParameter("_2", org.jooq.impl.SQLDataType.BIGINT, false, true);

    /**
     * Create a new routine call instance
     */
    public PgFilenodeRelation() {
        super("pg_filenode_relation", PgCatalog.PG_CATALOG, org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"regclass\""));

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Long value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Long> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Long value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<Long> field) {
        setField(_2, field);
    }
}
