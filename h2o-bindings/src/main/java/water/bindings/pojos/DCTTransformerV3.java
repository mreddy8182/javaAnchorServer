/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.pojos;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.*;


public class DCTTransformerV3 extends RequestSchemaV3 {

    /**
     * Dataset
     */
    public FrameKeyV3 dataset;

    /**
     * Destination Frame ID
     */
    @SerializedName("destination_frame")
    public FrameKeyV3 destinationFrame;

    /**
     * Dimensions of the input array: Height, Width, Depth (Nx1x1 for 1D, NxMx1 for 2D)
     */
    public int[] dimensions;

    /**
     * Whether to do the inverse transform
     */
    public boolean inverse;


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
    public DCTTransformerV3() {
        inverse = false;
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
