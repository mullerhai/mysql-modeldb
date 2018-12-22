/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.information_schema.tables.records;


import javax.annotation.Generated;

import jooq.postgresql.gen.information_schema.tables.Schemata;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


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
public class SchemataRecord extends TableRecordImpl<SchemataRecord> implements Record7<String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1441638894;

    /**
     * Setter for <code>information_schema.schemata.catalog_name</code>.
     */
    public void setCatalogName(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.schemata.catalog_name</code>.
     */
    public String getCatalogName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.schemata.schema_name</code>.
     */
    public void setSchemaName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.schemata.schema_name</code>.
     */
    public String getSchemaName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.schemata.schema_owner</code>.
     */
    public void setSchemaOwner(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.schemata.schema_owner</code>.
     */
    public String getSchemaOwner() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.schemata.default_character_set_catalog</code>.
     */
    public void setDefaultCharacterSetCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.schemata.default_character_set_catalog</code>.
     */
    public String getDefaultCharacterSetCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.schemata.default_character_set_schema</code>.
     */
    public void setDefaultCharacterSetSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.schemata.default_character_set_schema</code>.
     */
    public String getDefaultCharacterSetSchema() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.schemata.default_character_set_name</code>.
     */
    public void setDefaultCharacterSetName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.schemata.default_character_set_name</code>.
     */
    public String getDefaultCharacterSetName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.schemata.sql_path</code>.
     */
    public void setSqlPath(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.schemata.sql_path</code>.
     */
    public String getSqlPath() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Schemata.SCHEMATA.CATALOG_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Schemata.SCHEMATA.SCHEMA_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Schemata.SCHEMATA.SCHEMA_OWNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Schemata.SCHEMATA.DEFAULT_CHARACTER_SET_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Schemata.SCHEMATA.DEFAULT_CHARACTER_SET_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Schemata.SCHEMATA.DEFAULT_CHARACTER_SET_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Schemata.SCHEMATA.SQL_PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getCatalogName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSchemaName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSchemaOwner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getDefaultCharacterSetCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getDefaultCharacterSetSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getDefaultCharacterSetName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getSqlPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getCatalogName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSchemaName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSchemaOwner();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getDefaultCharacterSetCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDefaultCharacterSetSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDefaultCharacterSetName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSqlPath();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemataRecord value1(String value) {
        setCatalogName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemataRecord value2(String value) {
        setSchemaName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemataRecord value3(String value) {
        setSchemaOwner(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemataRecord value4(String value) {
        setDefaultCharacterSetCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemataRecord value5(String value) {
        setDefaultCharacterSetSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemataRecord value6(String value) {
        setDefaultCharacterSetName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemataRecord value7(String value) {
        setSqlPath(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SchemataRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SchemataRecord
     */
    public SchemataRecord() {
        super(Schemata.SCHEMATA);
    }

    /**
     * Create a detached, initialised SchemataRecord
     */
    public SchemataRecord(String catalogName, String schemaName, String schemaOwner, String defaultCharacterSetCatalog, String defaultCharacterSetSchema, String defaultCharacterSetName, String sqlPath) {
        super(Schemata.SCHEMATA);

        set(0, catalogName);
        set(1, schemaName);
        set(2, schemaOwner);
        set(3, defaultCharacterSetCatalog);
        set(4, defaultCharacterSetSchema);
        set(5, defaultCharacterSetName);
        set(6, sqlPath);
    }
}