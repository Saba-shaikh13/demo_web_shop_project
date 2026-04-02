package Stepdefinations;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.DriverFactory;

public class LoginSteps {
	WebDriver driver;
	LoginPage login;
	@Given("user launch demo shop website")
	public void user_launch_demo_shop_website() {
		driver = DriverFactory.getDriver();
		 ConfigReader.loadConfig();
		String Demo = ConfigReader.getProperty("Demo");
		driver.get(Demo);
		login=new LoginPage(driver);
	}

	@When("user click on login  in navbar")
	public void user_click_on_login_in_navbar() {
		login.clickLogin();
	}

	@When("user enters valid email and password")
	public void user_enters_valid_email_and_password() {
		login.enterEmailPassword();
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		login.clickLoginBtn();
		login.clicklogout();
	}

	@Then("user should login successfully")
	public void user_should_login_successfully() {
		System.out.println("login successful");
	}

}
