/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.pojos;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.*;


public class PartialDependenceV3 extends SchemaV3 {

    /**
     * Model
     */
    @SerializedName("model_id")
    public ModelKeyV3 modelId;

    /**
     * Frame
     */
    @SerializedName("frame_id")
    public FrameKeyV3 frameId;

    /**
     * Column(s)
     */
    public String[] cols;

    /**
     * weight_column_index
     */
    @SerializedName("weight_column_index")
    public int weightColumnIndex;

    /**
     * add_missing_na
     */
    @SerializedName("add_missing_na")
    public boolean addMissingNa;

    /**
     * Number of bins
     */
    public int nbins;

    /**
     * User define split points
     */
    @SerializedName("user_splits")
    public double[] userSplits;

    /**
     * Column(s) of user defined splits
     */
    @SerializedName("user_cols")
    public String[] userCols;

    /**
     * Number of user defined splits per column
     */
    @SerializedName("num_user_splits")
    public int[] numUserSplits;

    /**
     * Partial Dependence Data
     */
    @SerializedName("partial_dependence_data")
    public TwoDimTableV3[] partialDependenceData;

    /**
     * Key to store the destination
     */
    @SerializedName("destination_key")
    public PartialDependenceKeyV3 destinationKey;

    /**
     * Public constructor
     */
    public PartialDependenceV3() {
        weightColumnIndex = 0;
        addMissingNa = false;
        nbins = 0;
    }

    /**
     * Return the contents of this object as a JSON String.
     */
    @Override
    public String toString() {
        return new GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(this);
    }

}
