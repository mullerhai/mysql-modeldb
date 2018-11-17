/*
 * This file is generated by jOOQ.
 */
package jooq.mysql.gen;


import javax.annotation.Generated;

import jooq.mysql.gen.tables.Annotation;
import jooq.mysql.gen.tables.Annotationfragment;
import jooq.mysql.gen.tables.Crossvalidationevent;
import jooq.mysql.gen.tables.Crossvalidationfold;
import jooq.mysql.gen.tables.Dataframe;
import jooq.mysql.gen.tables.Dataframecolumn;
import jooq.mysql.gen.tables.Dataframemetadata;
import jooq.mysql.gen.tables.Dataframesplit;
import jooq.mysql.gen.tables.Event;
import jooq.mysql.gen.tables.Experiment;
import jooq.mysql.gen.tables.ExperimentRunView;
import jooq.mysql.gen.tables.Experimentrun;
import jooq.mysql.gen.tables.Feature;
import jooq.mysql.gen.tables.Fitevent;
import jooq.mysql.gen.tables.Gridcellcrossvalidation;
import jooq.mysql.gen.tables.Gridsearchcrossvalidationevent;
import jooq.mysql.gen.tables.Hyperparameter;
import jooq.mysql.gen.tables.Linearmodel;
import jooq.mysql.gen.tables.Linearmodelterm;
import jooq.mysql.gen.tables.Metadatakv;
import jooq.mysql.gen.tables.Metricevent;
import jooq.mysql.gen.tables.ModelView;
import jooq.mysql.gen.tables.Modelobjectivehistory;
import jooq.mysql.gen.tables.PipelineView;
import jooq.mysql.gen.tables.Pipelinestage;
import jooq.mysql.gen.tables.Project;
import jooq.mysql.gen.tables.Randomsplitevent;
import jooq.mysql.gen.tables.Transformer;
import jooq.mysql.gen.tables.TransformerView;
import jooq.mysql.gen.tables.Transformerspec;
import jooq.mysql.gen.tables.Transformevent;
import jooq.mysql.gen.tables.Treelink;
import jooq.mysql.gen.tables.Treemodel;
import jooq.mysql.gen.tables.Treemodelcomponent;
import jooq.mysql.gen.tables.Treenode;


