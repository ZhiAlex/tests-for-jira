package com.zhialex.jira_tests.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Story;

import static com.codeborne.selenide.Selenide.$;

public class HeaderComponents {

    private SelenideElement createIssueButton = $("#create_link");

    @Story("Клик на кнопку Create")
    public void createIssue() {
        createIssueButton.click();
    }
}
