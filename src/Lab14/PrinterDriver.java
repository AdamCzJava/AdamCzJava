package Lab14;

import javax.swing.JFrame;

import Lab12.Window;

public class PrinterDriver {

	public static void main(String[] args) {
		
		//Creating instance of the frame
		Printer printer = new Printer();
		printer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		printer.setSize(500,225);
		printer.setLocation(600,600);
		printer.setVisible(true);

	}

}