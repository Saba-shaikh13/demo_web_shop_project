package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

WebDriver driver;

public RegisterPage(WebDriver driver)
{
this.driver = driver;
}
By registerLink = By.xpath("//a[text()='Register']");
By gender = By.id("gender-female");
By firstName = By.id("FirstName");
By lastName = By.id("LastName");
By email = By.id("Email");
By password = By.id("Password");
By confirmPassword = By.id("ConfirmPassword");
By registerBtn = By.id("register-button");

public void clickRegister()
{
driver.findElement(registerLink).click();

}

public void enterDetails()
{
driver.findElement(gender).click();
driver.findElement(firstName).sendKeys("Sara");
driver.findElement(lastName).sendKeys("Shaikh");
}

public void enterEmailPassword()
{
driver.findElement(email).sendKeys("sara123@test.com");
driver.findElement(password).sendKeys("123456");
driver.findElement(confirmPassword).sendKeys("123456");
}

public void clickRegisterButton()
{
driver.findElement(registerBtn).click();
}

}