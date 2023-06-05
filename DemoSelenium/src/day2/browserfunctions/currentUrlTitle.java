package day2.browserfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class currentUrlTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver","E://AutomationTesting//Workspace//DemoSelenium//Exexutables//chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https;//google.com");
			
			String a = driver.getCurrentUrl();
			System.out.println("Current URL:"+a);
			
			String b=driver.getTitle();
			System.out.println("Current Title:"+b);
			
			
	}

}
