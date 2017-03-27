package com.inteli.toolsqa;

import com.inteli.util.TestCaseUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by aura on 14/2/17.
 */
public class CheckBoxRadioButtonTest {

    private TestCaseUtils testCase;
    private final String URL = "http://toolsqa.wpengine.com/automation-practice-form/";

    @BeforeTest
    public void setUp() {
        testCase = new TestCaseUtils();
    }

    @Test
    public void radioButtonTest() {
        testCase.driver.get(URL);

        // select alternate radio button
        List<WebElement> radio = testCase.driver.findElements(By.name("sex"));
        boolean isSelected = radio.get(0).isSelected();
        if(isSelected) {
            radio.get(1).click();
        }
        else
            radio.get(0).click();

        // select 3rd radio button for year
        testCase.driver.findElement(By.id("exp-2")).click();

        // select Automation-Tester for profession
        List<WebElement> profession = testCase.driver.findElements(By.name("profession"));
        for (WebElement option: profession) {
            if(option.getAttribute("value").equalsIgnoreCase("Automation Tester"))
                option.click();
            else
                continue;
        }

        // select automation tool as selenium IDE
        testCase.driver.findElement(By.cssSelector("input[value='Selenium IDE']")).click();
    }

    @AfterTest
    public void close() {
        testCase.driver.close();
    }
}
