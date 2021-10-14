package Lab2;

public class lab2aq1 {
	

	public static void main(String args[]) 
	{
		
		HotelRoom roomA = new HotelRoom (); // Create an instance of our HotelRoom class
		HotelRoom roomB = new HotelRoom ();
		
		roomA.setroomNumber(200);	//room number set to value 200
		System.out.println("The room number is " + roomA.getroomNumber());
		roomA.setroomType("Single");	//room type set to Single
		System.out.println("The type of the room is " + roomA.getroomType());
		
		roomB.setroomNumber(201);	//room number set to value 201
		System.out.println("The room number is " + roomB.getroomNumber());
		roomB.setroomType("Double");	//room type set to Double
		System.out.println("The type of the room is " + roomB.getroomType());
		
	
		
		
		
		
	}//end main
}//end class
