package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReference {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
		/*WebElement emailId=driver.findElement(By.id("Email"));
		emailId.sendKeys("testing");
		Thread.sleep(2000);
		driver.navigate().refresh();
		emailId.sendKeys("shambhavi");*/ // we get stale element exception
		//avoid harcoding and use POM
		
		LoginPage lp=new LoginPage(driver); 
		lp.getEmailTextField().sendKeys("testing");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		lp.getEmailTextField().sendKeys("shambhavi");
		
		

	}

}
