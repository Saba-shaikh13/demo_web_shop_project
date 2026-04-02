package automationtesting.Demo_Web_Shop;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo1 {

	ChromeDriver driver;
	@Test (priority=1)
	void launch()
	{
		 driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
	}
	
}
