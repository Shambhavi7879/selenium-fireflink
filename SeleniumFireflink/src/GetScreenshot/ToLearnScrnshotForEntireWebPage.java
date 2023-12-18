package GetScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ToLearnScrnshotForEntireWebPage {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		LocalDateTime sysTime = LocalDateTime.now();
		String time = sysTime.toString().replaceAll(":", "-"); //To avoid replacement images
		
		driver.get("https://demoapp.skillrary.com/");
		//driver.get("https://www.myntra.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/image1"+time+".png"); //for skillary
		//File dest = new File("./screenshot/image2.png"); for mintra
		FileHandler.copy(temp, dest);

	}

}
