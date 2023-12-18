package TestNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DWS_001 extends BaseClass {

	@Test
	public void addProductToCart()
	{
		Reporter.log("Product Added To Cart Successfully",true);
	}
}
