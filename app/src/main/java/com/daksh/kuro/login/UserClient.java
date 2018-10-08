package com.daksh.kuro.login;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface UserClient {

    @POST("profile")
    Call<Post> createAccount(@Body Post post);
}
