package com.mainacad.magento.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    //protected static WebDriver driver;

    protected final static ThreadLocal<WebDriver> DRIVER = new ThreadLocal<WebDriver>();

    protected static WebDriverWait wait;
    private static WebElement highlitedElem;


    public static WebDriver getDriver() {
        return DRIVER.get();
    }
    public static void setDriver(WebDriver driver) {
        BasePage.DRIVER.set(driver);
    }

    public static WebDriverWait getWait() {
        return wait;
    }



    public static void highlightElement(WebElement element) throws InterruptedException {
        unhighlightElement();
        highlitedElem = element;
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, "color: red; border: 3px solid red;");
    }

    public static void unhighlightElement() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) getDriver();
            js.executeScript("arguments[0].setAttribute('style', arguments[1]);", highlitedElem, "");
        } catch (Exception e) {
        }
    }
}