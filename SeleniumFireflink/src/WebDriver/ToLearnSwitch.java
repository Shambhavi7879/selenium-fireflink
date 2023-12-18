package WebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitch {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/3");
		Thread.sleep(10000);
		String parentId = driver.getWindowHandle(); // to get parent id
		driver.findElement(By.id("compare")).click();
		
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentId); // from  here
		
		for(String id:allWindowIds)
		{
			driver.switchTo().window(id);
			driver.close(); 
		}								//to here is to keep parent id and close all othjer window
			
		/*for(String id:allWindowIds)
		{
			driver.switchTo().window(id);
			if(driver.getCurrentUrl().contains("ebay"))
			{
				driver.close();
			}
			if(driver.getCurrentUrl().contains("flipkart"))
			{
				driver.close();
			}		
			
			//if (driver.getCurrentUrl().contains("flipkart"))
			if(driver.getCurrentUrl().contains("amazon"))
			{
				break;
			}
		 }
			driver.manage().window().maximize();  // This is to get one window max and other windows to be closed */
			
			
			/*driver.switchTo().window(id);
			Thread.sleep(1000);
			driver.close(); 
			//this are another method and it should be within for loop*/
		
			driver.switchTo().window(parentId);
			System.out.println(driver.getTitle()); // to get title for to keep parent window
	}

}
