/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.pojos;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.*;


public class GBMV3 extends SharedTreeV3<GBMParametersV3> {


    /*------------------------------------------------------------------------------------------------------------------
    //                                                  INHERITED
    //------------------------------------------------------------------------------------------------------------------

    // Model builder parameters.
    public GBMParametersV3 parameters;

    // The algo name for this ModelBuilder.
    public String algo;

    // The pretty algo name for this ModelBuilder (e.g., Generalized Linear Model, rather than GLM).
    public String algoFullName;

    // Model categories this ModelBuilder can build.
    public ModelCategory[] canBuild;

    // Indicator whether the model is supervised or not.
    public boolean supervised;

    // Should the builder always be visible, be marked as beta, or only visible if the user starts up with the
    // experimental flag?
    public ModelBuilderBuilderVisibility visibility;

    // Job Key
    public JobV3 job;

    // Parameter validation messages
    public ValidationMessageV3[] messages;

    // Count of parameter validation errors
    public int errorCount;

    // HTTP status to return for this build.
    public int __httpStatus;

    // Comma-separated list of JSON field paths to exclude from the result, used like:
    // "/3/Frames?_exclude_fields=frames/frame_id/URL,__meta"
    public String _excludeFields;

    */

    /**
     * Public constructor
     */
    public GBMV3() {
        algo = "";
        algoFullName = "";
        supervised = false;
        errorCount = 0;
        __httpStatus = 0;
        _excludeFields = "";
    }

    /**
     * Return the contents of this object as a JSON String.
     */
    @Override
    public String toString() {
        return new GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(this);
    }

}
