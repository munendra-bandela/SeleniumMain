package com.inteli.util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

/**
 * Created by aura on 11/2/17.
 */
public class ScreenShot {
    private TakesScreenshot screen;

    public ScreenShot(WebDriver driver) {
        screen = (TakesScreenshot)driver;
    }

    public void takeScreenShot() {

        /* Prints   java.lang.Thread
                    getStackTrace

        System.out.println(Thread.currentThread().getStackTrace()[0].getClassName());
        System.out.println(Thread.currentThread().getStackTrace()[0].getMethodName());


           Prints   com.inteli.util.ScreenShot
                    takeScreenShot

        System.out.println(Thread.currentThread().getStackTrace()[1].getClassName());
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());


           Prints   com.inteli.spicejet.SampleGoogle
                    loadPageTest

        System.out.println(Thread.currentThread().getStackTrace()[2].getClassName());
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
        */

        String stackTrace = Thread.currentThread().getStackTrace()[2].getClassName();
        String [] stack = stackTrace.split("[.]");

        String className = stack[stack.length - 1]; // get only className from stack
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();

        String fileName = className + "-" + methodName;

        ProjectProperty property = new ProjectProperty();
        String saveAt = property.properties.getProperty("screen-shots-location");
        String finalFileName;

        finalFileName = saveAt + "/" + fileName + ".png";

        File src = screen.getScreenshotAs(OutputType.FILE);
        File dst = new File(finalFileName);

        try {
            FileUtils.copyFile(src, dst);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
