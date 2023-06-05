package MouseKeyboardOps;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyCopyPaste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AutomationTesting\\Workspace\\DemoSelenium\\Exexutables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement fname=driver.findElement(By.xpath("//input[@placeholder='Frist Name']"));
		
		fname.sendKeys("admin",Keys.chord(Keys.CONTROL,"A"));
		
		fname.sendKeys(Keys.chord(Keys.CONTROL,"C"));
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL,"V"));
		
	}

}
