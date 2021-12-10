package Lab9;

public class Driver {

	public static void main(String[] args) {
		//LibraryItem array called arry
		LibraryItem [] arry = new LibraryItem [2];
		//Book and CD objects
		Book ob1 = new Book("Adam", "Computer Architecture nightmare part2", 233, "horror", "123");
		CD ob2 = new CD("Rock", "124","Queen","Rock you",123);
		arry[0]= ob1;
		arry[1]= ob2;
		
		
		//Calling calculatePrice method for each object
		System.out.println(ob1.calculatePrice());
		System.out.println(ob2.calculatePrice());
		

	}

}
