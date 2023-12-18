package WebEliments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnBooleanMethod {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://shoppersstack.com/signup");
		Thread.sleep(2000);
		WebElement submitButton = driver.findElement(By.xpath("//button[text()=\"Register\"]"));
		System.out.println(submitButton.isDisplayed());
		System.out.println(submitButton.isEnabled());
		
		driver.findElement(By.xpath("//input[@id='First Name']")).sendKeys("shambhavi");
		driver.findElement(By.xpath("//input[@id='Last Name']")).sendKeys("b n");
		driver.findElement(By.xpath("//input[@id='Female']")).click();
		driver.findElement(By.xpath(""));
		

	}

}
