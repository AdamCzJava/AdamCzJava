package lab10;

import javax.swing.JFrame;

public class MyColoursDriver {

	public static void main(String[] args) {
	
		MyColours myColours = new MyColours("My Colour Buttons");
		myColours.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myColours.setSize(600, 600);
		myColours.setVisible(true);
		myColours.setLocation(500, 400);

	}//end main

}//end class