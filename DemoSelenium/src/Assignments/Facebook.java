package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:\\AutomationTesting\\Workspace\\DemoSelenium\\Exexutables\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		String url="https://www.facebook.com/";
		driver.get(url);
		
		String a=driver.getTitle();
		System.out.println("Current Page Title:" +a);
		System.out.println("Current Page Title Lenth:" +a.length());
		
		String b=driver.getCurrentUrl();
		System.out.println("Current Page URL:" +b);
		
		if(b.equals(url))
		{
			System.out.println("Page Loaded");
			System.out.println("Current Page URL:" +b);
			
		}
		else
		{
			System.out.println("Page did not load");
			
		}
		
		String c=driver.getPageSource();
		System.out.println("Page Source Length:" +c.length());
		//System.out.println("Current Page Source:" +c);
		
		
		//driver.close();
	}

}
