package Lab7;

public class Vet {
	
	private String name;
	//Constructors
	public Vet () 
	{
		setName("");
	}
	public Vet (String name) 
	{
		this.name = name;
	}//Setters and getters
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}//Vaccinate method
	public void Vaccinate(Animal animal) 
	{
		System.out.println(name + " is vaccinating ");
		if( animal instanceof Dog)
		{
			System.out.println("Dog has been vaccinated: " + animal.toString() );
		}
		else 
		{
			System.out.println("Cat has been vaccinated: " + animal.toString());
		}
		
	}
}
