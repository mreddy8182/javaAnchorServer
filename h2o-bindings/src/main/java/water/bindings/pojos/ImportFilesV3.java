/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.pojos;

import com.google.gson.Gson;
import com.google.gson.annotations.*;


public class ImportFilesV3 extends RequestSchemaV3 {

    /**
     * path
     */
    public String path;

    /**
     * pattern
     */
    public String pattern;

    /**
     * files
     */
    public String[] files;

    /**
     * names
     */
    @SerializedName("destination_frames")
    public String[] destinationFrames;

    /**
     * fails
     */
    public String[] fails;

    /**
     * dels
     */
    public String[] dels;


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
    public ImportFilesV3() {
        path = "";
        pattern = "";
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
