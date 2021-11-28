package Lab7;

public class Cat extends Animal
	{
	public Cat (String type, int age, char gender)
	{
		//calling constructor from the super class
		super(type,age,gender);
	}

	//toString
	public String toString() {
		return "Cat [type=" + type + ", age=" + age + ", gender=" + gender + "]";
	}//Methods eat, sleep and makeSound
	public void eat ()
	{
		System.out.println("Cat is eating");
	}
	public void sleep ()
	{
		System.out.println("Cat is sleeping");
	}
	public void makeSound ()
	{
		System.out.println("Cat is making sound");
	}
	
	}
