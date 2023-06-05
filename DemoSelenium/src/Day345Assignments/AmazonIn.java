package Day345Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E://AutomationTesting//Workspace//DemoSelenium//Exexutables//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		String a=driver.getTitle();
		System.out.println("Current page Title:"+a);
		
		WebElement p=driver.findElement(By.linkText("Amazon Pay"));
		p.click();
		
		System.out.println("After Clicking Amazon Pay;Current page Title:"+driver.getTitle());
		
		driver.navigate().back();
		
		System.out.println("After Navigate Back , Current page Title:"+driver.getTitle());
		
		driver.manage().window().setSize(new Dimension(400,500));
		
		driver.close();
		
	}

}
