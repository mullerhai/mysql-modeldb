/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.public_;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.postgresql.gen.DefaultCatalog;
import jooq.postgresql.gen.public_.tables.Annotation;
import jooq.postgresql.gen.public_.tables.Annotationfragment;
import jooq.postgresql.gen.public_.tables.Crossvalidationevent;
import jooq.postgresql.gen.public_.tables.Crossvalidationfold;
import jooq.postgresql.gen.public_.tables.Dataframe;
import jooq.postgresql.gen.public_.tables.Dataframecolumn;
import jooq.postgresql.gen.public_.tables.Dataframemetadata;
import jooq.postgresql.gen.public_.tables.Dataframesplit;
import jooq.postgresql.gen.public_.tables.Event;
import jooq.postgresql.gen.public_.tables.Experiment;
import jooq.postgresql.gen.public_.tables.ExperimentRunView;
import jooq.postgresql.gen.public_.tables.Experimentrun;
import jooq.postgresql.gen.public_.tables.Feature;
import jooq.postgresql.gen.public_.tables.Fitevent;
import jooq.postgresql.gen.public_.tables.Gridcellcrossvalidation;
import jooq.postgresql.gen.public_.tables.Gridsearchcrossvalidationevent;
import jooq.postgresql.gen.public_.tables.Hyperparameter;
import jooq.postgresql.gen.public_.tables.Linearmodel;
import jooq.postgresql.gen.public_.tables.Linearmodelterm;
import jooq.postgresql.gen.public_.tables.Metadatakv;
import jooq.postgresql.gen.public_.tables.Metricevent;
import jooq.postgresql.gen.public_.tables.ModelView;
import jooq.postgresql.gen.public_.tables.Modelobjectivehistory;
import jooq.postgresql.gen.public_.tables.PipelineView;
import jooq.postgresql.gen.public_.tables.Pipelinestage;
import jooq.postgresql.gen.public_.tables.Project;
import jooq.postgresql.gen.public_.tables.Randomsplitevent;
import jooq.postgresql.gen.public_.tables.Transformer;
import jooq.postgresql.gen.public_.tables.TransformerView;
import jooq.postgresql.gen.public_.tables.Transformerspec;
import jooq.postgresql.gen.public_.tables.Transformevent;
import jooq.postgresql.gen.public_.tables.Treelink;
import jooq.postgresql.gen.public_.tables.Treemodel;
import jooq.postgresql.gen.public_.tables.Treemodelcomponent;
import jooq.postgresql.gen.public_.tables.Treenode;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


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
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 33395826;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.annotation</code>.
     */
    public final Annotation ANNOTATION = jooq.postgresql.gen.public_.tables.Annotation.ANNOTATION;

    /**
     * The table <code>public.annotationfragment</code>.
     */
    public final Annotationfragment ANNOTATIONFRAGMENT = jooq.postgresql.gen.public_.tables.Annotationfragment.ANNOTATIONFRAGMENT;

    /**
     * The table <code>public.crossvalidationevent</code>.
     */
    public final Crossvalidationevent CROSSVALIDATIONEVENT = jooq.postgresql.gen.public_.tables.Crossvalidationevent.CROSSVALIDATIONEVENT;

    /**
     * The table <code>public.crossvalidationfold</code>.
     */
    public final Crossvalidationfold CROSSVALIDATIONFOLD = jooq.postgresql.gen.public_.tables.Crossvalidationfold.CROSSVALIDATIONFOLD;

    /**
     * The table <code>public.dataframe</code>.
     */
    public final Dataframe DATAFRAME = jooq.postgresql.gen.public_.tables.Dataframe.DATAFRAME;

    /**
     * The table <code>public.dataframecolumn</code>.
     */
    public final Dataframecolumn DATAFRAMECOLUMN = jooq.postgresql.gen.public_.tables.Dataframecolumn.DATAFRAMECOLUMN;

    /**
     * The table <code>public.dataframemetadata</code>.
     */
    public final Dataframemetadata DATAFRAMEMETADATA = jooq.postgresql.gen.public_.tables.Dataframemetadata.DATAFRAMEMETADATA;

    /**
     * The table <code>public.dataframesplit</code>.
     */
    public final Dataframesplit DATAFRAMESPLIT = jooq.postgresql.gen.public_.tables.Dataframesplit.DATAFRAMESPLIT;

    /**
     * The table <code>public.event</code>.
     */
    public final Event EVENT = jooq.postgresql.gen.public_.tables.Event.EVENT;

    /**
     * The table <code>public.experiment</code>.
     */
    public final Experiment EXPERIMENT = jooq.postgresql.gen.public_.tables.Experiment.EXPERIMENT;

    /**
     * The table <code>public.experiment_run_view</code>.
     */
    public final ExperimentRunView EXPERIMENT_RUN_VIEW = jooq.postgresql.gen.public_.tables.ExperimentRunView.EXPERIMENT_RUN_VIEW;

    /**
     * The table <code>public.experimentrun</code>.
     */
    public final Experimentrun EXPERIMENTRUN = jooq.postgresql.gen.public_.tables.Experimentrun.EXPERIMENTRUN;

    /**
     * The table <code>public.feature</code>.
     */
    public final Feature FEATURE = jooq.postgresql.gen.public_.tables.Feature.FEATURE;

    /**
     * The table <code>public.fitevent</code>.
     */
    public final Fitevent FITEVENT = jooq.postgresql.gen.public_.tables.Fitevent.FITEVENT;

    /**
     * The table <code>public.gridcellcrossvalidation</code>.
     */
    public final Gridcellcrossvalidation GRIDCELLCROSSVALIDATION = jooq.postgresql.gen.public_.tables.Gridcellcrossvalidation.GRIDCELLCROSSVALIDATION;

    /**
     * The table <code>public.gridsearchcrossvalidationevent</code>.
     */
    public final Gridsearchcrossvalidationevent GRIDSEARCHCROSSVALIDATIONEVENT = jooq.postgresql.gen.public_.tables.Gridsearchcrossvalidationevent.GRIDSEARCHCROSSVALIDATIONEVENT;

    /**
     * The table <code>public.hyperparameter</code>.
     */
    public final Hyperparameter HYPERPARAMETER = jooq.postgresql.gen.public_.tables.Hyperparameter.HYPERPARAMETER;

    /**
     * The table <code>public.linearmodel</code>.
     */
    public final Linearmodel LINEARMODEL = jooq.postgresql.gen.public_.tables.Linearmodel.LINEARMODEL;

    /**
     * The table <code>public.linearmodelterm</code>.
     */
    public final Linearmodelterm LINEARMODELTERM = jooq.postgresql.gen.public_.tables.Linearmodelterm.LINEARMODELTERM;

    /**
     * The table <code>public.metadatakv</code>.
     */
    public final Metadatakv METADATAKV = jooq.postgresql.gen.public_.tables.Metadatakv.METADATAKV;

    /**
     * The table <code>public.metricevent</code>.
     */
    public final Metricevent METRICEVENT = jooq.postgresql.gen.public_.tables.Metricevent.METRICEVENT;

    /**
     * The table <code>public.model_view</code>.
     */
    public final ModelView MODEL_VIEW = jooq.postgresql.gen.public_.tables.ModelView.MODEL_VIEW;

    /**
     * The table <code>public.modelobjectivehistory</code>.
     */
    public final Modelobjectivehistory MODELOBJECTIVEHISTORY = jooq.postgresql.gen.public_.tables.Modelobjectivehistory.MODELOBJECTIVEHISTORY;

    /**
     * The table <code>public.pipeline_view</code>.
     */
    public final PipelineView PIPELINE_VIEW = jooq.postgresql.gen.public_.tables.PipelineView.PIPELINE_VIEW;

    /**
     * The table <code>public.pipelinestage</code>.
     */
    public final Pipelinestage PIPELINESTAGE = jooq.postgresql.gen.public_.tables.Pipelinestage.PIPELINESTAGE;

    /**
     * The table <code>public.project</code>.
     */
    public final Project PROJECT = jooq.postgresql.gen.public_.tables.Project.PROJECT;

    /**
     * The table <code>public.randomsplitevent</code>.
     */
    public final Randomsplitevent RANDOMSPLITEVENT = jooq.postgresql.gen.public_.tables.Randomsplitevent.RANDOMSPLITEVENT;

    /**
     * The table <code>public.transformer</code>.
     */
    public final Transformer TRANSFORMER = jooq.postgresql.gen.public_.tables.Transformer.TRANSFORMER;

    /**
     * The table <code>public.transformer_view</code>.
     */
    public final TransformerView TRANSFORMER_VIEW = jooq.postgresql.gen.public_.tables.TransformerView.TRANSFORMER_VIEW;

    /**
     * The table <code>public.transformerspec</code>.
     */
    public final Transformerspec TRANSFORMERSPEC = jooq.postgresql.gen.public_.tables.Transformerspec.TRANSFORMERSPEC;

    /**
     * The table <code>public.transformevent</code>.
     */
    public final Transformevent TRANSFORMEVENT = jooq.postgresql.gen.public_.tables.Transformevent.TRANSFORMEVENT;

    /**
     * The table <code>public.treelink</code>.
     */
    public final Treelink TREELINK = jooq.postgresql.gen.public_.tables.Treelink.TREELINK;

    /**
     * The table <code>public.treemodel</code>.
     */
    public final Treemodel TREEMODEL = jooq.postgresql.gen.public_.tables.Treemodel.TREEMODEL;

    /**
     * The table <code>public.treemodelcomponent</code>.
     */
    public final Treemodelcomponent TREEMODELCOMPONENT = jooq.postgresql.gen.public_.tables.Treemodelcomponent.TREEMODELCOMPONENT;

    /**
     * The table <code>public.treenode</code>.
     */
    public final Treenode TREENODE = jooq.postgresql.gen.public_.tables.Treenode.TREENODE;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        List result = new ArrayList();
        result.addAll(getSequences0());
        return result;
    }

    private final List<Sequence<?>> getSequences0() {
        return Arrays.<Sequence<?>>asList(
            Sequences.ANNOTATIONFRAGMENT_SEQ,
            Sequences.ANNOTATION_SEQ,
            Sequences.CROSSVALIDATIONEVENT_SEQ,
            Sequences.CROSSVALIDATIONFOLD_SEQ,
            Sequences.DATAFRAMECOLUMN_SEQ,
            Sequences.DATAFRAMEMETADATA_SEQ,
            Sequences.DATAFRAME_SEQ,
            Sequences.DATAFRAMESPLIT_SEQ,
            Sequences.EVENT_SEQ,
            Sequences.EXPERIMENTRUN_SEQ,
            Sequences.EXPERIMENT_SEQ,
            Sequences.FEATURE_SEQ,
            Sequences.FITEVENT_SEQ,
            Sequences.GRIDCELLCROSSVALIDATION_SEQ,
            Sequences.GRIDSEARCHCROSSVALIDATIONEVENT_SEQ,
            Sequences.HYPERPARAMETER_SEQ,
            Sequences.LINEARMODEL_SEQ,
            Sequences.LINEARMODELTERM_SEQ,
            Sequences.METADATAKV_SEQ,
            Sequences.METRICEVENT_SEQ,
            Sequences.MODELOBJECTIVEHISTORY_SEQ,
            Sequences.PIPELINESTAGE_SEQ,
            Sequences.PROJECT_SEQ,
            Sequences.RANDOMSPLITEVENT_SEQ,
            Sequences.TRANSFORMER_SEQ,
            Sequences.TRANSFORMERSPEC_SEQ,
            Sequences.TRANSFORMEVENT_SEQ,
            Sequences.TREELINK_SEQ,
            Sequences.TREEMODELCOMPONENT_SEQ,
            Sequences.TREEMODEL_SEQ,
            Sequences.TREENODE_SEQ);
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Annotation.ANNOTATION,
            Annotationfragment.ANNOTATIONFRAGMENT,
            Crossvalidationevent.CROSSVALIDATIONEVENT,
            Crossvalidationfold.CROSSVALIDATIONFOLD,
            Dataframe.DATAFRAME,
            Dataframecolumn.DATAFRAMECOLUMN,
            Dataframemetadata.DATAFRAMEMETADATA,
            Dataframesplit.DATAFRAMESPLIT,
            Event.EVENT,
            Experiment.EXPERIMENT,
            ExperimentRunView.EXPERIMENT_RUN_VIEW,
            Experimentrun.EXPERIMENTRUN,
            Feature.FEATURE,
            Fitevent.FITEVENT,
            Gridcellcrossvalidation.GRIDCELLCROSSVALIDATION,
            Gridsearchcrossvalidationevent.GRIDSEARCHCROSSVALIDATIONEVENT,
            Hyperparameter.HYPERPARAMETER,
            Linearmodel.LINEARMODEL,
            Linearmodelterm.LINEARMODELTERM,
            Metadatakv.METADATAKV,
            Metricevent.METRICEVENT,
            ModelView.MODEL_VIEW,
            Modelobjectivehistory.MODELOBJECTIVEHISTORY,
            PipelineView.PIPELINE_VIEW,
            Pipelinestage.PIPELINESTAGE,
            Project.PROJECT,
            Randomsplitevent.RANDOMSPLITEVENT,
            Transformer.TRANSFORMER,
            TransformerView.TRANSFORMER_VIEW,
            Transformerspec.TRANSFORMERSPEC,
            Transformevent.TRANSFORMEVENT,
            Treelink.TREELINK,
            Treemodel.TREEMODEL,
            Treemodelcomponent.TREEMODELCOMPONENT,
            Treenode.TREENODE);
    }
}