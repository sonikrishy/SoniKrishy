
public class Bicycle 
{

	double speed; // "this" keyword - refers to instance variables. they r not static, hence not class variables
	String color; // "this"
	// public -> protected -> default -> private
	//above r default variables

	public Bicycle(double mph, String color)
	{
	speed = mph;
	this.color = color;
	//constructor function same as class name returns object of class, no return type
	}
	
	public void accelerate(double miles)
	{
	System.out.println("initial speed = " + speed);	
	speed = speed + miles;	//speed += miles;
	System.out.println("new speed = " + speed);
	}

	public void stop()
	{
		speed = 0;
		System.out.println("speed when bike is stopped is " + speed);

	}
	public static void main(String[] args)
	{
		Bicycle bike = new Bicycle(5, "blue");
		bike.accelerate(3);
		bike.stop();
	}	
}


