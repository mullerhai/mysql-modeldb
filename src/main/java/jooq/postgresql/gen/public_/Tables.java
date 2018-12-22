/*
 * This file is generated by jOOQ.
 */
package jooq.postgresql.gen.public_;


import javax.annotation.Generated;

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


/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.annotation</code>.
     */
    public static final Annotation ANNOTATION = jooq.postgresql.gen.public_.tables.Annotation.ANNOTATION;

    /**
     * The table <code>public.annotationfragment</code>.
     */
    public static final Annotationfragment ANNOTATIONFRAGMENT = jooq.postgresql.gen.public_.tables.Annotationfragment.ANNOTATIONFRAGMENT;

    /**
     * The table <code>public.crossvalidationevent</code>.
     */
    public static final Crossvalidationevent CROSSVALIDATIONEVENT = jooq.postgresql.gen.public_.tables.Crossvalidationevent.CROSSVALIDATIONEVENT;

    /**
     * The table <code>public.crossvalidationfold</code>.
     */
    public static final Crossvalidationfold CROSSVALIDATIONFOLD = jooq.postgresql.gen.public_.tables.Crossvalidationfold.CROSSVALIDATIONFOLD;

    /**
     * The table <code>public.dataframe</code>.
     */
    public static final Dataframe DATAFRAME = jooq.postgresql.gen.public_.tables.Dataframe.DATAFRAME;

    /**
     * The table <code>public.dataframecolumn</code>.
     */
    public static final Dataframecolumn DATAFRAMECOLUMN = jooq.postgresql.gen.public_.tables.Dataframecolumn.DATAFRAMECOLUMN;

    /**
     * The table <code>public.dataframemetadata</code>.
     */
    public static final Dataframemetadata DATAFRAMEMETADATA = jooq.postgresql.gen.public_.tables.Dataframemetadata.DATAFRAMEMETADATA;

    /**
     * The table <code>public.dataframesplit</code>.
     */
    public static final Dataframesplit DATAFRAMESPLIT = jooq.postgresql.gen.public_.tables.Dataframesplit.DATAFRAMESPLIT;

    /**
     * The table <code>public.event</code>.
     */
    public static final Event EVENT = jooq.postgresql.gen.public_.tables.Event.EVENT;

    /**
     * The table <code>public.experiment</code>.
     */
    public static final Experiment EXPERIMENT = jooq.postgresql.gen.public_.tables.Experiment.EXPERIMENT;

    /**
     * The table <code>public.experiment_run_view</code>.
     */
    public static final ExperimentRunView EXPERIMENT_RUN_VIEW = jooq.postgresql.gen.public_.tables.ExperimentRunView.EXPERIMENT_RUN_VIEW;

    /**
     * The table <code>public.experimentrun</code>.
     */
    public static final Experimentrun EXPERIMENTRUN = jooq.postgresql.gen.public_.tables.Experimentrun.EXPERIMENTRUN;

    /**
     * The table <code>public.feature</code>.
     */
    public static final Feature FEATURE = jooq.postgresql.gen.public_.tables.Feature.FEATURE;

    /**
     * The table <code>public.fitevent</code>.
     */
    public static final Fitevent FITEVENT = jooq.postgresql.gen.public_.tables.Fitevent.FITEVENT;

    /**
     * The table <code>public.gridcellcrossvalidation</code>.
     */
    public static final Gridcellcrossvalidation GRIDCELLCROSSVALIDATION = jooq.postgresql.gen.public_.tables.Gridcellcrossvalidation.GRIDCELLCROSSVALIDATION;

    /**
     * The table <code>public.gridsearchcrossvalidationevent</code>.
     */
    public static final Gridsearchcrossvalidationevent GRIDSEARCHCROSSVALIDATIONEVENT = jooq.postgresql.gen.public_.tables.Gridsearchcrossvalidationevent.GRIDSEARCHCROSSVALIDATIONEVENT;

    /**
     * The table <code>public.hyperparameter</code>.
     */
    public static final Hyperparameter HYPERPARAMETER = jooq.postgresql.gen.public_.tables.Hyperparameter.HYPERPARAMETER;

    /**
     * The table <code>public.linearmodel</code>.
     */
    public static final Linearmodel LINEARMODEL = jooq.postgresql.gen.public_.tables.Linearmodel.LINEARMODEL;

    /**
     * The table <code>public.linearmodelterm</code>.
     */
    public static final Linearmodelterm LINEARMODELTERM = jooq.postgresql.gen.public_.tables.Linearmodelterm.LINEARMODELTERM;

    /**
     * The table <code>public.metadatakv</code>.
     */
    public static final Metadatakv METADATAKV = jooq.postgresql.gen.public_.tables.Metadatakv.METADATAKV;

    /**
     * The table <code>public.metricevent</code>.
     */
    public static final Metricevent METRICEVENT = jooq.postgresql.gen.public_.tables.Metricevent.METRICEVENT;

    /**
     * The table <code>public.model_view</code>.
     */
    public static final ModelView MODEL_VIEW = jooq.postgresql.gen.public_.tables.ModelView.MODEL_VIEW;

    /**
     * The table <code>public.modelobjectivehistory</code>.
     */
    public static final Modelobjectivehistory MODELOBJECTIVEHISTORY = jooq.postgresql.gen.public_.tables.Modelobjectivehistory.MODELOBJECTIVEHISTORY;

    /**
     * The table <code>public.pipeline_view</code>.
     */
    public static final PipelineView PIPELINE_VIEW = jooq.postgresql.gen.public_.tables.PipelineView.PIPELINE_VIEW;

    /**
     * The table <code>public.pipelinestage</code>.
     */
    public static final Pipelinestage PIPELINESTAGE = jooq.postgresql.gen.public_.tables.Pipelinestage.PIPELINESTAGE;

    /**
     * The table <code>public.project</code>.
     */
    public static final Project PROJECT = jooq.postgresql.gen.public_.tables.Project.PROJECT;

    /**
     * The table <code>public.randomsplitevent</code>.
     */
    public static final Randomsplitevent RANDOMSPLITEVENT = jooq.postgresql.gen.public_.tables.Randomsplitevent.RANDOMSPLITEVENT;

    /**
     * The table <code>public.transformer</code>.
     */
    public static final Transformer TRANSFORMER = jooq.postgresql.gen.public_.tables.Transformer.TRANSFORMER;

    /**
     * The table <code>public.transformer_view</code>.
     */
    public static final TransformerView TRANSFORMER_VIEW = jooq.postgresql.gen.public_.tables.TransformerView.TRANSFORMER_VIEW;

    /**
     * The table <code>public.transformerspec</code>.
     */
    public static final Transformerspec TRANSFORMERSPEC = jooq.postgresql.gen.public_.tables.Transformerspec.TRANSFORMERSPEC;

    /**
     * The table <code>public.transformevent</code>.
     */
    public static final Transformevent TRANSFORMEVENT = jooq.postgresql.gen.public_.tables.Transformevent.TRANSFORMEVENT;

    /**
     * The table <code>public.treelink</code>.
     */
    public static final Treelink TREELINK = jooq.postgresql.gen.public_.tables.Treelink.TREELINK;

    /**
     * The table <code>public.treemodel</code>.
     */
    public static final Treemodel TREEMODEL = jooq.postgresql.gen.public_.tables.Treemodel.TREEMODEL;

    /**
     * The table <code>public.treemodelcomponent</code>.
     */
    public static final Treemodelcomponent TREEMODELCOMPONENT = jooq.postgresql.gen.public_.tables.Treemodelcomponent.TREEMODELCOMPONENT;

    /**
     * The table <code>public.treenode</code>.
     */
    public static final Treenode TREENODE = jooq.postgresql.gen.public_.tables.Treenode.TREENODE;
}
