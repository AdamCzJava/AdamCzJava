package Lab8;

public class TestPerson 
{
	public static void main(String[] args) 
	{	
		//Array of Person objects
		Person[] array = new Person[2];
		
		//Create an Employee and Student object
		array[0] = new Employee("Arnold MacDonald", 10000.0);
		array[1] = new Student("Adam Czaplewski", "English");
		
		//Calling getName and getDescription methods on  the Employee object
		System.out.println("Employee Name: " + array[0].getName()  + ". "  + array[0].getDescription());
		
		//Calling getName and getDescription methods on the Student object
		System.out.println("Student Name: " + array[1].getName()  + ". " + array[1].getDescription());
	}
}
