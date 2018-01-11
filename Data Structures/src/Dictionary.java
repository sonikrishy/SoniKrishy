import java.util.HashMap; //package java.util has all data structures
import java.util.Set;

public class Dictionary
{
	public static void main(String[] args)
	{
		//HashMap hm = new HashMap(); //can declare this way too
		
		HashMap<String, Integer> hm = new HashMap(); // "Integer" is wrapper for primitive integer
		hm.put("apple", 1);
		hm.put("peach", 2);
		hm.put("orange", 3);
		
		//get all keys - another data str - Set - unordered collection
		
		Set<String> keys = hm.keySet(); //method that returns all keys
		//how to extract from set
		
		// for each - doesn't require to specify num of iterations
		for (String key: keys)
			System.out.println(key);
		
		//check if a key exists or not
		if (hm.containsKey("cake"))
			System.out.println(hm.get("cake")); //get allows to extract value based on key
		else
			System.out.println(hm.get("peach"));	
	}
}
