package cr.gui;

import cr.main.*;
import cr.usr.*;
import cr.closet.*;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class WestPanel extends JPanel{
	
	private JTextField searchText ;

	private ImageIcon userProfile;
	private Image userImage;

	private ImageIcon closetProfile;
        private Image closetImage;

	private JButton myPageBtn;
	private JButton addClothesBtn;

	private CustomFrame CFrame;
	
	private String[] menuNames = {"New Clothes", "Pop Chart","Pop Closets","Genre Clothes","My Closets"};

	private Container CtPane = new Container();

	private JButton[] menu;

	public WestPanel(){

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
				
				CtPane.add(new NorthPanel());
				CtPane.add(new CenterPanel(1,"", ""));
				CtPane.add(new WestPanel());
				Main.CFrame.repaint();
				Main.CFrame.setContentPane(CtPane);
				Main.CFrame.setVisible(true);

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
                        			        
							CtPane.add(new NorthPanel());

							if(i==4)
								CtPane.add(new CenterPanel( 3, "", menuNames[i]));
							else
								CtPane.add(new CenterPanel( 4,"", menuNames[i]));
							CtPane.add(new WestPanel());
							Main.CFrame.repaint();
                                			Main.CFrame.setContentPane(CtPane);
                                			Main.CFrame.setVisible(true);
						}
				}
			});

			this.add(menu[i]);
                }	

	}
}
