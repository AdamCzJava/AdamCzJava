package Lab2;

public class lab2aq3 
{
	public static void main(String args[]) 
	{
		
	
	HotelRoom roomC = new HotelRoom ();// Create an instance of our HotelRoom class
	
	roomC.setroomNumber(202);	//room number set to number 200
	System.out.println("The room number is " + roomC.getroomNumber());
	roomC.setroomType("Single");	//room type set to Single
	System.out.println("The type of the room is " + roomC.getroomType());
	roomC.setroomAvailable(0);	//room availability set to value 0
	System.out.println("The room is occupied " + roomC.getroomAvailable());
	roomC.setroomRate(90);	//room rate set to the value 90
	System.out.println("The room rate is " + roomC.getroomRate());
	
	}//end main
}//end class
