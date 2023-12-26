package Arijit_AutomationFramework.Arijit_AutomationFramework;

public class Test {

	public static void main(String[] args)
	{
//		int[] s={2,3,4,5,4,2,3,7};   //{2,3,4,5,7}
//		int l=s.length;
//		
//		int [] n=new int[l];
//		int i=0,j=0;
//		
//
//		int temp=0;
//		
//		for(i=0;i<l;i++)
//		{
//			for(j=0;j<l-1;j++)
//			{
//				if(s[i]==0)
//				{
//					continue;
//				}
//				else
//				{
//				if(s[i]==s[j+1])		
//				{
//                           //System.out.println("Duplicate Elements Found");    
//                           //System.out.println(s[j+1]);
//                          
//					       n[i]=s[i];
//					       s[j+1]=0;
//					       //Logic for removing the duplicaing element
//						}
//				
//				else
//				{
//					 n[i]=s[i];
//				}
//			
//				}
//			}
//		}
//		
//		for(i=0;i<l;i++)
//		{
//		System.out.println(n[i]);
//		}


		String s1="nice";
		String s2="iien";
		
		int l1=0,l2=0;
		int i=0,j=0;
		l1=s1.length();
		l2=s2.length();
		int count=0;
		//System.out.println(l1+"\n"+l2);
		if(l1==l2)
		{
			for(i=0;i<l1;i++)
			{
				String temp1=String.valueOf(s1.charAt(i));
				for(j=0;j<l1;j++)
				{
				String temp2=String.valueOf(s2.charAt(j));
				if(temp1.equalsIgnoreCase(temp2))
				{
					count++;
					//System.out.println(temp1);
				}
				
				}
			}
		}
		
		if(count==l1)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
				
		}
		

	}
}
