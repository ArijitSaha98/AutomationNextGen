package Interview_Questions_2023;

public class StringReverse {

	public static void main(String[] args)
	{
		String para="My name is Arijit";

		String s[]=para.split(" ",5);
		int i=0,j=0,k=0;

		for(i=1;i<s.length;i=i+2)
		{
			String word=s[i];
			String temp="";
			char a;
			
			for(j=0;j<word.length();j++)
			{
				a=word.charAt(j);
				temp=a+temp;
			}
			
			System.out.print(s[i-1]+" "+temp+" ");
			
		}


	}

}
