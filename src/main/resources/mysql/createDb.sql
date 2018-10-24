-- Top level grouping mechanism for machine learning events.
-- ModelDB stores multiple projects, each of which contains multiple
-- experiments, each of which contains multiple experiment runs.
-- Each event and primitive (DataFrame, Transformer, TransformerSpec) is
-- associated with an ExperimentRun.
DROP TABLE IF EXISTS Project;
CREATE TABLE Project (
  id int PRIMARY KEY AUTO_INCREMENT,
  -- A descriptive name for the project.
  name text,
  -- The name of the project author.
  author text,
  -- A description of the project and its goals.
  description text,
  -- The timestamp at which the project was created.
  created timestamp NOT NULL
)engine=InnoDB default charset=utf8 auto_increment=1;

-- The second level in the hierarchy of grouping. Many experiments
-- Can be contained in a single project. Each experiment has multiple runs.
DROP TABLE IF EXISTS Experiment;
CREATE TABLE Experiment (
  id int PRIMARY KEY AUTO_INCREMENT,
  -- The project that contains this experiment
  project int NOT NULL,
  foreign key( project)  REFERENCES Project (id)  on delete  cascade  on update cascade,
  -- The name of this particular experiment
  name text NOT NULL,
  -- A description of the experiment and the purpose of the experiment
  description text,
  -- A timestamp at which the experiment was created.
  created timestamp NOT NULL
)engine=InnoDB default charset=utf8 auto_increment=1;

-- Each experiment contains many experiment runs. In experiment runs,
-- you will find the actual machine learning events
DROP TABLE IF EXISTS ExperimentRun;
CREATE TABLE ExperimentRun (
  id int PRIMARY KEY AUTO_INCREMENT,
  -- The experiment which contains this run.
  experiment int NOT NULL,
  foreign key( experiment) REFERENCES Experiment (id)  on delete  cascade  on update cascade,
  -- A description of this particular run, with the goals and parameters it used.
  description text,
  -- A timestamp indicating the time at which this experiment run was created.
  sha text,
  -- Commit hash of the code for this run
  created timestamp NOT NULL
)engine=InnoDB default charset=utf8 auto_increment=1;

-- Metadata information
DROP TABLE IF EXISTS MetadataKV;
CREATE TABLE MetadataKV (
  id int PRIMARY KEY AUTO_INCREMENT,
  -- key name for this piece of metadata
  `key` text NOT NULL,
  -- value of this metadata piece
  value text NOT NULL,
  -- The type of the value
  valueType text NOT NULL
)engine=InnoDB default charset=utf8 auto_increment=1;

-- A DataFrame is a machine learning primitive. It is a table
-- of data with named and typed columns.
DROP TABLE IF EXISTS DataFrame;
CREATE TABLE DataFrame (
  id int PRIMARY KEY AUTO_INCREMENT,
  -- User assigned content associated with the data frame
  tag text,
  --  The number of rows (elements) stored within this DataFrame.
  numRows int NOT NULL,
  -- The ExperimentRun that contains this DataFrame
  experimentRun int NOT NULL,
  foreign key(experimentRun)  REFERENCES ExperimentRun (id)  on delete  cascade  on update cascade,
  -- A path to the file where this DataFrame is stored
  filepath text
)engine=InnoDB default charset=utf8 auto_increment=1;

-- A single column in a DataFrame
-- Each column has a unique name and can only contain a single type.
DROP TABLE IF EXISTS DataFrameColumn;
CREATE TABLE DataFrameColumn (
  id int PRIMARY KEY AUTO_INCREMENT,
  -- The ID of the DataFrame that has this column
  dfId int NOT NULL,
  foreign key(dfId)  REFERENCES DataFrame (id)  on delete  cascade  on update cascade,
  -- The name of the column
  name text NOT NULL,
  -- The type of data that is stored in this column: e.g: Integer, String
  type text NOT NULL
  -- Should we store the index of each column in a DataFrame?
)engine=InnoDB default charset=utf8 auto_increment=1;
CREATE INDEX  DataFrameColumnIndexDfId ON DataFrameColumn(dfId);

