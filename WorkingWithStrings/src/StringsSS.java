
public class StringsSS
{

	public static void main(String[] args)
	{
		String str = "I worship God!";
		
		String[] words = str.split(" ");
		
		for(int i = 0; i< words.length; i++)
		{
			System.out.println(words[i]);
		}
		
		for(int i = words.length - 1; i >= 0; i--)
		{
			System.out.println(words[i]);
		}
		
		System.out.println("str is " + str.length() + " chars long");
		
		System.out.println("str's 2nd word is " + str.substring(2, 9));
		
		int space1 = str.indexOf("");
		
		int j;
		j = str.length();
		
		for(int i = 0; i< str.length(); i++)
		{
			System.out.print(str.charAt(j - 1));
			j--;
		}
		
		String name = "Soniya Krish";
		char firstI = name.charAt(0);
		char secondI = name.charAt(name.indexOf(" ") + 1);
		System.out.println();
		System.out.println("Initails r "+ firstI + secondI);
		
		System.out.println("char at 5 " + name.charAt(5));
		
		System.out.println("index of K " + name.indexOf("K"));
		
	}

}
