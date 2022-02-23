package com.zhialex.jira_tests.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class TaskPage {

    private SelenideElement
            workflowButton = $("#opsbar-transitions_more"),
            status = $("#status-val");

    public TaskPage clickWorkflow() {
        workflowButton.click();
        return this;
    }

    public TaskPage chooseStatus(String status) {
        String xpath = String.format("//div[@id='opsbar-transitions_more_drop']//a//span[text()='%s']", status);
        $x(xpath).click();
        return this;
    }

    public SelenideElement getStatusElement() {
        return status;
    }
}
