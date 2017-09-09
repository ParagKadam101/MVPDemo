package com.parag.mvpdemo;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements LoginView{

    @BindView(R.id.edt_username) EditText editTextUsername;
    @BindView(R.id.edt_password) EditText editTextPassword;

    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        presenter = new LoginPresenter(this);
    }

    @OnClick(R.id.btn_login)
    public void loginClick(View view) {
        presenter.loginClick(view);
    }

    @Override
    public String getUsername() {
        return editTextUsername.getText().toString().trim();
    }

    @Override
    public void showUsernameError(int resId) {
        editTextUsername.setError(getString(resId));
    }

    @Override
    public String getPassword() {
        return editTextPassword.getText().toString().trim();
    }

    @Override
    public void showPasswordError(int resId) {
        editTextPassword.setError(getString(resId));
    }

    @Override
    public void startMainActivity() {
        new ActivityUtil(this).startMainActivity();
    }

    @Override
    public void showLoginError(int resId) {
        Snackbar.make(findViewById(R.id.relativelayout),getString(R.string.invalid_username_password),Snackbar.LENGTH_LONG).show();
    }
}
