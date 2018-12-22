/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.postgresql.gen.pg_catalog.Indexes;
import jooq.postgresql.gen.pg_catalog.PgCatalog;
import jooq.postgresql.gen.pg_catalog.tables.records.PgTsTemplateRecord;

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
public class PgTsTemplate extends TableImpl<PgTsTemplateRecord> {

    private static final long serialVersionUID = 1063312068;

    /**
     * The reference instance of <code>pg_catalog.pg_ts_template</code>
     */
    public static final PgTsTemplate PG_TS_TEMPLATE = new PgTsTemplate();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgTsTemplateRecord> getRecordType() {
        return PgTsTemplateRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_ts_template.tmplname</code>.
     */
    public final TableField<PgTsTemplateRecord, String> TMPLNAME = createField("tmplname", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_template.tmplnamespace</code>.
     */
    public final TableField<PgTsTemplateRecord, Long> TMPLNAMESPACE = createField("tmplnamespace", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_template.tmplinit</code>.
     */
    public final TableField<PgTsTemplateRecord, String> TMPLINIT = createField("tmplinit", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_ts_template.tmpllexize</code>.
     */
    public final TableField<PgTsTemplateRecord, String> TMPLLEXIZE = createField("tmpllexize", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_ts_template</code> table reference
     */
    public PgTsTemplate() {
        this(DSL.name("pg_ts_template"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ts_template</code> table reference
     */
    public PgTsTemplate(String alias) {
        this(DSL.name(alias), PG_TS_TEMPLATE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ts_template</code> table reference
     */
    public PgTsTemplate(Name alias) {
        this(alias, PG_TS_TEMPLATE);
    }

    private PgTsTemplate(Name alias, Table<PgTsTemplateRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgTsTemplate(Name alias, Table<PgTsTemplateRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgTsTemplate(Table<O> child, ForeignKey<O, PgTsTemplateRecord> key) {
        super(child, key, PG_TS_TEMPLATE);
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
        return Arrays.<Index>asList(Indexes.PG_TS_TEMPLATE_TMPLNAME_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTsTemplate as(String alias) {
        return new PgTsTemplate(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgTsTemplate as(Name alias) {
        return new PgTsTemplate(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTsTemplate rename(String name) {
        return new PgTsTemplate(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgTsTemplate rename(Name name) {
        return new PgTsTemplate(name, null);
    }
}
