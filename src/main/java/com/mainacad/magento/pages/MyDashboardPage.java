package com.mainacad.magento.pages;

import org.testng.Assert;

public class MyDashboardPage extends BasePage {
    //*********Web Elements*********

    //*********Constructor*********
    public MyDashboardPage() {

        Assert.assertEquals("My Account", driver.getTitle());
    }

    public MyDashboardPage goToMyDashboard() {

        return this;
    }
}
