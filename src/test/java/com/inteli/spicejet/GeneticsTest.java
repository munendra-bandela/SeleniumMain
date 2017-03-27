package com.inteli.spicejet;

import com.inteli.util.TestCaseUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by aura on 12/2/17.
 */
public class GeneticsTest {
    private TestCaseUtils testCase;

    @BeforeMethod
    public void initialize() {
        testCase = new TestCaseUtils();
    }

    @Test
    public void loadPageTest2() {
        // load page
        testCase.driver.get("http://www.gmail.com");
        Assert.assertEquals("Gmail", testCase.driver.getTitle());

        testCase.driver.findElement(By.id("Email")).sendKeys("imdoinwifi");
        testCase.driver.findElement(By.id("next")).click();
        testCase.driver.findElement(By.id("Passwd")).sendKeys("imdoinwifi");
        testCase.driver.findElement(By.id("signIn")).click();

        testCase.screenShot.takeScreenShot();
        testCase.driver.close();
    }

}