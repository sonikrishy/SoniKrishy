
public class TestPoint
{

	public static void main(String[] args)
	{
		// main method to execute/run class
		// object is an instance of a class
		// we create objects using constructors
		
		Point p = new Point(3, 4); 
		//new operator, to create object of class
		double distance = p.distanceFromOrigin();
		System.out.println("Distance from origin is " + distance);
		
		Point p2 = new Point();
		
	}

}
