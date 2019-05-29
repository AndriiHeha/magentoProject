package com.mainacad.magento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage extends BasePage {

    //*********Web Elements*********
    private static By accountButtonBy = By.xpath("//*[@id=\"header\"]/div/div[2]/a[3]/span[2]");
    private static By registerBy = By.linkText("Register");
    private static By loginBy = By.linkText("Log In");

    //*********Constructor*********
    public HomePage() {

        Assert.assertEquals("Madison Island", getDriver().getTitle());
    }

    //*********Page Methods*********
    //Go to Registration Page
    public RegistrationPage goToRegistrationPage() throws InterruptedException {
        WebElement elementAccountButton = getDriver().findElement(accountButtonBy);
        BasePage.highlightElement(elementAccountButton);
        elementAccountButton.click();

        WebElement elementRegisterButton = getDriver().findElement(registerBy);
        BasePage.highlightElement(elementRegisterButton);
        elementRegisterButton.click();

        return new RegistrationPage();
    }

    //Go To My DashBoard page
    public MyDashboardPage goToMyDashboardPage() {
        return new MyDashboardPage();
    }

    //Go To Login Page
    public LoginPage goToLoginPage() throws InterruptedException {
        WebElement elementAccountButton = getDriver().findElement(accountButtonBy);
        BasePage.highlightElement(elementAccountButton);
        elementAccountButton.click();

        getDriver().findElement(loginBy).click();

        return new LoginPage();
    }
}