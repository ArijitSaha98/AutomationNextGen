package Interview_Questions_2023;
import java.util.HashMap;

public class CountOfDuplicateCharacters { 
	public static void main(String[] args)
	{
		String input = "aaabbbcccdddeeefgh";
		char c[]=input.toCharArray();
		int len=c.length;
		String Output="";
		String Duplicate="";
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<len;i++)
		{
			String letters=Character.toString(c[i]);

			if(!map.containsKey(c[i]))
			{
				map.put(c[i],i);
				Output=Output+c[i];
			}
			else if(!Duplicate.contains(letters))
			{
				Duplicate=Duplicate+c[i];
			}
		}
		System.out.println("After Duplicate Characters Removed from the String : "+Output);
		System.out.println("Duplicate Characters Present In The String :"+Duplicate);
	}
}
