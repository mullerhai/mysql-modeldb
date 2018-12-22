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
public class Int2AvgAccumInv extends AbstractRoutine<Long[]> {

    private static final long serialVersionUID = -971212569;

    /**
     * The parameter <code>pg_catalog.int2_avg_accum_inv.RETURN_VALUE</code>.
     */
    public static final Parameter<Long[]> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), false, false);

    /**
     * The parameter <code>pg_catalog.int2_avg_accum_inv._1</code>.
     */
    public static final Parameter<Long[]> _1 = createParameter("_1", org.jooq.impl.SQLDataType.BIGINT.getArrayDataType(), false, true);

    /**
     * The parameter <code>pg_catalog.int2_avg_accum_inv._2</code>.
     */
    public static final Parameter<Short> _2 = createParameter("_2", org.jooq.impl.SQLDataType.SMALLINT, false, true);

    /**
     * Create a new routine call instance
     */
    public Int2AvgAccumInv() {
        super("int2_avg_accum_inv", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.BIGINT.getArrayDataType());

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
    public void set__2(Short value) {
        setValue(_2, value);
    }

    /**
     * Set the <code>_2</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__2(Field<Short> field) {
        setField(_2, field);
    }
}
