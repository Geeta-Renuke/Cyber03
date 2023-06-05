package selfAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AutomationTesting\\Workspace\\DemoSelenium\\Exexutables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		List<WebElement> a = driver.findElements(By.linkText("Google"));
		int SizeofA=a.size();
		System.out.println("Size of A :Google"+SizeofA);
		
		List<WebElement> b = driver.findElements(By.linkText("Gmail"));
		int SizeofB=b.size();
		System.out.println("Size of B :Gmail"+SizeofB);
		
		List<WebElement> c = driver.findElements(By.tagName("a"));
		int SizeofC=c.size();
		System.out.println("Size of c :Tag<a>"+SizeofC);
		
		
	}

}
