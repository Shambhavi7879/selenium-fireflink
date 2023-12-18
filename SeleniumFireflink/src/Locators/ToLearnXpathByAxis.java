package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpathByAxis {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/User/Documents/table.html");
		String Movie = "KGF";
		String Collection = driver.findElement(By.xpath("//td[text()=' "+Movie+" ']/following-sibling::td")).getText();
		String posistion = driver.findElement(By.xpath("//td[text()='"+Movie+"']/preceding-sibling::td")).getText();
		
		System.out.println("Movie:"+Movie);
		System.out.println("Collection:"+Collection);
		System.out.println("Posistion:"+posistion);

	}

}
