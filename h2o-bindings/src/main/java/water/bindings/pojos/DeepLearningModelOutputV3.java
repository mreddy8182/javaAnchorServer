/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.pojos;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.*;


public class DeepLearningModelOutputV3 extends ModelOutputSchemaV3 {

    /**
     * Frame keys for weight matrices
     */
    public FrameKeyV3[] weights;

    /**
     * Frame keys for bias vectors
     */
    public FrameKeyV3[] biases;

    /**
     * Normalization/Standardization multipliers for numeric predictors
     */
    public double[] normmul;

    /**
     * Normalization/Standardization offsets for numeric predictors
     */
    public double[] normsub;

    /**
     * Normalization/Standardization multipliers for numeric response
     */
    public double[] normrespmul;

    /**
     * Normalization/Standardization offsets for numeric response
     */
    public double[] normrespsub;

    /**
     * Categorical offsets for one-hot encoding
     */
    public int[] catoffsets;

    /**
     * Variable Importances
     */
    @SerializedName("variable_importances")
    public TwoDimTableV3 variableImportances;


    /*------------------------------------------------------------------------------------------------------------------
    //                                                  INHERITED
    //------------------------------------------------------------------------------------------------------------------

    // Column names
    public String[] names;

    // Domains for categorical columns
    public String[][] domains;

    // Cross-validation models (model ids)
    public ModelKeyV3[] crossValidationModels;

    // Cross-validation predictions, one per cv model (deprecated, use cross_validation_holdout_predictions_frame_id
    // instead)
    public FrameKeyV3[] crossValidationPredictions;

    // Cross-validation holdout predictions (full out-of-sample predictions on training data)
    public FrameKeyV3 crossValidationHoldoutPredictionsFrameId;

    // Cross-validation fold assignment (each row is assigned to one holdout fold)
    public FrameKeyV3 crossValidationFoldAssignmentFrameId;

    // Category of the model (e.g., Binomial)
    public ModelCategory modelCategory;

    // Model summary
    public TwoDimTableV3 modelSummary;

    // Scoring history
    public TwoDimTableV3 scoringHistory;

    // Training data model metrics
    public ModelMetricsBaseV3 trainingMetrics;

    // Validation data model metrics
    public ModelMetricsBaseV3 validationMetrics;

    // Cross-validation model metrics
    public ModelMetricsBaseV3 crossValidationMetrics;

    // Cross-validation model metrics summary
    public TwoDimTableV3 crossValidationMetricsSummary;

    // Job status
    public String status;

    // Start time in milliseconds
    public long startTime;

    // End time in milliseconds
    public long endTime;

    // Runtime in milliseconds
    public long runTime;

    // Help information for output fields
    public Map<String,String> help;

    */

    /**
     * Public constructor
     */
    public DeepLearningModelOutputV3() {
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
