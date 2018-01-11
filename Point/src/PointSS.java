// practice code by SS

public class PointSS
{
	double x;
	double y;
	
	public PointSS(double d, double e)
	{
		x = d;
		y = e;
	}

	public PointSS()
	{
		
	}
	
	/*public void distanceFromOrigin(double a, double b)
	{
		double distance = Math.sqrt(a*a + b*b);
		System.out.println("Distance from origin is " + distance);
	}*/
	
	public void distanceFromOrigin()
	{
		double distance = Math.sqrt(x*x + y*y);
		System.out.println("Distance from origin is " + distance);
	}
	public static void main(String[] args)
	{
		PointSS point = new PointSS();
		//point.distanceFromOrigin(3, 5);
		
		PointSS point1 = new PointSS(3.0, 4.0);
		point1.distanceFromOrigin();
		
	}

}
