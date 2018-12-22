/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.public_.tables;


import javax.annotation.Generated;

import jooq.postgresql.gen.public_.Public;
import jooq.postgresql.gen.public_.tables.records.ExperimentRunViewRecord;

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
public class ExperimentRunView extends TableImpl<ExperimentRunViewRecord> {

    private static final long serialVersionUID = -117968140;

    /**
     * The reference instance of <code>public.experiment_run_view</code>
     */
    public static final ExperimentRunView EXPERIMENT_RUN_VIEW = new ExperimentRunView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ExperimentRunViewRecord> getRecordType() {
        return ExperimentRunViewRecord.class;
    }

    /**
     * The column <code>public.experiment_run_view.experimentrunid</code>.
     */
    public final TableField<ExperimentRunViewRecord, Integer> EXPERIMENTRUNID = createField("experimentrunid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.experiment_run_view.experimentid</code>.
     */
    public final TableField<ExperimentRunViewRecord, Integer> EXPERIMENTID = createField("experimentid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.experiment_run_view.projectid</code>.
     */
    public final TableField<ExperimentRunViewRecord, Integer> PROJECTID = createField("projectid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>public.experiment_run_view</code> table reference
     */
    public ExperimentRunView() {
        this(DSL.name("experiment_run_view"), null);
    }

    /**
     * Create an aliased <code>public.experiment_run_view</code> table reference
     */
    public ExperimentRunView(String alias) {
        this(DSL.name(alias), EXPERIMENT_RUN_VIEW);
    }

    /**
     * Create an aliased <code>public.experiment_run_view</code> table reference
     */
    public ExperimentRunView(Name alias) {
        this(alias, EXPERIMENT_RUN_VIEW);
    }

    private ExperimentRunView(Name alias, Table<ExperimentRunViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private ExperimentRunView(Name alias, Table<ExperimentRunViewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ExperimentRunView(Table<O> child, ForeignKey<O, ExperimentRunViewRecord> key) {
        super(child, key, EXPERIMENT_RUN_VIEW);
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
    public ExperimentRunView as(String alias) {
        return new ExperimentRunView(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ExperimentRunView as(Name alias) {
        return new ExperimentRunView(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ExperimentRunView rename(String name) {
        return new ExperimentRunView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ExperimentRunView rename(Name name) {
        return new ExperimentRunView(name, null);
    }
}