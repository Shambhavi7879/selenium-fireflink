package Listenerss;

import java.time.Duration;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listenerImplementation.class)
public class TestScript extends Baseclass{
	
	@Test
	public void login()
	{
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("shambhavi.bn@testyantra.com");
		driver.findElement(By.id("Password")).sendKeys("Shambhavi@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Assert.assertEquals(true, false);
	}

}
