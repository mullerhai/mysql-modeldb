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
public class PgStatGetBgwriterMaxwrittenClean extends AbstractRoutine<Long> {

    private static final long serialVersionUID = 2048484191;

    /**
     * The parameter <code>pg_catalog.pg_stat_get_bgwriter_maxwritten_clean.RETURN_VALUE</code>.
     */
    public static final Parameter<Long> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * Create a new routine call instance
     */
    public PgStatGetBgwriterMaxwrittenClean() {
        super("pg_stat_get_bgwriter_maxwritten_clean", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.BIGINT);

        setReturnParameter(RETURN_VALUE);
    }
}
