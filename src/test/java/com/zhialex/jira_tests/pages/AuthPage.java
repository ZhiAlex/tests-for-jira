package com.zhialex.jira_tests.pages;

import com.codeborne.selenide.SelenideElement;
import com.zhialex.jira_tests.config.AuthConfig;
import io.qameta.allure.Step;
import org.aeonbits.owner.ConfigFactory;

import static com.codeborne.selenide.Selenide.$x;

public class AuthPage {

    private SelenideElement
            loginInput = $x("//input[@id='login-form-username']"),
            passwordInput = $x("//input[@id='login-form-password']");

    @Step("Авторизация")
    public void login() {
        AuthConfig config = ConfigFactory.create(AuthConfig.class, System.getProperties());
        loginInput.setValue(config.username());
        passwordInput.setValue(config.password()).pressEnter();
    }
}
