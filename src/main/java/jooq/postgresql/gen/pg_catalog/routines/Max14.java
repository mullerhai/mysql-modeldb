/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.routines;


import java.time.OffsetDateTime;

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
public class Max14 extends AbstractRoutine<OffsetDateTime> {

    private static final long serialVersionUID = 1567673713;

    /**
     * The parameter <code>pg_catalog.max.RETURN_VALUE</code>.
     */
    public static final Parameter<OffsetDateTime> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, false, false);

    /**
     * The parameter <code>pg_catalog.max._1</code>.
     */
    public static final Parameter<OffsetDateTime> _1 = createParameter("_1", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, false, true);

    /**
     * Create a new routine call instance
     */
    public Max14() {
        super("max", PgCatalog.PG_CATALOG, org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_1);
        setOverloaded(true);
    }

    /**
     * Set the <code>_1</code> parameter IN value to the routine
     */
    public void set__1(OffsetDateTime value) {
        setValue(_1, value);
    }

    /**
     * Set the <code>_1</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void set__1(Field<OffsetDateTime> field) {
        setField(_1, field);
    }
}
