/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.pojos;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.*;


public class ColV3 extends SchemaV3 {

    /**
     * label
     */
    public String label;

    /**
     * missing
     */
    @SerializedName("missing_count")
    public long missingCount;

    /**
     * zeros
     */
    @SerializedName("zero_count")
    public long zeroCount;

    /**
     * positive infinities
     */
    @SerializedName("positive_infinity_count")
    public long positiveInfinityCount;

    /**
     * negative infinities
     */
    @SerializedName("negative_infinity_count")
    public long negativeInfinityCount;

    /**
     * mins
     */
    public double[] mins;

    /**
     * maxs
     */
    public double[] maxs;

    /**
     * mean
     */
    public double mean;

    /**
     * sigma
     */
    public double sigma;

    /**
     * datatype: {enum, string, int, real, time, uuid}
     */
    public String type;

    /**
     * domain; not-null for categorical columns only
     */
    public String[] domain;

    /**
     * cardinality of this column's domain; not-null for categorical columns only
     */
    @SerializedName("domain_cardinality")
    public int domainCardinality;

    /**
     * data
     */
    public double[] data;

    /**
     * string data
     */
    @SerializedName("string_data")
    public String[] stringData;

    /**
     * decimal precision, -1 for all digits
     */
    public byte precision;

    /**
     * Histogram bins; null if not computed
     */
    @SerializedName("histogram_bins")
    public long[] histogramBins;

    /**
     * Start of histogram bin zero
     */
    @SerializedName("histogram_base")
    public double histogramBase;

    /**
     * Stride per bin
     */
    @SerializedName("histogram_stride")
    public double histogramStride;

    /**
     * Percentile values, matching the default percentiles
     */
    public double[] percentiles;

    /**
     * Public constructor
     */
    public ColV3() {
        label = "";
        missingCount = 0L;
        zeroCount = 0L;
        positiveInfinityCount = 0L;
        negativeInfinityCount = 0L;
        mean = 0.0;
        sigma = 0.0;
        type = "";
        domainCardinality = 0;
        precision = 0;
        histogramBase = 0.0;
        histogramStride = 0.0;
    }

    /**
     * Return the contents of this object as a JSON String.
     */
    @Override
    public String toString() {
        return new GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(this);
    }

}
