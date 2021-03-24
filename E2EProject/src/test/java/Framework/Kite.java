package Framework;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.KitePage;

import resources.base;

public class Kite extends base {
	
	public WebDriver driver;
	
	//need to remember below line for logging
	public static Logger log = LogManager.getLogger(base.class.getName());

	@BeforeTest
	public void initialize() throws IOException 
	{
		driver = intializeDriver();
		log.info("Browser get Launched");
		//driver.get(prop.getProperty("kiteurl"));
		driver.get("https://kite.zerodha.com/holdings");
		System.out.println(prop.getProperty("browser"));
		log.info("Navigated to LoginPage");
	}
	
	@Test
	public void ValidateHomeLinkExist() throws IOException, InterruptedException
	{
				
		KitePage kpg = new KitePage(driver);
		
		//driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("IW3296");
		//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Ansh$rima@4ze");
		
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@id='search-input']")).sendKeys("TCS");
		
		
		//Instantiate Action Class        
        Actions actions = new Actions(driver);
        
		WebElement listItem = driver.findElement(By.xpath("//body/div[@id='app']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/div[1]/li[1]"));
		
		       
		//Mouse hover menuOption 'Music'
		actions.moveToElement(listItem).perform();
		
		
		driver.findElement(By.xpath("//button[contains(text(),'B')]")).click();
		Assert.assertTrue(true);
		//log.info("Course Link Webelement is visible");
			
	}
	
	@AfterTest
	public void teardown()
	{
		//driver.close();
		log.info("Browser get closed");
	}
}
