package com.inteli.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by aura on 11/2/17.
 */
public class TestCaseUtils {
    public WebDriver driver;
    public ScreenShot screenShot;

    public TestCaseUtils() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        screenShot = new ScreenShot(driver);
    }

}
