package com.zhialex.jira_tests.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class TaskPage {

    private SelenideElement
            workflowButton = $("#opsbar-transitions_more"),
            status = $("#status-val");

    @Step("Открытие workflow")
    public TaskPage clickWorkflow() {
        workflowButton.click();
        return this;
    }

    @Step("Выбор статуса")
    public TaskPage chooseStatus(String status) {
        String xpath = String.format("//div[@id='opsbar-transitions_more_drop']//a//span[text()='%s']", status);
        $x(xpath).click();
        return this;
    }

    @Step("Проверка, что статус стал done")
    public void checkDoneStatus(String status) {
        this.status.lastChild().shouldHave(text(status));
    }
}
