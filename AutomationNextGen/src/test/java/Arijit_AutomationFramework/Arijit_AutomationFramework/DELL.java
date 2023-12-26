package Arijit_AutomationFramework.Arijit_AutomationFramework;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DELL {

	//static String url="https://www.google.com/";
	static String url="https://www.zapak.com";
	static WebDriver driver=null;

	public static void main(String[] args) throws MalformedURLException, IOException
	{
		DELL d=new DELL();

		System.setProperty("webdriver.chrome.driver", "D:\\__\\Workspace\\Selenium\\Arijit_AutomationFramework\\Servers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);

		driver.manage().window().maximize();
		d.getIPAddress();
		getbrokenlinks();
		

	}

	public static void getIPAddress()
	{
		try {
			InetAddress ip=InetAddress.getByName(new URL(url).getHost());
			System.out.println("IP ADDRESS OF THE URL : |"+ip+"|");				
		}
		catch(Exception e){
			e.printStackTrace();
		}		
	}

	public static void getbrokenlinks() throws MalformedURLException, IOException
	{
		int respcode=0;
		String att=null;
		List<WebElement> l=driver.findElements(By.tagName("a"));
		int length=l.size();
		System.out.println("***"+length+" Links present in the page.***");
		HttpURLConnection huc=null;
		for(int i=1;i<=length;i++)
		{
			WebElement elem=driver.findElement(By.xpath("(//a)"+"["+i+"]"));
			att=elem.getAttribute("href");
			System.out.println(i+". |"+att+"|");

			if(att==null)
			{
				System.out.println("Skipping"+"\n");	 
			}
			else if(att.startsWith("https"))
			{

				huc=(HttpURLConnection)(new URL(att).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				respcode=huc.getResponseCode();
				//System.out.println("Response Code : "+respcode);	

				if(respcode>=400)
				{
					System.err.println("Response Code : "+respcode);	
					System.err.println("Its not a Valid Link"+"\n");
				}
				else
				{
					System.out.println("Response Code : "+respcode);	
					System.out.println("Its a valid link"+"\n");

				}
			}
			else
			{
				System.out.println("Skipping"+"\n");	
			}
		}

	}


}
