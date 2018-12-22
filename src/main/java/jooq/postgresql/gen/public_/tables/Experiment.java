/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.public_.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.postgresql.gen.public_.Indexes;
import jooq.postgresql.gen.public_.Keys;
import jooq.postgresql.gen.public_.Public;
import jooq.postgresql.gen.public_.tables.records.ExperimentRecord;

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

    private static final long serialVersionUID = 933808114;

    /**
     * The reference instance of <code>public.experiment</code>
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
     * The column <code>public.experiment.id</code>.
     */
    public final TableField<ExperimentRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('experiment_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.experiment.project</code>.
     */
    public final TableField<ExperimentRecord, Integer> PROJECT = createField("project", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.experiment.name</code>.
     */
    public final TableField<ExperimentRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>public.experiment.description</code>.
     */
    public final TableField<ExperimentRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.experiment.created</code>.
     */
    public final TableField<ExperimentRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>public.experiment</code> table reference
     */
    public Experiment() {
        this(DSL.name("experiment"), null);
    }

    /**
     * Create an aliased <code>public.experiment</code> table reference
     */
    public Experiment(String alias) {
        this(DSL.name(alias), EXPERIMENT);
    }

    /**
     * Create an aliased <code>public.experiment</code> table reference
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
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.EXPERIMENT_PKEY);
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
        return Keys.EXPERIMENT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ExperimentRecord>> getKeys() {
        return Arrays.<UniqueKey<ExperimentRecord>>asList(Keys.EXPERIMENT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ExperimentRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ExperimentRecord, ?>>asList(Keys.EXPERIMENT__EXPERIMENT_PROJECT_FKEY);
    }

    public Project project() {
        return new Project(this, Keys.EXPERIMENT__EXPERIMENT_PROJECT_FKEY);
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
