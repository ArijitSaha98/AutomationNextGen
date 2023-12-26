package Interview_Questions_2023;

public class StaticExplanation2023 {
	
	static int a=5;

	public static void main(String args[])
	{
		StaticExplanation2023 x=new StaticExplanation2023();
		x.methodA();
		x.methodB();
	}

	public void methodA()
	{
		a=6;
		System.out.println("First : "+a);
	}

	public void methodB()
	{
		System.out.print("Second : "+a);
	}
}
