/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.pojos;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.*;


public class InputSchemaV4 {

    /**
     * Filter on the set of output fields: if you set _fields="foo,bar,baz", then only those fields will be included in
     * the output; or you can specify _fields="-goo,gee" to include all fields except goo and gee. If the result
     * contains nested data structures, then you can refer to the fields within those structures as well. For example if
     * you specify _fields="foo(oof),bar(-rab)", then only fields foo and bar will be included, and within foo there
     * will be only field oof, whereas within bar all fields except rab will be reported.
     */
    public String _fields;

    /**
     * Public constructor
     */
    public InputSchemaV4() {
        _fields = "";
    }

    /**
     * Return the contents of this object as a JSON String.
     */
    @Override
    public String toString() {
        return new GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(this);
    }

}
