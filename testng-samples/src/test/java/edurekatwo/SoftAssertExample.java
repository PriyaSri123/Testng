package edurekatwo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

	@Test
	public void tc1()
	{
		SoftAssert sa = new SoftAssert();
		int a = 6;
		Reporter.log("a =" +a);
		sa.assertTrue(a==5, "A is not equal to 5");
		System.out.println("tc-1");
		sa.assertAll();
		
	}
	@Test
	public void tc2()
	{
		System.out.println("tc-2");
		
	}
}
