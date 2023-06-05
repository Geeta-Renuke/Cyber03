package day1.browseropening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWay3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",".\\Exexutables\\chromedriver.exe");
		WebDriver cd=new ChromeDriver();
		cd.get("https://www.google.com");
		System.out.println("Current Page Title:"+cd.getTitle());
		System.out.println("Current Page URL:"+cd.getCurrentUrl());
		
		String pSCode=cd.getPageSource();
		//System.out.println("Current Source Code:"+pSCode);
		System.out.println("Current Pagesource length:"+pSCode.length());
		cd.close();
		
		
	}

}
