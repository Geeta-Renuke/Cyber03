
package Day345Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.gecko.driver","E:\\AutomationTesting\\Workspace\\DemoSelenium\\Exexutables\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			
			driver.get("https://demosite.executeautomation.com/Login.html");
			
			String a=driver.getTitle();
			System.out.println("Current Page Title:"+a);
			System.out.println("Current Page Title Length:"+a.length());
			
			String b=driver.getCurrentUrl();
			System.out.println("Current Page url:"+b);
			
			String c="https://demosite.executeautomation.com/Login.html";
			System.out.println("Verify opened Page:"+c.equals(a));
			
		//	driver.findElement(By.).sendKeys("");
		//	driver.findElement(By.).sendKeys("");
			// driver.findElement(By.).click();
			
			
			
			
				
	}

}
