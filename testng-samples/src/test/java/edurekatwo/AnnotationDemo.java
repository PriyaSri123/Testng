package edurekatwo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo {
	@Test(priority=2)
	public void tc5()
	{
		System.out.println("TC-5");
	}
	@BeforeMethod
	public void tc2()
	{
		System.out.println("TC-2 needs to executed before TC-1 or  TC-5	");
	}
	@Test(priority=1)
	public void tc1()
	{
		System.out.println("TC-1");
	}
	@AfterMethod
	public void tc3()
	{
		System.out.println("TC-3 needs to executed after TC-1 or  TC-5	");
	}
	
}
