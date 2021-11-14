package Lab5;

public class Circle extends Point {
	//instance variables
	private double radius;
	
	//Constructors
	public Circle ()
	{
		setRadius(0.0);
	}
	public Circle(double radius, int x, int y)
	{
		super(x, y);
		this.radius = radius;
	}
	//Getters and setters
	public double getRadius() 
	{
		return radius;
	}
	public void setRadius(double radius) 
	{
		this.radius = radius;
	}
	//toString method
	public String toString() 
	{
		return super.toString() + "Circle [radius=" + radius + "]";
	}
	
	
}

