/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.pojos;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.*;


public class EventV3 extends SchemaV3 {

    /**
     * Time when the event was recorded. Format is hh:mm:ss:ms
     */
    public String date;

    /**
     * Time in nanos
     */
    public long nanos;

    /**
     * type of recorded event
     */
    public TimelineEventEventTypeV3 type;

    /**
     * Public constructor
     */
    public EventV3() {
        date = "";
        nanos = -1L;
        type = TimelineEventEventTypeV3.unknown;
    }

    /**
     * Return the contents of this object as a JSON String.
     */
    @Override
    public String toString() {
        return new GsonBuilder().serializeSpecialFloatingPointValues().create().toJson(this);
    }

}
