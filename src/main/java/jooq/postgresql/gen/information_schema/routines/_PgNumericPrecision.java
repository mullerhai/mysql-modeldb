/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.information_schema.routines;


import javax.annotation.Generated;

import jooq.postgresql.gen.information_schema.InformationSchema;

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
public class _PgNumericPrecision extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = -997419219;

    /**
     * The parameter <code>information_schema._pg_numeric_precision.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>information_schema._pg_numeric_precision.typid</code>.
     */
    public static final Parameter<Long> TYPID = createParameter("typid", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>information_schema._pg_numeric_precision.typmod</code>.
     */
    public static final Parameter<Integer> TYPMOD = createParameter("typmod", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public _PgNumericPrecision() {
        super("_pg_numeric_precision", InformationSchema.INFORMATION_SCHEMA, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(TYPID);
        addInParameter(TYPMOD);
    }

    /**
     * Set the <code>typid</code> parameter IN value to the routine
     */
    public void setTypid(Long value) {
        setValue(TYPID, value);
    }

    /**
     * Set the <code>typid</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setTypid(Field<Long> field) {
        setField(TYPID, field);
    }

    /**
     * Set the <code>typmod</code> parameter IN value to the routine
     */
    public void setTypmod(Integer value) {
        setValue(TYPMOD, value);
    }

    /**
     * Set the <code>typmod</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setTypmod(Field<Integer> field) {
        setField(TYPMOD, field);
    }
}
