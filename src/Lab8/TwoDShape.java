package Lab8;

public abstract class TwoDShape extends Shape
{
	//Constructor
	public TwoDShape(String name, String colour)
  	{ 
  		super(name, colour); 
  	}
	//Abstract area method
  	public abstract double area();
  	//toString method
  	public String toString()
  	{
  		return (super.toString());
  	}
}
