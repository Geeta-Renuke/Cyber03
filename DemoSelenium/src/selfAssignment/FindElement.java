package selfAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AutomationTesting\\Workspace\\DemoSelenium\\Exexutables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		WebElement c=driver.findElement(By.xpath("//header/div[@id='nav-flyout-anchor']/div[0]/div[2]/a[1]/apas[1]"));
		c.click();
		
		WebElement a = driver.findElement(By.id("ap_email"));
		a.sendKeys("geetarenuke2294@gmail.com");
		
		WebElement b=driver.findElement(By.id("continue"));
		b.click();
}
}
