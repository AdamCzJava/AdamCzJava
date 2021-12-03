package Lab8;

public class Triangle extends TwoDShape
{
	private double base;
	private double height;
	
	//Constructor
	public Triangle(String name, String color, double base, double height)
	{
		super(name, color);
		this.base = base;
		this.height = height;
	}
	//Getters and setters
	public double getBase() 
	{
		return base;
	}
	public void setBase(double base) 
	{
		this.base = base;
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
		return super.toString() + "\nBase = " + base + "\nHeight = " + height;
	}
	//Area method 
	public double area()
  	{
  		return (.5 * base * height);
  	}
}
