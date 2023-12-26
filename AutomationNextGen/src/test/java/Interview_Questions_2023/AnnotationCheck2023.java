package Interview_Questions_2023;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationCheck2023 {

	WebDriver driver;
	ArrayList<String> tabs;
	
	/*
	 * @BeforeClass public void beforeClass() { //System.out.println("beforeClass");
	 * }
	 * 
	 * @BeforeMethod public void beforeMethod() {
	 * //System.out.println("beforeMethod"); }
	 */
	
	@BeforeTest
	public void beforeTest()
	{	
		System.setProperty("webdriver.chrome.driver","D:\\Important\\SeleniumFramework2023\\2023\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();	
	}
	
	@Test
	public void Test1()throws Exception
	{
		//System.out.println("Test1");
		
		WebElement elem;
		
		Actions a=new Actions(driver);
		Robot r=new Robot();
		
		elem=driver.findElement(By.xpath("//a[text()='Gmail']"));
		a.contextClick(elem).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		
		tabs=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs.size());
		driver.switchTo().window(tabs.get(1));		
		
		List<WebElement> l=driver.findElements(By.xpath("//a"));
		for(int i=0;i<l.size();i++)
		{
		System.out.println(l.get(i).getText());
		}
		
		Thread.sleep(5000);
		driver.close();		
	}
	
	
	  @Test 
	  public void Test2()
	  { 
		 	  
	  }
	 	

	@AfterTest
	public void afterTest()
	{
		driver.quit();
		
	}
	
	/*
	 * @AfterMethod public void afterMethod() { System.out.println("AfterMethod"); }
	 * 
	 * @AfterClass public void afterClass() { System.out.println("AfterClass"); }
	 * 
	 */	
}
