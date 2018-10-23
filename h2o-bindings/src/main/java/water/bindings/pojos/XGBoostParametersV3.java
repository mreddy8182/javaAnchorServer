/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.pojos;

import com.google.gson.Gson;
import com.google.gson.annotations.*;


public class XGBoostParametersV3 extends ModelParametersSchemaV3 {

    /**
     * (same as n_estimators) Number of trees.
     */
    public int ntrees;

    /**
     * (same as ntrees) Number of trees.
     */
    @SerializedName("n_estimators")
    public int nEstimators;

    /**
     * Maximum tree depth.
     */
    @SerializedName("max_depth")
    public int maxDepth;

    /**
     * (same as min_child_weight) Fewest allowed (weighted) observations in a leaf.
     */
    @SerializedName("min_rows")
    public double minRows;

    /**
     * (same as min_rows) Fewest allowed (weighted) observations in a leaf.
     */
    @SerializedName("min_child_weight")
    public double minChildWeight;

    /**
     * (same as eta) Learning rate (from 0.0 to 1.0)
     */
    @SerializedName("learn_rate")
    public double learnRate;

    /**
     * (same as learn_rate) Learning rate (from 0.0 to 1.0)
     */
    public double eta;

    /**
     * (same as subsample) Row sample rate per tree (from 0.0 to 1.0)
     */
    @SerializedName("sample_rate")
    public double sampleRate;

    /**
     * (same as sample_rate) Row sample rate per tree (from 0.0 to 1.0)
     */
    public double subsample;

    /**
     * (same as colsample_bylevel) Column sample rate (from 0.0 to 1.0)
     */
    @SerializedName("col_sample_rate")
    public double colSampleRate;

    /**
     * (same as col_sample_rate) Column sample rate (from 0.0 to 1.0)
     */
    @SerializedName("colsample_bylevel")
    public double colsampleBylevel;

    /**
     * (same as colsample_bytree) Column sample rate per tree (from 0.0 to 1.0)
     */
    @SerializedName("col_sample_rate_per_tree")
    public double colSampleRatePerTree;

    /**
     * (same as col_sample_rate_per_tree) Column sample rate per tree (from 0.0 to 1.0)
     */
    @SerializedName("colsample_bytree")
    public double colsampleBytree;

    /**
     * (same as max_delta_step) Maximum absolute value of a leaf node prediction
     */
    @SerializedName("max_abs_leafnode_pred")
    public float maxAbsLeafnodePred;

    /**
     * (same as max_abs_leafnode_pred) Maximum absolute value of a leaf node prediction
     */
    @SerializedName("max_delta_step")
    public float maxDeltaStep;

    /**
     * Score the model after every so many trees. Disabled if set to 0.
     */
    @SerializedName("score_tree_interval")
    public int scoreTreeInterval;

    /**
     * Seed for pseudo random number generator (if applicable)
     */
    public long seed;

    /**
     * (same as gamma) Minimum relative improvement in squared error reduction for a split to happen
     */
    @SerializedName("min_split_improvement")
    public float minSplitImprovement;

    /**
     * (same as min_split_improvement) Minimum relative improvement in squared error reduction for a split to happen
     */
    public float gamma;

    /**
     * Number of parallel threads that can be used to run XGBoost. Cannot exceed H2O cluster limits (-nthreads
     * parameter). Defaults to maximum available
     */
    public int nthread;

    /**
     * For tree_method=hist only: maximum number of bins
     */
    @SerializedName("max_bins")
    public int maxBins;

    /**
     * For tree_method=hist only: maximum number of leaves
     */
    @SerializedName("max_leaves")
    public int maxLeaves;

    /**
     * For tree_method=hist only: the mininum sum of hessian in a leaf to keep splitting
     */
    @SerializedName("min_sum_hessian_in_leaf")
    public float minSumHessianInLeaf;

    /**
     * For tree_method=hist only: the mininum data in a leaf to keep splitting
     */
    @SerializedName("min_data_in_leaf")
    public float minDataInLeaf;

