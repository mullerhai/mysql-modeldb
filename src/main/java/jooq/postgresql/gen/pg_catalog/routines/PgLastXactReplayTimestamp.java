/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.routines;


import java.time.OffsetDateTime;

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
public class PgLastXactReplayTimestamp extends AbstractRoutine<OffsetDateTime> {

    private static final long serialVersionUID = 887522942;

    /**
     * The parameter <code>pg_catalog.pg_last_xact_replay_timestamp.RETURN_VALUE</code>.
     */
    public static final Parameter<OffsetDateTime> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, false, false);

    /**
     * Create a new routine call instance
     */
    public PgLastXactReplayTimestamp() {
        super("pg_last_xact_replay_timestamp", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE);

        setReturnParameter(RETURN_VALUE);
    }
}
