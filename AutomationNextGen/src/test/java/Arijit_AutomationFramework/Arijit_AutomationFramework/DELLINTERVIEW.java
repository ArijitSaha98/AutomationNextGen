package Arijit_AutomationFramework.Arijit_AutomationFramework;

import java.util.Scanner;

public class DELLINTERVIEW {
	public static void main(String[] args)

	{
		int n=10;
		int a[]=new int[n];
		int i=0,sum=0,j=0;
		int summation=0,pair=0;
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the sum:");
		sum=sc.nextInt();sc.nextLine();

		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();sc.nextLine();
		}

		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				summation=a[i]+a[(i+j)-i];
				if(sum==summation)
				{
                  pair++;
                  System.out.println("FLAG RAISED\n"+a[i]+"+"+a[i+j]+"\n");
                  
				}
			}
		}
		//Logic:







		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}









		//   Scanner sc=new Scanner(System.in);
		//   int n=sc.nextInt();
		//   int count1 = 0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0;
		//   int s=0;
		//   int x=n;
		//   int j=0;
		//   while(x!=0)
		//   {
		//	j=x%10;
		//	System.out.println(j);
		//	//s=s*10+x;     
		//	//if()
		//	
		//	if(j==1)
		//	{
		//		count1++;
		//	}
		//	else if(j==2)
		//	{
		//		count2++;
		//	}
		//	else if(j==3)
		//	{
		//		count3++;
		//	}
		//	else if(j==4)
		//	{
		//		count4++;
		//	}
		//	else if(j==5)
		//	{
		//		count5++;
		//	}
		//	else if(j==6)
		//	{
		//		count6++;
		//	}
		//	else if(j==7)
		//	{
		//		count7++;
		//	}
		//	else if(j==8)
		//	{
		//		count8++;
		//	}
		//	else if(j==9)
		//	{
		//		count9++;
		//	}
		//	
		//	x=x/10;
		//	
		//   }
		//   
		//   System.out.println("count1"+count1);
		//   System.out.println("count2"+count2);
		//   System.out.println("count3"+count3);
		//   System.out.println("count4"+count4);
		//   System.out.println("count5"+count5);
		//   System.out.println("count6"+count6);
		//   System.out.println("count7"+count7);
		//   System.out.println("count8"+count8);
		//   System.out.println("count9"+count9);
		//   
		//   


	}
}
