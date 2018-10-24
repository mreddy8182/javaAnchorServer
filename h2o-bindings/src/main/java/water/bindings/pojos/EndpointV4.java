/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.pojos;

import com.google.gson.Gson;
import com.google.gson.annotations.*;


public class EndpointV4 extends OutputSchemaV4 {

    /**
     * Method+Url of the request; variable parts are enclosed in curly braces. For example: /4/schemas/{schema_name}
     */
    public String url;

    /**
     * Short description of the functionality provided by the endpoint.
     */
    public String description;

    /**
     * Unique name of the endpoint. These names can be used to look up the endpoint's info via GET /4/endpoints/{name}.
     */
    public String name;

    /**
     * Input schema.
     */
    @SerializedName("input_schema")
    public String inputSchema;

    /**
     * Schema for the result returned by the endpoint.
     */
    @SerializedName("output_schema")
    public String outputSchema;


    /*------------------------------------------------------------------------------------------------------------------
    //                                                  INHERITED
    //------------------------------------------------------------------------------------------------------------------

    // Url describing the schema of the current object.
    public String __schema;

    */

    /**
     * Public constructor
     */
    public EndpointV4() {
        url = "null null";
        description = "";
        name = "";
        inputSchema = "";
        outputSchema = "";
        __schema = "/4/schemas/EndpointV4";
    }

    /**
     * Return the contents of this object as a JSON String.
     */
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}