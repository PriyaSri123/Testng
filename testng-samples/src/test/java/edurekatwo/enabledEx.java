package edurekatwo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class enabledEx {
	
	@Test(description = "Create user tc 1")
	public void tc1()
	{
	   System.out.println("TC-1");
	}
	@Test(description = "Create user tc 2",enabled = false)
	public void tc2()
	{
		int a =14;
		assertTrue(a==5);
		 System.out.println("TC-2");
	}

}
