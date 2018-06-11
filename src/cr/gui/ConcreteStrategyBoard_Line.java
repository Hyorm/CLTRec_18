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

public class ConcreteStrategyBoard_Line implements ConcreteStrategyBoard{

	private CustomFrame CFrame;
	private Container CtPane = new Container();

        public JScrollPane getDisplayBoard(String[] closetPIDlist, int x, int y){

		String productID = "";

		Border border = BorderFactory.createEmptyBorder( 0, 0, 0, 0 );

		ImageIcon[] rClo = new ImageIcon[50];
		Image reco_img;
		JScrollPane scrollPane;
		JPanel conPane = new JPanel();
		conPane.setLayout(new GridLayout(51,6));

		String[] col = {"Product Image","Product ID","Category","Season","Style","Color"};

		JLabel[] colLab_0 = new JLabel[50];
		JLabel[] colLab_3 = new JLabel[50];
		JLabel[] colLab_4 = new JLabel[50];
		JLabel[] colLab_5 = new JLabel[50];
		String[] clothesIn;	
		String[] productPath = new String[50];
		JLabel[] cltLab = new JLabel[50];
		JButton[] cloBtn = new JButton[50];
		JLabel[] colLab_Name = new JLabel[6];
/*
		for(int i = 0; i < 6; i++){
			colLab_Name[i] = new JLabel(col[i]);
			colLab_Name[i].setSize(80, 30);
			colLab_Name[i].setHorizontalAlignment(JLabel.CENTER);
			colLab_Name[i].setBounds(100+x+i*147, 60+y, 147, 50);
			this.add(colLab_Name[i]);
		}
*/
		for(int i = 0; i < 50; i++){
		
			Clothes thisCLo = new Clothes();
			clothesIn = new String[6];
			if(closetPIDlist[i].contains("jpeg"))
				productID = closetPIDlist[i].substring(0, closetPIDlist[i].length()-5);
			else if(closetPIDlist[i].contains("jpg"))
				productID = closetPIDlist[i].substring(0, closetPIDlist[i].length()-4);
			else
				productID = closetPIDlist[i];

			productPath[i] = closetPIDlist[i];
			rClo[i] = new ImageIcon("./img/clothes/"+closetPIDlist[i]);
                        reco_img = rClo[i].getImage();
                        reco_img = reco_img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                        rClo[i] = new ImageIcon(reco_img); 
			
			thisCLo = Main.dataCloset.getClothes(productID);
			clothesIn =  ClothesDecode.clothesDecode(thisCLo.getFeature());
			cltLab[i] = new JLabel(rClo[i]);/*Product Image label*/
			cloBtn[i] = new JButton(productID);/*Product ID Btn*/
			colLab_0[i] = new JLabel(clothesIn[0]);/*Product Category label*/
			colLab_4[i] = new JLabel(clothesIn[4]);/*Product Season label*/
			colLab_5[i] = new JLabel(clothesIn[5]);/*Product Style label*/
			colLab_3[i] = new JLabel(clothesIn[3]);/*Product Color label*/

			cloBtn[i].setContentAreaFilled(false);
                        cloBtn[i].setBorderPainted(false);
                        cloBtn[i].setFocusPainted(false);

			cloBtn[i].addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent e){
					String productID = "";
                                        for(int i=0; i<50; i++)
                                                if(cloBtn[i]==e.getSource()){
                                                        productID = productPath[i];
                                        }
                                        CtPane.add(new NorthPanel());
                                        CtPane.add(new CenterPanel( 2,  productID, ""));
                                        CtPane.add(new WestPanel());
                                        Main.CFrame.repaint(); 
                                        Main.CFrame.setContentPane(CtPane);
                                        Main.CFrame.setVisible(true);
                               }
                        });

			cltLab[i].setHorizontalAlignment(JLabel.CENTER);
			cloBtn[i].setHorizontalAlignment(JLabel.CENTER);
			colLab_0[i].setHorizontalAlignment(JLabel.CENTER);
			colLab_4[i].setHorizontalAlignment(JLabel.CENTER);	
			colLab_5[i].setHorizontalAlignment(JLabel.CENTER);
			colLab_3[i].setHorizontalAlignment(JLabel.CENTER);

			conPane.add(cltLab[i]);
			conPane.add(cloBtn[i]);
			conPane.add(colLab_0[i]);
			conPane.add(colLab_4[i]);
			conPane.add(colLab_5[i]);
			conPane.add(colLab_3[i]);
			
		}

		conPane.setBackground(Color.white);

		scrollPane = new JScrollPane(conPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

		scrollPane.setBorder(border);

		return scrollPane;

	}

}
