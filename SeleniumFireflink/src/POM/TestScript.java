package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.id("Email")).sendKeys("shambhavi@gmail.com");
		//driver.findElement(By.id("Password")).sendKeys("shambhavi");
		
		WelcomePage wp=new WelcomePage(driver);
		wp.getLoginLink().click();
		Thread.sleep(1000);
		LoginPage lp=new LoginPage(driver);
		lp.getEmailTextField().sendKeys("shambhavi.bn@testyantra.com");
		lp.getPasswordTextField().sendKeys("Shambhavi@123");
		lp.getLoginButton().click();
		Thread.sleep(2000);
		HomePage hp=new HomePage(driver);
		hp.getLogoutLink().click();
		
	}

}
