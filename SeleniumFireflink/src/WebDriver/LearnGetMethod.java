package WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnGetMethod {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/"); //url should be fully qualified with https

	}

}
