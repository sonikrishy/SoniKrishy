
public class KKBike
{
	double speed;
	String color;
	
	public KKBike(double mph, String hue)
	{
		speed = mph;
		color = hue; 
	}
	
	public double stopBike()
	{
		speed = 0;
		System.out.println("speed is " + speed);
		return speed;
	}
	
	public double accelarateBike(double incrSpeed)
	{
		speed = speed + incrSpeed;
		System.out.println("speed is " + speed);
		return speed;
	}
	
	public static void main(String[] args)
	{
		KKBike bike = new KKBike(2.5, "red");
		bike.stopBike();
		
		bike.accelarateBike(7.8);
	}

}
