package TestNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class multipleTestNG {
	@Test
	public void delete() 
	{
		Reporter.log("TestNG class executed....",true);
	}
	
	@Test
	public void add()
	{
		Reporter.log("method exicuted",true);
	}
	
	@Test
	public void remove()
	{
		Reporter.log("another test",true);
	}


}
