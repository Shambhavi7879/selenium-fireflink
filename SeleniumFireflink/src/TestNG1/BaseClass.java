package TestNG1;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseClass {

	@BeforeClass
	public void beforeSuite()
	{
		Reporter.log("Establish DB connection and report config",true);
	}
	
	@AfterClass
	public void afterSuit()
	{
		Reporter.log("Close DB connection and flush all reports",true);
	}
	
	@BeforeClass
	public void beforeTest()
	{
		Reporter.log("@BeforeTest",true);
	}
	
	@AfterClass
	public void afterTest()
	{
		Reporter.log("@AfterTest",true);
	}
	
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("Open browser and navigate url",true);
	}
	
	@AfterClass
	public void afterClass()
	{
		Reporter.log("Close Browser",true);
	}
	
	@BeforeClass
	public void beforeMethod()
	{
		Reporter.log("Login",true);
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		Reporter.log("Logout",true);
	}
	
}
