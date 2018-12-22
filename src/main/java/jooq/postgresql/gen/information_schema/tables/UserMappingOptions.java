/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.information_schema.tables;


import javax.annotation.Generated;

import jooq.postgresql.gen.information_schema.InformationSchema;
import jooq.postgresql.gen.information_schema.tables.records.UserMappingOptionsRecord;

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
public class UserMappingOptions extends TableImpl<UserMappingOptionsRecord> {

    private static final long serialVersionUID = 1236477642;

    /**
     * The reference instance of <code>information_schema.user_mapping_options</code>
     */
    public static final UserMappingOptions USER_MAPPING_OPTIONS = new UserMappingOptions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserMappingOptionsRecord> getRecordType() {
        return UserMappingOptionsRecord.class;
    }

    /**
     * The column <code>information_schema.user_mapping_options.authorization_identifier</code>.
     */
    public final TableField<UserMappingOptionsRecord, String> AUTHORIZATION_IDENTIFIER = createField("authorization_identifier", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.user_mapping_options.foreign_server_catalog</code>.
     */
    public final TableField<UserMappingOptionsRecord, String> FOREIGN_SERVER_CATALOG = createField("foreign_server_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.user_mapping_options.foreign_server_name</code>.
     */
    public final TableField<UserMappingOptionsRecord, String> FOREIGN_SERVER_NAME = createField("foreign_server_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.user_mapping_options.option_name</code>.
     */
    public final TableField<UserMappingOptionsRecord, String> OPTION_NAME = createField("option_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.user_mapping_options.option_value</code>.
     */
    public final TableField<UserMappingOptionsRecord, String> OPTION_VALUE = createField("option_value", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.user_mapping_options</code> table reference
     */
    public UserMappingOptions() {
        this(DSL.name("user_mapping_options"), null);
    }

    /**
     * Create an aliased <code>information_schema.user_mapping_options</code> table reference
     */
    public UserMappingOptions(String alias) {
        this(DSL.name(alias), USER_MAPPING_OPTIONS);
    }

    /**
     * Create an aliased <code>information_schema.user_mapping_options</code> table reference
     */
    public UserMappingOptions(Name alias) {
        this(alias, USER_MAPPING_OPTIONS);
    }

    private UserMappingOptions(Name alias, Table<UserMappingOptionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserMappingOptions(Name alias, Table<UserMappingOptionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> UserMappingOptions(Table<O> child, ForeignKey<O, UserMappingOptionsRecord> key) {
        super(child, key, USER_MAPPING_OPTIONS);
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
    public UserMappingOptions as(String alias) {
        return new UserMappingOptions(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserMappingOptions as(Name alias) {
        return new UserMappingOptions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserMappingOptions rename(String name) {
        return new UserMappingOptions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserMappingOptions rename(Name name) {
        return new UserMappingOptions(name, null);
    }
}
