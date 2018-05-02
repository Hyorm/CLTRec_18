package cr.gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JCheckBox;

public class Custom_GUI extends JFrame
{
	JFrame jFrame = new JFrame("Menu");
	
	 JTextField textID = new JTextField(10);
     JLabel labelID = new JLabel("Input ID :");

     JTextField textPwd = new JTextField(10);
     JLabel labelPwd = new JLabel("Input Password : ");

     JTextField textName = new JTextField(10);
     JLabel labelName = new JLabel("Input Your Name : ");

     JCheckBox checkType1 = new JCheckBox("Bright");
     JCheckBox checkType2 = new JCheckBox("Dark");
     JCheckBox checkType3 = new JCheckBox("Neat");
     JCheckBox checkType4 = new JCheckBox("Casual");
     
     JButton b1 = new JButton("register");
     JButton b2 = new JButton("login");
     
     JMenuBar menuBar = new JMenuBar();
     JMenu Home = new JMenu("Home");
     JMenu Closet = new JMenu("Closet");

     public Custom_GUI()
     {
    	Home.add(new JMenuItem("imformation"));
    	
    	Closet.add(new JMenuItem("go to my closet"));
    	Closet.add(new JMenuItem("add my closet"));
    	
    	menuBar.add(Home);
    	menuBar.add(Closet);
    	
    	jFrame.setSize(500,500);
    	
    	jFrame.setVisible(true);
    	
    	jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	
     }
	public void register()
	{
		//set name
		//super("Custom_Closet");
		
		//set Layout
		this.setLayout(new FlowLayout());
		
		//add button
		//this.add(b2);
		//this.add(b3);
		//this.add(buttonStart);
		this.add(labelID);
		this.add(textID);
		this.add(labelPwd);
		this.add(textPwd);
		this.add(checkType1);
		this.add(checkType2);
		this.add(checkType3);
		this.add(checkType4);
		this.add(b1);
		
		//set frame size
		this.setSize(400, 400);
		
		//set visible
		this.setVisible(true);
		
		//
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void login() {
		
		this.setLayout(new FlowLayout());
		
		this.add(labelID);
		this.add(textID);
		
		this.add(labelPwd);
		this.add(textPwd);
		this.add(b2);
		
		//
		this.setSize(500, 400);
				
		//
		this.setVisible(true);
				
		//
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)
	{
		//
		new Custom_GUI();
		//Custom_GUI gui = new Custom_GUI();
	    //gui.register();
		//gui.login();
	}

}
