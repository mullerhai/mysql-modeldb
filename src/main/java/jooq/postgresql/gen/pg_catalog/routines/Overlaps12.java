/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.routines;


import java.sql.Timestamp;

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
public class Overlaps12 extends AbstractRoutine<Boolean> {

    private static final long serialVersionUID = 824560797;

    /**
     * The parameter <code>pg_catalog.overlaps.RETURN_VALUE</code>.
     */
    public static final Parameter<Boolean> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>pg_catalog.overlaps._1</code>.
     */
    public static final Parameter<Timestamp> _1 = createParameter("_1", org.jooq.impl.SQLDataType.TIMESTAMP, false, true);

    /**
     * The parameter <code>pg_catalog.overlaps._2</code>.
     */
    public static final Parameter<Timestamp> _2 = createParameter("_2", org.jooq.impl.SQLDataType.TIMESTAMP, false, true);

    /**
     * The parameter <code>pg_catalog.overlaps._3</code>.
     */
    public static final Parameter<Timestamp> _3 = createParameter("_3", org.jooq.impl.SQLDataType.TIMESTAMP, false, true);

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public static final Parameter<Object> _4 = createParameter("_4", org.jooq.impl.DefaultDataType.getDefaultDataType("\"pg_catalog\".\"interval\""), false, true);

    /**
     * Create a new routine call instance
     */
    public Overlaps12() {
        super("overlaps", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.BOOLEAN);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
        addInParameter(_3);
        addInParameter(_4);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Timestamp value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Timestamp> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Timestamp value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<Timestamp> field) {
        setField(_2, field);
    }

    /**
     * Set the <code>_3</code> parameter IN value to the routine
     */
    public void set__3(Timestamp value) {
        setValue(_3, value);
    }

    /**
     * Set the <code>_3</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__3(Field<Timestamp> field) {
        setField(_3, field);
    }

    /**
     * Set the <code>_4</code> parameter IN value to the routine
     */
    public void set__4(Object value) {
        setValue(_4, value);
    }

    /**
     * Set the <code>_4</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__4(Field<Object> field) {
        setField(_4, field);
    }
}
