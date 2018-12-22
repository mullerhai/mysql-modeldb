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
public class Int4AvgAccum extends AbstractRoutine<Long[]> {

    private static final long serialVersionUID = 1337494951;

    /**
     * The parameter <code>pg_catalog.int4_avg_accum.RETURN_VALUE</code>.
     */
    public static final Parameter<Long[]> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), false, false);

    /**
     * The parameter <code>pg_catalog.int4_avg_accum._1</code>.
     */
    public static final Parameter<Long[]> _1 = createParameter("_1", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), false, true);

    /**
     * The parameter <code>pg_catalog.int4_avg_accum._2</code>.
     */
    public static final Parameter<Integer> _2 = createParameter("_2", org.jooq.impl.SQLDataType.INTEGER, false, true);

    /**
     * Create a new routine call instance
     */
    public Int4AvgAccum() {
        super("int4_avg_accum", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.BIGINT.getArrayDataType());

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        addInParameter(_2);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Long... value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<Long[]> field) {
        setField(_1, field);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Integer value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<Integer> field) {
        setField(_2, field);
    }
}
