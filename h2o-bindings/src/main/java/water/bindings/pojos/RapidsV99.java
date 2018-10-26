/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.pojos;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.*;


public class RapidsV99 extends RequestSchemaV3 {

    /**
     * An Abstract Syntax Tree.
     */
    public String ast;

    /**
     * Parsing error, if any
     */
    public String error;

    /**
     * Scalar result
     */
    public double scalar;

    /**
     * Function result
     */
    public String funstr;

    /**
     * String result
     */
    public String string;

    /**
     * Result key
     */
    public FrameKeyV3 key;

    /**
     * Rows in Frame result
     */
    @SerializedName("num_rows")
    public long numRows;

    /**
     * Columns in Frame result
     */
    @SerializedName("num_cols")
    public int numCols;


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
    public RapidsV99() {
        ast = "";
        error = "";
        scalar = 0.0;
        funstr = "";
        string = "";
        numRows = 0L;
        numCols = 0;
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
