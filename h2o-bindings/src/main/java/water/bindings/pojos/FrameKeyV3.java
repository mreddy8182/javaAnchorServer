/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.pojos;

import com.google.gson.Gson;
import com.google.gson.annotations.*;


public class FrameKeyV3 extends KeyV3 {


    /*------------------------------------------------------------------------------------------------------------------
    //                                                  INHERITED
    //------------------------------------------------------------------------------------------------------------------

    // Name (string representation) for this Key.
    public String name;

    // Name (string representation) for the type of Keyed this Key points to.
    public String type;

    // URL for the resource that this Key points to, if one exists.
    public String url;

    */

    /**
     * Public constructor
     */
    public FrameKeyV3() {
        name = "";
        type = "";
        url = "";
    }

    /**
     * Return the contents of this object as a JSON String.
     */
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
