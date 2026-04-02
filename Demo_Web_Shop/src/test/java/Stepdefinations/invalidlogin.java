package Stepdefinations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.DriverFactory;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;


public class invalidlogin {
	WebDriver driver;
	LoginPage login;
	@Given("user launch  website")
	public void user_launch_website()
 {
		driver = DriverFactory.getDriver();
		 ConfigReader.loadConfig();
		String Demo = ConfigReader.getProperty("Demo");
		driver.get(Demo);
		login = new LoginPage(driver);
	}
	@When("user click on login")
	public void user_click_on_login() {
		login.clickLogin();
	}

	@And("user enters invalid email and password")
	public void user_enters_invalid_email_and_password() {
		login.enterInvalidEmailPassword();
	}
	@And("click on login button")
	public void click_on_login_button()
	{
		login.clickLoginBtn();
	}

	@Then("error message should be display")
	public void error_message_should_be_display() {
		System.out.println("login is failed");
	}

}
