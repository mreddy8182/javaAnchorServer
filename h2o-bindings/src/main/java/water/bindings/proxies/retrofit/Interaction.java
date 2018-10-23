/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.proxies.retrofit;

import water.bindings.pojos.*;
import retrofit2.*;
import retrofit2.http.*;

public interface Interaction {

  /** 
   * Create interactions between categorical columns.
   *   @param dest destination key
   *   @param source_frame Input data frame
   *   @param factor_columns Factor columns
   *   @param pairwise Whether to create pairwise quadratic interactions between factors (otherwise create one higher-
   *                   order interaction). Only applicable if there are 3 or more factors.
   *   @param max_factors Max. number of factor levels in pair-wise interaction terms (if enforced, one extra catch-all
   *                      factor will be made)
   *   @param min_occurrence Min. occurrence threshold for factor levels in pair-wise interaction terms
   *   @param _exclude_fields Comma-separated list of JSON field paths to exclude from the result, used like:
   *                          "/3/Frames?_exclude_fields=frames/frame_id/URL,__meta"
   */
  @FormUrlEncoded
  @POST("/3/Interaction")
  Call<JobV3> run(
    @Field("dest") String dest,
    @Field("source_frame") String source_frame,
    @Field("factor_columns") String[] factor_columns,
    @Field("pairwise") boolean pairwise,
    @Field("max_factors") int max_factors,
    @Field("min_occurrence") int min_occurrence,
    @Field("_exclude_fields") String _exclude_fields
  );

  @FormUrlEncoded
  @POST("/3/Interaction")
  Call<JobV3> run(@Field("max_factors") int max_factors);

}
