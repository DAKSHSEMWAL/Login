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

    @GET("status")
    Call<List<Profile>> getStatus(@Query("status") String status);
    @GET("data")
    Call<List<Profile>> getPhone(@Query("phone") String phone);
    @GET("data/{phone}/password")
    Call<List<Profile>> getPassword(@Path("password") String password);
    @GET("data/{phone}/name")
    Call<List<Profile>> getName(@Path("name") String name);
    @GET("data/{phone}/email")
    Call<List<Profile>> getEmail(@Path("email") String email);
    @GET("data/{phone}/dob")
    Call<List<Profile>> getDob(@Path("dob") String dob);
    @GET("data/{phone}/gender")
    Call<List<Profile>> getGender(@Path("gender") String gender);
    @GET("data/{phone}/loyality_points")
    Call<List<Profile>> getLoyality_points(@Path("loyality_points") String loyality_points);
    @GET("data/{phone}/photo")
    Call<List<Profile>> getPhoto(@Path("photo") String photo);
}

