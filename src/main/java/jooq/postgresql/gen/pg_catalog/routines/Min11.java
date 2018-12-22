/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.routines;


import java.time.OffsetTime;

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
public class Min11 extends AbstractRoutine<OffsetTime> {

    private static final long serialVersionUID = -385400144;

    /**
     * The parameter <code>pg_catalog.min.RETURN_VALUE</code>.
     */
    public static final Parameter<OffsetTime> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.TIMEWITHTIMEZONE, false, false);

    /**
     * The parameter <code>pg_catalog.min._1</code>.
     */
    public static final Parameter<OffsetTime> _1 = createParameter("_1", org.jooq.impl.SQLDataType.TIMEWITHTIMEZONE, false, true);

    /**
     * Create a new routine call instance
     */
    public Min11() {
        super("min", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.TIMEWITHTIMEZONE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(OffsetTime value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<OffsetTime> field) {
        setField(_1, field);
    }
}