    /**
     * Tree method
     */
    @SerializedName("tree_method")
    public TreexgboostXGBoostModelXGBoostParametersTreeMethod treeMethod;

    /**
     * Grow policy - depthwise is standard GBM, lossguide is LightGBM
     */
    @SerializedName("grow_policy")
    public TreexgboostXGBoostModelXGBoostParametersGrowPolicy growPolicy;

    /**
     * Booster type
     */
    public TreexgboostXGBoostModelXGBoostParametersBooster booster;

    /**
     * L2 regularization
     */
    @SerializedName("reg_lambda")
    public float regLambda;

    /**
     * L1 regularization
     */
    @SerializedName("reg_alpha")
    public float regAlpha;

    /**
     * Enable quiet mode
     */
    @SerializedName("quiet_mode")
    public boolean quietMode;

    /**
     * For booster=dart only: sample_type
     */
    @SerializedName("sample_type")
    public TreexgboostXGBoostModelXGBoostParametersDartSampleType sampleType;

    /**
     * For booster=dart only: normalize_type
     */
    @SerializedName("normalize_type")
    public TreexgboostXGBoostModelXGBoostParametersDartNormalizeType normalizeType;

    /**
     * For booster=dart only: rate_drop (0..1)
     */
    @SerializedName("rate_drop")
    public float rateDrop;

    /**
     * For booster=dart only: one_drop
     */
    @SerializedName("one_drop")
    public boolean oneDrop;

    /**
     * For booster=dart only: skip_drop (0..1)
     */
    @SerializedName("skip_drop")
    public float skipDrop;

    /**
     * Type of DMatrix. For sparse, NAs and 0 are treated equally.
     */
    @SerializedName("dmatrix_type")
    public TreexgboostXGBoostModelXGBoostParametersDMatrixType dmatrixType;

    /**
     * Backend. By default (auto), a GPU is used if available.
     */
    public TreexgboostXGBoostModelXGBoostParametersBackend backend;

    /**
     * Which GPU to use.
     */
    @SerializedName("gpu_id")
    public int gpuId;


    /*------------------------------------------------------------------------------------------------------------------
    //                                                  INHERITED
    //------------------------------------------------------------------------------------------------------------------

    // Destination id for this model; auto-generated if not specified.
    public ModelKeyV3 modelId;

    // Id of the training data frame.
    public FrameKeyV3 trainingFrame;

    // Id of the validation data frame.
    public FrameKeyV3 validationFrame;

    // Number of folds for K-fold cross-validation (0 to disable or >= 2).
    public int nfolds;

    // Whether to keep the predictions of the cross-validation models.
    public boolean keepCrossValidationPredictions;

    // Whether to keep the cross-validation fold assignment.
    public boolean keepCrossValidationFoldAssignment;

    // Allow parallel training of cross-validation models
    public boolean parallelizeCrossValidation;

    // Distribution function
    public GenmodelutilsDistributionFamily distribution;

    // Tweedie power for Tweedie regression, must be between 1 and 2.
    public double tweediePower;

    // Desired quantile for Quantile regression, must be between 0 and 1.
    public double quantileAlpha;

    // Desired quantile for Huber/M-regression (threshold between quadratic and linear loss, must be between 0 and 1).
    public double huberAlpha;

    // Response variable column.
    public ColSpecifierV3 responseColumn;

    // Column with observation weights. Giving some observation a weight of zero is equivalent to excluding it from the
    // dataset; giving an observation a relative weight of 2 is equivalent to repeating that row twice. Negative weights
    // are not allowed. Note: Weights are per-row observation weights and do not increase the size of the data frame.
    // This is typically the number of times a row is repeated, but non-integer values are supported as well. During
    // training, rows with higher weights matter more, due to the larger loss function pre-factor.
    public ColSpecifierV3 weightsColumn;

    // Offset column. This will be added to the combination of columns before applying the link function.
    public ColSpecifierV3 offsetColumn;

    // Column with cross-validation fold index assignment per observation.
    public ColSpecifierV3 foldColumn;

    // Cross-validation fold assignment scheme, if fold_column is not specified. The 'Stratified' option will stratify
    // the folds based on the response variable, for classification problems.
    public ModelParametersFoldAssignmentScheme foldAssignment;

    // Encoding scheme for categorical features
    public ModelParametersCategoricalEncodingScheme categoricalEncoding;

    // For every categorical feature, only use this many most frequent categorical levels for model training. Only used
    // for categorical_encoding == EnumLimited.
    public int maxCategoricalLevels;

    // Names of columns to ignore for training.
    public String[] ignoredColumns;

    // Ignore constant columns.
    public boolean ignoreConstCols;

    // Whether to score during each iteration of model training.
    public boolean scoreEachIteration;

    // Model checkpoint to resume training with.
    public ModelKeyV3 checkpoint;

    // Early stopping based on convergence of stopping_metric. Stop if simple moving average of length k of the
    // stopping_metric does not improve for k:=stopping_rounds scoring events (0 to disable)
    public int stoppingRounds;

    // Maximum allowed runtime in seconds for model training. Use 0 to disable.
    public double maxRuntimeSecs;

    // Metric to use for early stopping (AUTO: logloss for classification, deviance for regression)
    public ScoreKeeperStoppingMetric stoppingMetric;

    // Relative tolerance for metric-based stopping criterion (stop if relative improvement is not at least this much)
    public double stoppingTolerance;

    // Reference to custom evaluation function, format: `language:keyName=funcName`
    public String customMetricFunc;

    */

