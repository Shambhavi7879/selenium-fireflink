package task;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class promt {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://shoppersstack.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Swagger documentation")).click();
		
		Alert promptPopup=driver.switchTo().alert();
		promptPopup.accept();
		Thread.sleep(1000);
		promptPopup.sendKeys("admin");
		promptPopup.accept();
		Thread.sleep(1000);
		promptPopup.sendKeys("admin");
		promptPopup.accept();
		

	}

}
