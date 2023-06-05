package FirstTestNGPackage;

import org.testng.annotations.Test;

public class TestEnabled {
	
  @Test(enabled=false)
  public void testcase1() 
  {
	  System.out.println("I am TestCase1");
  }
  
  @Test(enabled=true)
  public void testcase2() 
  {
	  System.out.println("I am TestCase2");
  }
  
  @Test(enabled=false)
  public void testcase3() 
  {
	  System.out.println("I am TestCase3");
  }
  
  @Test(enabled=true)
  public void testcase4() 
  {
	  System.out.println("I am TestCase4");
  }
}
