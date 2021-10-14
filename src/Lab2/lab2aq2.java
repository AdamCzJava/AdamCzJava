package Lab2;

public class lab2aq2 {

	public static void main(String args[]) 
	{
		
		HotelRoom roomA = new HotelRoom ();	// Create an instance of our HotelRoom class
		HotelRoom roomB = new HotelRoom ();
		
		roomA.setroomNumber(200);	//room number set to value 200
		System.out.println("The room number is " + roomA.getroomNumber());
		roomA.setroomType("Single");	//room type set to Single
		System.out.println("The type of the room is " + roomA.getroomType());
		roomA.setroomAvailable(1);	//room availability set to value 1
		System.out.println("The room is vacant " + roomA.getroomAvailable());
		roomA.setroomRate(100);	//room rate set to 100
		System.out.println("The room rate is " + roomA.getroomRate());
		
		System.out.println("------------------------");
		
		roomB.setroomNumber(201);	//room number set to value 201
		System.out.println("The room number is " + roomB.getroomNumber());
		roomB.setroomType("Double");	//room type set to Double
		System.out.println("The type of the room is " + roomB.getroomType());
		roomB.setroomAvailable(0);	//room availability set to value 0
		System.out.println("The room is occupied " + roomB.getroomAvailable());
		roomB.setroomRate(80);	//room rate set to 80
		System.out.println("The room rate is " + roomB.getroomRate());
		
		
		
		
	}//end main
}//end class
