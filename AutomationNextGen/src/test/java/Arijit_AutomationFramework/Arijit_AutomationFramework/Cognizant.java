package Arijit_AutomationFramework.Arijit_AutomationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cognizant {
	
	@Test
	public void practicing() throws InterruptedException
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\__\\Workspace\\Selenium\\Arijit_AutomationFramework\\Servers\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.wait(6000);
		
		
	}

}
