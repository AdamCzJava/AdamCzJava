package lab10;

import javax.swing.JFrame;

public class ChangeColourDriver {

	public static void main(String[] args) {
	
		ChangeColour changeColour = new ChangeColour("Button");
		changeColour.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		changeColour.setSize(600, 600);
		changeColour.setVisible(true);
		changeColour.setLocation(500, 400);

	}//end main

}//end class