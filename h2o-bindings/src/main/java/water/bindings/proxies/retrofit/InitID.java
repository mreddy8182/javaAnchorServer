/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.proxies.retrofit;

import water.bindings.pojos.*;
import retrofit2.*;
import retrofit2.http.*;

public interface InitID {

  /** 
   * Issue a new session ID.
   *   @param session_key Session ID
   *   @param _exclude_fields Comma-separated list of JSON field paths to exclude from the result, used like:
   *                          "/3/Frames?_exclude_fields=frames/frame_id/URL,__meta"
   */
  @GET("/3/InitID")
  Call<InitIDV3> startSession(
    @Field("session_key") String session_key,
    @Field("_exclude_fields") String _exclude_fields
  );

  @GET("/3/InitID")
  Call<InitIDV3> startSession();

  /** 
   * End a session.
   *   @param session_key Session ID
   *   @param _exclude_fields Comma-separated list of JSON field paths to exclude from the result, used like:
   *                          "/3/Frames?_exclude_fields=frames/frame_id/URL,__meta"
   */
  @DELETE("/3/InitID")
  Call<InitIDV3> endSession(
    @Field("session_key") String session_key,
    @Field("_exclude_fields") String _exclude_fields
  );

  @DELETE("/3/InitID")
  Call<InitIDV3> endSession();

}
