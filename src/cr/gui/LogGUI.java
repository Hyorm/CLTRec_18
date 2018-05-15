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
	public LogGUI(){

		CustomFrame LFrame = new CustomFrame("Login");
		CompositePanel LPanel = new CompositePanel(6, 1);
		User logUser;
		System.out.println("This is User form");

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
				if(!userInfo[0].equals("nil")){
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
		
		LPanel.adds(idLab);
		LPanel.adds(inputID);

		LPanel.adds(pwLab);
		LPanel.adds(inputPW);

		LPanel.adds(logBtn);
		LPanel.adds(regBtn);

		LFrame.adds(LPanel);
		LFrame.size(500, 800).start();

		System.out.println(userInfo[0]);
	}
	
	public String[] getUserInfo(){

		return this.userInfo;
	}
	
}

