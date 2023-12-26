package Interview_Questions_2023;

public class ReverseANumber2023 {

	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5};
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
		
		/*
		 * int a= 123456; int temp=0; int b=0; while (a!=0) { b=a%10; temp=temp*10+b;
		 * a=a/10; }
		 * 
		 * System.out.println(temp);
		 */
	}
}
