package com.inteli.webpage;

import org.openqa.selenium.WebDriver;

/**
 * Created by aura on 11/2/17.
 */
public class WebPage {
    private String url;
    private WebDriver driver;

    public WebPage(String url, WebDriver driver) {
        this.url = url;
        this.driver = driver;
    }

}
