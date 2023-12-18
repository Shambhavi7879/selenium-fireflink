package TestNG1;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class apple {
	
	@Test(groups="smoke")
	public void launchApple()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.apple.com/in/store?afid=p238%7CsdUuvv563-dc_mtid_187079nc38483_pcrid_683481791481_pgrid_109516736379_pntwk_g_pchan__pexid__&cid=aos-IN-kwgo-brand--slid---product-");
		Reporter.log("Navigated to Apple",true);
	}


}
