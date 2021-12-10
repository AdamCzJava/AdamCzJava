package Lab9;

public class LibraryItem {
	//Variables 
	private String type;
	private String ID;
	
	//Constructor
	public LibraryItem (String  type, String ID) 
	{
		this.type = type;
		this.ID = ID;
	}
	//Getters and setters
	public String getType() 
	{
		return type;
	}
	public void setType(String type) 
	{
		this.type = type;
	}
	public String getID() 
	{
		return ID;
	}
	public void setID(String iD) 
	{
		ID = iD;
	}
	//toString method
	public String toString() {
		return "LibraryItem [type=" + type + ", ID=" + ID + "]";
	}
	
	
}

