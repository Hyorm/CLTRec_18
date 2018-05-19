package cr.main;

import cr.gui.*;
import cr.usr.*;

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
	

	public WestPanel(CustomFrame CFrame){

		this.CFrame = CFrame;

                this.setLayout(new GridLayout(9,1));
                Random rd = new Random();
                this.setBounds(0,80,200,850);

                Color b =  new Color(rd.nextInt(10000)%256, rd.nextInt(100000)%256, rd.nextInt(1234)%256);
                //this.setBackground(b);

                this.setBackground(Color.white);

		ImageIcon logo;
                Image logoRe;
                JLabel logoImg;
                JButton[] menu = new JButton[5];                

		logo = new ImageIcon("./img/logo/hanger.png");
                logoRe = logo.getImage();
                logoRe = logoRe.getScaledInstance(200, 100, Image.SCALE_SMOOTH);
                logo = new ImageIcon(logoRe);
                logoImg = new JLabel(logo);

		this.add(logoImg);

                menu = new JButton[5];
                menu[0] = new JButton("New Clothes");
                menu[1] = new JButton("Pop Chart");
                menu[2] = new JButton("Pop Closets");
                menu[3] = new JButton("Genre Clothes");
                menu[4] = new JButton("My Closets");

                for(int i = 0; i < 5; i++){
                        menu[i].setBorderPainted(false);
                        menu[i].setFocusPainted(false);
                        this.add(menu[i]);
                }

	}

	public WestPanel(CustomFrame CFrame, User user){

		this.CFrame = CFrame;
		this.user = user;
		this.setLayout(new GridLayout(9,1));
                Random rd = new Random();
		this.setBounds(0,80,200,850);

                Color b =  new Color(rd.nextInt(10000)%256, rd.nextInt(100000)%256, rd.nextInt(1234)%256);
                //this.setBackground(b);

		this.setBackground(Color.white);
		
		ImageIcon logo;
                Image logoRe;
                JLabel logoImg;
                JButton[] menu = new JButton[5];

		logo = new ImageIcon("./img/logo/hanger.png");
                logoRe = logo.getImage();
                logoRe = logoRe.getScaledInstance(200, 100, Image.SCALE_SMOOTH);
                logo = new ImageIcon(logoRe);
                logoImg = new JLabel(logo);

		this.add(logoImg);

                menu = new JButton[5];
                menu[0] = new JButton("New Clothes");
                menu[1] = new JButton("Pop Chart");
                menu[2] = new JButton("Pop Closets");
                menu[3] = new JButton("Genre Clothes");
                menu[4] = new JButton("My Closets");

                for(int i = 0; i < 5; i++){
                        menu[i].setBorderPainted(false);
                        menu[i].setFocusPainted(false);
                        this.add(menu[i]);
                }	

	}
}
