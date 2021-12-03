package Lab8;

public class Employee extends Person
{	
	double salary;
	
	//Constructor
	public Employee(String name, double salary )
	{
		super(name);
		this.salary = salary;
	}
	//Getters and setters
	public String getName()
	{
		return this.name;
	}
	public double getSalary() 
	{
		return salary;
	}
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	//Get Description method
	public String getDescription()
	{
		return "An employee with a salary of: " + salary;
	}
}
