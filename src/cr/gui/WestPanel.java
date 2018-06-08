package cr.gui;

import cr.main.*;
import cr.usr.*;
import cr.closet.*;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class WestPanel extends JPanel{
	
	private User user;
	private JTextField searchText ;

	private ImageIcon userProfile;
	private Image userImage;

	private ImageIcon closetProfile;
        private Image closetImage;

	private JButton myPageBtn;
	private JButton addClothesBtn;

	private CustomFrame CFrame;
	private Closet dataCloset;
	
	private String[] menuNames = {"New Clothes", "Pop Chart","Pop Closets","Genre Clothes","My Closets"};

	private Container CtPane = new Container();

	private JButton[] menu;

	public WestPanel(CustomFrame CFrame,Closet dataCloset, User user){

		if(user != null)
                        this.user = user;

		this.dataCloset = dataCloset;
                this.CFrame = CFrame;

                this.setLayout(new GridLayout(9,1));
                Random rd = new Random();
                this.setBounds(0,80,200,850);

                Color b =  new Color(rd.nextInt(10000)%256, rd.nextInt(100000)%256, rd.nextInt(1234)%256);
                //this.setBackground(b);

                this.setBackground(Color.white);

		ImageIcon logo;
                Image logoRe;
                JButton logoImgBtn;

		logo = new ImageIcon("./img/logo/hanger.png");
                logoRe = logo.getImage();
                logoRe = logoRe.getScaledInstance(200, 100, Image.SCALE_SMOOTH);
                logo = new ImageIcon(logoRe);
                logoImgBtn = new JButton(logo);

		logoImgBtn.addActionListener(new ActionListener(){

                        public void actionPerformed(ActionEvent e){
				if(user == null)
					CtPane.add(new NorthPanel(CFrame, dataCloset));
				else
					CtPane.add(new NorthPanel(CFrame, user,dataCloset));
				CtPane.add(new CenterPanel(CFrame,user, 1,dataCloset, "", ""));
				CtPane.add(new WestPanel(CFrame,dataCloset, user));
				CFrame.repaint();
				CFrame.setContentPane(CtPane);
				CFrame.setVisible(true);

                        }
                });	

		logoImgBtn.setContentAreaFilled(false);
		logoImgBtn.setBorderPainted(false);	
		logoImgBtn.setFocusPainted(false);
		

		this.add(logoImgBtn);

                menu = new JButton[5];
		
		for(int i = 0; i < 5; i++)
			menu[i] = new JButton(menuNames[i]);

                for(int i = 0; i < 5; i++){
                        menu[i].setBorderPainted(false);
                        menu[i].setFocusPainted(false);
			menu[i].addActionListener(new ActionListener(){

        	                public void actionPerformed(ActionEvent e){
					for(int i=0; i<5; i++)
						if(menu[i]==e.getSource()){
							if(user == null)
			                                        CtPane.add(new NorthPanel(CFrame, dataCloset));
                        			        else
								CtPane.add(new NorthPanel(CFrame, user,dataCloset));

							if(i==4)
								CtPane.add(new CenterPanel(CFrame,user, 3,dataCloset, "", menuNames[i]));
							else
								CtPane.add(new CenterPanel(CFrame,user, 4,dataCloset, "", menuNames[i]));
							CtPane.add(new WestPanel(CFrame,dataCloset, user));
							CFrame.repaint();
                                			CFrame.setContentPane(CtPane);
                                			CFrame.setVisible(true);
						}
				}
			});

			this.add(menu[i]);
                }	

	}
}
