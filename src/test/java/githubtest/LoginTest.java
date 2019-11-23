package githubtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Drivers//geckodriver");
		driver = new FirefoxDriver();
	}
	@Test
	public void doLogin()
	{
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("Passwd")).sendKeys("abcd");
		driver.findElement(By.id("SignIn")).click();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
