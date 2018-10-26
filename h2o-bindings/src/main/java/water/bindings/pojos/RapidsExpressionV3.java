/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.pojos;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.*;


public class RapidsExpressionV3 extends SchemaV3 {

    /**
     * (Class) name of the language construct
     */
    public String name;

    /**
     * Code fragment pattern.
     */
    public String pattern;

    /**
     * Description of the functionality provided by this language construct.
     */
    public String description;

    /**
     * Public constructor
     */
    public RapidsExpressionV3() {
        name = "";
        pattern = "";
        description = "";
    }

    /**
     * Return the contents of this object as a JSON String.
     */
    @Override
    public String toString() {
        return new GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(this);
    }

}
