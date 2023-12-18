package task;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wedTaskCommonPropertyFile {

	public static void main(String[] args) throws IOException {
		// STEP1: CREATE FIS/FR OBJECT
				FileInputStream fis=new FileInputStream("./testdata/commondata.property");
				
				//step2: Create respective file type object
				Properties prop=new Properties();
				
				prop.load(fis);
				//step3: call read methods
				String URL = prop.getProperty("url2");
				String userName = prop.getProperty("UserName");
				String passWord = prop.getProperty("Password");
				System.out.println(URL);
				System.out.println(userName);
				System.out.println(passWord);
				
				WebDriver driver=new ChromeDriver();
				driver.get(URL);
				driver.findElement(By.id("Email")).sendKeys("shambhavi");
				driver.findElement(By.id("Password")).sendKeys("shambhavi");
				
				
				


	}

}