-- Table associating metadata with dataframes
DROP TABLE IF EXISTS DataFrameMetadata;
CREATE TABLE DataFrameMetadata (
  id int PRIMARY KEY AUTO_INCREMENT,
  -- id of the dataframe
  dfId int NOT NULL,
  foreign key(dfId)  REFERENCES DataFrame (id)  on delete  cascade  on update cascade,
  -- id of the metadatakv
  metadataKvId int NOT NULL,
  foreign key(metadataKvId ) REFERENCES MetadataKV (id)  on delete  cascade  on update cascade
)engine=InnoDB default charset=utf8 auto_increment=1;

-- A Random Split event represents breaking a DataFrame into
-- smaller DataFrames randomly according to a weight vector that
-- specifies the relative sizes of the smaller DataFrames.
DROP TABLE IF EXISTS RandomSplitEvent;
CREATE TABLE RandomSplitEvent (
  id int PRIMARY KEY AUTO_INCREMENT,
  -- The DataFrame to split
  inputDataFrameId int NOT NULL,
  foreign key(inputDataFrameId)  REFERENCES DataFrame(id)  on delete  cascade  on update cascade,
  -- A seed to use to randomize the splitting process
  randomSeed BIGINT NOT NULL,
  -- The experiment run that contains RandomSplitEvent
  experimentRun int NOT NULL,
  foreign key(experimentRun )  REFERENCES ExperimentRun(id)  on delete  cascade  on update cascade
)engine=InnoDB default charset=utf8 auto_increment=1;


-- A DataFrameSplit represents a portion of a data frame produced by a Random Split Event
-- For example, if you split a DataFrame into pieces with weights of 0.3 and 0.7,
-- You would have two entries in the DataFrameSplit table, one for the 0.3 and one for the 0.7
DROP TABLE IF EXISTS DataFrameSplit;
CREATE TABLE DataFrameSplit (
  id int PRIMARY KEY AUTO_INCREMENT,
  -- The random split event that produced this piece (DataFrameSplit)
  splitEventId int NOT NULL,
  foreign key(splitEventId )  REFERENCES RandomSplitEvent(id)  on delete  cascade  on update cascade,
  -- The weight (relative size) of this piece (DataFrameSplit)
  weight FLOAT NOT NULL,
  -- The produced DataFrame
  dataFrameId int  NOT NULL,

  foreign key(dataFrameId)  REFERENCES DataFrame (id)  on delete  cascade  on update cascade,
  -- The experiment run that contains this piece (DataFrameSplit)
  experimentRun  int  NOT NULL,
  foreign key(experimentRun)  REFERENCES ExperimentRun(id)  on delete  cascade  on update cascade
)engine=InnoDB default charset=utf8 auto_increment=1;

-- A TransformerSpec is a machine learning primitive that describes
-- the hyperparameters used to create a model (A Transformer produced
-- by fitting a TransformerSpec to a DataFrame).
DROP TABLE IF EXISTS TransformerSpec;
CREATE TABLE TransformerSpec (
  id int PRIMARY KEY AUTO_INCREMENT,
  -- The kind of Transformer that this spec describes (e.g. linear regression)
  transformerType text NOT NULL,
  -- User assigned content about this spec
  tag text,
  -- The experiment run in which this spec is contained
  experimentRun  int  NOT NULL,
 foreign key( experimentRun)  REFERENCES ExperimentRun(id)  on delete  cascade  on update cascade
)engine=InnoDB default charset=utf8 auto_increment=1;

