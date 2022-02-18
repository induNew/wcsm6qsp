package testNG1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() 
  { 
	  Reporter.log("Demo class ",true);
  }
  
  @Test
  public void a() 
  { 
	  Reporter.log("suraj",true);
	  //	 int i=9;
//	 int result = i/0;
//	 System.out.println(result);
  }
  
}
