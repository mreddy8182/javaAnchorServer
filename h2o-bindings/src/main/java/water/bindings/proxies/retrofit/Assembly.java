/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.proxies.retrofit;

import water.bindings.pojos.*;
import retrofit2.*;
import retrofit2.http.*;

public interface Assembly {

  /** 
   * Generate a Java POJO from the Assembly
   *   @param assembly_id The key of the Assembly object to retrieve from the DKV.
   *   @param pojo_name The name of the file and generated class
   *   @param steps A list of steps describing the assembly line.
   *   @param frame Input Frame for the assembly.
   *   @param _exclude_fields Comma-separated list of JSON field paths to exclude from the result, used like:
   *                          "/3/Frames?_exclude_fields=frames/frame_id/URL,__meta"
   */
  @GET("/99/Assembly.java/{assembly_id}/{pojo_name}")
  Call<AssemblyV99> toJava(
    @Path("assembly_id") String assembly_id,
    @Path("pojo_name") String pojo_name,
    @Field("steps") String[] steps,
    @Field("frame") String frame,
    @Field("_exclude_fields") String _exclude_fields
  );

  @GET("/99/Assembly.java/{assembly_id}/{pojo_name}")
  Call<AssemblyV99> toJava(
    @Path("assembly_id") String assembly_id,
    @Path("pojo_name") String pojo_name
  );

  /** 
   * Fit an assembly to an input frame
   *   @param steps A list of steps describing the assembly line.
   *   @param frame Input Frame for the assembly.
   *   @param pojo_name The name of the file and generated class
   *   @param assembly_id The key of the Assembly object to retrieve from the DKV.
   *   @param _exclude_fields Comma-separated list of JSON field paths to exclude from the result, used like:
   *                          "/3/Frames?_exclude_fields=frames/frame_id/URL,__meta"
   */
  @FormUrlEncoded
  @POST("/99/Assembly")
  Call<AssemblyV99> fit(
    @Field("steps") String[] steps,
    @Field("frame") String frame,
    @Field("pojo_name") String pojo_name,
    @Field("assembly_id") String assembly_id,
    @Field("_exclude_fields") String _exclude_fields
  );

  @FormUrlEncoded
  @POST("/99/Assembly")
  Call<AssemblyV99> fit();

}
