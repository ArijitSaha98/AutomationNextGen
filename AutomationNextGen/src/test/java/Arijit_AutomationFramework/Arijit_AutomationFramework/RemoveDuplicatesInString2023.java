package Arijit_AutomationFramework.Arijit_AutomationFramework;

import java.util.HashMap;

public class RemoveDuplicatesInString2023 {
	public static void main(String[] args)
	{
		String s="Arijiit Ssahha bcc haii";
		String low=s.toLowerCase();
		char c[]=low.toCharArray();
		int l=c.length;
		String output="";
		HashMap<Character,Integer> map=new HashMap<>();

		for(int i=0;i<l;i++)
		{
			if(!map.containsKey(c[i]))
			{
				map.put(c[i],i);
				output=output+c[i];
			}
			else
			{
				map.put(c[i],i);
			}
		}



		System.out.println(output);
	}

}
