
public class Bike1
{
String color = "blue";
int ispeed = 5;

public void accelarate(int speedPlus)
{
ispeed = ispeed + speedPlus;
System.out.println("new speed is " + ispeed);
}

public void stop()
{
ispeed = 0;
System.out.println("Bike has stopped, speed is " + ispeed);
}

public static void main(String[] args)
{
	Bike1 bike = new Bike1();
	bike.accelarate(5);
	bike.stop();	
}
}
