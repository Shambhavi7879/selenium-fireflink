package task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		driver.switchTo().frame(4);
		
		WebElement image = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
		WebElement dest = driver.findElement(By.id("trash"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.dragAndDrop(image, dest).perform();
	}

}
