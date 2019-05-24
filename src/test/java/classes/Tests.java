package classes;

import com.mainacad.magento.pages.HomePage;
import org.testng.annotations.Test;

public class Tests extends BaseTest {

    private static String firstName = " ";
    private static String lastName = "test";
    private static String emailAddress = "test@test.com";
    private static String userPassword = "111111";
    private static String userPasswordConfirm = "111111";

    @Test
    //********Checking Presence The fields on Registration Page********
    public void goToRegistrationPageIsEnableFieldsChecking() {
        new HomePage().goToRegistrationPage()
                .isFieldsEnableOnRegistrationForm();
    }

    @Test
    public void goToRegistrationPageClickBackButtonCheckIfOnLoginPage() {
        new HomePage().goToRegistrationPage()
                .clickBackButton()
                .isLoginButtonEnable();
    }

    @Test
    //********Checking Presence Warning message near the fields on Registration Page********
    public void postEmptyRegistrationForm() {
        new HomePage().goToRegistrationPage()
                .clickRegistrationButton()
                .isRequiredMessageForFields();
    }

    @Test
    //*****Create user Account***********
    public void createAccountForUser() {
        new HomePage().goToRegistrationPage()
                .createAccount(firstName, lastName,emailAddress,userPassword,userPasswordConfirm)
                .checkIsSubscribeChekbox()
                .clickRegistrationButton();
    }
    @Test
    //***********Go to login page, login and check if user loged in**********
    public void goToLoginPage(){
        new HomePage().goToLoginPage()
                .userLogin(emailAddress,userPassword)
                .checkIfUserLogedIn();
    }

}
