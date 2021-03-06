/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.pojos;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.*;


public class ImportSQLTableV99 extends RequestSchemaV3 {

    /**
     * connection_url
     */
    @SerializedName("connection_url")
    public String connectionUrl;

    /**
     * table
     */
    public String table;

    /**
     * select_query
     */
    @SerializedName("select_query")
    public String selectQuery;

    /**
     * username
     */
    public String username;

    /**
     * password
     */
    public String password;

    /**
     * columns
     */
    public String columns;

    /**
     * optimize
     */
    public boolean optimize;


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
    public ImportSQLTableV99() {
        connectionUrl = "";
        table = "";
        selectQuery = "";
        username = "";
        password = "";
        columns = "*";
        optimize = true;
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
