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
        Assert.assertEquals("Create New Customer Account", getDriver().getTitle());
    }

    //********Methods for checking if fields are present on Registration Page***********
    public RegistrationPage isFieldsEnableOnRegistrationForm() {
        getDriver().findElement(regFirstNameField).isEnabled();
        getDriver().findElement(regLastNameField).isEnabled();
        getDriver().findElement(regEmailAddressField).isEnabled();
        getDriver().findElement(regPasswordField).isEnabled();
        getDriver().findElement(regConfirmPasswordField).isEnabled();
        getDriver().findElement(regIsSubscribeCheckBox).isEnabled();
        return this;
    }
    public RegistrationPage isLoginButtonEnable(){
        getDriver().findElement(loginButton).isEnabled();
        return this;
    }
    //******Click Back button on Registration page Method********
    public RegistrationPage clickBackButton() {
        getDriver().findElement(backButton).click();
        return this;
    }
    //********Required field message is displayed Methods********
    public RegistrationPage isRequiredMessageForFields(){
        getDriver().findElement(requiredFieldFirstName).isDisplayed();
        getDriver().findElement(requiredFieldLastName).isDisplayed();
        getDriver().findElement(requiredEmailAddress).isDisplayed();
        getDriver().findElement(requiredPassword).isDisplayed();
        getDriver().findElement(requiredConfirmPassword).isDisplayed();
        return this;
    }
    //********Create Account on Registration page Methods**********
    public RegistrationPage createAccount(String firstName, String lastName, String emailAddress, String userPassword, String userPassConfirm ) {
        getDriver().findElement(regFirstNameField).sendKeys(firstName);
        getDriver().findElement(regLastNameField).sendKeys(lastName);
        getDriver().findElement(regEmailAddressField).sendKeys(emailAddress);
        getDriver().findElement(regPasswordField).sendKeys(userPassword);
        getDriver().findElement(regConfirmPasswordField).sendKeys(userPassConfirm);
        return this;
    }
    //****************Check Subscriber Check Box********************
    public RegistrationPage checkIsSubscribeChekbox() {
        getDriver().findElement(regIsSubscribeCheckBox).click();
        return this;
        //****************Click Registration button*********************
    }
    public RegistrationPage clickRegistrationButton() {
        getDriver().findElement(regRegisterButton).click();
        return this;
    }

}

