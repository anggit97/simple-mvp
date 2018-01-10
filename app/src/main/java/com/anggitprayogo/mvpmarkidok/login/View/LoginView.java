package com.anggitprayogo.mvpmarkidok.login.View;

/**
 * Created by Anggit on 09/01/2018.
 */

public interface LoginView {

    void showValidationError();

    void loginSucces();

    void loginError(String result);
}
