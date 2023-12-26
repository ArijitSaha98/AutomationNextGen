package Arijit_AutomationFramework.Arijit_AutomationFramework;

public class MethodOverridingBaseClass extends MethodOverriding {

	void test(int x)
	{
		System.out.println("TEST B");
		
	}
	
	public static void main(String[] args)
	{
		MethodOverridingBaseClass m=new MethodOverridingBaseClass();
		m.test(20);
	}
}
