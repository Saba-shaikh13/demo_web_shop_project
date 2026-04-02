package Stepdefinations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.DriverFactory;
import pages.HomePage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
public class HomeSteps {
	WebDriver driver;
	HomePage home;
	@Given("launch browser")
	public void launch_browser() throws IOException {
		 driver = DriverFactory.getDriver();
		 ConfigReader.loadConfig();
		String Demo = ConfigReader.getProperty("Demo");
		driver.get(Demo);
	}

	@When("user navigates to Demo Web Shop")
	public void user_navigates_to_demo_web_shop() {
		home = new HomePage(driver);
	}

	@Then("homepage title should be correct andcategories should be visible")
	public void homepage_title_should_be_correct_andcategories_should_be_visible() {
		String title = home.getTitle();
		System.out.println(title);
		home.verifyCategories();

	}


}
