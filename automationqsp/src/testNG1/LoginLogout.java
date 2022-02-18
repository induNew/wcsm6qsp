package testNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginLogout {

	@Test(priority = 1)
	public void createUser() 
	{
		Reporter.log("Create users",true);
	}

	@Test
	public void login() 
	{
		Reporter.log("login",true);
	}

	@Test(priority = 2)
	public void logout() 
	{
		Reporter.log("logout",true);
	}
}
