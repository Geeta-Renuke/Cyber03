package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VTiger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E://AutomationTesting//Workspace//DemoSelenium//Exexutables//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement userfield=driver.findElement(By.id("username"));
		userfield.clear();
		userfield.sendKeys("admin");
		
		WebElement pwd=driver.findElement(By.id("password"));
		pwd.clear();
		pwd.sendKeys("Test@123");
		
		WebElement btn=driver.findElement(By.className("button buttonBlue"));
		btn.click();
		
	}

}