-- A hyperparameter helps guide the fitting of a model.
-- e.g. Number of trees in a random forest,
--      number of nuerons in a nueral network
DROP TABLE IF EXISTS HyperParameter;
CREATE TABLE HyperParameter (
  id int PRIMARY KEY AUTO_INCREMENT,
  -- The TransformerSpec that contains this hyperparameter
  spec int  NOT NULL,
  foreign key(spec)  REFERENCES TransformerSpec (id)  on delete  cascade  on update cascade,
  -- The name of this hyperparameter
  paramName text NOT NULL,
  -- The type of the hyperparameter (e.g. String, Integer)
  paramType VARCHAR(40) NOT NULL,
  -- The value assigned to this hyperparameter
  paramValue text NOT NULL,
  -- The minimum value allowed to be assigned to this hyperparameter
  -- Leave Min and Max NULL for non-numerical hyperparameters
  paramMinValue FLOAT,
  -- The maximum value allowed for this hyperparameter
  paramMaxValue FLOAT,
  -- The ExperimentRun that contains this hyperparameter
  experimentRun int  NOT NULL,
  foreign key(experimentRun )  REFERENCES ExperimentRun(id)  on delete  cascade  on update cascade
)engine=InnoDB default charset=utf8 auto_increment=1;

-- Transformers are machine learning primitives that take an input
-- DataFrame and produce an output DataFrame
DROP TABLE IF EXISTS Transformer;
CREATE TABLE Transformer (
  id int PRIMARY KEY AUTO_INCREMENT,
  --  The kind of Transformer (e.g. Linear Regression Model, One-Hot Encoder)
  transformerType text NOT NULL,
  --  User assigned text to describe this Transformer
  tag text,
  -- The ExperimentRun that contains this Transformer
  experimentRun int  NOT NULL,
  foreign key(experimentRun)  REFERENCES ExperimentRun(id)  on delete  cascade  on update cascade,
  --  The path to the serialized Transformer
  filepath text
)engine=InnoDB default charset=utf8 auto_increment=1;

-- Metadata associated with a linear regression, or logistic regression model.
DROP TABLE IF EXISTS LinearModel;
CREATE TABLE LinearModel (
    id int PRIMARY KEY AUTO_INCREMENT,
    -- This is the linear model.
    model  int  NOT NULL,
    foreign key(model)  REFERENCES Transformer(id),
    -- The root mean squared error.
    rmse DOUBLE,
    -- The variance explained by the model.
    explainedVariance DOUBLE,
    -- The R^2 value (coefficient of determiniation).
    r2 DOUBLE
)engine=InnoDB default charset=utf8 auto_increment=1;


-- The data associated with each term (one term per feature and an optional intercept term).
DROP TABLE IF EXISTS LinearModelTerm;
CREATE TABLE LinearModelTerm (
    id int PRIMARY KEY AUTO_INCREMENT,
    -- This is the linear model.
    model  int  NOT NULL,
   foreign key( model)  REFERENCES Transformer(id),
    -- The index of the term. If this is 0, it's the intercept term.
    termIndex int NOT NULL,
    -- The coefficient associated with the term.
    coefficient DOUBLE NOT NULL,
    -- The t-statistic for the term.
    tStat DOUBLE,
    -- The standard error for the term.
    stdErr DOUBLE,
    -- The p-value for the term.
    pValue DOUBLE
)engine=InnoDB default charset=utf8 auto_increment=1;

-- The value of the objective function during the training of a model.
DROP TABLE IF EXISTS ModelObjectiveHistory;
CREATE TABLE ModelObjectiveHistory (
    id int PRIMARY KEY AUTO_INCREMENT,
    -- This is the linear model.
    model  int  NOT NULL,
   foreign key( model )  REFERENCES Transformer(id),
    -- The iteration number.
    iteration int NOT NULL,
    -- The value of the objective function at this iteration.
    objectiveValue DOUBLE NOT NULL
)engine=InnoDB default charset=utf8 auto_increment=1;

