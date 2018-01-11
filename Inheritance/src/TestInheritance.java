
public class TestInheritance
{

	public static void main(String[] args)
	{
		Animal a = new Animal(); //default constructor
		a.setType("animal");
		System.out.println(a.getType());
		
		Dog d = new Dog("dog", "Tuzik", "Chihuahua");
		String type = d.getType();
		System.out.println(type);
		
		Animal dog = new Dog("dog", "Max", "Shephard");
		dog.getType();
		//dog.bark(); //bark is not available; it is Animal type, so Dog's methods r not available.
		
		/*Cat c = new Cat("Siamese");
		String typeC = c.getType();
		 System.out.println(typeC);
		*/
		Cat c = new Cat();
		c.setType("Siamese");
		String typeC = c.getType();
		 System.out.println(typeC);
		c.meow();
		
	}
}
