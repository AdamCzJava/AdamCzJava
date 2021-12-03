package Lab8;

public class Student extends Person
{	
	String course;
	
	//Constructor
	public Student(String name, String course )
	{
		super(name);
		this.course = course;
	}
	//Getters and setters
	public String getName()
	{
		return this.name;
	}
	public String getCourse()
	{
		return course;
	}
	public void setCourse(String course) 
	{
		this.course = course;
	}
	//Get description method
	public String getDescription()
	{
		return "A student studying: " + course;
	}
}
