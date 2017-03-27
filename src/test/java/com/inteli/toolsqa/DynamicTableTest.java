package com.inteli.toolsqa;

import com.inteli.util.TestCaseUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by aura on 14/2/17.
 */
public class DynamicTableTest {
    private TestCaseUtils testCase;
    private final String URL = "http://toolsqa.wpengine.com/automation-practice-table/";

    @BeforeMethod
    public void seUp() {
        testCase = new TestCaseUtils();
    }

    @Test
    public void dynamicTableTest() {
        testCase.driver.get(URL);

        // using hardcoded xpath to the cells
        String cellValue = testCase.driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[2]")).getText();
        System.out.println(cellValue);
        testCase.driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[6]/a")).click();

        // passing row and column number dynamically
        String row = "1";
        String col = "2";
        cellValue = testCase.driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+row+"]/td["+col+"]")).getText();
        System.out.println(cellValue);

        System.out.println("*** loop through all cells in a row ***");

        // print all column values of row Clock Tower Hotel
        String rowValue = "Clock Tower Hotel";
        for (int i = 1; i < 5; i++) {
            String cValue = null;
            cValue = testCase.driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+i+"]/th")).getText();
            if(cValue.equalsIgnoreCase(rowValue)) {
                for (int j = 1; j < 7 ; j++) {
                    WebElement eachCell = testCase.driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+i+"]/td["+j+"]"));
                    System.out.println(eachCell.getText());
                }
            }
        }

    }

    @AfterMethod
    public void close() {
        testCase.driver.close();
    }
}
