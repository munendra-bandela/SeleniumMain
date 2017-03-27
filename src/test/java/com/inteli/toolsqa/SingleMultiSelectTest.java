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
public class SingleMultiSelectTest {
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

        // get all the available options
        List<WebElement> continents = select.getOptions();
        for (WebElement opt : continents) {
            System.out.println(opt.getText());
        }

        // select Europe
        select.selectByIndex(2);

        // print selected option
        System.out.println(select.getFirstSelectedOption().getText());

        // select Africa
        select.selectByVisibleText("Africa");

        // print selected options
        System.out.println(select.getFirstSelectedOption().getText());

        // *** select multiple options
        WebElement multiSelect = testCase.driver.findElement(By.id("selenium_commands"));

        // create select object
        select = new Select(multiSelect);

        // select browser-commands
        select.selectByIndex(0);
        // select Navigation Commands
        select.selectByVisibleText("Navigation Commands");

        // print all selected options
        System.out.println("Multiple selected commands: ");
        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }
    }

    @AfterTest
    public void close() {
        testCase.driver.close();
    }
}
