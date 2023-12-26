package Arijit_AutomationFramework.Arijit_AutomationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class IndiumAndMindfire {

	
	RemoteWebDriver driver=null;
	@Test
	public void test1()
	{
		driver= new ChromeDriver();System.setProperty("webdriver.chrome.driver", "D:\\__\\Workspace\\Selenium\\Arijit_AutomationFramework\\Servers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		
		WebElement elem=driver.findElement(By.xpath(""));
		
		Select se=new Select(elem);
		se.selectByVisibleText("ABC");
		se.selectByIndex(1);
		se.selectByValue("ABC");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argument[0].click();",elem);
		js.executeScript("argument[0].value=' ';",elem);
		
		driver.switchTo().frame(1);
		driver.switchTo().window("ABC");
		
		//WebDriverWait wait=new WebDriverWait(driver,60);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("AND")));
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
		
	}
	
	

}
