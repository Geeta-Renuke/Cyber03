package MouseKeyboardOps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyRefreshPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AutomationTesting\\Workspace\\DemoSelenium\\Exexutables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,"R"));
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//body")).sendKeys(Keys.F5);
		
	}

}
