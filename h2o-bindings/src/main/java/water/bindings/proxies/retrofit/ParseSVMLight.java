/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.proxies.retrofit;

import water.bindings.pojos.*;
import retrofit2.*;
import retrofit2.http.*;
import okhttp3.ResponseBody;

public interface ParseSVMLight {

  /** 
   * Parse a raw byte-oriented Frame into a useful columnar data Frame.
   *   @param destination_frame Final frame name
   *   @param source_frames Source frames
   *   @param _exclude_fields Comma-separated list of JSON field paths to exclude from the result, used like:
   *                          "/3/Frames?_exclude_fields=frames/frame_id/URL,__meta"
   */
  @FormUrlEncoded
  @POST("/3/ParseSVMLight")
  Call<JobV3> parseSVMLight(
    @Field("destination_frame") String destination_frame,
    @Field("source_frames") String[] source_frames,
    @Field("_exclude_fields") String _exclude_fields
  );

  @FormUrlEncoded
  @POST("/3/ParseSVMLight")
  Call<JobV3> parseSVMLight(@Field("source_frames") String[] source_frames);

}
