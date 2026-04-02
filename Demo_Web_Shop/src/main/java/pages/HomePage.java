package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

WebDriver driver;

public HomePage(WebDriver driver)
{
this.driver = driver;
}

By books = By.linkText("Books");
By electronics = By.linkText("Electronics");
By apparel = By.linkText("Apparel & Shoes");

//public void verifyCategories()
//{	
//	driver.findElement(books).click();
//	driver.findElement(electronics).click();
//	driver.findElement(apparel).click();
//}
public boolean verifyCategories()
{
return driver.findElement(books).isDisplayed() &&
driver.findElement(electronics).isDisplayed() &&
driver.findElement(apparel).isDisplayed();
}
public String getTitle()
{
 return driver.getTitle();
}
}