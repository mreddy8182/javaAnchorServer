/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.proxies.retrofit;

import water.bindings.pojos.*;
import retrofit2.*;
import retrofit2.http.*;

public interface NodePersistentStorage {

  /** 
   * Return true or false.
   *   @param category Category name
   *   @param name Key name
   *   @param value Value
   *   @param _exclude_fields Comma-separated list of JSON field paths to exclude from the result, used like:
   *                          "/3/Frames?_exclude_fields=frames/frame_id/URL,__meta"
   */
  @GET("/3/NodePersistentStorage/categories/{category}/names/{name}/exists")
  Call<NodePersistentStorageV3> exists(
    @Path("category") String category,
    @Path("name") String name,
    @Field("value") String value,
    @Field("_exclude_fields") String _exclude_fields
  );

  @GET("/3/NodePersistentStorage/categories/{category}/names/{name}/exists")
  Call<NodePersistentStorageV3> exists(
    @Path("category") String category,
    @Path("name") String name
  );

  /** 
   * Return true or false.
   *   @param category Category name
   *   @param name Key name
   *   @param value Value
   *   @param _exclude_fields Comma-separated list of JSON field paths to exclude from the result, used like:
   *                          "/3/Frames?_exclude_fields=frames/frame_id/URL,__meta"
   */
  @GET("/3/NodePersistentStorage/configured")
  Call<NodePersistentStorageV3> configured(
    @Field("category") String category,
    @Field("name") String name,
    @Field("value") String value,
    @Field("_exclude_fields") String _exclude_fields
  );

  @GET("/3/NodePersistentStorage/configured")
  Call<NodePersistentStorageV3> configured();

  /** 
   * Store a named value.
   *   @param category Category name
   *   @param name Key name
   *   @param value Value
   *   @param _exclude_fields Comma-separated list of JSON field paths to exclude from the result, used like:
   *                          "/3/Frames?_exclude_fields=frames/frame_id/URL,__meta"
   */
  @FormUrlEncoded
  @POST("/3/NodePersistentStorage/{category}/{name}")
  Call<NodePersistentStorageV3> put_with_name(
    @Path("category") String category,
    @Path("name") String name,
    @Field("value") String value,
    @Field("_exclude_fields") String _exclude_fields
  );

  @FormUrlEncoded
  @POST("/3/NodePersistentStorage/{category}/{name}")
  Call<NodePersistentStorageV3> put_with_name(
    @Path("category") String category,
    @Path("name") String name
  );

  /** 
   * Return value for a given name.
   *   @param category Category name
   *   @param name Key name
   *   @param value Value
   *   @param _exclude_fields Comma-separated list of JSON field paths to exclude from the result, used like:
   *                          "/3/Frames?_exclude_fields=frames/frame_id/URL,__meta"
   */
  @GET("/3/NodePersistentStorage/{category}/{name}")
  Call<NodePersistentStorageV3> get_as_string(
    @Path("category") String category,
    @Path("name") String name,
    @Field("value") String value,
    @Field("_exclude_fields") String _exclude_fields
  );

  @GET("/3/NodePersistentStorage/{category}/{name}")
  Call<NodePersistentStorageV3> get_as_string(
    @Path("category") String category,
    @Path("name") String name
  );

  /** 
   * Delete a key.
   *   @param category Category name
   *   @param name Key name
   *   @param value Value
   *   @param _exclude_fields Comma-separated list of JSON field paths to exclude from the result, used like:
   *                          "/3/Frames?_exclude_fields=frames/frame_id/URL,__meta"
   */
  @DELETE("/3/NodePersistentStorage/{category}/{name}")
  Call<NodePersistentStorageV3> delete(
    @Path("category") String category,
    @Path("name") String name,
    @Field("value") String value,
    @Field("_exclude_fields") String _exclude_fields
  );

  @DELETE("/3/NodePersistentStorage/{category}/{name}")
  Call<NodePersistentStorageV3> delete(
    @Path("category") String category,
    @Path("name") String name
  );

  /** 
   * Store a value.
   *   @param category Category name
   *   @param name Key name
   *   @param value Value
   *   @param _exclude_fields Comma-separated list of JSON field paths to exclude from the result, used like:
   *                          "/3/Frames?_exclude_fields=frames/frame_id/URL,__meta"
   */
  @FormUrlEncoded
  @POST("/3/NodePersistentStorage/{category}")
  Call<NodePersistentStorageV3> put(
    @Path("category") String category,
    @Field("name") String name,
    @Field("value") String value,
    @Field("_exclude_fields") String _exclude_fields
  );

  @FormUrlEncoded
  @POST("/3/NodePersistentStorage/{category}")
  Call<NodePersistentStorageV3> put(@Path("category") String category);

  /** 
   * Return all keys stored for a given category.
   *   @param category Category name
   *   @param name Key name
   *   @param value Value
   *   @param _exclude_fields Comma-separated list of JSON field paths to exclude from the result, used like:
   *                          "/3/Frames?_exclude_fields=frames/frame_id/URL,__meta"
   */
  @GET("/3/NodePersistentStorage/{category}")
  Call<NodePersistentStorageV3> list(
    @Path("category") String category,
    @Field("name") String name,
    @Field("value") String value,
    @Field("_exclude_fields") String _exclude_fields
  );

  @GET("/3/NodePersistentStorage/{category}")
  Call<NodePersistentStorageV3> list(@Path("category") String category);

}
