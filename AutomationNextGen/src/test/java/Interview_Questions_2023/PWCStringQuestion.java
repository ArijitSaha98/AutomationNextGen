package Interview_Questions_2023;

import java.util.HashMap;
import java.util.Map;

public class PWCStringQuestion {

	public static void main(String[] args)
	{
		String s= "Automationaa"; 
		String slow=s.toLowerCase();
		char c[]=slow.toCharArray();

		Map<Character,Integer> map=new HashMap<>();


		for(int i=0;i<c.length;i++)
		{
			if(map.containsKey(c[i]))
			{
				int index=map.get(c[i]);
				map.replace(c[i],index+1);
			}
			else
			{
				map.put(c[i],1);
			}
		}
		System.out.println(map);

		int a[]=new int[26];


		for(int i=0;i<c.length;i++)
		{
			int index=c[i]-97;
			int value=a[index];

			a[index]=value+1;

			//System.out.println(index);			
			/*
			 * if(map.containsKey(c[i])) { int index=map.get(c[i]);
			 * map.replace(c[i],index+1); } else { map.put(c[i],1); }
			 */		

		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				System.out.println(a[i]);
			}
		}
	}
}
