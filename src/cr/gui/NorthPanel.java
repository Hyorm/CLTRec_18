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

	private ImageIcon closetProfile;
        private Image closetImage;

	private JButton myPageBtn;
	private JButton addClothesBtn;

	private CustomFrame CFrame;

	private Container CtPane = new Container();

	public NorthPanel(CustomFrame CFrame){

		String[] noUser = {"default","default","nil", "nil", "1234"};

		this.user = new User(noUser);
		this.CFrame = CFrame;

		this.setLayout(null);
		this.setBounds(0,0,1300,80);
                Random rd = new Random();
                Color b =  new Color(rd.nextInt(10000)%256, rd.nextInt(100000)%256, rd.nextInt(1234)%256);
                //this.setBackground(b);

                this.setBackground(Color.white);

		searchText = new JTextField(10);

                //User Page Icon --> Use User Id img
                userProfile = new ImageIcon("./img/userImage/"+this.user.getUserId()+".png");
                userImage = userProfile.getImage();
                userImage = userImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                userProfile = new ImageIcon(userImage);
		
                myPageBtn = new JButton(userProfile);

                myPageBtn.setContentAreaFilled(false);
                myPageBtn.setBorderPainted(false);
                myPageBtn.setFocusPainted(false);

		myPageBtn.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){
                		int userAttNum = 5;
                		String[] userInfo = new String[userAttNum];

				LogGUI logGUI = new LogGUI(user);

				userInfo = logGUI.getUserInfo();
				
                		if(userInfo[0].equals("nil")==false){
					System.out.println("Change");	
					user = new User(userInfo);
					CtPane.add(new NorthPanel(CFrame, user));
					CtPane.add(new CenterPanel(CFrame, 1));
					CtPane.add(new WestPanel(CFrame, user));
					CFrame.repaint();
					CFrame.setContentPane(CtPane);
					CFrame.setVisible(true);
					
					
				}
			}
		});

		searchText.setBounds(300, 20, 200, 25);
		myPageBtn.setBounds(1050, 20, 30, 30);

                this.add(searchText);
                this.add(myPageBtn);

	}

	public NorthPanel(CustomFrame CFrame, User user){

		System.out.println("North");
		this.CFrame = CFrame;
		this.user = user;
		this.setLayout(null);
                Random rd = new Random();
		this.setBounds(0,0,1440,80);
                Color b =  new Color(rd.nextInt(10000)%256, rd.nextInt(100000)%256, rd.nextInt(1234)%256);
                //this.setBackground(b);

		this.setBackground(Color.white);

		searchText = new JTextField(10);

                //User Page Icon --> Use User Id img
                userProfile = new ImageIcon("./img/userImage/"+this.user.getUserId()+".png");
                userImage = userProfile.getImage();
                userImage = userImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
                userProfile = new ImageIcon(userImage);

                myPageBtn = new JButton(userProfile);

                myPageBtn.setContentAreaFilled(false);
                myPageBtn.setBorderPainted(false);
                myPageBtn.setFocusPainted(false);

                myPageBtn.addActionListener(new ActionListener(){

                        public void actionPerformed(ActionEvent e){
                                        System.out.println("this");

                        }
                });

		//Closet add Page Icon ==default hanger.png
		closetProfile = new ImageIcon("./img/icon/hanger.png");
		closetImage = closetProfile.getImage();
		closetImage = closetImage.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		closetProfile = new ImageIcon(closetImage);

		addClothesBtn = new JButton(closetProfile);
		addClothesBtn.setContentAreaFilled(false);
		addClothesBtn.setBorderPainted(false);
		addClothesBtn.setFocusPainted(false);

		addClothesBtn.addActionListener(new ActionListener(){

                        public void actionPerformed(ActionEvent e){
                                        System.out.println("addClothes");

                        }
                });		
		
		searchText.setBounds(300, 20, 200, 25);
                myPageBtn.setBounds(1050, 20, 30, 30);
		addClothesBtn.setBounds(1120, 20, 30, 30);

                this.add(searchText);
                this.add(myPageBtn);
		this.add(addClothesBtn);
	}
}
