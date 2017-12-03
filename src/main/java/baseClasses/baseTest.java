package baseClasses;

import driverSetup.DriverFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 * Created by Jatin on 12/3/2017.
 */
public class baseTest {

    @BeforeTest
    public void beforeTest(){

        DriverFactory.getDriver();
    }

    @AfterTest
    public void afterTest(){
        DriverFactory.getDriver().quit();
    }
}
