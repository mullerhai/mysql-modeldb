/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.postgresql.gen.pg_catalog.Indexes;
import jooq.postgresql.gen.pg_catalog.PgCatalog;
import jooq.postgresql.gen.pg_catalog.tables.records.PgTsConfigRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
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
public class PgTsConfig extends TableImpl<PgTsConfigRecord> {

    private static final long serialVersionUID = 1078858538;

    /**
     * The reference instance of <code>pg_catalog.pg_ts_config</code>
     */
    public static final PgTsConfig PG_TS_CONFIG = new PgTsConfig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgTsConfigRecord> getRecordType() {
        return PgTsConfigRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_ts_config.cfgname</code>.
     */
    public final TableField<PgTsConfigRecord, String> CFGNAME = createField("cfgname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_config.cfgnamespace</code>.
     */
    public final TableField<PgTsConfigRecord, Long> CFGNAMESPACE = createField("cfgnamespace", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_config.cfgowner</code>.
     */
    public final TableField<PgTsConfigRecord, Long> CFGOWNER = createField("cfgowner", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_config.cfgparser</code>.
     */
    public final TableField<PgTsConfigRecord, Long> CFGPARSER = createField("cfgparser", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_ts_config</code> table reference
     */
    public PgTsConfig() {
        this(DSL.name("pg_ts_config"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ts_config</code> table reference
     */
    public PgTsConfig(String alias) {
        this(DSL.name(alias), PG_TS_CONFIG);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ts_config</code> table reference
     */
    public PgTsConfig(Name alias) {
        this(alias, PG_TS_CONFIG);
    }

    private PgTsConfig(Name alias, Table<PgTsConfigRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgTsConfig(Name alias, Table<PgTsConfigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgTsConfig(Table<O> child, ForeignKey<O, PgTsConfigRecord> key) {
        super(child, key, PG_TS_CONFIG);
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PG_TS_CONFIG_CFGNAME_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTsConfig as(String alias) {
        return new PgTsConfig(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTsConfig as(Name alias) {
        return new PgTsConfig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTsConfig rename(String name) {
        return new PgTsConfig(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTsConfig rename(Name name) {
        return new PgTsConfig(name, null);
    }
}