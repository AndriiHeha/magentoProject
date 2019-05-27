package classes;

import com.mainacad.magento.pages.HomePage;
import com.mainacad.magento.pages.MyDashboardPage;
import org.testng.annotations.Test;

public class Tests extends BaseTest {

    private static String firstName = "test11";
    private static String lastName = "test11";
    private static String emailAddress = "test11@test.com";
    private static String userPassword = "111111";
    private static String userPasswordConfirm = "111111";

    @Test (priority = 1)
    //********Checking Presence The fields on Registration Page********
    public void goToRegistrationPageIsEnableFieldsChecking() throws InterruptedException {
        new HomePage().goToRegistrationPage()
                .isFieldsEnableOnRegistrationForm();
    }

    @Test (priority = 2)
    public void goToRegistrationPageClickBackButtonCheckIfOnLoginPage() throws InterruptedException {
        new HomePage().goToRegistrationPage()
                .clickBackButton()
                .isLoginButtonEnable();
    }

    @Test (priority = 3)
    //********Checking Presence Warning message near the fields on Registration Page********
    public void postEmptyRegistrationForm() throws InterruptedException {
        new HomePage().goToRegistrationPage()
                .clickRegistrationButton()
                .isRequiredMessageForFields();
    }

    @Test (priority = 4)
    //*****Create user Account annd check navigating on MyDashboard***********
    public void createAccountForUser() throws InterruptedException {
        new HomePage().goToRegistrationPage()
                .createAccount(firstName, lastName,emailAddress,userPassword,userPasswordConfirm)
                .checkIsSubscribeChekbox()
                .clickRegistrationButton();
        new MyDashboardPage().checkNavigationOnMyDashboard(firstName, lastName);
    }
    @Test (priority = 5)
    //***********Go to login page, login and check if user loged in**********
    public void goToLoginPage() throws InterruptedException {
        new HomePage().goToLoginPage()
                .userLogin(emailAddress,userPassword)
                .checkIfUserLogedIn(firstName, lastName);
    }
}
