package com.zhialex.jira_tests.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

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

    @Step("Выбор проекта")
    public CreateIssueComponents chooseProjectInput() {
        chooseProjectInput.setValue("Test (TEST)").pressEnter();
        return this;
    }

    @Step("Выбор типа создаваемого таска")
    public CreateIssueComponents chooseIssueTypeInput() {
        chooseIssueTypeInput.setValue("Ошибка").pressEnter();
        return this;
    }

    @Step("Ввод summary")
    public CreateIssueComponents setSummary(String summary) {
        summaryInput.setValue(summary);
        return this;
    }

    @Step("Переход на режим ввобда текста описания")
    public CreateIssueComponents clickSetDescriptionTextButton() {
        chooseSetDescriptionTextButton.click();
        return this;
    }

    @Step("Ввод description")
    public CreateIssueComponents setDescription(String description) {
        descriptionTextArea.setValue(description);
        return this;
    }

    @Step("Клик на кнопку создания таски")
    public void createIssue() {
        createIssueButton.click();
    }
}
