package cr.main;
  
import cr.gui.*;
import cr.usr.*;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class CenterPanel extends JPanel{

	private CustomFrame CFrame;

	

        public CenterPanel(CustomFrame CFrame){

                this.CFrame = CFrame;

		this.setLayout(null);
                this.setBounds(200,80,1240,820);

                Random rd = new Random();
                Color b =  new Color(rd.nextInt(10000)%256, rd.nextInt(100000)%256, rd.nextInt(1234)%256);
                //this.setBackground(b);

                this.setBackground(Color.white);

		JLabel recoClosetLab = new JLabel("Today's Pick");

		JButton[] recoClosetSetBtn = new JButton[2];
		ImageIcon[] reco = new ImageIcon[2];
		Image recoRe;

		for(int i = 0; i < 2; i++){
			reco[i] = new ImageIcon("./img/icon/recoClosetBtn"+i+".png");
			recoRe = reco[i].getImage();
			recoRe = recoRe.getScaledInstance(480, 200, Image.SCALE_SMOOTH);
			reco[i] = new ImageIcon(recoRe);

			recoClosetSetBtn[i] = new JButton(reco[i]);

                	recoClosetSetBtn[i].setContentAreaFilled(false);
                	recoClosetSetBtn[i].setBorderPainted(false);
                	recoClosetSetBtn[i].setFocusPainted(false);

                	recoClosetSetBtn[i].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
                                        //Logout or Set Circumstance

                        	}
	                });	
		}
		recoClosetLab.setBounds(300, 90, 200, 30);
		recoClosetSetBtn[0].setBounds(300, 150, 480, 200);
		recoClosetSetBtn[1].setBounds(800, 150, 480, 200);
	
		this.add(recoClosetLab);

		for(int i = 0; i< 2; i++){
			this.add(recoClosetSetBtn[i]);
		}

	}	
}
