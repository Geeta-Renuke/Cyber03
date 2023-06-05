package day1.browseropening;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
		String driverPath=System.getProperty("user.dir")+"\\exexutables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		ChromeDriver cdriver=new ChromeDriver();
		*/
		
	
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Testing\\Workspace\\DemoSelenium\\Exexutables\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

	}

}
