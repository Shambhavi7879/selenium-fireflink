package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToLearnSoftAssert {
	
	@Test
	public void login() 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		SoftAssert softassert=new SoftAssert();
		
		driver.get("https://demowebshop.tricentis.com/login");
		softassert.assertEquals(driver.getTitle(),"Demo Web Shop.","failed to navigate");
		//softassert.assertEquals(driver.getTitle(),"Demo Web Shop. Login","failed to navigate");
		Reporter.log("User Navigated To Login page",true);
		
		driver.findElement(By.id("Email")).sendKeys("shambhavi.bn@testyantra.com");
		driver.findElement(By.id("Password")).sendKeys("Shambhavi@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		softassert.assertEquals(driver.getTitle(),"Demo Web","User failed to login");
		//softassert.assertEquals(driver.getTitle(),"Demo Web Shop","User failed to login");
		Reporter.log("User logged in successfully",true);
		softassert.assertAll();
	}

}
