/*
 * This file is generated by jOOQ.
 */
package jooq.sqlite.gen.tables;


import javax.annotation.Generated;

import jooq.sqlite.gen.ModeldbTest;
import jooq.sqlite.gen.tables.records.PipelineViewRecord;

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
 * VIEW
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PipelineView extends TableImpl<PipelineViewRecord> {

    private static final long serialVersionUID = 947434805;

    /**
     * The reference instance of <code>modeldb_test.pipeline_view</code>
     */
    public static final PipelineView PIPELINE_VIEW = new PipelineView();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PipelineViewRecord> getRecordType() {
        return PipelineViewRecord.class;
    }

    /**
     * The column <code>modeldb_test.pipeline_view.pipelinefitevent</code>.
     */
    public final TableField<PipelineViewRecord, Integer> PIPELINEFITEVENT = createField("pipelinefitevent", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.pipeline_view.stagenumber</code>.
     */
    public final TableField<PipelineViewRecord, Integer> STAGENUMBER = createField("stagenumber", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.pipeline_view.event_id</code>.
     */
    public final TableField<PipelineViewRecord, Integer> EVENT_ID = createField("event_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>modeldb_test.pipeline_view.eventtype</code>.
     */
    public final TableField<PipelineViewRecord, String> EVENTTYPE = createField("eventtype", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>modeldb_test.pipeline_view.eventid</code>.
     */
    public final TableField<PipelineViewRecord, Integer> EVENTID = createField("eventid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>modeldb_test.pipeline_view</code> table reference
     */
    public PipelineView() {
        this(DSL.name("pipeline_view"), null);
    }

    /**
     * Create an aliased <code>modeldb_test.pipeline_view</code> table reference
     */
    public PipelineView(String alias) {
        this(DSL.name(alias), PIPELINE_VIEW);
    }

    /**
     * Create an aliased <code>modeldb_test.pipeline_view</code> table reference
     */
    public PipelineView(Name alias) {
        this(alias, PIPELINE_VIEW);
    }

    private PipelineView(Name alias, Table<PipelineViewRecord> aliased) {
        this(alias, aliased, null);
    }

    private PipelineView(Name alias, Table<PipelineViewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("VIEW"));
    }

    public <O extends Record> PipelineView(Table<O> child, ForeignKey<O, PipelineViewRecord> key) {
        super(child, key, PIPELINE_VIEW);
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
    public PipelineView as(String alias) {
        return new PipelineView(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PipelineView as(Name alias) {
        return new PipelineView(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PipelineView rename(String name) {
        return new PipelineView(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PipelineView rename(Name name) {
        return new PipelineView(name, null);
    }
}
