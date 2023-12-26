package Interview_Questions_2023;

import java.util.ArrayList;
import java.util.List;

public class List_ColletionFramework2023 {

	public static void main(String[] args)
	{
		String s="aaaabbbbccccddddefg";
		String slow=s.toLowerCase();
		char c[]=s.toCharArray();
		int charlen=c.length;

		List<Character> l=new ArrayList<>();
		String output="";
		String duplicates="";
		int count=0;

		for(int i=0;i<charlen;i++)
		{
			String letter=Character.toString(c[i]);
			if(!l.contains(c[i]))
			{
				l.add(c[i]);
				output=output+c[i];
			}
			else if(!duplicates.contains(letter))
			{
				duplicates=duplicates+c[i];
				count++;	
			}
		}
		System.out.println(output);
		System.out.println(l);
		System.out.println(count);
		System.out.println(duplicates);
	}
}
