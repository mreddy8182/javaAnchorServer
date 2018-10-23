/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.pojos;

import com.google.gson.Gson;
import com.google.gson.annotations.*;


public class ModelInfoV4 extends OutputSchemaV4 {

    /**
     * Algorithm name, such as 'gbm', 'deeplearning', etc.
     */
    public String algo;

    /**
     * Development status of the algorithm: alpha, beta, or stable.
     */
    public String maturity;

    /**
     * Does the model support generation of POJOs?
     */
    @SerializedName("have_pojo")
    public boolean havePojo;

    /**
     * Does the model support generation of MOJOs?
     */
    @SerializedName("have_mojo")
    public boolean haveMojo;

    /**
     * Mojo version number for this algorithm.
     */
    @SerializedName("mojo_version")
    public String mojoVersion;


    /*------------------------------------------------------------------------------------------------------------------
    //                                                  INHERITED
    //------------------------------------------------------------------------------------------------------------------

    // Url describing the schema of the current object.
    public String __schema;

    */

    /**
     * Public constructor
     */
    public ModelInfoV4() {
        algo = "";
        maturity = "";
        havePojo = false;
        haveMojo = false;
        mojoVersion = "";
        __schema = "/4/schemas/ModelInfoV4";
    }

    /**
     * Return the contents of this object as a JSON String.
     */
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
