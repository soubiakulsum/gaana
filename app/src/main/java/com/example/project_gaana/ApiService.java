package com.example.project_gaana;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface ApiService {
    @GET("/search")
    Call<Responses> getUser(@Query("term") String str);

}
