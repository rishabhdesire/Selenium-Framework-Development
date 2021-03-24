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

public class ValidateCourseNavigationBar extends base {
	
	public WebDriver driver;
	
	//need to remember below line for logging
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException 
	{
		driver = intializeDriver();
		log.info("Browser get Launched");
		driver.get(prop.getProperty("url"));
		System.out.println(prop.getProperty("browser"));
		log.info("Navigated to HomePage");
	}
	
	@Test
	public void ValidateHomeLinkExist() throws IOException
	{
				
		LandingPage lpg = new LandingPage(driver);
				
		Assert.assertTrue(lpg.getCourseLink().isDisplayed());
		log.info("Course Link Webelement is visible");
			
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
		log.info("Browser get closed");
	}
}
