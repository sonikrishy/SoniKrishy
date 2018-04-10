
public class swapValues
{

	public static void main(String[] args)
	{
		//a = 5, b = 8, swap values of variables w/o introducing another variable
		int a = 5;
		int b = 8;
		
		b = b - a; // 3 b -= a
		a = a + b; // 8 a += b
		b = a - b; 

		System.out.println("a = " + a);
		System.out.println("b = " + b);				
	}
}
