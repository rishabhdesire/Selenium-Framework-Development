package Framework;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageObjects.LandingPage;

import resources.base;

public class ValidateCourseTitle extends base {
	
	public WebDriver driver;
	
	//need to remember below line for logging
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException 
	{
		driver = intializeDriver();
		log.info("Browser is Launched");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Home Page");
		System.out.println(prop.getProperty("browser"));
		
	}

	@Test
	public void ValidatePageTitle() throws IOException
	{
			
		LandingPage lpg = new LandingPage(driver);
		
		//compare actual and expected values
		
		Assert.assertEquals(lpg.getCourseTitle().getText(), "PracticePage");
		log.info("Successfully Validated Course Title Name");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		log.info("Browser get closed");
	}
	
}
