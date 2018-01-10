package com.anggitprayogo.mvpmarkidok.network;

import com.anggitprayogo.mvpmarkidok.model.Response.CountryResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Anggit on 10/01/2018.
 */

public interface NetworkClient {
    @GET("country/get/all")
    Call<CountryResponse> getCountryAll();
}
