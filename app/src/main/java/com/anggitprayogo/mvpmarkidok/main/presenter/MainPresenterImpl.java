package com.anggitprayogo.mvpmarkidok.main.presenter;

import android.util.Log;

import com.anggitprayogo.mvpmarkidok.main.view.MainView;
import com.anggitprayogo.mvpmarkidok.model.Response.CountryResponse;
import com.anggitprayogo.mvpmarkidok.network.NetworkClient;
import com.anggitprayogo.mvpmarkidok.network.ServiceGenerator;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Anggit on 10/01/2018.
 */

public class MainPresenterImpl implements MainPresenter{

    MainView mainView;

    public MainPresenterImpl(MainView mainView){
        this.mainView   =   mainView;
        getCountry();
    }


    @Override
    public void getCountry() {
        NetworkClient   networkClient   = ServiceGenerator.createService(NetworkClient.class);

        Call<CountryResponse> call  =   networkClient.getCountryAll();

        call.enqueue(new Callback<CountryResponse>() {
            @Override
            public void onResponse(Call<CountryResponse> call, Response<CountryResponse> response) {
                if (response.isSuccessful()){
                    Log.d("DEBUG 1", new GsonBuilder().setPrettyPrinting().create().toJson(response.body()));
                }else{
                    Log.d("DEBUG 2", "GAGAL");

                }
            }

            @Override
            public void onFailure(Call<CountryResponse> call, Throwable t) {
                Log.d("DEBUG 3", t.getMessage());
            }
        });
    }
}
