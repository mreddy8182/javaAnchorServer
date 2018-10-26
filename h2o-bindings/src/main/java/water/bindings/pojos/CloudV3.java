/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.pojos;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.*;


public class CloudV3 extends RequestSchemaV3 {

    /**
     * skip_ticks
     */
    @SerializedName("skip_ticks")
    public boolean skipTicks;

    /**
     * version
     */
    public String version;

    /**
     * branch_name
     */
    @SerializedName("branch_name")
    public String branchName;

    /**
     * build_number
     */
    @SerializedName("build_number")
    public String buildNumber;

    /**
     * build_age
     */
    @SerializedName("build_age")
    public String buildAge;

    /**
     * build_too_old
     */
    @SerializedName("build_too_old")
    public boolean buildTooOld;

    /**
     * Node index number cloud status is collected from (zero-based)
     */
    @SerializedName("node_idx")
    public int nodeIdx;

    /**
     * cloud_name
     */
    @SerializedName("cloud_name")
    public String cloudName;

    /**
     * cloud_size
     */
    @SerializedName("cloud_size")
    public int cloudSize;

    /**
     * cloud_uptime_millis
     */
    @SerializedName("cloud_uptime_millis")
    public long cloudUptimeMillis;

    /**
     * Cloud internal timezone
     */
    @SerializedName("cloud_internal_timezone")
    public String cloudInternalTimezone;

    /**
     * Timezone used for parsing datetime columns
     */
    @SerializedName("datafile_parser_timezone")
    public String datafileParserTimezone;

    /**
     * cloud_healthy
     */
    @SerializedName("cloud_healthy")
    public boolean cloudHealthy;

    /**
     * Nodes reporting unhealthy
     */
    @SerializedName("bad_nodes")
    public int badNodes;

    /**
     * Cloud voting is stable
     */
    public boolean consensus;

    /**
     * Cloud is accepting new members or not
     */
    public boolean locked;

    /**
     * Cloud is in client mode.
     */
    @SerializedName("is_client")
    public boolean isClient;

    /**
     * nodes
     */
    public NodeV3[] nodes;

    /**
     * internal_security_enabled
     */
    @SerializedName("internal_security_enabled")
    public boolean internalSecurityEnabled;


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
    public CloudV3() {
        skipTicks = false;
        version = "";
        branchName = "";
        buildNumber = "";
        buildAge = "";
        buildTooOld = false;
        nodeIdx = 0;
        cloudName = "";
        cloudSize = 0;
        cloudUptimeMillis = 0L;
        cloudInternalTimezone = "";
        datafileParserTimezone = "";
        cloudHealthy = false;
        badNodes = 0;
        consensus = false;
        locked = false;
        isClient = false;
        internalSecurityEnabled = false;
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
