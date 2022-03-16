package com.zhialex.jira_tests;

import com.codeborne.selenide.Configuration;
import com.zhialex.jira_tests.helpers.Attach;
import com.zhialex.jira_tests.pages.AuthPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class BaseTest {

    public final AuthPage authPage = new AuthPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.holdBrowserOpen = false;
        Configuration.browserSize = "1920x1080";
    }

    @AfterEach
    void closeBrowser() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        closeWebDriver();
    }
}
