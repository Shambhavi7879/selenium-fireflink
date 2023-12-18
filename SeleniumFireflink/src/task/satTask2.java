package task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class satTask2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		driver.switchTo().frame(0);
		driver.findElement(By.id("montana")).click();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
		WebElement result = driver.findElement(By.xpath("//h1[@class='h3']"));
		System.out.println(result.getText());
	}

}
