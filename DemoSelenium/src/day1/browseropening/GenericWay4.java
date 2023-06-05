package day1.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWay4 {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setUp("firefox");
		

	}
	public static void setUp(String browserName) {
		// TODO Auto-generated method stub
		if(browserName.equalsIgnoreCase("chrome"));
		{
			System.setProperty("webdriver.chrome.driver", ".\\exexutables\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		//else 
		{
			System.setProperty("webdriver.firefox.driver", ".\\exexutables\\firefoxdriver.exe");
			driver=new FirefoxDriver();
		}
		
	}
}
