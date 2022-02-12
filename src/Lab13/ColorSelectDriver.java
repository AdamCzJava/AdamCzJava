package Lab13;

import javax.swing.JFrame;

import Lab12.Window;

public class ColorSelectDriver {

	public static void main(String[] args) {
		
		//Creating instance of the frame
		ColorSelect colorSelect = new ColorSelect();
		colorSelect.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		colorSelect.setSize(350,150);
		colorSelect.setLocation(600,400);
		colorSelect.setVisible(true);

	}

}
