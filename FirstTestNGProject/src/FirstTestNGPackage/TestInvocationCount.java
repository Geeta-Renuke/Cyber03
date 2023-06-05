package FirstTestNGPackage;

import org.testng.annotations.Test;

public class TestInvocationCount {
  @Test(invocationCount=3)
  public void testSignin() 
  {
	  System.out.println("User Successfully Signed in the Application");
  }
}
