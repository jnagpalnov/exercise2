package driverSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Jatin on 12/3/2017.
 */
public class DriverFactory {


    // private constructor to make class sigleton
    private DriverFactory(){

    }

    static WebDriver driver=null;

    public static WebDriver getDriver(){
        if(driver==null)
        {
            setDriver();
        }
        return driver;
    }

    public static void setDriver(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromeDriver/chromedriver.exe");

         driver=new ChromeDriver();

    }

}
