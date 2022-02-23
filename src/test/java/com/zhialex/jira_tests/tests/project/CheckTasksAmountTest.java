package com.zhialex.jira_tests.tests.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckTasksAmountTest extends ProjectBaseTest {

    @Test
    @DisplayName("Check amount of tasks")
    void checkTasksAmountTest() {

        int taskAmount = Integer.parseInt(projectPage.getTasksAmount().getText().split(" ")[0]);

        assertEquals(taskAmount, projectPage.getTasks().toArray().length);
    }
}
