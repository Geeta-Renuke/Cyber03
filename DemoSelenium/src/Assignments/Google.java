package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\AutomationTesting\\Workspace\\DemoSelenium\\Exexutables\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String b=driver.getCurrentUrl();
		System.out.println("Current Page URL:" +b);
		
		String c=driver.getPageSource();
		System.out.println("Page Source Length:" +c.length());
	}

}
