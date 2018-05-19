/**
*
*@author KimHyoRim
*
*@since 2018.05.04
*
*This is main class
*Manage entire system
*
*/

package cr.main;

import cr.gui.*;
import cr.usr.*;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class Main{

		//Singlton User
		static private User user;

		//FrameLayout
		static CustomFrame CFrame = new CustomFrame("CLTRec_Beta");
		static CompositePanel north = new CompositePanel();
		static CompositePanel west = new CompositePanel();
		static protected CompositePanel center = new CompositePanel();
		static protected Container contentPane = new Container();	

	public static void main(String[] args){

		String[] noUser = {"default","default","nil", "nil", "1234"};

		user = new User(noUser);

		//West MenuBar Comonent
		ImageIcon logo;
		Image logoRe;
		JLabel logoImg;
		JButton[] menu = new JButton[5];

		//Set LayOut
		west = new CompositePanel(9,1,0,80,200,850);
               	//CompositePanel center = new CompositePanel(200,80,1240,850);
                
		contentPane = CFrame.getContentPane();

                //North Menu Bar
              
                contentPane.add(new NorthPanel(CFrame));

                //West Menu Bar

                logo = new ImageIcon("./img/logo/hanger.png");
                logoRe = logo.getImage();
                logoRe = logoRe.getScaledInstance(200, 100, Image.SCALE_SMOOTH);
                logo = new ImageIcon(logoRe);
                logoImg = new JLabel(logo);

                west.adds(logoImg);

                menu = new JButton[5];
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
