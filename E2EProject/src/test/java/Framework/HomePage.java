package Framework;

import java.io.IOException;

import org.testng.annotations.Test;

public class HomePage extends base {

	@Test
	public void basePageNavigation() throws IOException
	{
		driver = intializeDriver();
		driver.get("http://qaclickacademy.com");
		
	}
}
