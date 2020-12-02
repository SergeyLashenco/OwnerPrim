package io.owner.sergey;

import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class GitHubTest {
    private WebDriver driver;

    @BeforeEach
    public void initDriver() {
        driver = new WebDriverProvider().get();
    }


    @Test
    public void testMainPageHub() {
        final  ServiceConfig config =  ConfigFactory.newInstance()
                .create(ServiceConfig.class);
        driver.get(config.webUrl());
    }

    @AfterEach
    public void stopDriver() {
        driver.quit();
    }


}
