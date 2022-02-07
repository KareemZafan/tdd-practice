package com.google.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.session.FirefoxFilter;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTests {
    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void goToHomePage() {
        driver.get("https://www.google.com/");
        Assert.assertEquals(driver.getTitle(), "Google");

    }

    @Test
    public void testGoogleLogoIsDisplayed() {
        Assert.assertTrue(driver.findElement(By
                .cssSelector("img.lnXdpd")).isDisplayed());

    }

    @Test
    public void testGoogleTitle() {
        Assert.assertEquals(driver.getTitle(),"Google");
    }

    @AfterTest
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }

}
