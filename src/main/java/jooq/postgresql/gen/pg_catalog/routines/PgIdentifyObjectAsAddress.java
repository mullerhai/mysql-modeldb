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
public class PgIdentifyObjectAsAddress extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = -37270622;

    /**
     * The parameter <code>pg_catalog.pg_identify_object_as_address.classid</code>.
     */
    public static final Parameter<Long> CLASSID = createParameter("classid", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_identify_object_as_address.objid</code>.
     */
    public static final Parameter<Long> OBJID = createParameter("objid", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>pg_catalog.pg_identify_object_as_address.objsubid</code>.
     */
    public static final Parameter<Integer> OBJSUBID = createParameter("objsubid", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>pg_catalog.pg_identify_object_as_address.type</code>.
     */
    public static final Parameter<String> TYPE = createParameter("type", org.jooq.impl.SQLDataType.CLOB, false, false);

    /**
     * The parameter <code>pg_catalog.pg_identify_object_as_address.object_names</code>.
     */
    public static final Parameter<String[]> OBJECT_NAMES = createParameter("object_names", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), false, false);

    /**
     * The parameter <code>pg_catalog.pg_identify_object_as_address.object_args</code>.
     */
    public static final Parameter<String[]> OBJECT_ARGS = createParameter("object_args", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), false, false);

    /**
     * Create a new routine call instance
     */
    public PgIdentifyObjectAsAddress() {
        super("pg_identify_object_as_address", PgCatalog.PG_CATALOG);

        addInParameter(CLASSID);
        addInParameter(OBJID);
        addInParameter(OBJSUBID);
        addOutParameter(TYPE);
        addOutParameter(OBJECT_NAMES);
        addOutParameter(OBJECT_ARGS);
    }

    /**
     * Set the <code>classid</code> parameter IN value to the routine
     */
    public void setClassid(Long value) {
        setValue(CLASSID, value);
    }

    /**
     * Set the <code>objid</code> parameter IN value to the routine
     */
    public void setObjid(Long value) {
        setValue(OBJID, value);
    }

    /**
     * Set the <code>objsubid</code> parameter IN value to the routine
     */
    public void setObjsubid(Integer value) {
        setValue(OBJSUBID, value);
    }

    /**
     * Get the <code>type</code> parameter OUT value from the routine
     */
    public String getType() {
        return get(TYPE);
    }

    /**
     * Get the <code>object_names</code> parameter OUT value from the routine
     */
    public String[] getObjectNames() {
        return get(OBJECT_NAMES);
    }

    /**
     * Get the <code>object_args</code> parameter OUT value from the routine
     */
    public String[] getObjectArgs() {
        return get(OBJECT_ARGS);
    }
}
