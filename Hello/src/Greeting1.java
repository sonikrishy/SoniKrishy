
public class Greeting1
{
	String name;
	int count;
	
	public void DisplayGreet()
	{
		for(int i = 0; i < count; i++)
		{
		System.out.println("Hello " + name);
		}
	}
	
	public Greeting1(String cName, int cCount)
	{
		name = cName;
		count = cCount;
	}
	
	/*public static void main(String[] args)
	{
		Greeting1 greet = new Greeting1("Soniya");
		greet.DisplayGreet();
	}*/
}

