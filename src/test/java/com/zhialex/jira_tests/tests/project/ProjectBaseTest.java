package com.zhialex.jira_tests.tests.project;

import com.github.javafaker.Faker;
import com.zhialex.jira_tests.BaseTest;
import com.zhialex.jira_tests.components.CreateIssueComponents;
import com.zhialex.jira_tests.components.HeaderComponents;
import com.zhialex.jira_tests.pages.ProjectPage;
import com.zhialex.jira_tests.pages.TaskPage;
import org.junit.jupiter.api.BeforeEach;

public class ProjectBaseTest extends BaseTest {

    HeaderComponents headerComponents = new HeaderComponents();
    CreateIssueComponents issueComponents = new CreateIssueComponents();
    TaskPage taskPage = new TaskPage();
    ProjectPage projectPage = new ProjectPage();
    Faker faker = new Faker();

    @BeforeEach
    void login() {
        projectPage.openPage();
        authPage.login();
    }
}
