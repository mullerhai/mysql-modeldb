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
import jooq.sqlite.gen.tables.records.ExperimentRecord;

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
public class Experiment extends TableImpl<ExperimentRecord> {

    private static final long serialVersionUID = 662205515;

    /**
     * The reference instance of <code>modeldb_test.Experiment</code>
     */
    public static final Experiment EXPERIMENT = new Experiment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ExperimentRecord> getRecordType() {
        return ExperimentRecord.class;
    }

    /**
     * The column <code>modeldb_test.Experiment.id</code>.
     */
    public final TableField<ExperimentRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>modeldb_test.Experiment.project</code>.
     */
    public final TableField<ExperimentRecord, Integer> PROJECT = createField("project", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.Experiment.name</code>.
     */
    public final TableField<ExperimentRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.Experiment.description</code>.
     */
    public final TableField<ExperimentRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>modeldb_test.Experiment.created</code>.
     */
    public final TableField<ExperimentRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>modeldb_test.Experiment</code> table reference
     */
    public Experiment() {
        this(DSL.name("Experiment"), null);
    }

    /**
     * Create an aliased <code>modeldb_test.Experiment</code> table reference
     */
    public Experiment(String alias) {
        this(DSL.name(alias), EXPERIMENT);
    }

    /**
     * Create an aliased <code>modeldb_test.Experiment</code> table reference
     */
    public Experiment(Name alias) {
        this(alias, EXPERIMENT);
    }

    private Experiment(Name alias, Table<ExperimentRecord> aliased) {
        this(alias, aliased, null);
    }

    private Experiment(Name alias, Table<ExperimentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Experiment(Table<O> child, ForeignKey<O, ExperimentRecord> key) {
        super(child, key, EXPERIMENT);
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
        return Arrays.<Index>asList(Indexes.EXPERIMENT_PRIMARY, Indexes.EXPERIMENT_PROJECT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ExperimentRecord, Integer> getIdentity() {
        return Keys.IDENTITY_EXPERIMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ExperimentRecord> getPrimaryKey() {
        return Keys.KEY_EXPERIMENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ExperimentRecord>> getKeys() {
        return Arrays.<UniqueKey<ExperimentRecord>>asList(Keys.KEY_EXPERIMENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ExperimentRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ExperimentRecord, ?>>asList(Keys.EXPERIMENT_IBFK_1);
    }

    public Project project() {
        return new Project(this, Keys.EXPERIMENT_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Experiment as(String alias) {
        return new Experiment(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Experiment as(Name alias) {
        return new Experiment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Experiment rename(String name) {
        return new Experiment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Experiment rename(Name name) {
        return new Experiment(name, null);
    }
}
