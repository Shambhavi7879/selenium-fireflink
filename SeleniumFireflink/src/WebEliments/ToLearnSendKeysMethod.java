package WebEliments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSendKeysMethod {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement searchTextField = driver.findElement(By.xpath("//input[@values=Search store']"));
		searchTextField.sendKeys("books");
		
		System.out.println(searchTextField);

	}

}
