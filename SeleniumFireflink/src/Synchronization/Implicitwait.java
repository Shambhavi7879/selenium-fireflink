package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://shoppersstack.com/signup");
		driver.get("https://www.shoppersstack.com/products_page/7");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Thread.sleep(2000); it is like static wait untill this time we will not get the result
		//driver.findElement(By.xpath("//input[@id='First Name']")).sendKeys("shambhavi");
		driver.findElement(By.xpath("//button[@id='compare']")).click();

	}

}