-- Describes a Fit Event - Fitting a Transformer Spec to a DataFrame to
-- produce a model (Transformer)
DROP TABLE IF EXISTS FitEvent;
CREATE TABLE FitEvent (
  id int PRIMARY KEY AUTO_INCREMENT,
  -- The TransformerSpec guiding the fitting
  transformerSpec  int  NOT NULL,
 foreign key( transformerSpec)  REFERENCES TransformerSpec(id)  on delete  cascade  on update cascade,
  -- The model (fitted Transformer) produced by the fitting
  transformer  int  NOT NULL,
  foreign key(transformer )  REFERENCES Transformer(id)  on delete  cascade  on update cascade,
  -- The DataFrame that the Spec is being fitted to
  df  int  NOT NULL,
  foreign key(df)  REFERENCES DataFrame (id)  on delete  cascade  on update cascade,
  -- The names of the output columns that will contain the model's predictions
  -- There may be multiple columns produced - one predicting the actual data, and the others
  -- describing additional information, such as confidence
  predictionColumns text NOT NULL, -- Should be comma-separated, no spaces, alphabetical.
  -- The name of the columns in the DataFrame whose values this Transformer is supposed to predict. We support
  -- multiple label columns.
  labelColumns text NOT NULL,
  -- The ExperimentRun that contains this event.
  experimentRun  int  NOT NULL,
  foreign key(experimentRun)  REFERENCES ExperimentRun(id)  on delete  cascade  on update cascade,
  -- The type of problem that the FitEvent is solving (e.g. Regression,
  -- Classification, Clustering, Recommendation, Undefined)
  problemType text NOT NULL
)engine=InnoDB default charset=utf8 auto_increment=1;
CREATE INDEX  FitEventIndexTransformer ON FitEvent(transformer);

-- Describes a feature in the DataFrame - an attribute to consider when
-- creating a Transformer from a DataFrame via a FitEvent.
DROP TABLE IF EXISTS Feature;
CREATE TABLE Feature (
  id int PRIMARY KEY AUTO_INCREMENT,
  -- The name of the feature
  name VARCHAR(200) NOT NULL,
  -- The index of this feature in the feature vector
  featureIndex int NOT NULL,
  -- The importance to assign to this feature compared to the others
  -- (Depends on transformer type)
  importance DOUBLE NOT NULL,
  -- The transformer that should utilize this feature
  transformer  int  NOT NULL,
  foreign key(transformer )  REFERENCES Transformer(id)
)engine=InnoDB default charset=utf8 auto_increment=1;
CREATE INDEX  FeatureIndexTransformer ON Feature(transformer);
CREATE INDEX  FeatureIndexName ON Feature(name);

-- A TransformEvent describes using a Transformer to produce an output
-- DataFrame from an input DataFrame
DROP TABLE IF EXISTS TransformEvent;
CREATE TABLE TransformEvent (
  id int PRIMARY KEY AUTO_INCREMENT,
  -- The original DataFrame that is input into the Transformer
  oldDf  int  NOT NULL,
  foreign key(oldDf ) REFERENCES DataFrame(id)  on delete  cascade  on update cascade,
  -- The output DataFrame of the Transformer
  newDf int  NOT NULL,
 foreign key( newDf)  REFERENCES DataFrame(id)  on delete  cascade  on update cascade,
  -- The Transformer used to perform this transformation
  transformer int  NOT NULL,
 foreign key( transformer)  REFERENCES Transformer(id)  on delete  cascade  on update cascade,
  -- The columns in the input DataFrame that are used by the transformer
  inputColumns text NOT NULL, -- Should be comma-separated, no spaces, alphabetical.
  -- The columns outputted by the Transformer
  outputColumns text NOT NULL, -- Should be comma-separated, no spaces, alphabetical.
 experimentRun  int  NOT NULL,
 foreign key( experimentRun)  REFERENCES ExperimentRun(id)  on delete  cascade  on update cascade
)engine=InnoDB default charset=utf8 auto_increment=1;
CREATE INDEX  TransformEventIndexNewDf ON TransformEvent(newDf);
CREATE INDEX  TransformEventIndexExperimentRun ON TransformEvent(experimentRun);

