package Lab8;

public abstract class Shape
{
	private String name;
	private String colour;
	
	//Constructor
	public Shape(String name, String colour)
  	{ 
  		this.name = name; 
  		this.colour = colour; 
  	} 
  	//toString method
  	public String toString()
  	{
  		return ("---\nShape Name = " + this.name + "\nShape colour = " + this.colour);
  	}
  	//Abstract area method
  	public abstract double area();
}