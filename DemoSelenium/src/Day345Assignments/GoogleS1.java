package Day345Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","E://AutomationTesting//Workspace//DemoSelenium//Exexutables//chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","E:\\AutomationTesting\\Workspace\\DemoSelenium\\Exexutables\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("selenium");
		//a.sendKeys("selenium");
		
		List<WebElement> slist=driver.findElements(By.cssSelector("div[class='primary-side']>div>cr>div>div>*:nth-child(2)"));
		//("ul[class:'G43f7e']>li>div>*.:nth-child(2)>div>*:first-child>span")
		//("div[id='content']>div>cr>div>div>*:nth-child(2)")
		System.out.println("total s found:"+slist.size());
		
	
		
		
	}

}
