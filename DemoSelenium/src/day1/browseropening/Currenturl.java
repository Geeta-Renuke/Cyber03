package day1.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Currenturl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
					System.setProperty("webdriver.chrome.driver","E:\\Automation Testing\\Workspace\\DemoSelenium\\Exexutables\\chromedriver.exe");
					WebDriver driver=new ChromeDriver();
					
					driver.get("https://google.com");
					
					//String a = driver.getCurrentUrl();
					System.out.println("current url:"+driver.getCurrentUrl());
					
					String b=driver.getTitle();
					System.out.println(b);
					
		
		
	}

}
