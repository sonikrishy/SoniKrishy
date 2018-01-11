
public class SumDigits
{

	public static void main(String[] args)
	{
		//find sum of digits of number
		int num = 3911;
		int sum = 0;
		
		while(num != 0)
		{
			sum += (num % 10);
			num /= 10;
		}
		System.out.println(sum);
	}
}
