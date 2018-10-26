/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.proxies.retrofit;

import water.bindings.pojos.*;
import retrofit2.*;
import retrofit2.http.*;
import okhttp3.ResponseBody;

public interface SteamMetrics {

  /** 
   * Get metrics for Steam from H2O.
   *   @param _exclude_fields Comma-separated list of JSON field paths to exclude from the result, used like:
   *                          "/3/Frames?_exclude_fields=frames/frame_id/URL,__meta"
   */
  @GET("/3/SteamMetrics")
  Call<SteamMetricsV3> fetch(@Query("_exclude_fields") String _exclude_fields);

  @GET("/3/SteamMetrics")
  Call<SteamMetricsV3> fetch();

}
