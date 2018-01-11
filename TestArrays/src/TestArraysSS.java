
public class TestArraysSS
{

	public static void main(String[] args)
	{
		int[] arrayInt;
		String[] arrayString;
		int[] arrayInt1 = new int[5];
		String[] arrayString1 = new String[6];
		arrayString1[0] = "Soniya";
		
		String[] family = {"mama", "son", "Soni", "Krishy", "Manvay", "Priyanka", "nani"};
		
		for(int i = 0; i< family.length; i++)
		{
			System.out.println("family member: " + family[i]);
		}
		
		int[] arrayInt2 = {1, 2, 3, 4, 5};
		System.out.println(arrayInt2.length);
	}

}
