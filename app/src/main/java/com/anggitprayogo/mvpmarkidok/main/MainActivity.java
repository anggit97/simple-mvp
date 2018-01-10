package com.anggitprayogo.mvpmarkidok.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.anggitprayogo.mvpmarkidok.R;
import com.anggitprayogo.mvpmarkidok.main.presenter.MainPresenter;
import com.anggitprayogo.mvpmarkidok.main.presenter.MainPresenterImpl;
import com.anggitprayogo.mvpmarkidok.main.view.MainView;

public class MainActivity extends AppCompatActivity implements MainView{

    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPresenter   = new MainPresenterImpl(this);
    }

    @Override
    public void onSuccess() {

    }

    @Override
    public void onFailure() {

    }

    @Override
    public void onShowProgress() {

    }

    @Override
    public void onHideProgress() {

    }
}
