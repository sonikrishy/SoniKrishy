import java.util.Arrays;

public class TestArrays
{

	public static void main(String[] args)
	{
		int[] arry1; //arr1 is reference variable for array of integers 
		String[] arr2;
		int arr3[]; String arr4[];
		int[] arrInt = new int[10]; //allocated space for 10 integers
		
		String[] arrStr = new String[5]; //arrStr is reference variable that points to 5 reference variables that point to objects
		arrStr[0] = new String("Krish"); //it is ref var to string object "Krish"
		arrStr[1] = "Soniya"; //no need for "new", can use this way too
		
		for(int i=0; i<arrStr.length; i++)
		{
			System.out.println(arrStr[i]);
		}
		
		String[] family = {"mama", "son"};

		//how to compare arrays		
	String[] books = {"War and Peace", "Farewell to Arms", "Hamlet"};
	
	String[] books2 = {"War and Peace", "Farewell to Arms", "Hamlet"};
	
	if (books == books2)
		System.out.println("== : Arrays r equal");
	else
		System.out.println("== : Arrays r not equal");
	
	//why not equal? they point to 2 different reference variables in heap
	//we need to compare their elements/values, special class Arrays
	
	if (Arrays.equals(books, books2))
		System.out.println("equals : Arrays r equal");
	else
		System.out.println("equals : Arrays r not equal");

	}
}
