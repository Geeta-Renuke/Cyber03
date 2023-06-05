package selfAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AutomationTesting\\Workspace\\DemoSelenium\\Exexutables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		List<WebElement> b= driver.findElements(By.tagName("a"));
		int Sizeb=b.size();
		System.out.println("Size of B"+Sizeb);
		
		for(int i=1;i<Sizeb;i++)
		{
			WebElement a=b.get(i);
			String c=a.getText();
			System.out.println(c);
		}
		
	}

}
