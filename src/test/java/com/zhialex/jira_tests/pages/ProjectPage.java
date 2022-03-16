package com.zhialex.jira_tests.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.*;

public class ProjectPage {

    private final String url = "https://edujira.ifellow.ru/secure/RapidBoard.jspa?rapidView=1&projectKey=TEST&view=planning.nodetail";

    private SelenideElement
            tasksAmount = $(".ghx-issue-count");

    private ElementsCollection tasks = $$x("//div[@class='ghx-issue-content']");

    @Step("Получение уоличества тасков")
    public SelenideElement getTasksAmount() {
        return tasksAmount;
    }

    @Step("Получение всех тасков")
    public ElementsCollection getTasks() {
        return tasks;
    }

    @Step("Открытие страницы")
    public void openPage() {
        open(url);
    }

    @Step("Поиск таска по названию")
    public SelenideElement searchTaskByName(String taskName) {
        return $x("//span[text()='" + taskName + "']").parent().parent().$("a");
    }

    @Step("Открытие таска")
    public void openTask() {
        $(".ghx-key-group a").click();
    }

    @Step("Проверка количества тасков")
    public void checkTasksAmount(int tasksAmount, int tasksLength) {
        Assertions.assertEquals(tasksAmount, tasksLength);
    }
}
