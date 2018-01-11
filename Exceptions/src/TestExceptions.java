
public class TestExceptions
{
	public static void main(String[] args)
	{
		int i = 1; // try with 2, 3, 4
		int j = 0;
		try
		{
			switch(i)
			{
			case 1:
				System.out.println(i/j);//don't need 'break' here, coz its exception, it breaks on its own
			case 2:
				int[] arr = new int[2]; //new creates array object, only this mm allocated, trying to get 10th element
				i = arr[9];
			case 3:
				String str = "abc";
				char ch = str.charAt(99);
				}
			System.out.println("End of try block.");
		}
		
		catch(Exception e)
		{
			System.out.println(e); 
			//every object has method toString(), by default it is called, converts Exception object to string nd prints it
		}
	}
}
