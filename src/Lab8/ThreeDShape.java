package Lab8;

public abstract class ThreeDShape extends Shape
{
	//Constructor
	public ThreeDShape(String name, String colour)
  	{ 
  		super(name, colour); 
  	}
	//Abstract volume method
  	public abstract double volume();
  	//toString method
  	public String toString()
  	{
  		return (super.toString());
  	}
}
