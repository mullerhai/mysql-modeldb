/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.routines;


import java.sql.Time;
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
public class Time1 extends AbstractRoutine<Time> {

    private static final long serialVersionUID = 145481659;

    /**
     * The parameter <code>pg_catalog.time.RETURN_VALUE</code>.
     */
    public static final Parameter<Time> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.TIME, false, false);

    /**
     * The parameter <code>pg_catalog.time._1</code>.
     */
    public static final Parameter<Timestamp> _1 = createParameter("_1", org.jooq.impl.SQLDataType.TIMESTAMP, false, true);

    /**
     * Create a new routine call instance
     */
    public Time1() {
        super("time", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.TIME);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
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
}
