/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.postgresql.gen.pg_catalog.Indexes;
import jooq.postgresql.gen.pg_catalog.PgCatalog;
import jooq.postgresql.gen.pg_catalog.tables.records.PgReplicationOriginRecord;

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
public class PgReplicationOrigin extends TableImpl<PgReplicationOriginRecord> {

    private static final long serialVersionUID = -581573202;

    /**
     * The reference instance of <code>pg_catalog.pg_replication_origin</code>
     */
    public static final PgReplicationOrigin PG_REPLICATION_ORIGIN = new PgReplicationOrigin();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgReplicationOriginRecord> getRecordType() {
        return PgReplicationOriginRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_replication_origin.roident</code>.
     */
    public final TableField<PgReplicationOriginRecord, Long> ROIDENT = createField("roident", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_replication_origin.roname</code>.
     */
    public final TableField<PgReplicationOriginRecord, String> RONAME = createField("roname", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_replication_origin</code> table reference
     */
    public PgReplicationOrigin() {
        this(DSL.name("pg_replication_origin"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_replication_origin</code> table reference
     */
    public PgReplicationOrigin(String alias) {
        this(DSL.name(alias), PG_REPLICATION_ORIGIN);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_replication_origin</code> table reference
     */
    public PgReplicationOrigin(Name alias) {
        this(alias, PG_REPLICATION_ORIGIN);
    }

    private PgReplicationOrigin(Name alias, Table<PgReplicationOriginRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgReplicationOrigin(Name alias, Table<PgReplicationOriginRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgReplicationOrigin(Table<O> child, ForeignKey<O, PgReplicationOriginRecord> key) {
        super(child, key, PG_REPLICATION_ORIGIN);
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
        return Arrays.<Index>asList(Indexes.PG_REPLICATION_ORIGIN_ROIIDENT_INDEX, Indexes.PG_REPLICATION_ORIGIN_RONAME_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgReplicationOrigin as(String alias) {
        return new PgReplicationOrigin(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgReplicationOrigin as(Name alias) {
        return new PgReplicationOrigin(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgReplicationOrigin rename(String name) {
        return new PgReplicationOrigin(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgReplicationOrigin rename(Name name) {
        return new PgReplicationOrigin(name, null);
    }
}
