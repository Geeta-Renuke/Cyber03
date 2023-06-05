package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E://AutomationTesting//Workspace//DemoSelenium//Exexutables//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com");
		
		WebElement userfield=driver.findElement(By.id("user-name"));
		//userfield.clear();
		userfield.sendKeys("standard_user");
		
		WebElement pwd=driver.findElement(By.id("password"));
		//pwd.clear();
		pwd.sendKeys("secret_sauce");
		
		WebElement btn=driver.findElement(By.id("login-button"));
		btn.click();
		
	}

}
