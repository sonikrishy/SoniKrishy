
public class DiffGreets
{	
	public void printGreeting(String greet)
	{
		System.out.println("Greeting is: " + greet);
	}
	
	public static void main(String[] args)
	{
		DiffGreets diffGreets = new DiffGreets();
		diffGreets.printGreeting("Namaste!");
		diffGreets.printGreeting("Hello!");

	}

}
