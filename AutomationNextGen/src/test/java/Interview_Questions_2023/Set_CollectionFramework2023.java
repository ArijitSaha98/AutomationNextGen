package Interview_Questions_2023;

import java.util.HashSet;
import java.util.Set;

public class Set_CollectionFramework2023 {

	public static void main(String[] args)
	{
		String s="aaaabbbbccccddddefg";
		char a[]=s.toCharArray();
		int charlen=a.length;

		Set<Character> set=new HashSet<>();
		String output="";
		String duplicates="";
		int count=0;

		for(int i=0;i<charlen;i++)
		{
			if(set.add(a[i]))
			{
				output=output+a[i];
			}
			else
			{
				duplicates=duplicates+a[i];
				count++;
			}
		}
		System.out.println(set);
		System.out.println(output);
		System.out.println(duplicates+" "+count);
	}
}
