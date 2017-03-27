package com.inteli.spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by aura on 11/2/17.
 */
public class WindowTest {
    public static void main(String[] args) throws InterruptedException {
        String homeWindowId;
        WebDriver handle = new FirefoxDriver();

        handle.manage().window().maximize();
        homeWindowId = handle.getWindowHandle();
        handle.get("http://www.spicejet.com");
        handle.findElement(By.xpath("//a[@href='MobileApp.aspx']")).click();

        Set<String> allWindows = handle.getWindowHandles();
        System.out.println(allWindows.size());

        for (String window : allWindows) {
            handle.switchTo().window(window);
            System.out.println("Current window: " + handle.getTitle());
            if(false == homeWindowId.equals(handle.getWindowHandle())) {
                handle.findElement(By.xpath("//*[text()='Download Now']")).getText();
                System.out.println("Closed window is: " + handle.getTitle());
                handle.close();
                Thread.sleep(5000);
                System.out.println("Wait is over");
                handle.switchTo().defaultContent();
                //1handle.switchTo().window(homeWindowId);
            }
            System.out.println("Current window: " + handle.getTitle());
        }
        handle.close();

    }
}
