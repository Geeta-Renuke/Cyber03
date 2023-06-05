package HandlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlaze {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AutomationTesting\\Workspace\\DemoSelenium\\Exexutables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/");
		
	WebElement deviceListp=driver.findElement(By.linkText("Laptops"));
		deviceListp.click();
		
		Thread.sleep(2000);
		List<WebElement> deviceList=driver.findElements(By.cssSelector("div[id=\"tbodyid\"]>div>div>div>h4>a"));
		
		System.out.println("Total Device Count"+deviceList.size());
		
		List<WebElement> deviceList1=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		System.out.println("Total Device Count"+deviceList1.size());
	}

	
		//div[id="nav-xshop-container"]>div>a
	}

