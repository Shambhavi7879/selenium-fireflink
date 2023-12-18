package TestNG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationAttribute {    //testNG class
	//PRIORITY
	/*
	@Test(priority=1) 
	public void login()     //test case
	{
		Reporter.log("user logged in successfully....",true);   //test steps
	}
	
	@Test(priority=0)
	public void register()
	{
		Reporter.log("User registered successfully",true);
	}
	*/
	
	

	
	//INVOCATIONCOUNT
	/*
	@Test(priority=1,invocationCount=5)
	public void login() 
	{
		Reporter.log("user logged in successfully....",true);
	}
	
	@Test(priority=0)
	public void register()
	{
		Reporter.log("User registered successfully",true);
	}*/
	
	
	
	
	//THREADPOOLSIZE
	/*
	@Test(priority=1,invocationCount=5,threadPoolSize=5)
	public void login() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("user logged in successfully....",true);
	}
	
	@Test(priority=0)
	public void register()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("User registered successfully",true);
	}
	*/
	
	
	
	//ENABLE
	/*
	@Test(priority=1,invocationCount=5,threadPoolSize=5)
	public void login() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("user logged in successfully....",true);
	}
	
	@Test(priority=0,enabled=false)
	public void register()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("User registered successfully",true);
	}
	*/
	
	
	
	
	//DEPENDS ON METHODS
	
	@Test(dependsOnMethods="register")
	public void login() 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("user logged in successfully....",true);
	}
	
	@Test(priority=-1)
	public void register()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("User registered successfully",true);
		Assert.fail(); //assert it is used to fail the script
	}

}
