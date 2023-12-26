package Arijit_AutomationFramework.Arijit_AutomationFramework;

public class SplitString2023 {
	
	public static void main(String[] args)
	{
		String s="ARI@JI@T@S";
		String[] r=s.split("@",4);
		
		for(int i=0;i<r.length;i++)
		System.out.println(r[i]);	
		}

}
