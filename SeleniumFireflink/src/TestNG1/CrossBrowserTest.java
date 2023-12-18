package TestNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	public WebDriver driver;
	
/*
	@Test
	public void demo()

	{
		
		//WebDriver driver=new ChromeDriver();
		//WebDriver driver=new FirefoxDriver();
		//WebDriver driver=new EdgeDriver();
		//driver.get("https://demowebshop.tricentis.com/login");
		
		
		
		//instead of writing separately we will write in single script
	
		String browserName="chrome"; //by changing input we can run it different browser before adding parameter and driver in method 
		
		if(browserName.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		
		driver.get("https://demowebshop.tricentis.com/login");
			
	}
		
*/		
		
	
	//Using Parameter
	
	@Parameters("Browser")
	@Test
	public void demo(@Optional("chrome") String browserName)
	{
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		
		driver.get("https://demowebshop.tricentis.com/login");

   	}


}
