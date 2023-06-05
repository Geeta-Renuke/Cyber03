package HandlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBlazeDeviceCountName {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AutomationTesting\\Workspace\\DemoSelenium\\Exexutables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(1000);
		List<WebElement> deviceListp=driver.findElements(By.cssSelector("div>div[id=\"tbodyid\"]>div>div>div>h4>a"));
		Thread.sleep(2000);
		System.out.println("Total Device Count"+deviceListp.size());
		
		
	/*	List<WebElement> deviceList=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		int s=deviceList.size();
		System.out.println("Total Device Count"+s);*/
		
	/*	WebElement a=deviceList.get(0);
		String menuName=a.getText();
		System.out.println("First Menu Name:"+menuName);
		//System.out.println("First Menu Name:"+deviceList.get(0).getText());  */
		
	}

}
