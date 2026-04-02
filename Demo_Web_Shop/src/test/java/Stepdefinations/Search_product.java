package Stepdefinations;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SearchPage;
import utilities.ConfigReader;
import utilities.DriverFactory;

public class Search_product {
	WebDriver driver;
	SearchPage search;
	@Given("launch demo shop website")
	public void launch_demo_shop_website() {
		driver = DriverFactory.getDriver();
		 ConfigReader.loadConfig();
		String Demo = ConfigReader.getProperty("Demo");
		driver.get(Demo);
		search = new SearchPage(driver);

	}

	@When("Enter product name in search box")
	public void enter_product_name_in_search_box() {
		search.enterProduct();
	}

	@And("click search")
	public void click_search() {
		search.clickSearch();
	}

	@Then("verify relevant results appear successfully")
	public void verify_relevant_results_appear_successfully() {
		boolean result = search.verifyResults();
		System.out.println("product search successful");
	}


}
