package edurekatwo;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertionExample {

	@Test
	public void tc1()
	{
		int a = 6;
		Reporter.log("a =" +a);
		Assert.assertTrue(a==5, "A is not equal to 5");
		System.out.println("tc-1");
		
	}
	@Test
	public void tc2()
	{
		System.out.println("tc-2");
		
	}

}
