
public class TestArrayStrings
{

	public static void main(String[] args)
	{
		String sentence = "I am studying Java";
		
		//print individual words
		String[] words = sentence.split(" ");
		int len = words.length;
		
		for(int i=0; i<len; i++)
		{
			System.out.println(words[i]);
		}
		
		System.out.println();
		//print same in reverse order
		for (int i=len-1; i>=0; i--)
		{
			System.out.println(words[i]);
		}
		
		StringBuilder sb = new StringBuilder(sentence);
		sb.reverse();
		System.out.println(sb);
	}

}
