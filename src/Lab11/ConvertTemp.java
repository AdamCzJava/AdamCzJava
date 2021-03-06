package Lab11;

//Converts a Fahrenheit temperature entered by the user to Celsius, or vice versa

import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertTemp extends JFrame {
	
	private JTextField fahrenField = new JTextField();
	private JTextField celsiusField = new JTextField();
	
	// Constructor
	public ConvertTemp(String title)	{
		// Set title for frame and choose layout
		super(title);
		getContentPane().setLayout(new GridLayout(2, 2));

		// Add Fahrenheit label and text field to frame
		add(new JLabel("Fahrenheit"));
		add(fahrenField);
		// Attach listener to text field
		fahrenField.addActionListener(new FahrenheitListener ());
		
		// Add Celsius label and text field to frame
		add(new JLabel("Celsius"));
		add(celsiusField);
		// Attach listener to text field
		celsiusField.addActionListener(new CelsiusListener());
		// Attach window listener
		addWindowListener(new WindowCloser());
	}//end costructor

	//Listener for Fahrenheit field
	class FahrenheitListener implements ActionListener{

		//Calculating fahrenheit 
		public void actionPerformed(ActionEvent e) {
			String fahrenhetstr = fahrenField.getText();
			double fahrenheit = Double.parseDouble(fahrenhetstr);
			double celsius = (fahrenheit -32)* 5.0 / 9.0;
			celsius = Math.rint(celsius * 100.0)/100.0;
			celsiusField.setText(celsius + "");
		}
	}
	
	class CelsiusListener implements ActionListener{

		//Calculating celsius
		public void actionPerformed(ActionEvent e) {
			String celsiusstr = celsiusField.getText();
			double celsius = Double.parseDouble(celsiusstr);
			double fahrenheit = celsius * 9.0 / 5.0 + 32;
			fahrenheit = Math.rint(fahrenheit * 100.0)/100.0;
			fahrenField.setText(fahrenheit + "");
		}
		
		
	}
	// Listener for window
	class WindowCloser extends WindowAdapter {
		public void windowClosing(WindowEvent evt) {
			System.exit(0);
		}
	}
	

}//end class