/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.pojos;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.*;
import java.util.Map;


public class ModelOutputSchemaV3 extends SchemaV3 {

    /**
     * Column names
     */
    public String[] names;

    /**
     * Domains for categorical columns
     */
    public String[][] domains;

    /**
     * Cross-validation models (model ids)
     */
    @SerializedName("cross_validation_models")
    public ModelKeyV3[] crossValidationModels;

    /**
     * Cross-validation predictions, one per cv model (deprecated, use cross_validation_holdout_predictions_frame_id
     * instead)
     */
    @SerializedName("cross_validation_predictions")
    public FrameKeyV3[] crossValidationPredictions;

    /**
     * Cross-validation holdout predictions (full out-of-sample predictions on training data)
     */
    @SerializedName("cross_validation_holdout_predictions_frame_id")
    public FrameKeyV3 crossValidationHoldoutPredictionsFrameId;

    /**
     * Cross-validation fold assignment (each row is assigned to one holdout fold)
     */
    @SerializedName("cross_validation_fold_assignment_frame_id")
    public FrameKeyV3 crossValidationFoldAssignmentFrameId;

    /**
     * Category of the model (e.g., Binomial)
     */
    @SerializedName("model_category")
    public ModelCategory modelCategory;

    /**
     * Model summary
     */
    @SerializedName("model_summary")
    public TwoDimTableV3 modelSummary;

    /**
     * Scoring history
     */
    @SerializedName("scoring_history")
    public TwoDimTableV3 scoringHistory;

    /**
     * Training data model metrics
     */
    @SerializedName("training_metrics")
    public ModelMetricsBaseV3 trainingMetrics;

    /**
     * Validation data model metrics
     */
    @SerializedName("validation_metrics")
    public ModelMetricsBaseV3 validationMetrics;

    /**
     * Cross-validation model metrics
     */
    @SerializedName("cross_validation_metrics")
    public ModelMetricsBaseV3 crossValidationMetrics;

    /**
     * Cross-validation model metrics summary
     */
    @SerializedName("cross_validation_metrics_summary")
    public TwoDimTableV3 crossValidationMetricsSummary;

    /**
     * Job status
     */
    public String status;

    /**
     * Start time in milliseconds
     */
    @SerializedName("start_time")
    public long startTime;

    /**
     * End time in milliseconds
     */
    @SerializedName("end_time")
    public long endTime;

    /**
     * Runtime in milliseconds
     */
    @SerializedName("run_time")
    public long runTime;

    /**
     * Help information for output fields
     */
    public Map<String,String> help;

    /**
     * Public constructor
     */
    public ModelOutputSchemaV3() {
        status = "";
        startTime = 0L;
        endTime = 0L;
        runTime = 0L;
    }

    /**
     * Return the contents of this object as a JSON String.
     */
    @Override
    public String toString() {
        return new GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(this);
    }

}
