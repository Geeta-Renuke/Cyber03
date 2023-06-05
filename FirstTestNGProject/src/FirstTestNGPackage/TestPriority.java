package FirstTestNGPackage;

import org.testng.annotations.Test;

public class TestPriority {
	
  @Test(priority=1)
  public void testSignIn()
  {
	  System.out.println("User Succeessfully Signed in");
  }
  
  @Test(priority=2)
  public void testLogIn()
  {
	  System.out.println("User Succeessfully Logged in");
  }
  
  @Test(priority=3,enabled=false)
  public void testLogOut()
  {
	  System.out.println("User Succeessfully Logout");
  }
}
