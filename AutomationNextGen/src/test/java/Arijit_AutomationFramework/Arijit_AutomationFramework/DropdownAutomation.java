package Arijit_AutomationFramework.Arijit_AutomationFramework;

import java.awt.Desktop.Action;
import java.awt.event.KeyEvent;
import java.awt.Robot;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DropdownAutomation {
	
	WebDriver driver=null;
	
	@Test
	public void test1()
	{
		try {
		WebDriver driver=null;
		System.setProperty("webdriver.chrome.driver", "D:\\__\\Workspace\\Selenium\\Arijit_AutomationFramework\\Servers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		Actions a =new Actions(driver);
		Robot r=new Robot();
		
		//driver.switchTo().frame(0);
		WebElement element=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		element.sendKeys("Dropdown");
		element.sendKeys(Keys.ENTER);
	
		WebElement element1=driver.findElement(By.xpath("//h3[text()='Dropdowns - Bootstrap']"));
		element1.click();
		WebElement element2=driver.findElement(By.xpath("//a[@class='nav-item nav-link dropdown-toggle mr-md-2']"));
		element2.click();
		List<WebElement> elem=driver.findElements(By.xpath("//div[@class='dropdown-menu dropdown-menu-right show']//a"));
		
		for(int i=0;i<elem.size();i++)
		{
		 String s=elem.get(i).getText();
		 System.out.println(s);
		 
		 if(s.equalsIgnoreCase("All versions"))
		 {
			r.keyPress(KeyEvent.VK_ENTER);
			
		 }
		 driver.switchTo().alert().accept();
		 //AutoIT Script
		 //Runtime.getRuntime().exec(s);
		
		}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		
		
		
		
		
	}
	

}
