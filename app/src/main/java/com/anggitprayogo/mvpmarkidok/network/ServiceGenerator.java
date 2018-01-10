package com.anggitprayogo.mvpmarkidok.network;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Anggit on 10/01/2018.
 */

public class ServiceGenerator {

    private static final String BASE_URL   =   "http://services.groupkt.com/";

    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    private static HttpLoggingInterceptor loggingInterceptor    =   new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);


    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit    =   builder.build();


    public static <C> C createService(Class<C> serviceClass){

        if (!httpClient.interceptors().contains(loggingInterceptor)){
            httpClient.addInterceptor(loggingInterceptor);

            builder.client(httpClient.build());
            retrofit    =   builder.build();
        }

        return retrofit.create(serviceClass);
    }
}
