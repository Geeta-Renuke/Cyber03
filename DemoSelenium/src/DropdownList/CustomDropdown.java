package DropdownList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustomDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E://AutomationTesting//Workspace//DemoSelenium//Exexutables//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://thompsonsj.com/bootstrapselect-dropdown/");
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		
		WebElement dropdown=driver.findElement(By.id("bsd1-button"));
		
		wait.until(ExpectedConditions.elementToBeClickable(dropdown));
		
		dropdown.click();
		
		List<WebElement> options=driver.findElements(By.cssSelector(".dropdown-menu.dropdown-menu-right.show>div>a"));
		
		System.out.println("Option Count:"+options.size());
		
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		options.get(2).click();
		
	}

}
