package Lab7;

public class Dog extends Animal{

	public Dog (String type, int age, char gender)
	{
		//calling constructor from the super class
		super(type,age,gender);
	}
	//toString
	public String toString() {
		return "Dog [type=" + type + ", age=" + age + ", gender=" + gender + "]";
	}//Methods eat, sleep and makeSound
	public void eat ()
	{
		System.out.println("Dog is eating");
	}
	public void sleep ()
	{
		System.out.println("Dog is sleeping");
	}
	public void makeSound ()
	{
		System.out.println("Dog is making sound");
	}
}
