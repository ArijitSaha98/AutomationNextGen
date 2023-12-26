package Arijit_AutomationFramework.Arijit_AutomationFramework;

public class MethodOverloading {
	
	void test(int x,int y)
	{

		System.out.println("TEST A");
	}
	
	void test(int y)
	{
		System.out.println("TEST B");
	}
	
	public static void main(String[] args)
	{
		MethodOverloading m=new MethodOverloading();
		m.test(5);
		m.test(2, 3);
	}

}
