/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.information_schema.tables.records;


import javax.annotation.Generated;

import jooq.postgresql.gen.information_schema.tables.ViewColumnUsage;

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
public class ViewColumnUsageRecord extends TableRecordImpl<ViewColumnUsageRecord> implements Record7<String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 1536096206;

    /**
     * Setter for <code>information_schema.view_column_usage.view_catalog</code>.
     */
    public void setViewCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.view_column_usage.view_catalog</code>.
     */
    public String getViewCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>information_schema.view_column_usage.view_schema</code>.
     */
    public void setViewSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.view_column_usage.view_schema</code>.
     */
    public String getViewSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.view_column_usage.view_name</code>.
     */
    public void setViewName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.view_column_usage.view_name</code>.
     */
    public String getViewName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.view_column_usage.table_catalog</code>.
     */
    public void setTableCatalog(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.view_column_usage.table_catalog</code>.
     */
    public String getTableCatalog() {
        return (String) get(3);
    }

    /**
     * Setter for <code>information_schema.view_column_usage.table_schema</code>.
     */
    public void setTableSchema(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.view_column_usage.table_schema</code>.
     */
    public String getTableSchema() {
        return (String) get(4);
    }

    /**
     * Setter for <code>information_schema.view_column_usage.table_name</code>.
     */
    public void setTableName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>information_schema.view_column_usage.table_name</code>.
     */
    public String getTableName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>information_schema.view_column_usage.column_name</code>.
     */
    public void setColumnName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>information_schema.view_column_usage.column_name</code>.
     */
    public String getColumnName() {
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
        return ViewColumnUsage.VIEW_COLUMN_USAGE.VIEW_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ViewColumnUsage.VIEW_COLUMN_USAGE.VIEW_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ViewColumnUsage.VIEW_COLUMN_USAGE.VIEW_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ViewColumnUsage.VIEW_COLUMN_USAGE.TABLE_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ViewColumnUsage.VIEW_COLUMN_USAGE.TABLE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ViewColumnUsage.VIEW_COLUMN_USAGE.TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ViewColumnUsage.VIEW_COLUMN_USAGE.COLUMN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getViewCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getViewSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getViewName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getViewCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getViewSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getViewName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewColumnUsageRecord value1(String value) {
        setViewCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewColumnUsageRecord value2(String value) {
        setViewSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewColumnUsageRecord value3(String value) {
        setViewName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewColumnUsageRecord value4(String value) {
        setTableCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewColumnUsageRecord value5(String value) {
        setTableSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewColumnUsageRecord value6(String value) {
        setTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewColumnUsageRecord value7(String value) {
        setColumnName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ViewColumnUsageRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7) {
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
     * Create a detached ViewColumnUsageRecord
     */
    public ViewColumnUsageRecord() {
        super(ViewColumnUsage.VIEW_COLUMN_USAGE);
    }

    /**
     * Create a detached, initialised ViewColumnUsageRecord
     */
    public ViewColumnUsageRecord(String viewCatalog, String viewSchema, String viewName, String tableCatalog, String tableSchema, String tableName, String columnName) {
        super(ViewColumnUsage.VIEW_COLUMN_USAGE);

        set(0, viewCatalog);
        set(1, viewSchema);
        set(2, viewName);
        set(3, tableCatalog);
        set(4, tableSchema);
        set(5, tableName);
        set(6, columnName);
    }
}
