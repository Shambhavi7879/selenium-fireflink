package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoLogin {
	
	@Test
	public void login()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("shambhavi.bn@testyantra.com");
		driver.findElement(By.id("Password")).sendKeys("Shambhavi@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		if(driver.getTitle().equals("Demo Web Shop"))
		{
			Reporter.log("User logged in",true);
		}
		else
		{
			Reporter.log("User Failed To Login",true);
		}
	}

}