/**
 * Convenience access to all tables in modeldb_test
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
     * The table <code>modeldb_test.Annotation</code>.
     */
    public static final Annotation ANNOTATION = jooq.mysql.gen.tables.Annotation.ANNOTATION;

    /**
     * The table <code>modeldb_test.AnnotationFragment</code>.
     */
    public static final Annotationfragment ANNOTATIONFRAGMENT = jooq.mysql.gen.tables.Annotationfragment.ANNOTATIONFRAGMENT;

    /**
     * The table <code>modeldb_test.CrossValidationEvent</code>.
     */
    public static final Crossvalidationevent CROSSVALIDATIONEVENT = jooq.mysql.gen.tables.Crossvalidationevent.CROSSVALIDATIONEVENT;

    /**
     * The table <code>modeldb_test.CrossValidationFold</code>.
     */
    public static final Crossvalidationfold CROSSVALIDATIONFOLD = jooq.mysql.gen.tables.Crossvalidationfold.CROSSVALIDATIONFOLD;

    /**
     * The table <code>modeldb_test.DataFrame</code>.
     */
    public static final Dataframe DATAFRAME = jooq.mysql.gen.tables.Dataframe.DATAFRAME;

    /**
     * The table <code>modeldb_test.DataFrameColumn</code>.
     */
    public static final Dataframecolumn DATAFRAMECOLUMN = jooq.mysql.gen.tables.Dataframecolumn.DATAFRAMECOLUMN;

    /**
     * The table <code>modeldb_test.DataFrameMetadata</code>.
     */
    public static final Dataframemetadata DATAFRAMEMETADATA = jooq.mysql.gen.tables.Dataframemetadata.DATAFRAMEMETADATA;

    /**
     * The table <code>modeldb_test.DataFrameSplit</code>.
     */
    public static final Dataframesplit DATAFRAMESPLIT = jooq.mysql.gen.tables.Dataframesplit.DATAFRAMESPLIT;

    /**
     * The table <code>modeldb_test.Event</code>.
     */
    public static final Event EVENT = jooq.mysql.gen.tables.Event.EVENT;

    /**
     * The table <code>modeldb_test.Experiment</code>.
     */
    public static final Experiment EXPERIMENT = jooq.mysql.gen.tables.Experiment.EXPERIMENT;

    /**
     * The table <code>modeldb_test.ExperimentRun</code>.
     */
    public static final Experimentrun EXPERIMENTRUN = jooq.mysql.gen.tables.Experimentrun.EXPERIMENTRUN;

    /**
     * VIEW
     */
    public static final ExperimentRunView EXPERIMENT_RUN_VIEW = jooq.mysql.gen.tables.ExperimentRunView.EXPERIMENT_RUN_VIEW;

    /**
     * The table <code>modeldb_test.Feature</code>.
     */
    public static final Feature FEATURE = jooq.mysql.gen.tables.Feature.FEATURE;

    /**
     * The table <code>modeldb_test.FitEvent</code>.
     */
    public static final Fitevent FITEVENT = jooq.mysql.gen.tables.Fitevent.FITEVENT;

    /**
     * The table <code>modeldb_test.GridCellCrossValidation</code>.
     */
    public static final Gridcellcrossvalidation GRIDCELLCROSSVALIDATION = jooq.mysql.gen.tables.Gridcellcrossvalidation.GRIDCELLCROSSVALIDATION;

    /**
     * The table <code>modeldb_test.GridSearchCrossValidationEvent</code>.
     */
    public static final Gridsearchcrossvalidationevent GRIDSEARCHCROSSVALIDATIONEVENT = jooq.mysql.gen.tables.Gridsearchcrossvalidationevent.GRIDSEARCHCROSSVALIDATIONEVENT;

    /**
     * The table <code>modeldb_test.HyperParameter</code>.
     */
    public static final Hyperparameter HYPERPARAMETER = jooq.mysql.gen.tables.Hyperparameter.HYPERPARAMETER;

    /**
     * The table <code>modeldb_test.LinearModel</code>.
     */
    public static final Linearmodel LINEARMODEL = jooq.mysql.gen.tables.Linearmodel.LINEARMODEL;

    /**
     * The table <code>modeldb_test.LinearModelTerm</code>.
     */
    public static final Linearmodelterm LINEARMODELTERM = jooq.mysql.gen.tables.Linearmodelterm.LINEARMODELTERM;

    /**
     * The table <code>modeldb_test.MetadataKV</code>.
     */
    public static final Metadatakv METADATAKV = jooq.mysql.gen.tables.Metadatakv.METADATAKV;

    /**
     * The table <code>modeldb_test.MetricEvent</code>.
     */
    public static final Metricevent METRICEVENT = jooq.mysql.gen.tables.Metricevent.METRICEVENT;

    /**
     * The table <code>modeldb_test.ModelObjectiveHistory</code>.
     */
    public static final Modelobjectivehistory MODELOBJECTIVEHISTORY = jooq.mysql.gen.tables.Modelobjectivehistory.MODELOBJECTIVEHISTORY;

    /**
     * VIEW
     */
    public static final ModelView MODEL_VIEW = jooq.mysql.gen.tables.ModelView.MODEL_VIEW;

    /**
     * The table <code>modeldb_test.PipelineStage</code>.
     */
    public static final Pipelinestage PIPELINESTAGE = jooq.mysql.gen.tables.Pipelinestage.PIPELINESTAGE;

    /**
     * VIEW
     */
    public static final PipelineView PIPELINE_VIEW = jooq.mysql.gen.tables.PipelineView.PIPELINE_VIEW;

    /**
     * The table <code>modeldb_test.Project</code>.
     */
    public static final Project PROJECT = jooq.mysql.gen.tables.Project.PROJECT;

    /**
     * The table <code>modeldb_test.RandomSplitEvent</code>.
     */
    public static final Randomsplitevent RANDOMSPLITEVENT = jooq.mysql.gen.tables.Randomsplitevent.RANDOMSPLITEVENT;

    /**
     * The table <code>modeldb_test.Transformer</code>.
     */
    public static final Transformer TRANSFORMER = jooq.mysql.gen.tables.Transformer.TRANSFORMER;

    /**
     * The table <code>modeldb_test.TransformerSpec</code>.
     */
    public static final Transformerspec TRANSFORMERSPEC = jooq.mysql.gen.tables.Transformerspec.TRANSFORMERSPEC;

    /**
     * VIEW
     */
    public static final TransformerView TRANSFORMER_VIEW = jooq.mysql.gen.tables.TransformerView.TRANSFORMER_VIEW;

    /**
     * The table <code>modeldb_test.TransformEvent</code>.
     */
    public static final Transformevent TRANSFORMEVENT = jooq.mysql.gen.tables.Transformevent.TRANSFORMEVENT;

    /**
     * The table <code>modeldb_test.TreeLink</code>.
     */
    public static final Treelink TREELINK = jooq.mysql.gen.tables.Treelink.TREELINK;

    /**
     * The table <code>modeldb_test.TreeModel</code>.
     */
    public static final Treemodel TREEMODEL = jooq.mysql.gen.tables.Treemodel.TREEMODEL;

    /**
     * The table <code>modeldb_test.TreeModelComponent</code>.
     */
    public static final Treemodelcomponent TREEMODELCOMPONENT = jooq.mysql.gen.tables.Treemodelcomponent.TREEMODELCOMPONENT;

    /**
     * The table <code>modeldb_test.TreeNode</code>.
     */
    public static final Treenode TREENODE = jooq.mysql.gen.tables.Treenode.TREENODE;
}
