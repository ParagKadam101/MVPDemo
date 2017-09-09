package com.parag.mvpdemo;


import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import butterknife.ButterKnife;

public class LoginPresenter {
    private LoginView loginView;

    public LoginPresenter(LoginView loginView) {
        this.loginView = loginView;
        ButterKnife.bind((MainActivity)loginView);
    }

    public void loginClick(View view) {
        InputMethodManager imm = (InputMethodManager)((MainActivity)loginView).getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);

        String username = ((MainActivity)loginView).editTextUsername.getText().toString().trim();
        String password = ((MainActivity)loginView).editTextPassword.getText().toString().trim();

        if(username.isEmpty()) {
            loginView.showUsernameError(R.string.username_error);
            return;
        }
        if(password.isEmpty()){
            loginView.showPasswordError(R.string.password_error);
            return;
        }
        if(UtilClass.login(username,password))
        {
            loginView.startMainActivity();
        }
        else
        {
            loginView.showLoginError(R.string.invalid_username_password);
        }
    }
}
