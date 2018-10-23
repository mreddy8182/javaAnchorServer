/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.pojos;

import com.google.gson.Gson;
import com.google.gson.annotations.*;


public class DownloadDataV3 extends RequestSchemaV3 {

    /**
     * Frame to download
     */
    @SerializedName("frame_id")
    public FrameKeyV3 frameId;

    /**
     * Emit double values in a machine readable lossless format with Double.toHexString().
     */
    @SerializedName("hex_string")
    public boolean hexString;

    /**
     * CSV Stream
     */
    public String csv;

    /**
     * Suggested Filename
     */
    public String filename;


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
    public DownloadDataV3() {
        hexString = false;
        csv = "";
        filename = "";
        _excludeFields = "";
    }

    /**
     * Return the contents of this object as a JSON String.
     */
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
