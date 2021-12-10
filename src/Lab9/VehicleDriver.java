package Lab9;

public class VehicleDriver {
	//Drive program
	public static void main(String[] args)
	{	//Car and Hgv objects 
		Car ob1 = new Car ();
		Hgv ob2 = new Hgv ();
		//Array of the Car and Hgv objects
		RoadVehicle [] arr1 = new RoadVehicle [2]; 
		
		arr1[0] = ob1;
		arr1[1] = ob2;
		
		//Calling method calculateDuty for Car and Hgv objects
		arr1[1].calculateDuty();
		arr1[0].calculateDuty();
	 
	}

}
