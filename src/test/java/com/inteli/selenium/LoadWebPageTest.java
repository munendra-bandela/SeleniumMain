package com.inteli.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

/**
 * Created by aura on 9/2/17.
 */
public class LoadWebPageTest {

    @org.testng.annotations.Test
    public static void main(String [] arg) {
        String pageTitile = "Google";

        WebDriver handle = new FirefoxDriver();

        handle.get("http://www.google.com");

        Assert.assertEquals(pageTitile, handle.getTitle());

        handle.close();
        handle.quit();
    }
}
