package iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIframe {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
		driver.get("https://www.dream11.com/fantasy-football");
		
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("send-sms-iframe");
		WebElement iframe = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.id("regEmail")).sendKeys("1234567890");
		driver.findElement(By.id("regUser")).click();
		//driver.findElement(By.id("hamburger")).click();	//noSuchelEmentException
															//error becaouse driver control is in iframe we need switch back to main page
		
		driver.switchTo().defaultContent(); // To Switch back these ways are used
		//driver.switchTo().parentFrame();
		driver.findElement(By.id("hamburger")).click();

	}

}
