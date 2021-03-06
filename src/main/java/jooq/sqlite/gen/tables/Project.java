/*
 * This file is generated by jOOQ.
 */
package jooq.sqlite.gen.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.sqlite.gen.Indexes;
import jooq.sqlite.gen.Keys;
import jooq.sqlite.gen.ModeldbTest;
import jooq.sqlite.gen.tables.records.ProjectRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
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
public class Project extends TableImpl<ProjectRecord> {

    private static final long serialVersionUID = -550915285;

    /**
     * The reference instance of <code>modeldb_test.Project</code>
     */
    public static final Project PROJECT = new Project();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProjectRecord> getRecordType() {
        return ProjectRecord.class;
    }

    /**
     * The column <code>modeldb_test.Project.id</code>.
     */
    public final TableField<ProjectRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>modeldb_test.Project.name</code>.
     */
    public final TableField<ProjectRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>modeldb_test.Project.author</code>.
     */
    public final TableField<ProjectRecord, String> AUTHOR = createField("author", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>modeldb_test.Project.description</code>.
     */
    public final TableField<ProjectRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>modeldb_test.Project.created</code>.
     */
    public final TableField<ProjectRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>modeldb_test.Project</code> table reference
     */
    public Project() {
        this(DSL.name("Project"), null);
    }

    /**
     * Create an aliased <code>modeldb_test.Project</code> table reference
     */
    public Project(String alias) {
        this(DSL.name(alias), PROJECT);
    }

    /**
     * Create an aliased <code>modeldb_test.Project</code> table reference
     */
    public Project(Name alias) {
        this(alias, PROJECT);
    }

    private Project(Name alias, Table<ProjectRecord> aliased) {
        this(alias, aliased, null);
    }

    private Project(Name alias, Table<ProjectRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Project(Table<O> child, ForeignKey<O, ProjectRecord> key) {
        super(child, key, PROJECT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return ModeldbTest.MODELDB_TEST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PROJECT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ProjectRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PROJECT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProjectRecord> getPrimaryKey() {
        return Keys.KEY_PROJECT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProjectRecord>> getKeys() {
        return Arrays.<UniqueKey<ProjectRecord>>asList(Keys.KEY_PROJECT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Project as(String alias) {
        return new Project(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Project as(Name alias) {
        return new Project(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Project rename(String name) {
        return new Project(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Project rename(Name name) {
        return new Project(name, null);
    }
}
