package cr.gui;
  
import cr.algorithm.*;
import cr.usr.*;
import cr.closet.*;
import cr.main.*;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.*;

public class ConcreteStrategyBoard_Grid implements ConcreteStrategyBoard{

	private CustomFrame CFrame;
	private Container CtPane = new Container();
	private JScrollPane scrollPane = new JScrollPane();

	public JScrollPane getDisplayBoard(String[] closetPIDlist, int x, int y){

		String productID = "";

		Border border = BorderFactory.createEmptyBorder( 0, 0, 0, 0 );

		JButton[] rClothesBtn = new JButton[50];

		ImageIcon[] rClo = new ImageIcon[50];
		Image reco_img;

		JPanel gridShow = new JPanel();
		gridShow.setLayout(new GridLayout(10,5));
		
		String[] productPath = new String[50];

		for(int i = 0; i < 50; i++){

			Clothes thisCLo = new Clothes();
			productPath[i] = closetPIDlist[i];

			if(closetPIDlist[i].contains("jpeg"))
                                productID = closetPIDlist[i].substring(0, closetPIDlist[i].length()-5);
                        else
                                productID = closetPIDlist[i].substring(0, closetPIDlist[i].length()-4);

			thisCLo = Main.dataCloset.getClothes(productID);
			rClo[i] = new ImageIcon("./img/clothes/"+closetPIDlist[i]);
			reco_img = rClo[i].getImage();
			reco_img = reco_img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
			rClo[i] = new ImageIcon(reco_img);

			rClothesBtn[i] = new JButton(rClo[i]);
			rClothesBtn[i].setContentAreaFilled(false);
			rClothesBtn[i].setBorderPainted(false);
			rClothesBtn[i].setFocusPainted(false);
	

			rClothesBtn[i].addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent e){

					String productID = "";

					for(int i=0; i<50; i++)
						if(rClothesBtn[i]==e.getSource()){
							productID = productPath[i];
						}
                                        if(Main.user == null)
                                     		CtPane.add(new NorthPanel(CFrame, Main.dataCloset));
                                        else
                                                CtPane.add(new NorthPanel(CFrame, Main.user,Main.dataCloset));
					CtPane.add(new CenterPanel(CFrame,Main.user, 2, Main.dataCloset, productID, ""));
                                        CtPane.add(new WestPanel(CFrame, Main.dataCloset, Main.user));
                                        CFrame.repaint();
                                       	CFrame.setContentPane(CtPane);
                                       	CFrame.setVisible(true); 
                               }
			});

		}

		for(int i = 0; i< 50; i++)
			gridShow.add(rClothesBtn[i]);

		scrollPane = new JScrollPane(gridShow,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		gridShow.setBackground(Color.white);
                scrollPane.setBorder(border);

		return scrollPane;
	}
}
