package Arijit_AutomationFramework.Arijit_AutomationFramework;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public class Calculator {
	
	AppiumDriver driver;
	
	
	@Test
	void calculator() throws MalformedURLException
	{
		
		DesiredCapabilities d=new DesiredCapabilities();
		d.setCapability("deviceName", "Redmi Note 8 Pro");
		d.setCapability("udid", "qkpbztb6z5nrfqcm");
		d.setCapability("platformName", "Android");
		d.setCapability("platformVersion", "11 RPIA.200720.011");
		d.setCapability("appPackage", "com.miui.calculator");
		d.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
		
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		driver=new AppiumDriver(url,d);
		
		System.out.println("Application Started...");  
	}
	

}
