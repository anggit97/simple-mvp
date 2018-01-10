package com.anggitprayogo.mvpmarkidok.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.anggitprayogo.mvpmarkidok.R;
import com.anggitprayogo.mvpmarkidok.login.Presenter.LoginPresenter;
import com.anggitprayogo.mvpmarkidok.login.Presenter.LoginPresenterImpl;
import com.anggitprayogo.mvpmarkidok.login.View.LoginView;
import com.anggitprayogo.mvpmarkidok.main.MainActivity;

public class LoginActivity extends AppCompatActivity implements LoginView{

    LoginPresenter loginPresenter;
    EditText etUsername, etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername  =   (EditText)findViewById(R.id.etUsername);
        etPassword  =   (EditText)findViewById(R.id.etPassword);
        btnLogin    =   (Button)findViewById(R.id.btnLogin);

        loginPresenter  =   new LoginPresenterImpl(this);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginPresenter.doLogin(etUsername.getText().toString(),etPassword.getText().toString());
            }
        });
    }

    @Override
    public void showValidationError() {
        Toast.makeText(LoginActivity.this, "Tidak boleh ada field yang kosong",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSucces() {
        Toast.makeText(LoginActivity.this, "Login Berhasil",Toast.LENGTH_SHORT).show();
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
        finish();
    }

    @Override
    public void loginError(String result) {
        Toast.makeText(LoginActivity.this, "Gagal cuy : "+result,Toast.LENGTH_SHORT).show();
    }
}
