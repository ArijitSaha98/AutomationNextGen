package Arijit_AutomationFramework.Arijit_AutomationFramework;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization{
	
	@Parameters({"Checking"})
	@Test(invocationCount = 5,groups= {"Regression"},priority = 0,enabled=true)

	public void test(String Checking)
	{
		System.out.println(Checking);
		System.out.println(Thread.activeCount());
	}
	
	
	@Test(groups= {"Functional"},priority=1,enabled=true)
	public void Test2()
	{
		System.out.println("**Successful**");
		System.out.println(Thread.activeCount());
	}
	

}
