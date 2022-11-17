package edurekatwo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class DependsonEx1 {


	@Test()
	public void createUser()
	{
	   System.out.println("createUser");
	}
	@Test(dependsOnMethods = {"createUser"})
	public void updateUser()
	{
		 System.out.println("Update User");
	}
	@Test(dependsOnMethods = {"updateUser"})
	public void deleteUser()
	{
		 System.out.println("Delete User");
	}



}
