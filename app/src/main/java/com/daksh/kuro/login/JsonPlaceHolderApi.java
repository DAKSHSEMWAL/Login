package com.daksh.kuro.login;



import java.util.List;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface JsonPlaceHolderApi {

    @GET("profile")
    Call<List<Profile>> getEmail(@Query("email") String email);
    @GET("profile")
    Call<List<Profile>> getPhone(@Query("phone") String phone);
    @GET("profile/{email}/password")
    Call<List<Profile>> getPassword(@Path("password") String password);
    @GET("profile/{email}/name")
    Call<List<Profile>> getName(@Path("name") String name);

}

