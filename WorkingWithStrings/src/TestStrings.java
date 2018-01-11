
public class TestStrings
{

	public static void main(String[] args)
	{
		String str = new String("Java");
		//every installation of java comes with package java.lang, classes in it don't need import
		//String is so popular we don't need to use constructor
		
		String str2 = "I am studying Java";
		
		// number of chars in string, have method length() for same, first char has index 0, last has length() -1
		//charAt(index) - char at that position
		//indexOf('char')
		//extract substring - substring(index1, index2) - index1 - position of first char, index2 - last but one char
		
		String sub = str2.substring(2, 4);
		System.out.println("substring example: " + sub);
		
		//palindrome
		String palindrome = "Madam Im Adam";
		//print it backwards
		int len = palindrome.length();
		
		System.out.println("length is: " + len);
		
		System.out.println("length is: " + palindrome.length());
		
		for(int i=len-1; i>= 0; i--) 
		{
			System.out.print(palindrome.charAt(i));
		}
		
		//create  a string with ur name- first, last, then print ur initials
		String name = "Soniya Krishna";
		int space = name.indexOf(' ');
		char firstChar = name.charAt(0);
		System.out.println();
		System.out.println("first initial: " + firstChar);
		char secondChar = name.charAt(space + 1);
		System.out.println("second initail: " + secondChar);
		System.out.println("Initails are: " + firstChar + secondChar);
		System.out.println(firstChar + secondChar); //this + is not concatenation operator, it gives addition of ASCII code of each char
		System.out.println("" + firstChar + secondChar); 
	}

}
