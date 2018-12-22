/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.information_schema.tables;


import javax.annotation.Generated;

import jooq.postgresql.gen.information_schema.InformationSchema;
import jooq.postgresql.gen.information_schema.tables.records.ForeignServersRecord;

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
public class ForeignServers extends TableImpl<ForeignServersRecord> {

    private static final long serialVersionUID = -450548227;

    /**
     * The reference instance of <code>information_schema.foreign_servers</code>
     */
    public static final ForeignServers FOREIGN_SERVERS = new ForeignServers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ForeignServersRecord> getRecordType() {
        return ForeignServersRecord.class;
    }

    /**
     * The column <code>information_schema.foreign_servers.foreign_server_catalog</code>.
     */
    public final TableField<ForeignServersRecord, String> FOREIGN_SERVER_CATALOG = createField("foreign_server_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.foreign_servers.foreign_server_name</code>.
     */
    public final TableField<ForeignServersRecord, String> FOREIGN_SERVER_NAME = createField("foreign_server_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.foreign_servers.foreign_data_wrapper_catalog</code>.
     */
    public final TableField<ForeignServersRecord, String> FOREIGN_DATA_WRAPPER_CATALOG = createField("foreign_data_wrapper_catalog", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.foreign_servers.foreign_data_wrapper_name</code>.
     */
    public final TableField<ForeignServersRecord, String> FOREIGN_DATA_WRAPPER_NAME = createField("foreign_data_wrapper_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.foreign_servers.foreign_server_type</code>.
     */
    public final TableField<ForeignServersRecord, String> FOREIGN_SERVER_TYPE = createField("foreign_server_type", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.foreign_servers.foreign_server_version</code>.
     */
    public final TableField<ForeignServersRecord, String> FOREIGN_SERVER_VERSION = createField("foreign_server_version", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.foreign_servers.authorization_identifier</code>.
     */
    public final TableField<ForeignServersRecord, String> AUTHORIZATION_IDENTIFIER = createField("authorization_identifier", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * Create a <code>information_schema.foreign_servers</code> table reference
     */
    public ForeignServers() {
        this(DSL.name("foreign_servers"), null);
    }

    /**
     * Create an aliased <code>information_schema.foreign_servers</code> table reference
     */
    public ForeignServers(String alias) {
        this(DSL.name(alias), FOREIGN_SERVERS);
    }

    /**
     * Create an aliased <code>information_schema.foreign_servers</code> table reference
     */
    public ForeignServers(Name alias) {
        this(alias, FOREIGN_SERVERS);
    }

    private ForeignServers(Name alias, Table<ForeignServersRecord> aliased) {
        this(alias, aliased, null);
    }

    private ForeignServers(Name alias, Table<ForeignServersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ForeignServers(Table<O> child, ForeignKey<O, ForeignServersRecord> key) {
        super(child, key, FOREIGN_SERVERS);
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
    public ForeignServers as(String alias) {
        return new ForeignServers(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ForeignServers as(Name alias) {
        return new ForeignServers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ForeignServers rename(String name) {
        return new ForeignServers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ForeignServers rename(Name name) {
        return new ForeignServers(name, null);
    }
}
