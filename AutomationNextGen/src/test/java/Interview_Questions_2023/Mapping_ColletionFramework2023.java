package Interview_Questions_2023;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Mapping_ColletionFramework2023 {

	public static void main(String[] args)
	{
		String s="AaaAbbbbCccDdddefg";
		String slow=s.toLowerCase();

		Set<Character> set=new HashSet<>();
		int count=0,i=0;
		String output="";

		for(i=0;i<slow.length();i++)
		{

			if(!set.add(slow.charAt(i)) && !output.contains(Character.toString(slow.charAt(i))))
			{
				output=output+slow.charAt(i);	
			}
			else
			{
				set.add(slow.charAt(i));
			}
		}
		System.err.println("Implementation using Set And HashSet");
		System.out.println(set+" "+output+"\n");

		count=0;
		output="";

		char c[]=slow.toCharArray();
		Map<Character,Integer> m=new HashMap<>();

		for(i=0;i<slow.length();i++)
		{
			if(!m.containsKey(c[i]))
			{
				output=c[i]+output;
				m.put(c[i], i);
			}
		}
		System.out.println(m.keySet()+" "+output);
	}
}
