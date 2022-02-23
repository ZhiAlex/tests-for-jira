package com.zhialex.jira_tests.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HeaderComponents {

    SelenideElement createIssueButton = $("#create_link");

    public void createIssue() {
        createIssueButton.click();
    }
}
