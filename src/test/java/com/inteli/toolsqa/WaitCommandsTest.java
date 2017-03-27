package com.inteli.toolsqa;

import com.inteli.util.TestCaseUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by aura on 17/2/17.
 */
public class WaitCommandsTest {

    private TestCaseUtils testCase;
    private final String URL = "http://toolsqa.wpengine.com/automation-practice-switch-windows/";

    @BeforeMethod
    public void setUp() {
        testCase = new TestCaseUtils();
        testCase.driver.get(URL);
    }

    @Test
    public void alertTest() {
        testCase.driver.findElement(By.id("timingAlert")).click();
        WebDriverWait wait = new WebDriverWait(testCase.driver, 4);

        Alert timeOutAlert = wait.until(ExpectedConditions.alertIsPresent());
        timeOutAlert.accept();
    }

    @AfterMethod
    public void tearDown() {
        testCase.driver.close();
    }

}
