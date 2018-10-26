/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.pojos;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.*;


public class ModelsV3 extends RequestSchemaV3 {

    /**
     * Name of Model of interest
     */
    @SerializedName("model_id")
    public ModelKeyV3 modelId;

    /**
     * Return potentially abridged model suitable for viewing in a browser
     */
    public boolean preview;

    /**
     * Find and return compatible frames?
     */
    @SerializedName("find_compatible_frames")
    public boolean findCompatibleFrames;

    /**
     * Models
     */
    public ModelSchemaBaseV3[] models;

    /**
     * Compatible frames
     */
    @SerializedName("compatible_frames")
    public FrameV3[] compatibleFrames;


    /*------------------------------------------------------------------------------------------------------------------
    //                                                  INHERITED
    //------------------------------------------------------------------------------------------------------------------

    // Comma-separated list of JSON field paths to exclude from the result, used like:
    // "/3/Frames?_exclude_fields=frames/frame_id/URL,__meta"
    public String _excludeFields;

    */

    /**
     * Public constructor
     */
    public ModelsV3() {
        preview = false;
        findCompatibleFrames = false;
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
