package MouseKeyboardOps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AutomationTesting\\Workspace\\DemoSelenium\\Exexutables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		Actions a=new Actions(driver);
		
		List<WebElement> menulist=driver.findElements(By.cssSelector(".navbar-nav>li>a"));
		
		WebElement webtablelink=menulist.get(4);
		
		Thread.sleep(1000);
		a.moveToElement(webtablelink,100,0).perform();
	}

}
