
public class Point
{
	private double x; //visible only within class
	private double y;
	
	public double distanceFromOrigin()
	{
		return Math.sqrt(x*x + y*y); //by default all class methods have access to all class variables
	}	
	
	// we need to specify x and y too	
	
	public Point(double a, double b) //constructor, same name as class, no return type
		{
			x = a;
			y = b;
		}
	
	//created a class, need to use it
	
	//each class can have as many constructors as we like
	//default constructor
	public Point()
	{
	x=0; //can be x= -1 or anything
	y=0;
	}
}
