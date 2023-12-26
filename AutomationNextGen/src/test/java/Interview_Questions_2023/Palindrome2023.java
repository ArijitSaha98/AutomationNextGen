package Interview_Questions_2023;

public class Palindrome2023 {

	public static void main(String[] args)
	{
		
		String s="1234321";
		int len=s.length(); // len=5
		int i=0;

		for(i=0;i<len/2;i++) //i<2
		{
			if(s.charAt(i)!=s.charAt(len-1-i))
			{
				break;
			}
		}
		if(i==len/2)
			System.out.println("Palindrome");
		else
			System.out.println("Not A Palindrome");

	}

}
