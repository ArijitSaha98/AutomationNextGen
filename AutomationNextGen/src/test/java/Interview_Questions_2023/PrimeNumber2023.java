package Interview_Questions_2023;

import java.util.Scanner;

public class PrimeNumber2023 {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int a=s.nextInt();
		int i=0,j=0;
		
		for(i=2;i<a;i++)
		{
			if(a%i==0)
			{
				break;
			}
		}
		if(i==a)
		{
			System.out.println("Prime Number");		
		}
		else
			System.out.println("Not Prime Number");		
			
		
		/*
		int i=0,j=0;
		for(i=2;i<=100;i++)
		{
			for(j=2;j<i;j++) 
			{ 
				if(i%j==0)
				{
					break;
				}
			}
			if(j==i)
			{
				System.out.println(i);
			}
		}*/
	}

}
