package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnPartialLinkText {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		//driver.findElement(By.partialLinkText("Digital ")).click();
		driver.findElement(By.partialLinkText("JEWELRY")).click();
		//driver.findElement(By.partialLinkText("JeWelRy")).click();// error either we can use inspect value or visible text value it is case sensitive

	}

}
