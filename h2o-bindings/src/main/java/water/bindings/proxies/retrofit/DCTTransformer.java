/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.proxies.retrofit;

import water.bindings.pojos.*;
import retrofit2.*;
import retrofit2.http.*;
import okhttp3.ResponseBody;

public interface DCTTransformer {

  /** 
   * Row-by-row discrete cosine transforms in 1D, 2D and 3D.
   *   @param dataset Dataset
   *   @param destination_frame Destination Frame ID
   *   @param dimensions Dimensions of the input array: Height, Width, Depth (Nx1x1 for 1D, NxMx1 for 2D)
   *   @param inverse Whether to do the inverse transform
   *   @param _exclude_fields Comma-separated list of JSON field paths to exclude from the result, used like:
   *                          "/3/Frames?_exclude_fields=frames/frame_id/URL,__meta"
   */
  @FormUrlEncoded
  @POST("/99/DCTTransformer")
  Call<JobV3> run(
    @Field("dataset") String dataset,
    @Field("destination_frame") String destination_frame,
    @Field("dimensions") int[] dimensions,
    @Field("inverse") boolean inverse,
    @Field("_exclude_fields") String _exclude_fields
  );

  @FormUrlEncoded
  @POST("/99/DCTTransformer")
  Call<JobV3> run(
    @Field("dataset") String dataset,
    @Field("dimensions") int[] dimensions
  );

}
