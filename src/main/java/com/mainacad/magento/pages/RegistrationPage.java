package com.mainacad.magento.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationPage extends BasePage{

    //*********Web Elements*********
    private static By regFirstNameField = By.id("firstname");
    private static By regLastNameField = By.id("lastname");
    private static By regEmailAddressField = By.id("email_address");
    private static By regPasswordField = By.id("password");
    private static By regConfirmPasswordField = By.id("confirmation");
    private static By regIsSubscribeCheckBox = By.id("is_subscribed");
    private static By regRegisterButton = By.xpath("//*[@id=\"form-validate\"]/div[2]/button/span/span");

    //*********Constructor*********
    public RegistrationPage() {
        Assert.assertEquals("Create New Customer Account", driver.getTitle());
    }
    //********Registration page Set fields Methods**********
    public RegistrationPage setFirstName(String firstName){
        driver.findElement(regFirstNameField).sendKeys(firstName);
        return this;
    }
    public RegistrationPage setLastName(String lastName){
        driver.findElement(regLastNameField).sendKeys(lastName);
        return this;
    }
    public RegistrationPage setEmailAddress(String emailAddress){
        driver.findElement(regEmailAddressField).sendKeys(emailAddress);
        return this;
    }

}

