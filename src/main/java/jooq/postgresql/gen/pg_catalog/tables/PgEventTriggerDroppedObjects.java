/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.tables;


import javax.annotation.Generated;

import jooq.postgresql.gen.pg_catalog.PgCatalog;
import jooq.postgresql.gen.pg_catalog.tables.records.PgEventTriggerDroppedObjectsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class PgEventTriggerDroppedObjects extends TableImpl<PgEventTriggerDroppedObjectsRecord> {

    private static final long serialVersionUID = 1961397822;

    /**
     * The reference instance of <code>pg_catalog.pg_event_trigger_dropped_objects</code>
     */
    public static final PgEventTriggerDroppedObjects PG_EVENT_TRIGGER_DROPPED_OBJECTS = new PgEventTriggerDroppedObjects();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgEventTriggerDroppedObjectsRecord> getRecordType() {
        return PgEventTriggerDroppedObjectsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_event_trigger_dropped_objects.classid</code>.
     */
    public final TableField<PgEventTriggerDroppedObjectsRecord, Long> CLASSID = createField("classid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_event_trigger_dropped_objects.objid</code>.
     */
    public final TableField<PgEventTriggerDroppedObjectsRecord, Long> OBJID = createField("objid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_event_trigger_dropped_objects.objsubid</code>.
     */
    public final TableField<PgEventTriggerDroppedObjectsRecord, Integer> OBJSUBID = createField("objsubid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_event_trigger_dropped_objects.original</code>.
     */
    public final TableField<PgEventTriggerDroppedObjectsRecord, Boolean> ORIGINAL = createField("original", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_event_trigger_dropped_objects.normal</code>.
     */
    public final TableField<PgEventTriggerDroppedObjectsRecord, Boolean> NORMAL = createField("normal", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_event_trigger_dropped_objects.is_temporary</code>.
     */
    public final TableField<PgEventTriggerDroppedObjectsRecord, Boolean> IS_TEMPORARY = createField("is_temporary", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_event_trigger_dropped_objects.object_type</code>.
     */
    public final TableField<PgEventTriggerDroppedObjectsRecord, String> OBJECT_TYPE = createField("object_type", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_event_trigger_dropped_objects.schema_name</code>.
     */
    public final TableField<PgEventTriggerDroppedObjectsRecord, String> SCHEMA_NAME = createField("schema_name", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_event_trigger_dropped_objects.object_name</code>.
     */
    public final TableField<PgEventTriggerDroppedObjectsRecord, String> OBJECT_NAME = createField("object_name", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_event_trigger_dropped_objects.object_identity</code>.
     */
    public final TableField<PgEventTriggerDroppedObjectsRecord, String> OBJECT_IDENTITY = createField("object_identity", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_event_trigger_dropped_objects.address_names</code>.
     */
    public final TableField<PgEventTriggerDroppedObjectsRecord, String[]> ADDRESS_NAMES = createField("address_names", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_event_trigger_dropped_objects.address_args</code>.
     */
    public final TableField<PgEventTriggerDroppedObjectsRecord, String[]> ADDRESS_ARGS = createField("address_args", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * Create a <code>pg_catalog.pg_event_trigger_dropped_objects</code> table reference
     */
    public PgEventTriggerDroppedObjects() {
        this(DSL.name("pg_event_trigger_dropped_objects"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_event_trigger_dropped_objects</code> table reference
     */
    public PgEventTriggerDroppedObjects(String alias) {
        this(DSL.name(alias), PG_EVENT_TRIGGER_DROPPED_OBJECTS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_event_trigger_dropped_objects</code> table reference
     */
    public PgEventTriggerDroppedObjects(Name alias) {
        this(alias, PG_EVENT_TRIGGER_DROPPED_OBJECTS);
    }

    private PgEventTriggerDroppedObjects(Name alias, Table<PgEventTriggerDroppedObjectsRecord> aliased) {
        this(alias, aliased, new Field[0]);
    }

    private PgEventTriggerDroppedObjects(Name alias, Table<PgEventTriggerDroppedObjectsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgEventTriggerDroppedObjects(Table<O> child, ForeignKey<O, PgEventTriggerDroppedObjectsRecord> key) {
        super(child, key, PG_EVENT_TRIGGER_DROPPED_OBJECTS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgEventTriggerDroppedObjects as(String alias) {
        return new PgEventTriggerDroppedObjects(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgEventTriggerDroppedObjects as(Name alias) {
        return new PgEventTriggerDroppedObjects(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgEventTriggerDroppedObjects rename(String name) {
        return new PgEventTriggerDroppedObjects(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgEventTriggerDroppedObjects rename(Name name) {
        return new PgEventTriggerDroppedObjects(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgEventTriggerDroppedObjects call() {
        return new PgEventTriggerDroppedObjects(DSL.name(getName()), null, new Field[] { 
        });
    }
}
