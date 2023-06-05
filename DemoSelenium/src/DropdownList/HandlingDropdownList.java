package DropdownList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\AutomationTesting\\Workspace\\DemoSelenium\\Exexutables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/register.html");
		
		WebElement skilldropdown=driver.findElement(By.id("Skills"));
		
		Select selectSkill=new Select(skilldropdown);
		
		System.out.println("Is dropdown is allowing you to select multiple dropdown:"+selectSkill.isMultiple());
		
		System.out.println("Already Selected Option Name:"+selectSkill.getFirstSelectedOption().getText());
		
		List<WebElement> options=selectSkill.getOptions();
		
		System.out.println("Option Count is:" + options.size());
		
		for(int i=0;i<options.size();i++)
		{
			System.out.println("option"+i+":"+options.get(i).getText());
		}
		
		selectSkill.selectByIndex(4);
		System.out.println("Already Selected Option Name:"+selectSkill.getFirstSelectedOption().getText());
		selectSkill.selectByValue("Backup Management");
		System.out.println("Already Selected Option Name:"+selectSkill.getFirstSelectedOption().getText());
		selectSkill.selectByVisibleText("Analytics");
		System.out.println("Already Selected Option Name:"+selectSkill.getFirstSelectedOption().getText());
		
		String act_SkillName="";
		for(int i=1;i<options.size();i++)
		{
			if((options.size()-1)!=i)
			{
			act_SkillName=act_SkillName+options.get(i).getText()+",";
			}
			else
			{
				act_SkillName=act_SkillName+options.get(i).getText();
			}
		
		}
		/*
		 String Exp_skillName="";
		 System.out.println("SkillName"+act_SkillName);
		  System.out.println("Exp_SkillName"+exp_SkillName);
		  System.out.println("Skills are in sorted order or not:"+act_SkillName.equals(exp_SkillName));
		 */
		
		Select dayDrop=new Select(driver.findElement(By.id("daybox")));
		List<Integer> days=new ArrayList<Integer>();
		for(int i=1;i<dayDrop.getOptions().size();i++)
		{
			String day=dayDrop.getOptions().get(i).getText();
			days.add(Integer.parseInt(day));
		}
		List<Integer> dupdays=new ArrayList<Integer>(days);
		Collections.sort(dupdays);
		System.out.println(days.equals(dupdays));
	}	
}
