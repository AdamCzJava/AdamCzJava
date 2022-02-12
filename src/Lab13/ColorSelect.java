package Lab13;


import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class ColorSelect extends JFrame {

	//Create a two buttons ok and cancel
	//Create two check boxes, three panels and one combobox
	private JButton okJButton;
	private JButton cancelJButton;
	private JCheckBox snapJCheckBox;
	private JCheckBox showJCheckBox;
	private JPanel checkJPanel1;
	private JPanel fieldJPanel2;
	private JPanel buttonJPanel;
	private JComboBox drop;
	
	//Constructor
	public ColorSelect() {
		super("ColorSelect");
		
		//Create a check panel
		snapJCheckBox = new JCheckBox("background");
		showJCheckBox = new JCheckBox("foreground");
		checkJPanel1 = new JPanel ();
		checkJPanel1.setLayout(new FlowLayout( FlowLayout.CENTER));
		checkJPanel1.add(snapJCheckBox);
		checkJPanel1.add(showJCheckBox);
		//Create a buton panel
		okJButton = new JButton("Ok");
		cancelJButton = new JButton("Cancel");
		buttonJPanel = new JPanel();
		buttonJPanel.setLayout(new FlowLayout( FlowLayout.CENTER));
		buttonJPanel.add(okJButton);
		buttonJPanel.add(cancelJButton);
		//Create ComboBox panel
		JComboBox drop = new JComboBox ();
		fieldJPanel2 = new JPanel(new GridLayout(1,1));
		drop.addItem("Red");
		fieldJPanel2.add(drop);
		//Setting the layout
		setLayout(new GridLayout(3,1));
		add(fieldJPanel2);
		add(checkJPanel1);
		add(buttonJPanel);
		
		
	}
}
