/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.pojos;

import com.google.gson.Gson;
import com.google.gson.annotations.*;


public class JobV4 extends OutputSchemaV4 {

    /**
     * Job id
     */
    @SerializedName("job_id")
    public String jobId;

    /**
     * Job status
     */
    public JobStatusV4 status;

    /**
     * Current progress, a number going from 0 to 1
     */
    public float progress;

    /**
     * Current progress status description
     */
    @SerializedName("progress_msg")
    public String progressMsg;

    /**
     * Start time
     */
    @SerializedName("start_time")
    public long startTime;

    /**
     * Runtime in milliseconds
     */
    public long duration;

    /**
     * Id of the target object (being created by this Job)
     */
    @SerializedName("target_id")
    public String targetId;

    /**
     * Type of the target: Frame, Model, etc.
     */
    @SerializedName("target_type")
    public String targetType;

    /**
     * Exception message, if an exception occurred
     */
    public String exception;

    /**
     * Stacktrace
     */
    public String stacktrace;


    /*------------------------------------------------------------------------------------------------------------------
    //                                                  INHERITED
    //------------------------------------------------------------------------------------------------------------------

    // Url describing the schema of the current object.
    public String __schema;

    */

    /**
     * Public constructor
     */
    public JobV4() {
        jobId = "";
        progress = 0.0f;
        progressMsg = "";
        startTime = 0L;
        duration = 0L;
        targetId = "";
        targetType = "";
        exception = "";
        stacktrace = "";
        __schema = "/4/schemas/JobV4";
    }

    /**
     * Return the contents of this object as a JSON String.
     */
    @Override
    public String toString() {
        return new Gson().toJson(this);
    }

}