DROP TABLE IF EXISTS TreeNode;
CREATE TABLE TreeNode (
  id int PRIMARY KEY AUTO_INCREMENT,
  isLeaf int NOT NULL, -- 1 if node is leaf, 0 if node is internal
  prediction DOUBLE NOT NULL, -- Internal nodes obviously do not use their predictions
  impurity DOUBLE NOT NULL, -- Impurity of node.
  gain DOUBLE, -- Information gain at node. NULL for leaf nodes.
  splitIndex int, -- Index of feature that the internal node is splitting. NULL if this is a leaf node.
 rootNode int  NOT NULL,
 foreign key( rootNode)  REFERENCES TreeNode(id) -- NULL for the root node
)engine=InnoDB default charset=utf8 auto_increment=1;

DROP TABLE IF EXISTS TreeLink;
CREATE TABLE TreeLink (
  id int PRIMARY KEY AUTO_INCREMENT,
  parent int  NOT NULL,
 foreign key( parent)  REFERENCES TreeNode(id)  on delete  cascade  on update cascade,
 child int  NOT NULL,
 foreign key( child ) REFERENCES TreeNode(id)  on delete  cascade  on update cascade,
  isLeft int NOT NULL -- 1 if the child is a left child and 0 if the child is a right child.
)engine=InnoDB default charset=utf8 auto_increment=1;

DROP TABLE IF EXISTS TreeModel;
CREATE TABLE TreeModel (
  id int PRIMARY KEY AUTO_INCREMENT,
  model int  NOT NULL,
 foreign key( model ) REFERENCES Transformer(id)  on delete  cascade  on update cascade,
  modelType text NOT NULL -- Should be "Decision Tree", "GBT", or "Random Forest"
)engine=InnoDB default charset=utf8 auto_increment=1;

-- This represents the components of a tree ensemble (gradient boosted tree or random forest).
-- Note that we can also represent a decision tree as an ensemble with a single component that has weight 1.0.
DROP TABLE IF EXISTS TreeModelComponent;
CREATE TABLE TreeModelComponent (
  id int PRIMARY KEY AUTO_INCREMENT,
  model int  NOT NULL,
  foreign key(model )  REFERENCES Transformer(id),
  componentIndex int NOT NULL,
  componentWeight DOUBLE NOT NULL,
  rootNode int  NOT NULL,
 foreign key( rootNode)  REFERENCES TreeNode(id)
)engine=InnoDB default charset=utf8 auto_increment=1;

-- An event that represents the evaluation of a model given a DataFrame
DROP TABLE IF EXISTS MetricEvent;
CREATE TABLE MetricEvent (
  id int PRIMARY KEY AUTO_INCREMENT,
  -- The model (Transformer) being evaluated
  transformer int  NOT NULL,
  foreign key(transformer ) REFERENCES Transformer(id)  on delete  cascade  on update cascade,
  -- The DataFrame that the model is being evaluated on
  df int  NOT NULL,
 foreign key( df)  REFERENCES DataFrame(id)  on delete  cascade  on update cascade,
  -- The type of Metric being measured (e.g. Squared Error, Accuracy, f1)
  metricType text NOT NULL,
  -- The value of the measured Metric
  metricValue REAL NOT NULL,
  -- The Experiment Run that contains this Metric
  experimentRun  int  NOT NULL,
 foreign key( experimentRun)  REFERENCES ExperimentRun(id)  on delete  cascade  on update cascade
)engine=InnoDB default charset=utf8 auto_increment=1;

-- A generic Event that can represent anything
DROP TABLE IF EXISTS Event;
CREATE TABLE Event (
  id int PRIMARY KEY AUTO_INCREMENT,
  -- The type of the event that this entry represents
  eventType text NOT NULL,
  -- The id of the event within its respective table
  eventId int NOT NULL, -- references the actual event in the table
  -- The Experiment Run that contains this Event
  experimentRun int  NOT NULL,
  foreign key(experimentRun)  REFERENCES ExperimentRun(id)  on delete  cascade  on update cascade
)engine=InnoDB default charset=utf8 auto_increment=1;

