package com.donggeon.honmaker.extension.Retrofit;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RetrofitAPI {
    @POST("/")
    Call<String> login(@Body String uid);
}