    /**
     * Public constructor
     */
    public XGBoostParametersV3() {
        ntrees = 50;
        nEstimators = 0;
        maxDepth = 6;
        minRows = 1.0;
        minChildWeight = 1.0;
        learnRate = 0.3;
        eta = 0.3;
        sampleRate = 1.0;
        subsample = 1.0;
        colSampleRate = 1.0;
        colsampleBylevel = 1.0;
        colSampleRatePerTree = 1.0;
        colsampleBytree = 1.0;
        maxAbsLeafnodePred = 0.0f;
        maxDeltaStep = 0.0f;
        scoreTreeInterval = 0;
        seed = -1L;
        minSplitImprovement = 0.0f;
        gamma = 0.0f;
        nthread = -1;
        maxBins = 256;
        maxLeaves = 0;
        minSumHessianInLeaf = 100.0f;
        minDataInLeaf = 0.0f;
        treeMethod = TreexgboostXGBoostModelXGBoostParametersTreeMethod.auto;
        growPolicy = TreexgboostXGBoostModelXGBoostParametersGrowPolicy.depthwise;
        booster = TreexgboostXGBoostModelXGBoostParametersBooster.gbtree;
        regLambda = 0.0f;
        regAlpha = 0.0f;
        quietMode = true;
        sampleType = TreexgboostXGBoostModelXGBoostParametersDartSampleType.uniform;
        normalizeType = TreexgboostXGBoostModelXGBoostParametersDartNormalizeType.tree;
        rateDrop = 0.0f;
        oneDrop = false;
        skipDrop = 0.0f;
        dmatrixType = TreexgboostXGBoostModelXGBoostParametersDMatrixType.auto;
        backend = TreexgboostXGBoostModelXGBoostParametersBackend.auto;
        gpuId = 0;
        nfolds = 0;
        keepCrossValidationPredictions = false;
        keepCrossValidationFoldAssignment = false;
        parallelizeCrossValidation = true;
        distribution = GenmodelutilsDistributionFamily.AUTO;
        tweediePower = 1.5;
        quantileAlpha = 0.5;
        huberAlpha = 0.9;
        foldAssignment = ModelParametersFoldAssignmentScheme.AUTO;
        categoricalEncoding = ModelParametersCategoricalEncodingScheme.AUTO;
        maxCategoricalLevels = 10;
        ignoreConstCols = true;
        scoreEachIteration = false;
        stoppingRounds = 0;
        maxRuntimeSecs = 0.0;
        stoppingMetric = ScoreKeeperStoppingMetric.AUTO;
        stoppingTolerance = 0.001;
        customMetricFunc = "";
    }

    /**
     * Return the contents of this object as a JSON String.
     */
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
