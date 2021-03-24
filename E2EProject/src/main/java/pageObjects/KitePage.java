package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KitePage {
	
	public WebDriver driver;
	
	//Declare all elements
	By signin = By.xpath("//button[contains(text(),'Login')]");
	By coursetitle = By.xpath("//h1[contains(text(),'Practice Page')]");
	By courselink = By.xpath("//button[contains(text(),'Home')]");
		
	public KitePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
	
	public WebElement getCourseTitle()
	{
		return driver.findElement(coursetitle);
	}
	
	public WebElement getCourseLink()
	{
		return driver.findElement(courselink);
	}
	
}
