
public class TestExceptions1
{

	public static void main(String[] args)
	{
		int i = 3;
		
		try
		{
			switch(i)
			{
			case 5:
				System.out.println(i/0);
			case 1:
				int[] arr = new int[2];
				System.out.println(arr[4]);
			case 2:
				String str = "Soniya";
				System.out.println(str.charAt(20));
			}
			System.out.println("end of try block");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
