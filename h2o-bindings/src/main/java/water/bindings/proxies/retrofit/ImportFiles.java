/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.proxies.retrofit;

import water.bindings.pojos.*;
import retrofit2.*;
import retrofit2.http.*;

public interface ImportFiles {

  /** 
   * Import raw data files into a single-column H2O Frame.
   *   @param path path
   *   @param pattern pattern
   *   @param _exclude_fields Comma-separated list of JSON field paths to exclude from the result, used like:
   *                          "/3/Frames?_exclude_fields=frames/frame_id/URL,__meta"
   */
  @FormUrlEncoded
  @POST("/3/ImportFiles")
  Call<ImportFilesV3> importFiles(
    @Field("path") String path,
    @Field("pattern") String pattern,
    @Field("_exclude_fields") String _exclude_fields
  );

  @FormUrlEncoded
  @POST("/3/ImportFiles")
  Call<ImportFilesV3> importFiles(@Field("path") String path);

}