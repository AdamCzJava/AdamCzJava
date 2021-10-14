package Lab2;

public class HotelRoom {
	//roomNumber, roomType, roomAvailable and roomRate are accessible to all methods in this class
	private int roomNumber;
	private String roomType;
	private int roomAvailable;
	private double roomRate;
	
	//default constructor method 
	public HotelRoom ()
	{
		setroomNumber(0);
		setroomType("Single");
		setroomAvailable(0);
		setroomRate(0.0);
		
	}
	//constructor method 2
	public HotelRoom (int number, String type, int present, double star, boolean status )
	{
		setroomNumber(number);
		setroomType(type);
		setroomAvailable(present);
		setroomRate(star);
		
	//Setter's and getter's methods	
	}
	public void setroomRate (double star)	//method to set room rate
	{
		roomRate = star;
	}
	public double getroomRate () 	//method to get room rate
	{
		return roomRate;
	}
	public void setroomNumber (int number) //method to set room number
	{
		roomNumber = number;
	}	
	public void setroomType (String type)	//method to set room type
	{
		roomType = type;
	}	
	public int getroomNumber ()	//method to get room number
	{
		return roomNumber;
	}
	public String getroomType () //method to get room type
	{
		return roomType;
	}
	public void setroomAvailable (int presenta)	//method to set room availability 
	{
		
		boolean y = isOccupiated (roomAvailable);
		if (y == true && presenta == 1) 
		{
			System.out.println("The room can not be booked again");
		}
		else
		{
			roomAvailable = presenta;
		}
	}
	public int getroomAvailable ()	//method to get room availability value
	{
		return roomAvailable;
	}
	public boolean isOccupiated (int roomAvailable)	//method to get information about room vacancy
	{
		boolean x = false; 
		if(roomAvailable == 1 ) 
		{
			x = true;
	
		}
		else
		{	
			x = false;
		}	
		
		return x;
		
	}
}//end class
