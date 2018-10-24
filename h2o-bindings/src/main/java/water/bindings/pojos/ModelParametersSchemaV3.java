/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.pojos;

import com.google.gson.Gson;
import com.google.gson.annotations.*;


public class ModelParametersSchemaV3 extends SchemaV3 {

    /**
     * Destination id for this model; auto-generated if not specified.
     */
    @SerializedName("model_id")
    public ModelKeyV3 modelId;

    /**
     * Id of the training data frame.
     */
    @SerializedName("training_frame")
    public FrameKeyV3 trainingFrame;

    /**
     * Id of the validation data frame.
     */
    @SerializedName("validation_frame")
    public FrameKeyV3 validationFrame;

    /**
     * Number of folds for K-fold cross-validation (0 to disable or >= 2).
     */
    public int nfolds;

    /**
     * Whether to keep the predictions of the cross-validation models.
     */
    @SerializedName("keep_cross_validation_predictions")
    public boolean keepCrossValidationPredictions;

    /**
     * Whether to keep the cross-validation fold assignment.
     */
    @SerializedName("keep_cross_validation_fold_assignment")
    public boolean keepCrossValidationFoldAssignment;

    /**
     * Allow parallel training of cross-validation models
     */
    @SerializedName("parallelize_cross_validation")
    public boolean parallelizeCrossValidation;

    /**
     * Distribution function
     */
    public GenmodelutilsDistributionFamily distribution;

    /**
     * Tweedie power for Tweedie regression, must be between 1 and 2.
     */
    @SerializedName("tweedie_power")
    public double tweediePower;

    /**
     * Desired quantile for Quantile regression, must be between 0 and 1.
     */
    @SerializedName("quantile_alpha")
    public double quantileAlpha;

    /**
     * Desired quantile for Huber/M-regression (threshold between quadratic and linear loss, must be between 0 and 1).
     */
    @SerializedName("huber_alpha")
    public double huberAlpha;

    /**
     * Response variable column.
     */
    @SerializedName("response_column")
    public ColSpecifierV3 responseColumn;

    /**
     * Column with observation weights. Giving some observation a weight of zero is equivalent to excluding it from the
     * dataset; giving an observation a relative weight of 2 is equivalent to repeating that row twice. Negative weights
     * are not allowed. Note: Weights are per-row observation weights and do not increase the size of the data frame.
     * This is typically the number of times a row is repeated, but non-integer values are supported as well. During
     * training, rows with higher weights matter more, due to the larger loss function pre-factor.
     */
    @SerializedName("weights_column")
    public ColSpecifierV3 weightsColumn;

    /**
     * Offset column. This will be added to the combination of columns before applying the link function.
     */
    @SerializedName("offset_column")
    public ColSpecifierV3 offsetColumn;

    /**
     * Column with cross-validation fold index assignment per observation.
     */
    @SerializedName("fold_column")
    public ColSpecifierV3 foldColumn;

    /**
     * Cross-validation fold assignment scheme, if fold_column is not specified. The 'Stratified' option will stratify
     * the folds based on the response variable, for classification problems.
     */
    @SerializedName("fold_assignment")
    public ModelParametersFoldAssignmentScheme foldAssignment;

    /**
     * Encoding scheme for categorical features
     */
    @SerializedName("categorical_encoding")
    public ModelParametersCategoricalEncodingScheme categoricalEncoding;

    /**
     * For every categorical feature, only use this many most frequent categorical levels for model training. Only used
     * for categorical_encoding == EnumLimited.
     */
    @SerializedName("max_categorical_levels")
    public int maxCategoricalLevels;

    /**
     * Names of columns to ignore for training.
     */
    @SerializedName("ignored_columns")
    public String[] ignoredColumns;

    /**
     * Ignore constant columns.
     */
    @SerializedName("ignore_const_cols")
    public boolean ignoreConstCols;

    /**
     * Whether to score during each iteration of model training.
     */
    @SerializedName("score_each_iteration")
    public boolean scoreEachIteration;

    /**
     * Model checkpoint to resume training with.
     */
    public ModelKeyV3 checkpoint;

    /**
     * Early stopping based on convergence of stopping_metric. Stop if simple moving average of length k of the
     * stopping_metric does not improve for k:=stopping_rounds scoring events (0 to disable)
     */
    @SerializedName("stopping_rounds")
    public int stoppingRounds;

    /**
     * Maximum allowed runtime in seconds for model training. Use 0 to disable.
     */
    @SerializedName("max_runtime_secs")
    public double maxRuntimeSecs;

    /**
     * Metric to use for early stopping (AUTO: logloss for classification, deviance for regression)
     */
    @SerializedName("stopping_metric")
    public ScoreKeeperStoppingMetric stoppingMetric;

    /**
     * Relative tolerance for metric-based stopping criterion (stop if relative improvement is not at least this much)
     */
    @SerializedName("stopping_tolerance")
    public double stoppingTolerance;

    /**
     * Reference to custom evaluation function, format: `language:keyName=funcName`
     */
    @SerializedName("custom_metric_func")
    public String customMetricFunc;

    /**
     * Public constructor
     */
    public ModelParametersSchemaV3() {
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
        return new Gson().toJson(this);
    }

}