
public class KBike
{
	double speed;
	String color;
	
	public void stopBike()
	{
		speed = 0;
	}
	
	public void accelarateBike(double incrementSpeedBy)
	{
		speed = speed + incrementSpeedBy;
		System.out.println("speed inside accelarateBike: " + speed);
	}
}
