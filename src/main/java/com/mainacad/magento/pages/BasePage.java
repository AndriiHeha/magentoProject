package com.mainacad.magento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    private static WebElement highlitedElem;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        BasePage.driver = driver;
    }

    public static WebDriverWait getWait() {
        return wait;
    }

}