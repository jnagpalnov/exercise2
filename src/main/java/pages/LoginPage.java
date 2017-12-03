package pages;

import com.sun.org.apache.bcel.internal.generic.NEW;
import driverSetup.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

/**
 * Created by Jatin on 12/3/2017.
 */
public class LoginPage {

    String userInputField="emailInput";
    String userPasswordField="pswInput";


    public HomePage doLogin(String userName, String password){

        WebDriverWait wait=new WebDriverWait(DriverFactory.getDriver(), 20);
        Reporter.log("Entering username:" + userName);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(userInputField))).sendKeys(userName);
        Reporter.log("Entering password:" + password);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(userPasswordField))).sendKeys(password);
        Reporter.log("clicking submit button");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id(userPasswordField))).submit();
        return new HomePage();
    }
}
