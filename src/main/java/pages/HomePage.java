package pages;

import driverSetup.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

/**
 * Created by Jatin on 12/3/2017.
 */
public class HomePage {



    public HomePage verifyLoggedInSuccessfully(String role) {
        // Todo : unable to complete this method because unable to view the home page as the command docker-compose up hangs on 'Attaching image to ex2_api_1'. More information is in Readme file.
        WebDriverWait wait=new WebDriverWait(DriverFactory.getDriver(), 20);
        Reporter.log("Entering username:");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[contains(text(),'" + role + "')]")));
        return new HomePage();
    }

}

