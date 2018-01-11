
public class Dog extends Animal
{
private String name;
private String breed;

//call constructor for dog
public Dog(String aType, String aName, String aBreed)
{
	
//first create Animal
	super(); 
	//this is default constructor for Animal, optional
	
	setType(aType);
	name = aName;
	breed = aBreed;
}

public void bark()
{
	System.out.println("whoof");
}
}
