package com.anggitprayogo.mvpmarkidok.login.Presenter;

import com.anggitprayogo.mvpmarkidok.login.LoginActivity;
import com.anggitprayogo.mvpmarkidok.login.View.LoginView;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Anggit on 10/01/2018.
 */
public class LoginPresenterTest {

    LoginActivity loginActivity;

    @Test
    public void doLogin() throws Exception {
        LoginPresenter  loginPresenter  = new LoginPresenterImpl(loginActivity);
//        Assert.assertEquals(loginPresenter.doLogin("admin","admin"),"berhasil","gagal");
    }

}