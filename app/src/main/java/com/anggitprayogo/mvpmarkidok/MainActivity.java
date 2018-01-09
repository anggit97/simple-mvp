package com.anggitprayogo.mvpmarkidok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.anggitprayogo.mvpmarkidok.Login.Presenter.LoginPresenter;
import com.anggitprayogo.mvpmarkidok.Login.Presenter.LoginPresenterImpl;
import com.anggitprayogo.mvpmarkidok.Login.View.LoginView;

public class MainActivity extends AppCompatActivity implements LoginView{

    LoginPresenter loginPresenter;
    EditText etUsername, etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        Toast.makeText(MainActivity.this, "Tidak boleh ada field yang kosong",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSucces() {
        Toast.makeText(MainActivity.this, "Login Berhasil",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginError() {
        Toast.makeText(MainActivity.this, "Login Gagal",Toast.LENGTH_SHORT).show();
    }
}
