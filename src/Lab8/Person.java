package Lab8;

public abstract class Person 
{	
	String name;
	
	//Constructor
	public Person(String name) 
	{
		this.name = name;
	}
	//Two abstract methods
	public abstract String getName();
	
	public abstract String getDescription();
}