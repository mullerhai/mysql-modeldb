/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.tables;


import javax.annotation.Generated;

import jooq.postgresql.gen.pg_catalog.PgCatalog;
import jooq.postgresql.gen.pg_catalog.tables.records.PgLsDirRecord;

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
public class PgLsDir extends TableImpl<PgLsDirRecord> {

    private static final long serialVersionUID = -556765549;

    /**
     * The reference instance of <code>pg_catalog.pg_ls_dir</code>
     */
    public static final PgLsDir PG_LS_DIR = new PgLsDir();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgLsDirRecord> getRecordType() {
        return PgLsDirRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_ls_dir.pg_ls_dir</code>.
     */
    public final TableField<PgLsDirRecord, String> PG_LS_DIR_ = createField("pg_ls_dir", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>pg_catalog.pg_ls_dir</code> table reference
     */
    public PgLsDir() {
        this(DSL.name("pg_ls_dir"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ls_dir</code> table reference
     */
    public PgLsDir(String alias) {
        this(DSL.name(alias), PG_LS_DIR);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_ls_dir</code> table reference
     */
    public PgLsDir(Name alias) {
        this(alias, PG_LS_DIR);
    }

    private PgLsDir(Name alias, Table<PgLsDirRecord> aliased) {
        this(alias, aliased, new Field[1]);
    }

    private PgLsDir(Name alias, Table<PgLsDirRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PgLsDir(Table<O> child, ForeignKey<O, PgLsDirRecord> key) {
        super(child, key, PG_LS_DIR);
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
    public PgLsDir as(String alias) {
        return new PgLsDir(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgLsDir as(Name alias) {
        return new PgLsDir(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLsDir rename(String name) {
        return new PgLsDir(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgLsDir rename(Name name) {
        return new PgLsDir(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgLsDir call(String __1) {
        return new PgLsDir(DSL.name(getName()), null, new Field[] { 
              DSL.val(__1, org.jooq.impl.SQLDataType.CLOB)
        });
    }

    /**
     * Call this table-valued function
     */
    public PgLsDir call(Field<String> __1) {
        return new PgLsDir(DSL.name(getName()), null, new Field[] { 
              __1
        });
    }
}
