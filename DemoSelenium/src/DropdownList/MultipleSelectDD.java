package DropdownList;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E://AutomationTesting//Workspace//DemoSelenium//Exexutables//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://omayo.blogspot.com/");
		
		WebElement cardropdown=driver.findElement(By.id("multiselect1"));
		
		Select selectSkill=new Select(cardropdown);
		
		System.out.println("selectMultiple Options"+selectSkill.isMultiple());
		
		List<WebElement> options=selectSkill.getOptions();
		
		System.out.println("option count is"+options.size());
		
		for(int i=1;i<options.size();i++)
		{
			System.out.println("option"+i+":"+options.get(i).getText());
		}
		
		selectSkill.selectByIndex(0);
		selectSkill.selectByIndex(3);
		selectSkill.selectByValue("Hyundaix");
		selectSkill.selectByValue("Audi");
		
		List<WebElement> selectcars=selectSkill.getAllSelectedOptions();
		System.out.println("Selected car Count:"+selectcars.size());
		
		selectSkill.deselectByIndex(0);
		
		selectSkill.deselectByValue("Hyundaix");
		selectSkill.deselectByVisibleText("Audi");
		selectSkill.deselectAll();
	}

}
