/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.proxies.retrofit;

import water.bindings.pojos.*;
import retrofit2.*;
import retrofit2.http.*;
import okhttp3.ResponseBody;

public interface DataInfoFrame {

  /** 
   * Test only
   *   @param frame input frame
   *   @param interactions interactions
   *   @param use_all use all factor levels
   *   @param standardize standardize
   *   @param interactions_only interactions only returned
   */
  @FormUrlEncoded
  @POST("/3/DataInfoFrame")
  Call<DataInfoFrameV3> getDataInfoFrame(
    @Field("frame") String frame,
    @Field("interactions") String[] interactions,
    @Field("use_all") boolean use_all,
    @Field("standardize") boolean standardize,
    @Field("interactions_only") boolean interactions_only
  );

  @FormUrlEncoded
  @POST("/3/DataInfoFrame")
  Call<DataInfoFrameV3> getDataInfoFrame();

}
