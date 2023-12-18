package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnId {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://demowebshop.tricentis.com/login");
		//driver.findElement(By.id("Email")).sendKeys("testing@123"); //finding element and passing the data to it
		driver.get("https://shoppersstack.com/user-signin");
		Thread.sleep(10000); //exception will be for this and stopper stack need time to download
		driver.findElement(By.id("Email")).sendKeys("shambhavi.bn@testyantra.com");
		driver.findElement(By.id("Password")).sendKeys("Anusuya@143");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(1000);
		
		
	}

}
