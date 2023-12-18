package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.dream11.com/fantasy-football");
		driver.findElement(By.id("regEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("regUser")).click();
//error for this program bcoz it is iframe it has diffenrt steps
	}

}
