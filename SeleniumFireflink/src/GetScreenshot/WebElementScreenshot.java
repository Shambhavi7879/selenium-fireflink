package GetScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		File temp = driver.findElement(By.xpath("//div[@class='desktop-logoContainer']")).getScreenshotAs(OutputType.FILE);
		File temp2 = driver.findElement(By.xpath("//h4[contains(text(),'Medal Worthy')]")).getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/image3.png"); 
		File dest2 = new File("./screenshot/image4.png"); 
		FileHandler.copy(temp, dest);
		FileHandler.copy(temp2, dest2);
		
	}

}
