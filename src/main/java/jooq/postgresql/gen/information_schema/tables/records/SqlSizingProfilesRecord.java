/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.information_schema.tables.records;


import javax.annotation.Generated;

import jooq.postgresql.gen.information_schema.tables.SqlSizingProfiles;

import org.jooq.Field;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class SqlSizingProfilesRecord extends TableRecordImpl<SqlSizingProfilesRecord> implements Record5<Integer, String, String, Integer, String> {

    private static final long serialVersionUID = -1121080587;

    /**
     * Setter for <code>information_schema.sql_sizing_profiles.sizing_id</code>.
     */
    public void setSizingId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>information_schema.sql_sizing_profiles.sizing_id</code>.
     */
    public Integer getSizingId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>information_schema.sql_sizing_profiles.sizing_name</code>.
     */
    public void setSizingName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>information_schema.sql_sizing_profiles.sizing_name</code>.
     */
    public String getSizingName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>information_schema.sql_sizing_profiles.profile_id</code>.
     */
    public void setProfileId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>information_schema.sql_sizing_profiles.profile_id</code>.
     */
    public String getProfileId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>information_schema.sql_sizing_profiles.required_value</code>.
     */
    public void setRequiredValue(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>information_schema.sql_sizing_profiles.required_value</code>.
     */
    public Integer getRequiredValue() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>information_schema.sql_sizing_profiles.comments</code>.
     */
    public void setComments(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>information_schema.sql_sizing_profiles.comments</code>.
     */
    public String getComments() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, Integer, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, String, Integer, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SqlSizingProfiles.SQL_SIZING_PROFILES.SIZING_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SqlSizingProfiles.SQL_SIZING_PROFILES.SIZING_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SqlSizingProfiles.SQL_SIZING_PROFILES.PROFILE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return SqlSizingProfiles.SQL_SIZING_PROFILES.REQUIRED_VALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return SqlSizingProfiles.SQL_SIZING_PROFILES.COMMENTS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getSizingId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSizingName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getProfileId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getRequiredValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getComments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getSizingId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSizingName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getProfileId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getRequiredValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getComments();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlSizingProfilesRecord value1(Integer value) {
        setSizingId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlSizingProfilesRecord value2(String value) {
        setSizingName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlSizingProfilesRecord value3(String value) {
        setProfileId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlSizingProfilesRecord value4(Integer value) {
        setRequiredValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlSizingProfilesRecord value5(String value) {
        setComments(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SqlSizingProfilesRecord values(Integer value1, String value2, String value3, Integer value4, String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SqlSizingProfilesRecord
     */
    public SqlSizingProfilesRecord() {
        super(SqlSizingProfiles.SQL_SIZING_PROFILES);
    }

    /**
     * Create a detached, initialised SqlSizingProfilesRecord
     */
    public SqlSizingProfilesRecord(Integer sizingId, String sizingName, String profileId, Integer requiredValue, String comments) {
        super(SqlSizingProfiles.SQL_SIZING_PROFILES);

        set(0, sizingId);
        set(1, sizingName);
        set(2, profileId);
        set(3, requiredValue);
        set(4, comments);
    }
}