/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.pojos;

import com.google.gson.Gson;
import com.google.gson.annotations.*;


public class RapidsHelpV3 extends SchemaV3 {

    /**
     * Description of the rapids language.
     */
    public RapidsExpressionV3[] expressions;

    /**
     * Public constructor
     */
    public RapidsHelpV3() {
    }

    /**
     * Return the contents of this object as a JSON String.
     */
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
