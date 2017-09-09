package com.parag.mvpdemo.login;

import com.parag.mvpdemo.LoginPresenter;
import com.parag.mvpdemo.LoginView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class LoginPresenterTest {
    @Mock
    private LoginView loginView;
    private LoginPresenter loginPresenter;

    @Before
    public void setUp() throws Exception {
        loginPresenter = new LoginPresenter(loginView);
    }

    @Test
    public void shouldShowErrorMessageWhenUsernameIsEmpty() throws Exception {

    }

}