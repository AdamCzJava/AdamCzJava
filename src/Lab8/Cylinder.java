package Lab8;

public class Cylinder extends ThreeDShape
{	
	private double radius;
	private double height;
	
	//Constructor
	public Cylinder(String name, String color, double radius, double height)
	{
		super(name, color);
		this.radius = radius;
		this.height = height;
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
	public double getHeight() 
	{
		return height;
	}
	public void setHeight(double height) 
	{
		this.height = height;
	}
	//toString method
	public String toString() 
	{
		return super.toString() + "\nRadius = " + radius + "\nHeight = " + height;
	}
	//Area method 
	public double area()
  	{
  		return ((2*Math.PI) * radius * height) + (2*Math.PI) * Math.pow(radius,2);
  	}
	//Volume method 
	public double volume()
  	{
  		return (height * Math.PI * Math.pow(radius,2));
  	}

}
