package testNGFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag2 {
  @Test(description = "this test case is used to perform the login action")
  public void login()
  {
	  Reporter.log("Login is successful",true);
  }
}
