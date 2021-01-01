package Framework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	
	//declare here as well so that it will not impact in parrele execution or multipel driver should not get confused
	public WebDriver driver;
	
	//https://www.rahulshettyacademy.com/AutomationPractice/
	//need to remember below line for logging
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException 
	{
		driver = intializeDriver();
		log.info("Browser Launched");
	}

	@Test(dataProvider="getData")
	public void basePageNavigation(String Username, String Password) throws IOException
	{
		
		
		driver.get(prop.getProperty("url"));
		System.out.println(prop.getProperty("browser"));
		log.info("Navigated to HomePage successfully");
				
		LandingPage lpg = new LandingPage(driver);
		lpg.getLogin().click();
		log.info("Navigated to Login Page");
		
		LoginPage logpg = new LoginPage(driver);
		System.out.println(Username);
		logpg.getEmail().sendKeys(Username);
		log.info(Username);
		logpg.getPassword().sendKeys(Password);
		logpg.getLogin().click();
		//accept alert
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		log.info("Clickedd on Login Button");

		
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		log.info("Browser Closed");
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		//row stand for how many data types test should pass
		//column stand for how many values per each test
		
		//Here Array Size is 2
		//i.e. 0,1
		
		Object[][] data = new Object[2][2]; 
		
		//0th row
		data[0][0]="restricteduser";
		data[0][1]="pass1";
		
		//1st row
		data[1][0]="nonrestricteduser";
		data[1][1]="pass2";
		
		return data;
	}

	
}
