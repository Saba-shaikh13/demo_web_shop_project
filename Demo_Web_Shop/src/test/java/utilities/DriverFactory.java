//package utilities;
//
//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class DriverFactory {
//
//    public static WebDriver driver;
//
//    public static WebDriver getDriver()
//    {
//        if(driver == null)
//        {
//            WebDriverManager.chromedriver().setup();   // important
//            driver = new ChromeDriver();
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//            driver.manage().window().maximize();
//        }
//
//        return driver;
//    }
//}

package utilities;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

    public static WebDriver driver;

    public static WebDriver getDriver()
   {
        if(driver == null)
        {
    		System.setProperty("webdriver.edge.driver","C:\\Users\\SK Laptop Town\\sabacorejava\\Demo_Web_Shop\\DriverResources\\msedgedriver.exe");
            driver = new EdgeDriver();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
            driver.manage().window().maximize();
        }

        return driver;
    }
}