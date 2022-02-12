package Lab12;

import javax.swing.JFrame;

public class DriverWindow {

	public static void main(String[] args) {
		
		//Creating instance of the frame
		Window window = new Window();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(350,150);
		window.setLocation(600,400);
		window.setVisible(true);
		
	}

}
