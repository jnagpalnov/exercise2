import baseClasses.baseTest;
import driverSetup.DriverFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;

/**
 * Created by Jatin on 12/3/2017.
 */
public class LoginPageTest extends baseTest {

  //  String baseURL="http://localhost:3001/";
     String baseURL="file:///D:/i/Empatica_software_engineer_in_test/ex2/public/index.html";
    @BeforeMethod
    public void beforeMethod(){
        DriverFactory
                .getDriver()
                .get(baseURL);
    }

    @Test
    public  void loginTestAdmin(){
        LoginPage loginPage=new LoginPage();
        loginPage
                .doLogin("admin@empatica.com", "adminPassword")
                .verifyLoggedInSuccessfully("Admin");
    }

    @Test
    public  void loginTestResearcher(){
        LoginPage loginPage=new LoginPage();
        loginPage
                .doLogin("researcher@empatica.com", "researcherPassword")
                .verifyLoggedInSuccessfully("Researcher");
    }

    @Test
    public  void loginTestSimpleUser(){
        LoginPage loginPage=new LoginPage();
        loginPage
                .doLogin("user@empatica.com","userPassword")
                .verifyLoggedInSuccessfully("User");
    }
}
