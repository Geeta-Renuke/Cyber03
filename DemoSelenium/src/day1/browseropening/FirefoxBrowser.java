package day1.browseropening;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.driver", "E:\\AutomationTesting\\Workspace\\DemoSelenium\\Exexutables\\geckodriver.exe");
		FirefoxDriver cd=new FirefoxDriver();
	}

}
