package com.daksh.kuro.login;

public class ApiUtils {
    private ApiUtils() {}

    public static final String BASE_URL = "https://my-json-server.typicode.com/DAKSHSEMWAL/demo/";

    public static JsonPlaceHolderApi getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(JsonPlaceHolderApi.class);
    }
}
