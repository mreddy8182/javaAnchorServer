/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.pojos;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.*;


public class MetadataV3 extends RequestSchemaV3 {

    /**
     * Number for specifying an endpoint
     */
    public int num;

    /**
     * HTTP method (GET, POST, DELETE) if fetching by path
     */
    @SerializedName("http_method")
    public String httpMethod;

    /**
     * Path for specifying an endpoint
     */
    public String path;

    /**
     * Class name, for fetching docs for a schema (DEPRECATED)
     */
    public String classname;

    /**
     * Schema name (e.g., DocsV1), for fetching docs for a schema
     */
    public String schemaname;

    /**
     * List of endpoint routes
     */
    public RouteV3[] routes;

    /**
     * List of schemas
     */
    public SchemaMetadataV3[] schemas;

    /**
     * Table of Contents Markdown
     */
    public String markdown;


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
    public MetadataV3() {
        num = 0;
        httpMethod = "";
        path = "";
        classname = "";
        schemaname = "";
        markdown = "";
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
