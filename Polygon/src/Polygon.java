
public class Polygon
{
	double side1;
	double side2; 
	String shape;

	public Polygon(double dim1, double dim2, String cShape)
	{
		side1 = dim1;
		side2 = dim2;
		shape = cShape;
	}
	
	public void areaShape()
	{
		double area;
		
		switch(shape)
		{
		case "Square":
			area = side1 * side2;
			System.out.println("Area of " + shape + " is " + area);
			break;
			
		case "Rectangle":
			area = side1 * side2;
			System.out.println("Area of " + shape + " is " + area);
			break;
			
		case "Triangle":
			area = .5 * side1 * side2;
			System.out.println("Area of " + shape + " is " + area);
			break;
			
		case "Circle":
			area = Math.floor(3.14 * side1 * side2 * 100)/100;
			System.out.println("Area of " + shape + " is " + area);
			break;
		}
	}
	
	public static void main(String[] args)
	{
		Polygon poly = new Polygon(2, 4, "Rectangle");
		poly.areaShape();

		Polygon poly1 = new Polygon(4, 4, "Square");
		poly1.areaShape();

		Polygon poly2 = new Polygon(3, 3, "Circle");
		poly2.areaShape();

		
		Polygon poly3 = new Polygon(5, 10, "Triangle");
		poly3.areaShape();
	}

}
