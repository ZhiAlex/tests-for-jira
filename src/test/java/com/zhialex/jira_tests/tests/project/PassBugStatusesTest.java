package com.zhialex.jira_tests.tests.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;

public class PassBugStatusesTest extends ProjectBaseTest {

    @Test
    @DisplayName("Check the passage of the bug for all statuses")
    public void passBugStatusesTest() {

        headerComponents.createIssue();

        String summary = faker.book().author() + " " + faker.numerify("######");
        String status = "Done";

        issueComponents
                .chooseProjectInput()
                .chooseIssueTypeInput()
                .setSummary(summary)
                .clickSetDescriptionTextButton()
                .setDescription(faker.beer().name())
                .createIssue();

        projectPage.searchTaskByName(summary).click();
        projectPage.openTask();

        taskPage
                .clickWorkflow()
                .chooseStatus(status)
                .getStatusElement().lastChild().shouldHave(text(status));
    }
}
