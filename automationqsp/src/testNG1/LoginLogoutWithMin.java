package testNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginLogoutWithMin {

	@Test
	public void createUser() 
	{
		Reporter.log("Create users",true);
	}

	@Test(priority = -1)
	public void login() 
	{
		Reporter.log("login",true);
	}

	@Test
	public void logout() 
	{
		Reporter.log("logout",true);
	}
}
