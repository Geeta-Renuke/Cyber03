package Day345Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E://AutomationTesting//Workspace//DemoSelenium//Exexutables//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		String a=driver.getTitle();
		System.out.println("Current Page Title:"+a);
		System.out.println("Current Page Title Length:"+a.length());
		
		String b=driver.getCurrentUrl();
		System.out.println("Current Page URL:"+b);
	
		String eTitle="https://demo.actitime.com";
		String aTitle=driver.getTitle();
		System.out.println("verify correct page opened:"+aTitle.equals(eTitle));
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		System.out.println("Current Page Title:"+driver.getTitle());
		
		driver.close();
	}

}
