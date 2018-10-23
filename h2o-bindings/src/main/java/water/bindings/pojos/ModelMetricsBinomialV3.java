/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.pojos;

import com.google.gson.Gson;
import com.google.gson.annotations.*;


public class ModelMetricsBinomialV3 extends ModelMetricsBaseV3 {

    /**
     * The R^2 for this scoring run.
     */
    public double r2;

    /**
     * The logarithmic loss for this scoring run.
     */
    public double logloss;

    /**
     * The AUC for this scoring run.
     */
    @SerializedName("AUC")
    public double auc;

    /**
     * The precision-recall AUC for this scoring run.
     */
    @SerializedName("pr_auc")
    public double prAuc;

    /**
     * The Gini score for this scoring run.
     */
    @SerializedName("Gini")
    public double gini;

    /**
     * The mean misclassification error per class.
     */
    @SerializedName("mean_per_class_error")
    public double meanPerClassError;

    /**
     * The class labels of the response.
     */
    public String[] domain;

    /**
     * The ConfusionMatrix at the threshold for maximum F1.
     */
    public ConfusionMatrixV3 cm;

    /**
     * The Metrics for various thresholds.
     */
    @SerializedName("thresholds_and_metric_scores")
    public TwoDimTableV3 thresholdsAndMetricScores;

    /**
     * The Metrics for various criteria.
     */
    @SerializedName("max_criteria_and_metric_scores")
    public TwoDimTableV3 maxCriteriaAndMetricScores;

    /**
     * Gains and Lift table.
     */
    @SerializedName("gains_lift_table")
    public TwoDimTableV3 gainsLiftTable;


    /*------------------------------------------------------------------------------------------------------------------
    //                                                  INHERITED
    //------------------------------------------------------------------------------------------------------------------

    // The model used for this scoring run.
    public ModelKeyV3 model;

    // The checksum for the model used for this scoring run.
    public long modelChecksum;

    // The frame used for this scoring run.
    public FrameKeyV3 frame;

    // The checksum for the frame used for this scoring run.
    public long frameChecksum;

    // Optional description for this scoring run (to note out-of-bag, sampled data, etc.)
    public String description;

    // The category (e.g., Clustering) for the model used for this scoring run.
    public ModelCategory modelCategory;

    // The time in mS since the epoch for the start of this scoring run.
    public long scoringTime;

    // Predictions Frame.
    public FrameV3 predictions;

    // The Mean Squared Error of the prediction for this scoring run.
    public double mse;

    // The Root Mean Squared Error of the prediction for this scoring run.
    public double rmse;

    // Number of observations.
    public long nobs;

    // Name of custom metric
    public String customMetricName;

    // Value of custom metric
    public double customMetricValue;

    */

    /**
     * Public constructor
     */
    public ModelMetricsBinomialV3() {
        r2 = 0.0;
        logloss = 0.0;
        auc = 0.0;
        prAuc = 0.0;
        gini = 0.0;
        meanPerClassError = 0.0;
        modelChecksum = 0L;
        frameChecksum = 0L;
        description = "";
        scoringTime = 0L;
        mse = 0.0;
        rmse = 0.0;
        nobs = 0L;
        customMetricName = "";
        customMetricValue = 0.0;
    }

    /**
     * Return the contents of this object as a JSON String.
     */
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
