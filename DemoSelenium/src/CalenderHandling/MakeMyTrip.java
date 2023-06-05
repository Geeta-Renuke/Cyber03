package CalenderHandling;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AutomationTesting\\Workspace\\DemoSelenium\\Exexutables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.makemytrip.com/");
		
		//to handle offer popup
		try
		{
			driver.switchTo().frame(driver.findElement(By.id("Webklipper-publisher-widget-container-notification-frame")));
			driver.findElement(By.cssSelector(".close")).click();
			driver.switchTo().defaultContent();
			driver.findElement(By.cssSelector("li[data-cy='account']")).click();
		}
		catch(NoSuchElementException e)
		{
			System.out.println(e);
		}
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		driver.findElement(By.cssSelector("div.DayPicker-Months>div:nth-of-type(2)>.DayPicker-Body>*:nth-child(2)>*:nth-child(3)>div>p")).click();
				
	}

}
