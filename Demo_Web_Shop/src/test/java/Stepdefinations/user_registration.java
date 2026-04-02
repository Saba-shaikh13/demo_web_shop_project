package Stepdefinations;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegisterPage;
import pages.SearchPage;
import utilities.ConfigReader;
import utilities.DriverFactory;

public class user_registration {
	WebDriver driver;
	RegisterPage register;
	@Given("launch demo shop")
	public void launch_demo_shop() {
		driver = DriverFactory.getDriver();
		 ConfigReader.loadConfig();
		String Demo = ConfigReader.getProperty("Demo");
		driver.get(Demo);
		register = new RegisterPage(driver);
	}

	@When("user should click on register in navbar")
	public void user_should_click_on_register_in_navbar() {
		register.clickRegister();
	}

	@And("user enters details")
	public void user_enters_details() {
		register.enterDetails();
	}

	@And("enter email and password")
	public void enter_email_and_password() {
		register.enterEmailPassword();
	}

	@And("user clicks Register button")
	public void user_clicks_register_button() {
		register.clickRegisterButton();
	}

	@Then("registration should be successful")
	public void registration_should_be_successful() {
		System.out.println("registration successful");
	}


}
