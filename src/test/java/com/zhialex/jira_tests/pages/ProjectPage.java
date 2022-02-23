package com.zhialex.jira_tests.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class ProjectPage {

    private final String url = "https://edujira.ifellow.ru/secure/RapidBoard.jspa?rapidView=1&projectKey=TEST&view=planning.nodetail";

    private SelenideElement
            tasksAmount = $(".ghx-issue-count"),
            pageTitle = $("#ghx-board-name");

    private ElementsCollection tasks = $$x("//div[@class='ghx-issue-content']");

    public SelenideElement getTasksAmount() {
        return tasksAmount;
    }

    public ElementsCollection getTasks() {
        return tasks;
    }

    public SelenideElement searchTaskByName(String taskName) {
        return $x("//span[text()='" + taskName + "']").parent().parent().$("a");
    }

    public void openTask() {
        $(".ghx-key-group a").click();
    }

    public String getUrl() {
        return url;
    }
}
