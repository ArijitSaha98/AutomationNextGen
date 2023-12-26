package Arijit_AutomationFramework.Arijit_AutomationFramework;
import java.util.Scanner;
public class PrimeNumber {

	public static void Naskar(int i)
	{
		if(i==1)
		{
			System.out.println("Naskar");
		}
		else                                                    
		{
			System.out.println("Naskar not gadha");
		}
	}

	public static void Naskar(String s)
	{
		if(s.equals("Naskar"))
		{
			System.out.println("Naskar  String");
		}
		else
		{
			System.out.println("Naskar not gadha");
		}
	}

	public static void main(String[] args)    // int main()
	{
		PrimeNumber n=new PrimeNumber();   //object
		n.Naskar(1);                     //Polymorphism
		n.Naskar("Naskar");
	}
}
