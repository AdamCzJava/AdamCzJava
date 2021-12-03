package Lab8;

public class Sphere extends ThreeDShape
{	
	private double radius;
	
	//Constructor
	public Sphere(String name, String color, double radius)
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
  		return (4*Math.PI) * Math.pow(radius,2);
  	}
	//Volume method 
	public double volume()
  	{
  		return ((4*Math.PI * Math.pow(radius, 3))) / 3;
  	}

	
}
