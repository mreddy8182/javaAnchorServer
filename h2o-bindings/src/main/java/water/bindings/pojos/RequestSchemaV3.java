/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.pojos;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.*;


public class RequestSchemaV3 extends SchemaV3 {

    /**
     * Comma-separated list of JSON field paths to exclude from the result, used like:
     * "/3/Frames?_exclude_fields=frames/frame_id/URL,__meta"
     */
    @SerializedName("_exclude_fields")
    public String _excludeFields;

    /**
     * Public constructor
     */
    public RequestSchemaV3() {
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
