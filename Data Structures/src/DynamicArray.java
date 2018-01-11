import java.util.ArrayList;

public class DynamicArray
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList(); //dynamic array - expand/shrink, can place only objects, not primitives.
										// for primitives, there is java class INTEGER, 
										// for double, there is DOUBLE, for long, LONG 
		boolean size = al.isEmpty();
		
		String one = "One";
		String two = "Two";
		
		al.add(one);
		al.add(two);
		String three = "Three";
		al.add(three);
		al.add("Four");
		
		int alSize = al.size();
		
		al.add("Five"); // array is ordered collection of elements
		al.add(1); // by ss
		al.add(2.5); // by ss
		
		if (al.contains(three))
		{
			int index = al.indexOf(two);
			System.out.println("Index of two is: " + index);
		}
		al.remove(0);
		
		// print all items of array list
		
		//for (int i = 0; i< alSize; i++)
		ArrayList<String> as = new ArrayList<String>(); //only Strings in ArrayList
		String on = "One";
		String tw = "Two";
		
		as.add(on);
		as.add(tw);
		String thre = "Three";
		as.add(thre);
		as.add("Four");
		
		String a = as.get(1);
		System.out.println(a);		
	}
}
