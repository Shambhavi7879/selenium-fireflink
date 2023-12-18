package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromPropertyfile {

	public static void main(String[] args) throws IOException {
		// STEP1: CREATE FIS/FR OBJECT
		FileInputStream fis=new FileInputStream("./testdata/commondata.property");
		
		//step2: Create respective file type object
		Properties prop=new Properties();
		
		prop.load(fis);
		//step3: call read methods
		String URL = prop.getProperty("url");
		System.out.println(URL);
		
		WebDriver driver=new ChromeDriver();
		driver.get(URL);

	}

}
