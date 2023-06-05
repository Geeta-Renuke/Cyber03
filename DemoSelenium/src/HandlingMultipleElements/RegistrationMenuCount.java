package HandlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationMenuCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AutomationTesting\\Workspace\\DemoSelenium\\Exexutables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/register.html");
		
		List<WebElement> deviceListp=driver.findElements(By.cssSelector(".navbar-nav>li>a"));
		System.out.println("Total Device Count"+deviceListp.size());
	}

}