-- Represents a transform event or fit event that was part of the creation of a pipeline model
-- A pipeline model is a sequence of transformers, some of which may have been created by
-- Fit Events, in which each transformer transforms its input and passes its output to the next
-- Transformer
DROP TABLE IF EXISTS PipelineStage;
CREATE TABLE PipelineStage (
  id int PRIMARY KEY AUTO_INCREMENT,
  pipelineFitEvent int  NOT NULL,
  foreign key(pipelineFitEvent )  REFERENCES FitEvent(id)  on delete  cascade  on update cascade,
 transformOrFitEvent int  NOT NULL,
  foreign key(transformOrFitEvent)  REFERENCES Event(id)  on delete  cascade  on update cascade,
  isFit int NOT NULL, -- 0 if this is a Transform stage and 1 if this is a Fit stage.
  stageNumber int NOT NULL,
  experimentRun int  NOT NULL,
  foreign key(experimentRun)  REFERENCES ExperimentRun(id)  on delete  cascade  on update cascade
)engine=InnoDB default charset=utf8 auto_increment=1;

DROP TABLE IF EXISTS CrossValidationEvent;
CREATE TABLE CrossValidationEvent (
  id int PRIMARY KEY AUTO_INCREMENT,
  df int  NOT NULL,
 foreign key( df)  REFERENCES DataFrame(id)  on delete  cascade  on update cascade,
  spec int  NOT NULL,
  foreign key(spec)  REFERENCES TransformerSpec(id)  on delete  cascade  on update cascade,
  numFolds int NOT NULL,
  randomSeed BIGINT NOT NULL,
  evaluator text NOT NULL,
  experimentRun int  NOT NULL,
  foreign key(experimentRun)  REFERENCES ExperimentRun(id)  on delete  cascade  on update cascade
)engine=InnoDB default charset=utf8 auto_increment=1;

DROP TABLE IF EXISTS CrossValidationFold;
CREATE TABLE CrossValidationFold (
  id int PRIMARY KEY AUTO_INCREMENT,
  metric int  NOT NULL,
  event int  NOT NULL,
  experimentRun int  NOT NULL,
 foreign key( metric )  REFERENCES MetricEvent(id)  on delete  cascade  on update cascade,
  foreign key(event )  REFERENCES CrossValidationEvent(id)  on delete  cascade  on update cascade,
 foreign key( experimentRun )  REFERENCES ExperimentRun(id)  on delete  cascade  on update cascade
)engine=InnoDB default charset=utf8 auto_increment=1;

DROP TABLE IF EXISTS GridSearchCrossValidationEvent;
CREATE TABLE GridSearchCrossValidationEvent (
  id int PRIMARY KEY AUTO_INCREMENT,
  numFolds int NOT NULL,
  best int  NOT NULL,
  experimentRun int  NOT NULL,
  foreign key(best)  REFERENCES FitEvent(id)  on delete  cascade  on update cascade,
 foreign key( experimentRun)  REFERENCES ExperimentRun(id)  on delete  cascade  on update cascade
)engine=InnoDB default charset=utf8 auto_increment=1;

DROP TABLE IF EXISTS GridCellCrossValidation;
CREATE TABLE GridCellCrossValidation (
  id int PRIMARY KEY AUTO_INCREMENT,
  gridSearch int  NOT NULL,
  crossValidation int  NOT NULL,
  experimentRun int  NOT NULL,
 foreign key( gridSearch)  REFERENCES GridSearchCrossValidationEvent(id)  on delete  cascade  on update cascade,
 foreign key( crossValidation ) REFERENCES CrossValidationEvent(id)  on delete  cascade  on update cascade,
  foreign key(experimentRun ) REFERENCES ExperimentRun(id)  on delete  cascade  on update cascade
)engine=InnoDB default charset=utf8 auto_increment=1;

