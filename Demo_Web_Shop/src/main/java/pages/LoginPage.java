package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
	this.driver = driver;
	}
	
	By login = By.linkText("Log in");
	By email = By.id("Email");
	By pass = By.id("Password");
	By remember=By.name("RememberMe");
	By loginButton=By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
	By logout=By.linkText("Log out");
	public void clickLogin()
	{	
		driver.findElement(login).click();
		driver.findElement(loginButton).click();


	}

	public void enterEmailPassword()
	{
		driver.findElement(email).sendKeys("saba@gmail.com");
		driver.findElement(pass).sendKeys("123456");
		driver.findElement(remember).click();
		
	}
	public void clickLoginBtn()
	{
		driver.findElement(loginButton).click();

	}
	public void enterInvalidEmailPassword()
	{
		driver.findElement(email).sendKeys("saba@123.com");
		driver.findElement(pass).sendKeys("123456");
		driver.findElement(remember).click();
		
	}
	public void clicklogout()
	{
		driver.findElement(logout).click();
	}
}
