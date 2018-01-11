import java.util.HashMap;
import java.util.Set;

public class Unique
{

	public static void main(String[] args)
	{
		String[] names = {"Soniya", "Krish", "Krish", "Manvay", "Priyanka", "Manvay"};
		//verify if array contains duplicates, print if has or not, how many dupes
		//use property of hashmap that it has unique keys
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		for (String name: names)
			hm.put(name, 1); //will ignore duplicate keys/names
		
		if (hm.size() == names.length)
			System.out.println("there r no duplicates");
		else
			System.out.println("array has duplicates");
		
		//find dupes, nd how many - put in key-value/ name - num of times
		
		for (String name: names)
		{
			if (hm.containsKey(name))
			hm.put(name, hm.get(name) + 1); //just increments value of key, doesn't add key
			else
				hm.put(name, 1);
		}
		
		Set<String> keys = hm.keySet();
		for (String key: keys)
			System.out.println("Key: " + key + " Count: " + hm.get(key));	
	}
}
