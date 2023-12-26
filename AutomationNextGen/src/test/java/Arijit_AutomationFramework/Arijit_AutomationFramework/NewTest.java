 package Arijit_AutomationFramework.Arijit_AutomationFramework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewTest {
	
	WebDriver driver;
	
	@Test
  public void test1() {
		System.setProperty("webdriver.chrome.driver", "D:\\__\\Workspace\\Selenium\\Arijit_AutomationFramework\\Servers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");

		driver.findElement(By.xpath("(//input[@aria-label=\"I'm Feeling Lucky\"])[2]")).click();


		WebElement elem=driver.findElement(By.xpath("//a[@id=\"archive-link-link\"]"));
		elem.click();
		
		List<WebElement> elem1=driver.findElements(By.xpath("//a[@id=\"archive-link-link\"]"));
        
		String[] s=null;
		
		System.out.println(elem1.get(1).getText());
		//String s=driver.getTitle();
		//Assert.assertEquals(s,"Google Doodles");

  }
	@Test
	public void test2()
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\__\\Workspace\\Selenium\\Arijit_AutomationFramework\\Servers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.yahoo.com");
		
		
		driver.switchTo().frame(0);
	}
	
  
//  @BeforeClass
//  public void beforeClass() {
//	  System.setProperty("webdriver.chrome.driver", "D:\\__\\Workspace\\Selenium\\Arijit_AutomationFramework\\Servers\\chromedriver.exe");
//	  driver=new ChromeDriver();
//	  driver.manage().window().maximize();
//	  driver.manage().deleteAllCookies();
//	  
//	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	  driver.get("https://www.google.com");
//  
//  }
//  
//  @AfterClass
//  public void afterClass()
//  {
//	  //driver.manage().window().minimize();
//	  //driver.quit();
//	  
//  }



}
