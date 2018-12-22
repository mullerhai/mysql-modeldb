/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.routines;


import javax.annotation.Generated;

import jooq.postgresql.gen.pg_catalog.PgCatalog;

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
public class PgAdvisoryLockShared2 extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1984425153;

    /**
     * The parameter <code>pg_catalog.pg_advisory_lock_shared._1</code>.
     */
    public static final Parameter<Integer> _1 = createParameter("_1", org.jooq.impl.SQLDataType.INTEGER, false, true);

    /**
     * The parameter <code>pg_catalog.pg_advisory_lock_shared._2</code>.
     */
    public static final Parameter<Integer> _2 = createParameter("_2", org.jooq.impl.SQLDataType.INTEGER, false, true);

    /**
     * Create a new routine call instance
     */
    public PgAdvisoryLockShared2() {
        super("pg_advisory_lock_shared", PgCatalog.PG_CATALOG);

        addInParameter(_1);
        addInParameter(_2);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(Integer value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_2</code> parameter IN value to the routine
     */
    public void set__2(Integer value) {
        setValue(_2, value);
    }
}