package CalenderHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateTimePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","E:\\AutomationTesting\\Workspace\\DemoSelenium\\Exexutables\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("http://demo.guru99.com/test/");
			
			WebElement dateBox=driver.findElement(By.xpath("//form//input[@name='bdaytime']"));
			
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			dateBox.sendKeys("09252013");
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			dateBox.sendKeys(Keys.TAB);
			dateBox.sendKeys("0245PM");
			
					
	}

}
