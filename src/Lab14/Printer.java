package Lab14;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class Printer extends JFrame {

	//Create 4 buttons OK, cancel, setup and help
	//Create 4 checkbox buttons Image, Text, Code, Print to file
	//Create 2 panels for checkbox and buttons
	//Create 1 combobox, 2 labels and 1 buttongroup
	private JButton okJButton;
	private JButton cancelJButton;
	private JButton setupJButton;
	private JButton helpJButton;
	private JCheckBox snapJCheckBox;
	private JCheckBox showJCheckBox;
	private JCheckBox snaptwoJCheckBox;
	private JCheckBox showtwoJCheckBox;
	private JPanel checkJPanel1;
	private JPanel buttonJPanel;
	private JComboBox drop;
	private JLabel myPrint;
	private JLabel Quality;
	private ButtonGroup group;

	//Constructor
    public Printer() {
	super("Printer");
	
	//Creating radiobox panel, 3 panels which represents white fields
	//left panel which contains (left-top, left-middle and left-bottom panels)
	//right panel which contains remains element of the window
	myPrint = new JLabel("Printer:My Printer");
	Quality = new JLabel("Printer:Quality");
	snaptwoJCheckBox = new JCheckBox("Image");
	showtwoJCheckBox = new JCheckBox("Text");
	snapJCheckBox = new JCheckBox("Code");
	showJCheckBox = new JCheckBox("Print to File");
	checkJPanel1 = new JPanel ();
	JPanel radioPanel = new JPanel (new GridLayout(3,1,5,5));
	JPanel checkJPanel2 = new JPanel ();
	JPanel checkJPanel3 = new JPanel ();
	JPanel checkJPanel4 = new JPanel ();
	JPanel left = new JPanel (new BorderLayout());
	JPanel right = new JPanel ();
	JPanel lefttop = new JPanel (new FlowLayout(FlowLayout.LEFT));
	JPanel leftmiddle = new JPanel ();
	JPanel leftbottom = new JPanel (new FlowLayout(FlowLayout.LEFT));
	group = new ButtonGroup();
	
	
	//Setting up colors for the labels myPrint and Quality
	//Setting up dimension and color of the white fields in the middle
	myPrint.setForeground(new Color(106,90,205));
	Quality.setForeground(new Color(106,90,205));
	checkJPanel3.setBackground(Color.WHITE);
	checkJPanel2.setBackground(Color.WHITE);
	checkJPanel4.setBackground(Color.WHITE);
	checkJPanel4.setPreferredSize(new Dimension(50,80));
	checkJPanel3.setPreferredSize(new Dimension(50,80));
	checkJPanel2.setPreferredSize(new Dimension(50,80));
	
	//Setting up layout for the checkboxes panel and adding Image, Text, Code buttons to that panel
	checkJPanel1.setLayout(new GridLayout(3,1,5,5));
	checkJPanel1.add(snaptwoJCheckBox);
	checkJPanel1.add(showtwoJCheckBox);
	checkJPanel1.add(snapJCheckBox);
	
	//Creating a group of the radio buttons where "All" button is set up to selected
	JRadioButton selection = new JRadioButton("Selection");
	JRadioButton all = new JRadioButton("All");
	JRadioButton applet = new JRadioButton("Applet");
	group.add(selection);
	group.add(applet);
	group.add(all);
	all.setSelected(true);
	
	//Creating a buttons panel and setting up the layout for that panel
	okJButton = new JButton("Ok");
	cancelJButton = new JButton("Cancel");
	setupJButton = new JButton("Setup...");
	helpJButton = new JButton("Help");
	buttonJPanel = new JPanel();
	buttonJPanel.setLayout(new GridLayout(4,1,55,5));
	buttonJPanel.add(okJButton);
	buttonJPanel.add(cancelJButton);
	buttonJPanel.add(setupJButton);
	buttonJPanel.add(helpJButton);
	
	//Setting up the border layout for the left panel and adding two label myPrint to the lefttop panel and
	//label Quality to the leftbottom panel
	left.add(lefttop,BorderLayout.NORTH);
	left.add(leftmiddle,BorderLayout.CENTER);
	left.add(leftbottom,BorderLayout.SOUTH);
	lefttop.add(myPrint);
	leftbottom.add(Quality);
	
	//Creating panel for dropbox and adding drop button "High" and checkbox "Print to file" to the leftbottom panel
	JComboBox drop = new JComboBox ();
	new JPanel(new GridLayout(1,1));
	drop.addItem("High");
	leftbottom.add(drop);
	leftbottom.add(showJCheckBox);
	
	//Setting up the layout of the window
	setLayout(new FlowLayout(FlowLayout.CENTER, 10,5));
    radioPanel.add(selection);
    radioPanel.add(all);
    radioPanel.add(applet);
    right.add(buttonJPanel);
	leftmiddle.add(checkJPanel2);
	leftmiddle.add(checkJPanel1);
	leftmiddle.add(checkJPanel3);
	leftmiddle.add(radioPanel);
	leftmiddle.add(checkJPanel4);
	add(left);
    add(right);
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	