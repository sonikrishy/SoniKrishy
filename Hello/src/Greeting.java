
public class Greeting
{
	
	public void display(String greet)
	{
		System.out.println("Greeting in display " + greet);
	}
	
public static void main(String[] args)
{
	//1 eg.
	String greeting1 = "Hi";
	System.out.println("Greeting first " + greeting1);
	
	//2nd eg.
	Greeting greet2 = new Greeting();
	greet2.display("Bye Bye");
	greet2.display("Namaste");	
}
}
