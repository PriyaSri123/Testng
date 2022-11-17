package edurekatwo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

@Test(groups = {"regression"})
public class GroupExample {
 
	@Test
	public void tc1()
	{
		System.out.println("tc-1");
	}
	@Test(groups = {"smoke"})
	public void tc2()
	{
		System.out.println("tc-2");
	}
	@Test(groups = {"smoke"})
	public void tc3()
	{
		System.out.println("tc-3");
	}
	@Test(groups = {"smoke"})
	public void tc4()
	{
		System.out.println("tc-4");
	}
}
