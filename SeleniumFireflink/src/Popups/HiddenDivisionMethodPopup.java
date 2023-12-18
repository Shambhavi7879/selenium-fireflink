package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionMethodPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		WebElement overlayFrame = driver.findElement(By.xpath("//iframe[contains(@name,'notification-frame')]"));
		driver.switchTo().frame(overlayFrame);
		driver.findElement(By.xpath("//a[@class='close']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
		
		while(true)
		{
			try 
			{
				driver.findElement(By.xpath("//div[text()='September 2024']/../..//p[text()='10']")).click();
			}
			catch (Exception e)
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
			
		}
		
	}

}
