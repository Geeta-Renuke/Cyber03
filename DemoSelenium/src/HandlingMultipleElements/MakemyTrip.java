package HandlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakemyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AutomationTesting\\Workspace\\DemoSelenium\\Exexutables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/bus-tickets/");
		Thread.sleep(1000);
		WebElement fromcity=driver.findElement(By.id("fromCity"));
		fromcity.sendKeys("Pune");
		Thread.sleep(1000);
		List<WebElement> a=driver.findElements(By.cssSelector("ul[class='react-autosuggest__suggestions-list']>li>div>p>span"));
		System.out.println("Total Suggestions List:"+a.size());
		
		

		WebElement tocity=driver.findElement(By.className("react-autosuggest__input react-autosuggest__input--open"));
		tocity.sendKeys("Mumbai");
		
		
	}

}
