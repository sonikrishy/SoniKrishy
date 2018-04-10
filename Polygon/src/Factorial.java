
public class Factorial
{
	int num;
	
	public Factorial(int cNum)
	{
		num = cNum;
	}
	
	public void calcFactorial()
	{
		int product = 1;
		for(int i = num; i > 0; i--)
		{
			product = product * i;
		}
		System.out.println("Factorial of " + num + " is " + product);
	}
	
	public static void main(String[] args)
	{
		Factorial fact = new Factorial(5);
		fact.calcFactorial();
		
		Factorial fact1 = new Factorial(1);
		fact1.calcFactorial();
	}
}
