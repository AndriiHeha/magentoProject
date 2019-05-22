package classes;

import com.mainacad.magento.pages.HomePage;
import org.testng.annotations.Test;

public class Tests extends BaseTest{

    @Test
    public void test(){
        new HomePage().goToRegistrationPage();
    }
}
