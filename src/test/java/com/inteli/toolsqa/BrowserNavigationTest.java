package com.inteli.toolsqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by aura on 13/2/17.
 */
public class BrowserNavigationTest {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());

        driver.findElement(By.id("lst-ib")).sendKeys("facebook");
        driver.findElement(By.id("lst-ib")).clear();

        System.out.println(driver.getTitle());
        driver.close();
    }
}
