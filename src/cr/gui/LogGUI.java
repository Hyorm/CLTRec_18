package cr.gui;

import cr.usr.*;
import cr.main.*;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class LogGUI{
	
		public static String[] userInfo = new String[5];
		private static boolean userLock = true;
		CustomFrame LFrame;
                CompositePanel LPanel;
	public LogGUI(User user){

		if(false==user.getUserId().equals("default")){
			LFrame.dispose();
		}
		else{
			loginPage();
		}
	}
	public void loginPage(){
		LFrame = new CustomFrame("Login");
		LPanel = new CompositePanel(6, 1);

		LFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		System.out.println("This is login form");

		JLabel idLab = new JLabel("ID");
		idLab.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel pwLab = new JLabel("PW");
		pwLab.setHorizontalAlignment(SwingConstants.CENTER);

		JTextField inputID = new JTextField(10);
		JTextField inputPW = new JTextField(10);

		JButton logBtn = new JButton("LOGIN");
		logBtn.addActionListener(new ActionListener(){

                        public void actionPerformed(ActionEvent e){
                                //id connect
				userInfo = LogOn.logOn(inputID.getText(), inputPW.getText());
				if(userInfo[0].equals("nil")==false){
					LFrame.dispose();
				
				}else{
					//error message
					JOptionPane.showMessageDialog(null,"Wrong ID/PW", "Wrong", JOptionPane.WARNING_MESSAGE);
				}
			
                        }
                });

		JButton regBtn = new JButton("REGISTER");
		regBtn.addActionListener(new ActionListener(){

                        public void actionPerformed(ActionEvent e){
                                //Lpanel.change("regGUI");
                        }
                });
		
		this.LPanel.adds(idLab);
		this.LPanel.adds(inputID);

		this.LPanel.adds(pwLab);
		this.LPanel.adds(inputPW);

		this.LPanel.adds(logBtn);
		this.LPanel.adds(regBtn);

		this.LFrame.adds(this.LPanel);
		this.LFrame.size(500, 800).start();

		//System.out.println(userInfo[0]);

	}
	
	public String[] getUserInfo(){

		return this.userInfo;
	}
	
}

