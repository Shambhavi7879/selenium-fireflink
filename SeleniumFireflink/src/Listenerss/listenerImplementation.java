package Listenerss;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class listenerImplementation extends Baseclass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test Script Failed",true);
		
		LocalDateTime sysTime = LocalDateTime.now();
		String time = sysTime.toString().replaceAll(":", "-"); //To avoid replacement images
		
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShot/listener"+time+".png");
		try
		{
			FileHandler.copy(temp, dest);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}
	
	
	
}
