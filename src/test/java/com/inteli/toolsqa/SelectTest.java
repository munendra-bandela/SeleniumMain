package com.inteli.toolsqa;

import com.inteli.util.TestCaseUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by aura on 14/2/17.
 */
public class SelectTest {
    private TestCaseUtils testCase;
    private final String URL = "http://toolsqa.wpengine.com/automation-practice-form/";

    @BeforeTest
    public void setUp() {
        testCase = new TestCaseUtils();
    }

    @Test
    public void singleMultiSelectTest() {

        testCase.driver.get(URL);

        // identify dropdown
        WebElement dropDown = testCase.driver.findElement(By.id("continents"));

        // create select object on the element
        Select select = new Select(dropDown);

        System.out.println(select.getAllSelectedOptions().toString());

        // select Europe by its index
        select.selectByIndex(1);

    }

    @AfterTest
    public void close() {
        testCase.driver.close();
    }
}
