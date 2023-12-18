package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//step2
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//step1 :declare element
	@FindBy (linkText="Log out")
	private WebElement logoutLink;

	//step3
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	

}
