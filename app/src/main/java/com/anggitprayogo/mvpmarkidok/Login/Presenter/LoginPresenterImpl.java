package com.anggitprayogo.mvpmarkidok.Login.Presenter;

import com.anggitprayogo.mvpmarkidok.Login.View.LoginView;

/**
 * Created by Anggit on 09/01/2018.
 */

public class LoginPresenterImpl implements LoginPresenter{

    private LoginView loginView;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView  =   loginView;
    }

    @Override
    public void doLogin(String username, String password) {
        if (username.isEmpty() || password.isEmpty()){
            loginView.showValidationError();
        }else{
            if (username.equals("admin") && password.equals("admin")){
                loginView.loginSucces();
            }else{
                loginView.loginError();
            }
        }
    }
}
