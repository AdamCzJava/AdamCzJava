package Lab2;

public class lab2aq4 {

	public static void main(String args[]) 
	{
		HotelRoom roomB = new HotelRoom ();// Create an instance of our HotelRoom class
		System.out.println("The room status is: " + roomB.getroomAvailable());
		roomB.setroomAvailable(1);//room availability set to 1
		System.out.println("The room status is: " + roomB.getroomAvailable());
		roomB.setroomAvailable(1);//room availability set to 1
		System.out.println("The room status is: " + roomB.getroomAvailable());
		
	}//end main
}//end class
