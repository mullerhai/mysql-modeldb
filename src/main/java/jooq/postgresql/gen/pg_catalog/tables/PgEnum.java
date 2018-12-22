/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.postgresql.gen.pg_catalog.Indexes;
import jooq.postgresql.gen.pg_catalog.PgCatalog;
import jooq.postgresql.gen.pg_catalog.tables.records.PgEnumRecord;

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
public class PgEnum extends TableImpl<PgEnumRecord> {

    private static final long serialVersionUID = 1061140854;

    /**
     * The reference instance of <code>pg_catalog.pg_enum</code>
     */
    public static final PgEnum PG_ENUM = new PgEnum();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgEnumRecord> getRecordType() {
        return PgEnumRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_enum.enumtypid</code>.
     */
    public final TableField<PgEnumRecord, Long> ENUMTYPID = createField("enumtypid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_enum.enumsortorder</code>.
     */
    public final TableField<PgEnumRecord, Float> ENUMSORTORDER = createField("enumsortorder", org.jooq.impl.SQLDataType.REAL.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_enum.enumlabel</code>.
     */
    public final TableField<PgEnumRecord, String> ENUMLABEL = createField("enumlabel", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_enum</code> table reference
     */
    public PgEnum() {
        this(DSL.name("pg_enum"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_enum</code> table reference
     */
    public PgEnum(String alias) {
        this(DSL.name(alias), PG_ENUM);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_enum</code> table reference
     */
    public PgEnum(Name alias) {
        this(alias, PG_ENUM);
    }

    private PgEnum(Name alias, Table<PgEnumRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgEnum(Name alias, Table<PgEnumRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgEnum(Table<O> child, ForeignKey<O, PgEnumRecord> key) {
        super(child, key, PG_ENUM);
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
        return Arrays.<Index>asList(Indexes.PG_ENUM_TYPID_LABEL_INDEX, Indexes.PG_ENUM_TYPID_SORTORDER_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgEnum as(String alias) {
        return new PgEnum(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgEnum as(Name alias) {
        return new PgEnum(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgEnum rename(String name) {
        return new PgEnum(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgEnum rename(Name name) {
        return new PgEnum(name, null);
    }
}
