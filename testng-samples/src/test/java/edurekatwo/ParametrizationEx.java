package edurekatwo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizationEx {

	@Parameters ({"username", "password"})
	@Test
	public void validLogin(String Username, String Password)
	{
		System.out.println(Username);
		System.out.println(Password);
		
	}
	@Parameters ({"invalidusername", "invalidpassword"})
	@Test
	public void invalidLogin(String Username, String Password)
	{
		System.out.println(Username);
		System.out.println(Password);
		
	}
}
