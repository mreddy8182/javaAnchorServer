/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.pojos;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.*;


public class SharedTreeParametersV3 extends ModelParametersSchemaV3 {

    /**
     * Balance training data class counts via over/under-sampling (for imbalanced data).
     */
    @SerializedName("balance_classes")
    public boolean balanceClasses;

    /**
     * Desired over/under-sampling ratios per class (in lexicographic order). If not specified, sampling factors will be
     * automatically computed to obtain class balance during training. Requires balance_classes.
     */
    @SerializedName("class_sampling_factors")
    public float[] classSamplingFactors;

    /**
     * Maximum relative size of the training data after balancing class counts (can be less than 1.0). Requires
     * balance_classes.
     */
    @SerializedName("max_after_balance_size")
    public float maxAfterBalanceSize;

    /**
     * [Deprecated] Maximum size (# classes) for confusion matrices to be printed in the Logs
     */
    @SerializedName("max_confusion_matrix_size")
    public int maxConfusionMatrixSize;

    /**
     * Max. number (top K) of predictions to use for hit ratio computation (for multi-class only, 0 to disable)
     */
    @SerializedName("max_hit_ratio_k")
    public int maxHitRatioK;

    /**
     * Number of trees.
     */
    public int ntrees;

    /**
     * Maximum tree depth.
     */
    @SerializedName("max_depth")
    public int maxDepth;

    /**
     * Fewest allowed (weighted) observations in a leaf.
     */
    @SerializedName("min_rows")
    public double minRows;

    /**
     * For numerical columns (real/int), build a histogram of (at least) this many bins, then split at the best point
     */
    public int nbins;

    /**
     * For numerical columns (real/int), build a histogram of (at most) this many bins at the root level, then decrease
     * by factor of two per level
     */
    @SerializedName("nbins_top_level")
    public int nbinsTopLevel;

    /**
     * For categorical columns (factors), build a histogram of this many bins, then split at the best point. Higher
     * values can lead to more overfitting.
     */
    @SerializedName("nbins_cats")
    public int nbinsCats;

    /**
     * r2_stopping is no longer supported and will be ignored if set - please use stopping_rounds, stopping_metric and
     * stopping_tolerance instead. Previous version of H2O would stop making trees when the R^2 metric equals or exceeds
     * this
     */
    @SerializedName("r2_stopping")
    public double r2Stopping;

    /**
     * Seed for pseudo random number generator (if applicable)
     */
    public long seed;

    /**
     * Run on one node only; no network overhead but fewer cpus used.  Suitable for small datasets.
     */
    @SerializedName("build_tree_one_node")
    public boolean buildTreeOneNode;

    /**
     * Row sample rate per tree (from 0.0 to 1.0)
     */
    @SerializedName("sample_rate")
    public double sampleRate;

    /**
     * A list of row sample rates per class (relative fraction for each class, from 0.0 to 1.0), for each tree
     */
    @SerializedName("sample_rate_per_class")
    public double[] sampleRatePerClass;

    /**
     * Column sample rate per tree (from 0.0 to 1.0)
     */
    @SerializedName("col_sample_rate_per_tree")
    public double colSampleRatePerTree;

    /**
     * Relative change of the column sampling rate for every level (must be > 0.0 and <= 2.0)
     */
    @SerializedName("col_sample_rate_change_per_level")
    public double colSampleRateChangePerLevel;

    /**
     * Score the model after every so many trees. Disabled if set to 0.
     */
    @SerializedName("score_tree_interval")
    public int scoreTreeInterval;

    /**
     * Minimum relative improvement in squared error reduction for a split to happen
     */
    @SerializedName("min_split_improvement")
    public double minSplitImprovement;

    /**
     * What type of histogram to use for finding optimal split points
     */
    @SerializedName("histogram_type")
    public TreeSharedTreeModelSharedTreeParametersHistogramType histogramType;

    /**
     * Use Platt Scaling to calculate calibrated class probabilities. Calibration can provide more accurate estimates of
     * class probabilities.
     */
    @SerializedName("calibrate_model")
    public boolean calibrateModel;

    /**
     * Calibration frame for Platt Scaling
     */
    @SerializedName("calibration_frame")
    public FrameKeyV3 calibrationFrame;


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
    public SharedTreeParametersV3() {
        balanceClasses = false;
        maxAfterBalanceSize = 0.0f;
        maxConfusionMatrixSize = 0;
        maxHitRatioK = 0;
        ntrees = 0;
        maxDepth = 0;
        minRows = 0.0;
        nbins = 0;
        nbinsTopLevel = 0;
        nbinsCats = 0;
        r2Stopping = 0.0;
        seed = 0L;
        buildTreeOneNode = false;
        sampleRate = 0.0;
        colSampleRatePerTree = 0.0;
        colSampleRateChangePerLevel = 0.0;
        scoreTreeInterval = 0;
        minSplitImprovement = 0.0;
        calibrateModel = false;
        nfolds = 0;
        keepCrossValidationPredictions = false;
        keepCrossValidationFoldAssignment = false;
        parallelizeCrossValidation = false;
        tweediePower = 0.0;
        quantileAlpha = 0.0;
        huberAlpha = 0.0;
        maxCategoricalLevels = 0;
        ignoreConstCols = false;
        scoreEachIteration = false;
        stoppingRounds = 0;
        maxRuntimeSecs = 0.0;
        stoppingTolerance = 0.0;
        customMetricFunc = "";
    }

    /**
     * Return the contents of this object as a JSON String.
     */
    @Override
    public String toString() {
        return new GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(this);
    }

}
