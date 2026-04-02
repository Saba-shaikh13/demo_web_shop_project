package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//        features = "C:\\Users\\SK Laptop Town\\sabacorejava\\Demo_Web_Shop\\src\\test\\java\\resources\\features",
        features = "C:\\Users\\SK Laptop Town\\sabacorejava\\Demo_Web_Shop\\src\\main\\resources\\features",
        glue = "Stepdefinations",
        plugin = {"pretty","html:target/cucumber-report.html",
        		"pretty","json:target/cucumber-report.json"},
        monochrome = true
)

public class TestRunner extends AbstractTestNGCucumberTests {

}