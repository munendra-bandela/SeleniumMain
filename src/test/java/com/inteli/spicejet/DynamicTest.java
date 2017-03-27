package com.inteli.spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by aura on 11/2/17.
 */
public class DynamicTest {

    public static void main(String[] args) {
        String url = "http://www.spicejet.com/";

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
        driver.findElement(By.partialLinkText("Goa")).click();

        if (driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXTaction")).isDisplayed())
            System.out.println("element is displayed");
            driver.findElement(By.partialLinkText("BLR")).click();

        if (driver.findElement(By.id("ui-datepicker-div")).isDisplayed()) {
            driver.findElement(By.xpath("//div[child::span[text()='February']]/../following-sibling::table/descendant::a[text()='25']")).click();
        }

    }

}
