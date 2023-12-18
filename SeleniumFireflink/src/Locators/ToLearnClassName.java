package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnClassName {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-register")).click();
		//driver.findElement(By.className("search-box-text ui-autocomplete-input")).sendKeys("books");//error bcoz class name sometimes wor sometimes not eventhough it find element it is not possible to pass input
		
	}

}
