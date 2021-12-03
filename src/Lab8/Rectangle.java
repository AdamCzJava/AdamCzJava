package Lab8;

public class Rectangle extends TwoDShape
{	
	private double length;
	private double breadth;
	
	//Constructor
	public Rectangle(String name, String colour, double length, double breadth)
	{
		super(name, colour);
		this.length = length;
		this.breadth = breadth;
	}
	//Getters and setters
	public double getLength() 
	{
		return length;
	}
	public void setLength(double length) 
	{
		this.length = length;
	}
	public double getbreadth() 
	{
		return breadth;
	}
	public void setbreadth(double breadth) 
	{
		this.breadth = breadth;
	}
	//toString method
	public String toString() 
	{
		return super.toString() + "\nLength = " + length + "\nBreadth = " + breadth;
	}
	//Area method 
	public double area()
  	{
  		return length * breadth;
  	}

  	
}
