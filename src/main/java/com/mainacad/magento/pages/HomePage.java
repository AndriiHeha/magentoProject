package com.mainacad.magento.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends BasePage {

    //*********Web Elements*********
    private static By accountButtonBy = By.xpath("//*[@id=\"header\"]/div/div[2]/a[3]/span[2]");
    private static By registerBy = By.linkText("Register");
    private static By loginBy = By.linkText("Log In");

    //*********Constructor*********
    public HomePage() {

        Assert.assertEquals("Madison Island", driver.getTitle());
    }

    //*********Page Methods*********
    //Go to Registration Page
    public RegistrationPage goToRegistrationPage() {
        driver.findElement(accountButtonBy).click();
        driver.findElement(registerBy).click();
        return new RegistrationPage();
    }

    //Go To DashBoard page
    public MyDashboardPage goToMyDashboardPage() {

        return new MyDashboardPage();
    }

    //Go To Login Page
    public LoginPage goToLoginPage() {
        driver.findElement(accountButtonBy).click();
        driver.findElement(loginBy).click();
        return new LoginPage();
    }
}