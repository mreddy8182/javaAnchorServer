/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.proxies.retrofit;

import water.bindings.pojos.*;
import retrofit2.*;
import retrofit2.http.*;
import okhttp3.ResponseBody;

public interface DownloadDataset {

  /** 
   * Download dataset as a CSV.
   *   @param frame_id Frame to download
   *   @param hex_string Emit double values in a machine readable lossless format with Double.toHexString().
   *   @param _exclude_fields Comma-separated list of JSON field paths to exclude from the result, used like:
   *                          "/3/Frames?_exclude_fields=frames/frame_id/URL,__meta"
   */
  @GET("/3/DownloadDataset")
  Call<ResponseBody> fetch(
    @Query("frame_id") String frame_id,
    @Query("hex_string") boolean hex_string,
    @Query("_exclude_fields") String _exclude_fields
  );

  @GET("/3/DownloadDataset")
  Call<ResponseBody> fetch(@Query("frame_id") String frame_id);

  /** 
   * Download dataset as a CSV.
   *   @param frame_id Frame to download
   *   @param hex_string Emit double values in a machine readable lossless format with Double.toHexString().
   *   @param _exclude_fields Comma-separated list of JSON field paths to exclude from the result, used like:
   *                          "/3/Frames?_exclude_fields=frames/frame_id/URL,__meta"
   */
  @GET("/3/DownloadDataset.bin")
  Call<ResponseBody> fetchStreaming(
    @Query("frame_id") String frame_id,
    @Query("hex_string") boolean hex_string,
    @Query("_exclude_fields") String _exclude_fields
  );

  @GET("/3/DownloadDataset.bin")
  Call<ResponseBody> fetchStreaming(@Query("frame_id") String frame_id);

}
