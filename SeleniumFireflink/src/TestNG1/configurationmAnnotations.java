package TestNG1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class configurationmAnnotations {
	/*
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("@BeforeSuite",true);
	}
	
	@AfterSuite
	public void afterSuit()
	{
		Reporter.log("@AfterSuite",true);
	}
	
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("@BeforeTest",true);
	}
	
	@AfterTest
	public void afterTest()
	{
		Reporter.log("@AfterTest",true);
	}
	
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("@BeforeClass",true);
	}
	
	@AfterClass
	public void afterClass()
	{
		Reporter.log("@AfterClass",true);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("@BeforeMethod",true);
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		Reporter.log("@AfterMethod",true);
	}
	
	@Test
	public void demoTest()
	{
		Reporter.log("Demo Test Executed...",true);
	}
	
	@Test
	public void demoTest1()
	{
		Reporter.log("Demo1 Test Executed...",true);
	}
	
	*/
	
	//with discription
	
	public WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Reporter.log("Establish DB connection and report config",true);
	}
	
	@AfterSuite
	public void afterSuit()
	{
		Reporter.log("Close DB connection and flush all reports",true);
	}
	
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("@BeforeTest",true);
	}
	
	@AfterTest
	public void afterTest()
	{
		Reporter.log("@AfterTest",true);
	}
	
	@BeforeClass
	public void beforeClass()
	{
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Open browser and navigate url",true);
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.close();
		Reporter.log("Close Browser",true);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		driver.findElement(By.linkText("Log in")).click();
		Reporter.log("Login",true);
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		driver.findElement(By.linkText("Log out")).click();
		Reporter.log("Logout",true);
	}
	
	@Test
	public void demoTest()
	{
		driver.findElement(By.id("Email")).sendKeys("shambhavi.bn@testyantra.com");
		driver.findElement(By.id("Password")).sendKeys("Shambhavi@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("Demo Test Executed...",true);
	}
	

}
