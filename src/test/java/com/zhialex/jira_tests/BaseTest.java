package com.zhialex.jira_tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.zhialex.jira_tests.pages.AuthPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    public final AuthPage authPage = new AuthPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = false;
        Configuration.browserSize = "1920x1080";
    }

    @AfterEach
    void closeBrowser() {
        Selenide.closeWebDriver();
    }
}
