package Arijit_AutomationFramework.Arijit_AutomationFramework;

public class ReverseString2023 {
	public static void main(String[] args) {
		String s="My Name is Arijit Saha Raha Na gaya human race";
		String a[]=s.split(" ",11);
		int j=0;
		for(int i=0;i<a.length;i=i+2)
		{
			String b=a[i];
			/*
			 * char[] c=b.toCharArray();
			 * 
			 * for(j=c.length-1;j>=0;j--) { System.out .print(c[j]); }
			 */
			String temp="";
			char d;
			for(j=0;j<b.length();j++)
			{
				d=b.charAt(j);
				temp=d+temp;
			}
			if(i==a.length-1)
			{
				break;
			}
			System.out .println(temp);        
		}

		/*
		 * public static void main(String args[]) { String s="TEST";
		 * 
		 * char[] c=s.toCharArray();
		 * 
		 * for(int i=c.length-1;i>=0;i--) { System.out.print(c[i]); } }
		 */
	}

}