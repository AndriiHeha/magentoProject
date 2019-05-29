package com.mainacad.magento.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class MyDashboardPage extends BasePage {
    //*********Web Elements*********
    private static By myDashBoard = By.className("page-title");
    private static By helloUser = By.className("hello");
    private static By successRegistrationMsg = By.className("success-msg");

    //*********Constructor*********
    public MyDashboardPage() {

        Assert.assertEquals("My Account", getDriver().getTitle());
    }

    public MyDashboardPage checkNavigationOnMyDashboard(String firstName, String lastName) {
        getDriver().findElement(myDashBoard).isDisplayed();
        getDriver().findElement(helloUser).isDisplayed();
        Assert.assertEquals("Thank you for registering with Madison Island.", getDriver().findElement(successRegistrationMsg).getText());
        Assert.assertEquals("Hello, " + firstName + " " + lastName + "!", getDriver().findElement(helloUser).getText());
        return this;
    }
}