-- An annotation is a user-specified note that is posted to the server.
-- It consists of an ordered sequence of AnnotationFragments.
DROP TABLE IF EXISTS Annotation;
CREATE TABLE Annotation (
  id int PRIMARY KEY AUTO_INCREMENT,
  posted timestamp NOT NULL,
  experimentRun int  NOT NULL,
  foreign key(experimentRun)  REFERENCES ExperimentRun(id)  on delete  cascade  on update cascade
)engine=InnoDB default charset=utf8 auto_increment=1;

-- An AnnotationFragment is part of an Annotation. For example, consider the annotation:
-- ("I'm having issues with"), (model 1), ("it seems that it was trained on an erroneous dataset"), (DataFrame 2).
-- This annotation has four fragments (in parentheses). We let an AnnotationFragment to represent one of the following:
--  message: A string
--  spec: A reference to a TransformerSpec
--   Transformer: A references to a Transformer
--  DataFrame: A reference to a DataFrame
-- We indicate which of these four types the AnnotationFragment is by using the 'type' column.
-- The 'index' column represents the position of the fragment in the Annotation. In our example annotation above, the
-- (DataFrame 2) fragment would have index 3 while the ("I'm having issues with") fragment would have index 0.
DROP TABLE IF EXISTS AnnotationFragment;
CREATE TABLE AnnotationFragment (
  id int PRIMARY KEY AUTO_INCREMENT,
  annotation  int  NOT NULL,
  transformer int  NOT NULL,
  DataFrame int  NOT NULL,
  spec int  NOT NULL,
  experimentRun int  NOT NULL,
  foreign key(annotation)  REFERENCES Annotation(id)  on delete  cascade  on update cascade,
  fragmentIndex int NOT NULL,
  type text NOT NULL,
  foreign key(transformer ) REFERENCES Transformer(id),
  foreign key(DataFrame)  REFERENCES DataFrame(id),
  foreign key(spec ) REFERENCES TransformerSpec(id),
  message text,
  foreign key(experimentRun)  REFERENCES ExperimentRun(id)  on delete  cascade  on update cascade
)engine=InnoDB default charset=utf8 auto_increment=1;

--  Create a view for models (i.e. the Transformers that have an associated FitEvent).
DROP VIEW IF EXISTS model_view;
CREATE VIEW model_view AS
  SELECT fe.id as fe_id, ts.transformertype as model_type, fe.transformer as model, fe.transformerspec as spec_id, fe.df as train_df
  FROM FitEvent fe, TransformerSpec ts
  WHERE ts.id = fe.transformerspec order by fe.id;

--  Create a view for Transformers which are not models
DROP VIEW IF EXISTS transformer_view;
CREATE VIEW transformer_view AS
  SELECT te.id as te_id, t.transformertype as transformer_type, te.transformer as transformer, te.olddf as input_df, te.newdf as output_df
  FROM TransformEvent te, Transformer t
  WHERE te.transformer = t.id order by te.id;

-- Create a view for pipeline structure
DROP VIEW IF EXISTS pipeline_view;
CREATE VIEW pipeline_view AS
  SELECT pipelinefitevent, stagenumber, e.id as event_id, e.eventtype, e.eventid
  FROM PipelineStage ps, Event e
  WHERE ps.transformorfitevent = e.id order by stagenumber, eventtype;

-- Create a view that shows experimentrun, experiment, and projectid in one table.
DROP VIEW IF EXISTS experiment_run_view;
CREATE VIEW experiment_run_view AS
    SELECT er.id AS experimentRunId, e.id AS experimentId, p.id AS projectId
    FROM ExperimentRun er, Experiment e, Project p
    WHERE er.experiment = e.id
    AND e.project = p.id;
