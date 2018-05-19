package cr.main;

import cr.gui.*;
import cr.usr.*;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class NorthPanel extends JPanel{
	
	private User user;
	private JTextField searchText ;
	private ImageIcon userProfile;
	private Image userImage;

	private JButton myPage;

	private CustomFrame CFrame;
	

	public NorthPanel(CustomFrame CFrame){

		String[] noUser = {"default","default","nil", "nil", "1234"};

		this.user = new User(noUser);
		this.CFrame = CFrame;

		this.setLayout(null);
		this.setBounds(0,0,1440,80);
                Random rd = new Random();
                Color b =  new Color(rd.nextInt(10000)%256, rd.nextInt(100000)%256, rd.nextInt(1234)%256);
                this.setBackground(b);

                //this.setBackground(Color.white);

		searchText = new JTextField(10);

                //User Page Icon --> Use User Id img
                userProfile = new ImageIcon("./img/userImage/"+this.user.getUserId()+".png");
                userImage = userProfile.getImage();
                userImage = userImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                userProfile = new ImageIcon(userImage);
		
                myPage = new JButton(userProfile);

                myPage.setContentAreaFilled(false);
                myPage.setBorderPainted(false);
                myPage.setFocusPainted(false);

		myPage.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){
                		int userAttNum = 5;
                		String[] userInfo = new String[userAttNum];

				LogGUI logGUI = new LogGUI();

				userInfo = logGUI.getUserInfo();
				
                		if(userInfo[0]!=null){
				
					user = new User(userInfo);
					CFrame.setContentPane(new NorthPanel(CFrame, user));
				}
			}
		});

		searchText.setBounds(300, 10, 200, 25);
		myPage.setBounds(1200, 10, 30, 30);

                this.add(searchText);
                this.add(myPage);

	}

	public NorthPanel(CustomFrame CFrame, User user){

		this.CFrame = CFrame;
		this.user = user;
		this.setLayout(null);
                Random rd = new Random();
		this.setBounds(0,0,1440,80);
                Color b =  new Color(rd.nextInt(10000)%256, rd.nextInt(100000)%256, rd.nextInt(1234)%256);
                this.setBackground(b);

		//this.setBackground(Color.white);

		searchText = new JTextField(10);

                //User Page Icon --> Use User Id img
                userProfile = new ImageIcon("./img/userImage/"+this.user.getUserId()+".png");
                userImage = userProfile.getImage();
                userImage = userImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                userProfile = new ImageIcon(userImage);

                myPage = new JButton(userProfile);

                myPage.setContentAreaFilled(false);
                myPage.setBorderPainted(false);
                myPage.setFocusPainted(false);

                myPage.addActionListener(new ActionListener(){

                        public void actionPerformed(ActionEvent e){
                                        //change Pane

                        }
                });

		searchText.setBounds(300, 10, 200, 25);
                myPage.setBounds(1200, 10, 30, 30);

                this.add(searchText);
                this.add(myPage);
	}
}
