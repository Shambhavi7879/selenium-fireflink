package TestNG1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class wipro {
	
	@Test(groups="system")
	public void launchWipro()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.wipro.com/");
		Reporter.log("Navigated to Wipro",true);
	}


}
