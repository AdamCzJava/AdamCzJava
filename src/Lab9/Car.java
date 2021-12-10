package Lab9;

public class Car extends RoadVehicle implements ImportDuty
	{
		private String carType;
	//Constructors
	public Car() 
	{
	 	this("", 0, 0);
	}
	public Car(String c, int w, int p) 
	{ 
		super(w, p);
		setType(c);
	}
	//Getters and setters
	public void setType(String t)  
	{
		carType = t;
	}
	public String getType()
	{
		return carType;
	}
	//calculateDuty method
	public void calculateDuty() 
	{
		System.out.println("Duty is " + CARTAXRATE);
	}
}