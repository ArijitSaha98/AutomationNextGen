package Arijit_AutomationFramework.Arijit_AutomationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PracticeMainClass {

	WebDriver driver;
	@BeforeTest
	//@Parameters("browser")
	public void beforeTest()
	{
//		if(browser.equalsIgnoreCase("chrome"))
		
		System.setProperty("webdriver.chrome.driver","D:\\\\__\\\\Workspace\\\\Selenium\\\\Arijit_AutomationFramework\\\\Servers\\\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
		
		
		
		
//		else if(browser.equalsIgnoreCase("firefox"))
//		{
//			System.out.println("Runninggggggg Firefox");
//		}
//		
//		driver.switchTo().alert().accept();
//		driver.switchTo().alert().dismiss();

	}


	@AfterTest
	public void teardown()
	{
		

	}

}
