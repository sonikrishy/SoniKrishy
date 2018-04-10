
public class TestKBike
{

	public static void main(String[] args)
	{
		KBike b = new KBike();
		
		b.speed = 5.50;
		b.color = "Blue";
		
		System.out.println("Bike's initail speed is: " + b.speed);
		
		//b.stopBike();
		
		//System.out.println("Bike's speed when stopped: " + b.speed);
		
		b.accelarateBike(3.5);
		
		System.out.println("Bike's accelarated speed is: " + b.speed);
	}
}
