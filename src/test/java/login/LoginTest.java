package login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {
    @Test
    public void testSuccessfulLogin(){
       LoginPage loginpage=  homePage.click_formAuthenticaionLink();
       loginpage.setUsername("tomsmith");
       loginpage.setPassword("SuperSecretPassword!");
     SecureAreaPage secureAreaPage= loginpage.clickButton();
     // assertEquals(secureAreaPage.getAlert(),"You logged out of the secure area!","Alert text is incorrect");
        assertTrue(secureAreaPage.getAlert().contains("You logged into a secure area!"),"Alert text is incorrect");
    }
}
