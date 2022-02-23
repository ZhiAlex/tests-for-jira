package com.zhialex.jira_tests.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CreateIssueComponents {

    private SelenideElement
            chooseProjectInput = $("#project-field"),
            chooseIssueTypeInput = $("#issuetype-field"),
            summaryInput = $("#summary"),
            createIssueButton = $("#create-issue-submit"),
            chooseSetDescriptionTextButton = $x("(//ul[@class='tabs-menu']//a)[2]"),
            descriptionTextArea = $("#description");

    public CreateIssueComponents chooseProjectInput() {
        chooseProjectInput.setValue("Test (TEST)").pressEnter();
        return this;
    }

    public CreateIssueComponents chooseIssueTypeInput() {
        chooseIssueTypeInput.setValue("Ошибка").pressEnter();
        return this;
    }

    public CreateIssueComponents setSummary(String summary) {
        summaryInput.setValue(summary);
        return this;
    }

    public CreateIssueComponents clickSetDescriptionTextButton() {
        chooseSetDescriptionTextButton.click();
        return this;
    }

    public CreateIssueComponents setDescription(String description) {
        descriptionTextArea.setValue(description);
        return this;
    }

    public void createIssue() {
        createIssueButton.click();
    }
}
