/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.pg_catalog.tables;


import javax.annotation.Generated;

import jooq.postgresql.gen.pg_catalog.PgCatalog;
import jooq.postgresql.gen.pg_catalog.tables.records.RegexpSplitToTableRecord;

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
public class RegexpSplitToTable extends TableImpl<RegexpSplitToTableRecord> {

    private static final long serialVersionUID = -1524730446;

    /**
     * The reference instance of <code>pg_catalog.regexp_split_to_table</code>
     */
    public static final RegexpSplitToTable REGEXP_SPLIT_TO_TABLE = new RegexpSplitToTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RegexpSplitToTableRecord> getRecordType() {
        return RegexpSplitToTableRecord.class;
    }

    /**
     * The column <code>pg_catalog.regexp_split_to_table.regexp_split_to_table</code>.
     */
    public final TableField<RegexpSplitToTableRecord, String> REGEXP_SPLIT_TO_TABLE_ = createField("regexp_split_to_table", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>pg_catalog.regexp_split_to_table</code> table reference
     */
    public RegexpSplitToTable() {
        this(DSL.name("regexp_split_to_table"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.regexp_split_to_table</code> table reference
     */
    public RegexpSplitToTable(String alias) {
        this(DSL.name(alias), REGEXP_SPLIT_TO_TABLE);
    }

    /**
     * Create an aliased <code>pg_catalog.regexp_split_to_table</code> table reference
     */
    public RegexpSplitToTable(Name alias) {
        this(alias, REGEXP_SPLIT_TO_TABLE);
    }

    private RegexpSplitToTable(Name alias, Table<RegexpSplitToTableRecord> aliased) {
        this(alias, aliased, new Field[3]);
    }

    private RegexpSplitToTable(Name alias, Table<RegexpSplitToTableRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> RegexpSplitToTable(Table<O> child, ForeignKey<O, RegexpSplitToTableRecord> key) {
        super(child, key, REGEXP_SPLIT_TO_TABLE);
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
    public RegexpSplitToTable as(String alias) {
        return new RegexpSplitToTable(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RegexpSplitToTable as(Name alias) {
        return new RegexpSplitToTable(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public RegexpSplitToTable rename(String name) {
        return new RegexpSplitToTable(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public RegexpSplitToTable rename(Name name) {
        return new RegexpSplitToTable(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public RegexpSplitToTable call(String __1, String __2, String __3) {
        return new RegexpSplitToTable(DSL.name(getName()), null, new Field[] { 
              DSL.val(__1, org.jooq.impl.SQLDataType.CLOB)
            , DSL.val(__2, org.jooq.impl.SQLDataType.CLOB)
            , DSL.val(__3, org.jooq.impl.SQLDataType.CLOB)
        });
    }

    /**
     * Call this table-valued function
     */
    public RegexpSplitToTable call(Field<String> __1, Field<String> __2, Field<String> __3) {
        return new RegexpSplitToTable(DSL.name(getName()), null, new Field[] { 
              __1
            , __2
            , __3
        });
    }
}
