package Lab12;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Window extends JFrame{

	//Creating a JButtons for OK, Cancel and Help buttons.
	//Declare the text fields, text labels and two check boxes as well
	//We also need to create three panels on which we need to install our buttons
	private JButton okJButton;
	private JButton cancelJButton;
	private JButton helpJButton;
	private JTextField xJTextField;
	private JTextField yJTextField;
	private JLabel xJLabel;
	private JLabel yJLabel;
	private JCheckBox snapJCheckBox;
	private JCheckBox showJCheckBox;
	private JPanel checkJPanel;
	private JPanel buttonJPanel;
	private JPanel fieldJPanel1;
	private JPanel fieldJPanel2;
	private JPanel fieldJPanel;
	
	//Constructor
	public Window() {
		super("Align");
		
		//Creating a check panel
		snapJCheckBox = new JCheckBox("Snap to Grid");
		showJCheckBox = new JCheckBox("Show Grid");
		checkJPanel = new JPanel ();
		checkJPanel.setLayout(new GridLayout(2,1));
		checkJPanel.add(snapJCheckBox);
		checkJPanel.add(showJCheckBox);
		
		//Creating a field panel for x
		xJLabel = new JLabel("X: ");
		xJTextField = new JTextField("8",3);
		fieldJPanel1 = new JPanel();
		fieldJPanel1.setLayout(new FlowLayout());
		fieldJPanel1.add(xJLabel);
		fieldJPanel1.add(xJTextField);
		
		//Creating a field panel for y
		yJLabel = new JLabel("Y: ");
		yJTextField = new JTextField("8", 3);
		fieldJPanel2 = new JPanel();
		fieldJPanel2.setLayout(new FlowLayout());
		fieldJPanel2.add(yJLabel);
		fieldJPanel2.add(yJTextField);
		
		//Creating a field panel to combine two panels above
		fieldJPanel = new JPanel();
		fieldJPanel.setLayout(new BorderLayout());
		fieldJPanel.add(fieldJPanel1, BorderLayout.NORTH);
		fieldJPanel.add(fieldJPanel2, BorderLayout.SOUTH);
		
		//Creating a button panel
		okJButton = new JButton("Ok");
		cancelJButton = new JButton("Cancel");
		helpJButton = new JButton("Help");
		buttonJPanel = new JPanel();
		buttonJPanel.setLayout(new GridLayout(3,1,10,5));
		buttonJPanel.add(okJButton);
		buttonJPanel.add(cancelJButton);
		buttonJPanel.add(helpJButton);
		
		setLayout(new FlowLayout(FlowLayout.CENTER, 10,5));
		add(checkJPanel);
		add(fieldJPanel);
		add(buttonJPanel);
	}
}
