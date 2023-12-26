package Interview_Questions_2023;
public class Factorial_Recursion_2023 {
	public static void main(String[] args)
	{

		int input=5, output=0;
		
		Factorial_Recursion_2023 f=new Factorial_Recursion_2023();
		
		output=f.factorial(input);		
		System.out.println(output);

		/*
		 * // Normal Reccursion int number=5,i=0,output=1; for (i=1;i<=number;i++) {
		 * output=output*i; } System.out.println(output);
		 */
	}
	static int output=1;
	public static int factorial(int input)
	{
		
		if(input>1)
		{
			output=output*input;
			factorial(input-1);
		}
		return output;
	}
}


