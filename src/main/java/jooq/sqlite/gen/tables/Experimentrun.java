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
import jooq.sqlite.gen.tables.records.ExperimentrunRecord;

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
public class Experimentrun extends TableImpl<ExperimentrunRecord> {

    private static final long serialVersionUID = -485451751;

    /**
     * The reference instance of <code>modeldb_test.ExperimentRun</code>
     */
    public static final Experimentrun EXPERIMENTRUN = new Experimentrun();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ExperimentrunRecord> getRecordType() {
        return ExperimentrunRecord.class;
    }

    /**
     * The column <code>modeldb_test.ExperimentRun.id</code>.
     */
    public final TableField<ExperimentrunRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>modeldb_test.ExperimentRun.experiment</code>.
     */
    public final TableField<ExperimentrunRecord, Integer> EXPERIMENT = createField("experiment", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.ExperimentRun.description</code>.
     */
    public final TableField<ExperimentrunRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>modeldb_test.ExperimentRun.sha</code>.
     */
    public final TableField<ExperimentrunRecord, String> SHA = createField("sha", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>modeldb_test.ExperimentRun.created</code>.
     */
    public final TableField<ExperimentrunRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>modeldb_test.ExperimentRun</code> table reference
     */
    public Experimentrun() {
        this(DSL.name("ExperimentRun"), null);
    }

    /**
     * Create an aliased <code>modeldb_test.ExperimentRun</code> table reference
     */
    public Experimentrun(String alias) {
        this(DSL.name(alias), EXPERIMENTRUN);
    }

    /**
     * Create an aliased <code>modeldb_test.ExperimentRun</code> table reference
     */
    public Experimentrun(Name alias) {
        this(alias, EXPERIMENTRUN);
    }

    private Experimentrun(Name alias, Table<ExperimentrunRecord> aliased) {
        this(alias, aliased, null);
    }

    private Experimentrun(Name alias, Table<ExperimentrunRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Experimentrun(Table<O> child, ForeignKey<O, ExperimentrunRecord> key) {
        super(child, key, EXPERIMENTRUN);
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
        return Arrays.<Index>asList(Indexes.EXPERIMENTRUN_EXPERIMENT, Indexes.EXPERIMENTRUN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ExperimentrunRecord, Integer> getIdentity() {
        return Keys.IDENTITY_EXPERIMENTRUN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ExperimentrunRecord> getPrimaryKey() {
        return Keys.KEY_EXPERIMENTRUN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ExperimentrunRecord>> getKeys() {
        return Arrays.<UniqueKey<ExperimentrunRecord>>asList(Keys.KEY_EXPERIMENTRUN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ExperimentrunRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ExperimentrunRecord, ?>>asList(Keys.EXPERIMENTRUN_IBFK_1);
    }

    public Experiment experiment() {
        return new Experiment(this, Keys.EXPERIMENTRUN_IBFK_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Experimentrun as(String alias) {
        return new Experimentrun(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Experimentrun as(Name alias) {
        return new Experimentrun(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Experimentrun rename(String name) {
        return new Experimentrun(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Experimentrun rename(Name name) {
        return new Experimentrun(name, null);
    }
}