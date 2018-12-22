/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.information_schema.tables;


import javax.annotation.Generated;

import jooq.postgresql.gen.information_schema.InformationSchema;
import jooq.postgresql.gen.information_schema.tables.records.ForeignDataWrappersRecord;

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
public class ForeignDataWrappers extends TableImpl<ForeignDataWrappersRecord> {

    private static final long serialVersionUID = -1202772898;

    /**
     * The reference instance of <code>information_schema.foreign_data_wrappers</code>
     */
    public static final ForeignDataWrappers FOREIGN_DATA_WRAPPERS = new ForeignDataWrappers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ForeignDataWrappersRecord> getRecordType() {
        return ForeignDataWrappersRecord.class;
    }

    /**
     * The column <code>information_schema.foreign_data_wrappers.foreign_data_wrapper_catalog</code>.
     */
    public final TableField<ForeignDataWrappersRecord, String> FOREIGN_DATA_WRAPPER_CATALOG = createField("foreign_data_wrapper_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.foreign_data_wrappers.foreign_data_wrapper_name</code>.
     */
    public final TableField<ForeignDataWrappersRecord, String> FOREIGN_DATA_WRAPPER_NAME = createField("foreign_data_wrapper_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.foreign_data_wrappers.authorization_identifier</code>.
     */
    public final TableField<ForeignDataWrappersRecord, String> AUTHORIZATION_IDENTIFIER = createField("authorization_identifier", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.foreign_data_wrappers.library_name</code>.
     */
    public final TableField<ForeignDataWrappersRecord, String> LIBRARY_NAME = createField("library_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.foreign_data_wrappers.foreign_data_wrapper_language</code>.
     */
    public final TableField<ForeignDataWrappersRecord, String> FOREIGN_DATA_WRAPPER_LANGUAGE = createField("foreign_data_wrapper_language", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.foreign_data_wrappers</code> table reference
     */
    public ForeignDataWrappers() {
        this(DSL.name("foreign_data_wrappers"), null);
    }

    /**
     * Create an aliased <code>information_schema.foreign_data_wrappers</code> table reference
     */
    public ForeignDataWrappers(String alias) {
        this(DSL.name(alias), FOREIGN_DATA_WRAPPERS);
    }

    /**
     * Create an aliased <code>information_schema.foreign_data_wrappers</code> table reference
     */
    public ForeignDataWrappers(Name alias) {
        this(alias, FOREIGN_DATA_WRAPPERS);
    }

    private ForeignDataWrappers(Name alias, Table<ForeignDataWrappersRecord> aliased) {
        this(alias, aliased, null);
    }

    private ForeignDataWrappers(Name alias, Table<ForeignDataWrappersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ForeignDataWrappers(Table<O> child, ForeignKey<O, ForeignDataWrappersRecord> key) {
        super(child, key, FOREIGN_DATA_WRAPPERS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForeignDataWrappers as(String alias) {
        return new ForeignDataWrappers(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForeignDataWrappers as(Name alias) {
        return new ForeignDataWrappers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ForeignDataWrappers rename(String name) {
        return new ForeignDataWrappers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ForeignDataWrappers rename(Name name) {
        return new ForeignDataWrappers(name, null);
    }
}
