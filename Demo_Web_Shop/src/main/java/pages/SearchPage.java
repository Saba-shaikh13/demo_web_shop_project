package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

WebDriver driver;

public SearchPage(WebDriver driver)
{
this.driver = driver;
}

By searchBox = By.id("small-searchterms");
By searchBtn = By.xpath("//input[@value='Search']");
By resultText = By.xpath("//div[@class='search-results']");


public void enterProduct()
{
driver.findElement(searchBox).sendKeys("Laptop");
}

public void clickSearch()
{
driver.findElement(searchBtn).click();
}
public boolean verifyResults()
{
return driver.findElement(resultText).isDisplayed();
}
}