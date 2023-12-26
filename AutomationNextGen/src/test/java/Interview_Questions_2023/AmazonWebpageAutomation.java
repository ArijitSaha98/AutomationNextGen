package Interview_Questions_2023;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
public class AmazonWebpageAutomation {
	WebDriver driver=null;

	@BeforeTest
	public void beforeTest()
	{
		try {
			String URL = "https://www.amazon.in";
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
			
			Actions a=new Actions(driver);
			
			element=driver.findElement(By.xpath("//div//following::a//following::span[contains(text(),'Hello')]"));
			a.moveToElement(element).perform();
			
			List<WebElement> elem =driver.findElements(By.xpath("(//div[@id='gw-layout']//descendant::div)//h2"));
			String s="";
			for(int i=0;i<elem.size();i++)
			{	
			s=elem.get(i).getText();
			System.out.println(s);
			}
			
			String Xpath="(//h2[contains(text(),'"+s+"')]//following::a)[1]";
			driver.findElement(By.xpath(Xpath)).click();
			
			//driver.findElement(By.linkText("Your Orders")).click();
			

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
