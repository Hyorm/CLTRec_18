import javax.swing.*;

import java.awt.*;

import java.awt.event.*;
import java.io.IOException;
import java.sql.*;
import javax.swing.JComboBox;


 

public class regGUI extends JFrame implements ActionListener 
  { 

    JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    //JLabel l9;

    JTextField tf1, tf2, tf5, tf6, tf7;

    JButton btn1, btn2;

    JPasswordField p1, p2;
    
    //JComboBox age;
    
    //String[] age_arr= new String[31];


 

    regGUI()
     {

        setVisible(true);

        setSize(700, 700);

        setLayout(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle("Register");

        Container c= getContentPane();   
        c.setLayout(null);    
        c.setBackground(Color.pink);   

        l1.setForeground(Color.black);

        l1.setFont(new Font("Serif", Font.BOLD, 20));

 

        l2 = new JLabel("Name:");

        l3 = new JLabel("Email-ID:");

        l4 = new JLabel("Create Passowrd:");

        l5 = new JLabel("Confirm Password:");

        l6 = new JLabel("Country:");

        l7 = new JLabel("State:");

        l8 = new JLabel("Phone No:"); 
        
        //l9 = new JLabel("Age:");

        tf1 = new JTextField();

        tf2 = new JTextField();

        p1 = new JPasswordField();

        p2 = new JPasswordField();

        tf5 = new JTextField();

        tf6 = new JTextField();

        tf7 = new JTextField();
        
        /*for(int i = 0; i <= 31; i++)
        {
        	age_arr[i-1] = Integer.toString(i);
        }

        age = new JComboBox(age_arr);*/

 

        btn1 = new JButton("Submit");

        btn2 = new JButton("Clear");

 

        btn1.addActionListener(this);

        btn2.addActionListener(this);

 

        l1.setBounds(100, 30, 400, 30);

        l2.setBounds(80, 70, 200, 30);

        l3.setBounds(80, 110, 200, 30);

        l4.setBounds(80, 150, 200, 30);

        l5.setBounds(80, 190, 200, 30);

        l6.setBounds(80, 230, 200, 30);

        l7.setBounds(80, 270, 200, 30);

        l8.setBounds(80, 310, 200, 30);
        
        //l9.setBounds(80, 350, 200, 30);

        tf1.setBounds(300, 70, 200, 30);

        tf2.setBounds(300, 110, 200, 30);

        p1.setBounds(300, 150, 200, 30);

        p2.setBounds(300, 190, 200, 30);

        tf5.setBounds(300, 230, 200, 30);

        tf6.setBounds(300, 270, 200, 30);

        tf7.setBounds(300, 310, 200, 30);
        
        //age.setBounds(300, 200, 60, 30);

        btn1.setBounds(50, 350, 100, 30);

        btn2.setBounds(170, 350, 100, 30);

 

        add(l1);

        add(l2);

        add(tf1);

        add(l3);

        add(tf2);

        add(l4);

        add(p1);

        add(l5);

        add(p2);

        add(l6);

        add(tf5);

        add(l7);

        add(tf6);

        add(l8);

        add(tf7);
        
        //add(l9);
        
        //add(age);

        add(btn1);

        add(btn2);

    }

 

    public void actionPerformed(ActionEvent e) 
     {

        if (e.getSource() == btn1)
         {

            int x = 0;

            String s1 = tf1.getText();

            String s2 = tf2.getText();

 

            char[] s3 = p1.getPassword();

            char[] s4 = p2.getPassword(); 

            String s8 = new String(s3);

            String s9 = new String(s4);

 

            String s5 = tf5.getText();

            String s6 = tf6.getText();

            String s7 = tf7.getText();
            
            //String s11 = (String) age.getSelectedItem();
            
            /*try {
				Register.register(s2, s9, s1, Integer.parseInt(s11));
			} catch (NumberFormatException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			*/

         }
    }

    /*public static void main(String args[])
   {

        new RegesterGUI();

    }*/



}
