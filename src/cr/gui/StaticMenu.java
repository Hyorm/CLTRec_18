package cr.gui;

import cr.*;
import cr.main.*;

import javax.swing.*;
import java.awt.*;

public class StaticMenu{

	public static void staticMenu(){

		CustomFrame CFrame = new CustomFrame();
		CompositePanel north = new CompositePanel(0,0,1440,80);
		CompositePanel west = new CompositePanel(9,1,0,80,200,850);
		CompositePanel center = new CompositePanel(200,80,1240,850);
		Container contentPane = CFrame.getContentPane();

		//North Menu Bar
		JTextField searchText = new JTextField(10);


		//User Page Icon --> Use User Id img 
		ImageIcon userProfile = new ImageIcon("./img/userImage/root.png");
		Image user = userProfile.getImage();
		Image newuser = user.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		userProfile = new ImageIcon(newuser);
		
		JButton myPage = new JButton(userProfile);

		myPage.setContentAreaFilled(false);
		myPage.setBorderPainted(false);
		myPage.setFocusPainted(false);

		JButton searchButton = new JButton("search");

		north.adds(searchButton, 510, 10, 100, 25);
                north.adds(searchText, 300, 10, 200, 25);
		north.adds(myPage, 1200, 10, 30, 30);
		
                contentPane.add(north);


		//West Menu Bar

		ImageIcon logo = new ImageIcon("./img/logo/hanger.png");
                Image logoRe = logo.getImage();
                logoRe = logoRe.getScaledInstance(200, 100, Image.SCALE_SMOOTH);
                logo = new ImageIcon(logoRe);
                JLabel logoImg = new JLabel(logo);

                west.adds(logoImg);

		JButton[] menu = new JButton[5];;
		menu[0] = new JButton("New Clothes");
		menu[1] = new JButton("Pop Chart");
		menu[2] = new JButton("Pop Closets");
		menu[3] = new JButton("Genre Clothes");
		menu[4] = new JButton("My Closets");
		
		for(int i = 0; i < 5; i++){
			menu[i].setBorderPainted(false);
			menu[i].setFocusPainted(false);
			west.adds(menu[i]);
		}		

                contentPane.add(west);

		contentPane.add(center);
                
                CFrame.size(1440,900);
                CFrame.start();

	}
}
