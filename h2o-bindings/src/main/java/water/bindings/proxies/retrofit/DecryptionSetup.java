/*
 * This file is auto-generated by h2o-3/h2o-bindings/bin/gen_java.py
 * Copyright 2016 H2O.ai;  Apache License Version 2.0 (see LICENSE for details)
 */
package water.bindings.proxies.retrofit;

import water.bindings.pojos.*;
import retrofit2.*;
import retrofit2.http.*;
import okhttp3.ResponseBody;

public interface DecryptionSetup {

  /** 
   * Install a decryption tool for parsing of encrypted data.
   *   @param decrypt_tool_id Target key for the Decryption Tool
   *   @param decrypt_impl Implementation of the Decryption Tool
   *   @param keystore_id Location of Java Keystore
   *   @param keystore_type Keystore type
   *   @param key_alias Key alias
   *   @param password Key password
   *   @param cipher_spec Specification of the cipher (and padding)
   *   @param _exclude_fields Comma-separated list of JSON field paths to exclude from the result, used like:
   *                          "/3/Frames?_exclude_fields=frames/frame_id/URL,__meta"
   */
  @FormUrlEncoded
  @POST("/3/DecryptionSetup")
  Call<DecryptionSetupV3> setupDecryption(
    @Field("decrypt_tool_id") String decrypt_tool_id,
    @Field("decrypt_impl") String decrypt_impl,
    @Field("keystore_id") String keystore_id,
    @Field("keystore_type") String keystore_type,
    @Field("key_alias") String key_alias,
    @Field("password") String password,
    @Field("cipher_spec") String cipher_spec,
    @Field("_exclude_fields") String _exclude_fields
  );

  @FormUrlEncoded
  @POST("/3/DecryptionSetup")
  Call<DecryptionSetupV3> setupDecryption();

}
