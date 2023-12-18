package task;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class taskChildwindowPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/products_page/3");
		Thread.sleep(10000);
		driver.findElement(By.id("compare")).click();
		Set<String> allWindowIds = driver.getWindowHandles();
		
		for(String id:allWindowIds)
		{
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			if (url.contains("amazon"))
			{
				break;
			}
		}
		Dimension size = driver.manage().window().getSize();
		System.out.println("Height:"+size.getHeight());
		System.out.println("Width:"+size.getWidth());
		Point position = driver.manage().window().getPosition();
		System.out.println("Xposition:"+position.getX());
		System.out.println("Yposition:"+position.getY());
		driver.close();


	}

}
