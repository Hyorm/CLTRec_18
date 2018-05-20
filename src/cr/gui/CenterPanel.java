package cr.main;
  
import cr.gui.*;
import cr.usr.*;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class CenterPanel extends JPanel{

	private CustomFrame CFrame;

        public CenterPanel(CustomFrame CFrame, int flag){

		this.CFrame = CFrame;
		if(flag == 0)
			firstCenterPanel(200, 80);
		else
			firstCenterPanel(0, 0);

	}
	
	public void firstCenterPanel(int x, int y){
		
		String[] keyword = {"Street", "Formal", "Vintage", "Bohemian", "Chic", "Artsy", "Casual", "Sophisticated", "Tomboy", "Rocker", "Preppy"};

		this.setLayout(null);
                this.setBounds(200,80,1240,820);

                Random rd = new Random();
                Color b =  new Color(rd.nextInt(10000)%256, rd.nextInt(100000)%256, rd.nextInt(1234)%256);
                //this.setBackground(b);

                this.setBackground(Color.white);

		JLabel recoClosetLab = new JLabel("Today's Pick");
		JLabel newClothesLab = new JLabel("New Clothes");
		JLabel keyWordLab = new JLabel("Pop KeyWord");

		JButton[] recoClosetSetBtn = new JButton[2];
		JButton[] newClothesBtn = new JButton[6];
		JButton[] KeyWordBtn = new JButton[11];

		ImageIcon[] reco = new ImageIcon[2];
		ImageIcon[] nClo = new ImageIcon[6];
		Image recoRe;

		for(int i = 0; i < 2; i++){
			reco[i] = new ImageIcon("./img/icon/recoClosetBtn"+i+".png");
			recoRe = reco[i].getImage();
			recoRe = recoRe.getScaledInstance(400, 200, Image.SCALE_SMOOTH);
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

		for(int i = 0; i < 6; i++){

			nClo[i] = new ImageIcon("./img/clothes/newClothes"+i+".jpg");
			recoRe = nClo[i].getImage();
			recoRe = recoRe.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
			nClo[i] = new ImageIcon(recoRe);

			newClothesBtn[i] = new JButton(nClo[i]);	
	
			newClothesBtn[i].setContentAreaFilled(false);
			newClothesBtn[i].setBorderPainted(false);
			newClothesBtn[i].setFocusPainted(false);

			newClothesBtn[i].addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent e){
                                        //Logout or Set Circumstance

                                }
			});

		}


                recoClosetLab.setBounds(100+x, 10+y, 200, 30);
                recoClosetSetBtn[0].setBounds(100+x, 70+y, 400, 200);
                recoClosetSetBtn[1].setBounds(570+x, 70+y, 400, 200);

		newClothesLab.setBounds(100+x, 320+y, 200, 20);

		int num = 100;

		for(int i = 0; i < 6; i++){
	
			newClothesBtn[i].setBounds(num+x,350+y,100,100);

			num += 150;
		}

                this.add(recoClosetLab);
		this.add(newClothesLab);

                for(int i = 0; i< 2; i++){
                        this.add(recoClosetSetBtn[i]);
                }
		for(int i = 0; i < 6; i++){
			this.add(newClothesBtn[i]);
		}

        }
}
