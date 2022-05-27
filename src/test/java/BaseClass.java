import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	WebDriver driver;

	@BeforeMethod
	public void beforeMethod()
	{
		
	}
	
	@BeforeTest
	public void beforeTest()
	{
		setupDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
	}
	
	@AfterTest()
	public void afterTest()
	{
		
	}
	
	@AfterMethod()
	public void afterMethod()
	{
		
	}
	void setupDriver() {
		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + File.separator + "driver" + File.separator + "chromedriver_101.exe");
		driver = new ChromeDriver();

		
	}
}
