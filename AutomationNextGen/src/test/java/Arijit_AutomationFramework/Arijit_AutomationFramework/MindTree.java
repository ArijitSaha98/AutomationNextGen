package Arijit_AutomationFramework.Arijit_AutomationFramework;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class MindTree {

	WebDriver driver=null;
	
	@BeforeTest
	public void beforeTest()
	{
		try {
			String URL = "https://www.flipkart.com";
			//Runtime.getRuntime().exec("taskkill /F /IM chrome.exe");
			System.setProperty("webdriver.chrome.driver", "D:\\Important\\SeleniumFramework2023\\2023\\chromedriver.exe");
			driver=new ChromeDriver();

			driver.get(URL);
			driver.manage().window().maximize();

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}


	@Test
	public void Test1()
	{
		try {
			
			WebElement element=null;
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			
			
			element=driver.findElement(By.xpath("//span[@role='button']"));
			wait.until(ExpectedConditions.visibilityOfAllElements(element));
			element.click();
			
			element=driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
			wait.until(ExpectedConditions.visibilityOfAllElements(element));
			element.click();
			
			element.sendKeys("SAMSUNG MOBILE");
			
			element=driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']"));
			wait.until(ExpectedConditions.visibilityOfAllElements(element));
			element.click();
			
			
		} catch (Exception e) {
			System.err.println(e);
		}
		}

	@AfterTest
	public void AfterTest()
	{
		
		//driver.quit();
	}
}


