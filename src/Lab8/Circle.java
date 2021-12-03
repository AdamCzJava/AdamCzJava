package Lab8;

public class Circle extends TwoDShape
{	
	
	private double radius;
	
	//Constructor
	public Circle(String name, String color, double radius)
	{
		super(name, color);
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
		return super.toString() + "\nRadius = " + radius;
	}
	//Area method 
	public double area()
  	{
  		return Math.PI * Math.pow(radius,2);
  	}

	
}
