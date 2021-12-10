package Lab9;

public class Hgv extends RoadVehicle implements ImportDuty
{
	private int cargo;
	//Constructors
	public Hgv()
	{ 	
		this(0,0,0);	
	}
	public Hgv(int c, int w, int p)
	{ 
		super(w, p);
		setCargo(c);
	}
	//Setters and getters
	public void setCargo(int size)
	{
		cargo = size;
	}
	public int getCargo()
	{
		return cargo;
	}	
	//calculateDuty method
	public void calculateDuty()
	{
		System.out.println("Duty is " + HGVTAXRATE);
	}
}