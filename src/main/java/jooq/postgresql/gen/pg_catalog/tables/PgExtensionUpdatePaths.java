/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.tables;


import javax.annotation.Generated;

import jooq.postgresql.gen.pg_catalog.PgCatalog;
import jooq.postgresql.gen.pg_catalog.tables.records.PgExtensionUpdatePathsRecord;

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
public class PgExtensionUpdatePaths extends TableImpl<PgExtensionUpdatePathsRecord> {

    private static final long serialVersionUID = 671577119;

    /**
     * The reference instance of <code>pg_catalog.pg_extension_update_paths</code>
     */
    public static final PgExtensionUpdatePaths PG_EXTENSION_UPDATE_PATHS = new PgExtensionUpdatePaths();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgExtensionUpdatePathsRecord> getRecordType() {
        return PgExtensionUpdatePathsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_extension_update_paths.source</code>.
     */
    public final TableField<PgExtensionUpdatePathsRecord, String> SOURCE = createField("source", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_extension_update_paths.target</code>.
     */
    public final TableField<PgExtensionUpdatePathsRecord, String> TARGET = createField("target", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_extension_update_paths.path</code>.
     */
    public final TableField<PgExtensionUpdatePathsRecord, String> PATH = createField("path", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>pg_catalog.pg_extension_update_paths</code> table reference
     */
    public PgExtensionUpdatePaths() {
        this(DSL.name("pg_extension_update_paths"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_extension_update_paths</code> table reference
     */
    public PgExtensionUpdatePaths(String alias) {
        this(DSL.name(alias), PG_EXTENSION_UPDATE_PATHS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_extension_update_paths</code> table reference
     */
    public PgExtensionUpdatePaths(Name alias) {
        this(alias, PG_EXTENSION_UPDATE_PATHS);
    }

    private PgExtensionUpdatePaths(Name alias, Table<PgExtensionUpdatePathsRecord> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private PgExtensionUpdatePaths(Name alias, Table<PgExtensionUpdatePathsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgExtensionUpdatePaths(Table<O> child, ForeignKey<O, PgExtensionUpdatePathsRecord> key) {
        super(child, key, PG_EXTENSION_UPDATE_PATHS);
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
    public PgExtensionUpdatePaths as(String alias) {
        return new PgExtensionUpdatePaths(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgExtensionUpdatePaths as(Name alias) {
        return new PgExtensionUpdatePaths(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgExtensionUpdatePaths rename(String name) {
        return new PgExtensionUpdatePaths(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgExtensionUpdatePaths rename(Name name) {
        return new PgExtensionUpdatePaths(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgExtensionUpdatePaths call(String name) {
        return new PgExtensionUpdatePaths(DSL.name(getName()), null, new Field[] { 
              DSL.val(name, org.jooq.impl.SQLDataType.VARCHAR)
        });
    }

    /**
     * Call this table-valued function
     */
    public PgExtensionUpdatePaths call(Field<String> name) {
        return new PgExtensionUpdatePaths(DSL.name(getName()), null, new Field[] { 
              name
        });
    }
}
