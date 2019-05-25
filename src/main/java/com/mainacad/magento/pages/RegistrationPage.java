package com.mainacad.magento.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationPage extends BasePage {
    //*********Web Elements*********
    private static By regFirstNameField = By.id("firstname");
    private static By regLastNameField = By.id("lastname");
    private static By regEmailAddressField = By.id("email_address");
    private static By regPasswordField = By.id("password");
    private static By regConfirmPasswordField = By.id("confirmation");
    private static By regIsSubscribeCheckBox = By.id("is_subscribed");
    private static By regRegisterButton = By.xpath("//*[@id=\"form-validate\"]/div[2]/button/span/span");
    private static By backButton = By.xpath("//*[@id=\"form-validate\"]/div[2]/p/a");
    private static By loginButton = By.name("send");

    private static By requiredFieldFirstName = By.id("advice-required-entry-firstname");
    private static By requiredFieldLastName = By.id("advice-required-entry-lastname");
    private static By requiredEmailAddress = By.id("advice-required-entry-email_address");
    private static By requiredPassword = By.id("advice-required-entry-password");
    private static By requiredConfirmPassword = By.id("advice-required-entry-confirmation");

    //*********Constructor*********
    public RegistrationPage() {
        Assert.assertEquals("Create New Customer Account", driver.getTitle());
    }

    //********Methods for checking if fields are present on Registration Page***********
    public RegistrationPage isFieldsEnableOnRegistrationForm() {
        driver.findElement(regFirstNameField).isEnabled();
        driver.findElement(regLastNameField).isEnabled();
        driver.findElement(regEmailAddressField).isEnabled();
        driver.findElement(regPasswordField).isEnabled();
        driver.findElement(regConfirmPasswordField).isEnabled();
        driver.findElement(regIsSubscribeCheckBox).isEnabled();
        return this;
    }
    public RegistrationPage isLoginButtonEnable(){
        driver.findElement(loginButton).isEnabled();
        return this;
    }
    //******Click Back button on Registration page Method********
    public RegistrationPage clickBackButton() {
        driver.findElement(backButton).click();
        return this;
    }
    //********Required field message is displayed Methods********
    public RegistrationPage isRequiredMessageForFields(){
        driver.findElement(requiredFieldFirstName).isDisplayed();
        driver.findElement(requiredFieldLastName).isDisplayed();
        driver.findElement(requiredEmailAddress).isDisplayed();
        driver.findElement(requiredPassword).isDisplayed();
        driver.findElement(requiredConfirmPassword).isDisplayed();
        return this;
    }
    //********Create Account on Registration page Methods**********
    public RegistrationPage createAccount(String firstName, String lastName, String emailAddress, String userPassword, String userPassConfirm ) {
        driver.findElement(regFirstNameField).sendKeys(firstName);
        driver.findElement(regLastNameField).sendKeys(lastName);
        driver.findElement(regEmailAddressField).sendKeys(emailAddress);
        driver.findElement(regPasswordField).sendKeys(userPassword);
        driver.findElement(regConfirmPasswordField).sendKeys(userPassConfirm);
        return this;
    }
    //****************Check Subscriber Check Box********************
    public RegistrationPage checkIsSubscribeChekbox() {
        driver.findElement(regIsSubscribeCheckBox).click();
        return this;
        //****************Click Registration button*********************
    }
    public RegistrationPage clickRegistrationButton() {
        driver.findElement(regRegisterButton).click();
        return this;
    }

}

