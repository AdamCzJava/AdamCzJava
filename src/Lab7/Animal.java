package Lab7;

public class Animal {

	protected String type;
	protected int age;
	protected char gender;
	//Constructors
	public Animal ()
	{
		setType("");
		setAge(0);
		setGender(' ');
	}
	public Animal (String type, int age, char gender)
	{
		this.type = type;
		this.age = age;
		this.gender = gender;
	}//Getters and setters
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}//Methods
	public void eat ()
	{
		System.out.println("Animal is eating");
	}
	public void sleep ()
	{
		System.out.println("Animal is sleeping");
	}
	public void makeSound ()
	{
		System.out.println("Animal is making sound");
	}
	
	
}
