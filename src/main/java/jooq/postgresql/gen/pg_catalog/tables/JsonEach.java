/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.tables;


import javax.annotation.Generated;

import jooq.postgresql.gen.pg_catalog.PgCatalog;
import jooq.postgresql.gen.pg_catalog.tables.records.JsonEachRecord;

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
public class JsonEach extends TableImpl<JsonEachRecord> {

    private static final long serialVersionUID = 499459985;

    /**
     * The reference instance of <code>pg_catalog.json_each</code>
     */
    public static final JsonEach JSON_EACH = new JsonEach();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JsonEachRecord> getRecordType() {
        return JsonEachRecord.class;
    }

    /**
     * The column <code>pg_catalog.json_each.key</code>.
     */
    public final TableField<JsonEachRecord, String> KEY = createField("key", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JsonEachRecord, Object> VALUE = createField("value", org.jooq.impl.SQLDataType.OTHER, this, "");

    /**
     * Create a <code>pg_catalog.json_each</code> table reference
     */
    public JsonEach() {
        this(DSL.name("json_each"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.json_each</code> table reference
     */
    public JsonEach(String alias) {
        this(DSL.name(alias), JSON_EACH);
    }

    /**
     * Create an aliased <code>pg_catalog.json_each</code> table reference
     */
    public JsonEach(Name alias) {
        this(alias, JSON_EACH);
    }

    private JsonEach(Name alias, Table<JsonEachRecord> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private JsonEach(Name alias, Table<JsonEachRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JsonEach(Table<O> child, ForeignKey<O, JsonEachRecord> key) {
        super(child, key, JSON_EACH);
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
    public JsonEach as(String alias) {
        return new JsonEach(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonEach as(Name alias) {
        return new JsonEach(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonEach rename(String name) {
        return new JsonEach(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public JsonEach rename(Name name) {
        return new JsonEach(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public JsonEach call(Object fromJson) {
        return new JsonEach(DSL.name(getName()), null, new Field[] { 
              DSL.val(fromJson, org.jooq.impl.SQLDataType.OTHER)
        });
    }

    /**
     * Call this table-valued function
     */
    public JsonEach call(Field<Object> fromJson) {
        return new JsonEach(DSL.name(getName()), null, new Field[] { 
              fromJson
        });
    }
}
