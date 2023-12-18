package Listbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectListBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/signup");
		WebElement dayDropdown = driver.findElement(By.id("day"));
		Select daySelect=new Select(dayDropdown);
		daySelect.selectByIndex(9);
		
		WebElement monthDropdown = driver.findElement(By.id("month"));
		Select monthSelect=new Select(monthDropdown);
		monthSelect.selectByValue("9");
		
		WebElement yearDropdown = driver.findElement(By.id("year"));
		Select yearSelect=new Select(yearDropdown);
		//yearSelect.selectByVisibleText("2000");
		List<WebElement> allOptions = yearSelect.getOptions();
		yearSelect.selectByIndex(allOptions.size()-1);
		
		
		//System.out.println(yearSelect.isMultiple());
		
		//Thread.sleep(2000);
		//monthSelect.deselectByValue("9"); // error only deselect for multiselect option
		 

	}

}
