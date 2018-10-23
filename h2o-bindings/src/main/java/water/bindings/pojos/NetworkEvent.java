/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.pojos;

import com.google.gson.Gson;
import com.google.gson.annotations.*;


public class NetworkEvent extends EventV3 {

    /**
     * Boolean flag distinguishing between sends (true) and receives(false)
     */
    @SerializedName("is_send")
    public boolean isSend;

    /**
     * network protocol (UDP/TCP)
     */
    public String protocol;

    /**
     * UDP type (exec,ack, ackack,...
     */
    @SerializedName("msg_type")
    public String msgType;

    /**
     * Sending node
     */
    public String from;

    /**
     * Receiving node
     */
    public String to;

    /**
     * Pretty print of the first few bytes of the msg payload. Contains class name for tasks.
     */
    public String data;


    /*------------------------------------------------------------------------------------------------------------------
    //                                                  INHERITED
    //------------------------------------------------------------------------------------------------------------------

    // Time when the event was recorded. Format is hh:mm:ss:ms
    public String date;

    // Time in nanos
    public long nanos;

    // type of recorded event
    public TimelineEventEventTypeV3 type;

    */

    /**
     * Public constructor
     */
    public NetworkEvent() {
        isSend = false;
        protocol = "unknown";
        msgType = "unknown";
        from = "unknown";
        to = "unknown";
        data = "unknown";
        date = "";
        nanos = -1L;
        type = TimelineEventEventTypeV3.unknown;
    }

    /**
     * Return the contents of this object as a JSON String.
     */
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}
