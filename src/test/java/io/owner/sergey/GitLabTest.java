package io.owner.sergey;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class GitLabTest {
    private WebDriver driver;

    @BeforeEach
    public void initDriver() {
        driver = new WebDriverProvider().get();
    }


    @Test
    public void testMainPageLab() {
        driver.get("https://gitlab.com");
    }

    @AfterEach
    public void stopDriver() {
        driver.quit();
    }


}
