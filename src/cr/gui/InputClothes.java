package cr.gui;

import cr.usr.*;
import cr.main.*;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class InputClothes extends JFrame{

	private String[] WCategory = {"Outerwear", "Dresses", "Shirts/Blouses", "Knitwear","T-shirts", "Pants/Trousers", "Skirts"};
        private String[] ACategory = { "Bags","Wallets"};
        private String[] HCategory = {"Hat", "Cap", "Bonnet", "Derby"};
        private String[] SCategory = {"Boots", "DressShoes", "Sneakers"};
        private String[] Type = {"Accessories", "Shoes","Hat", "Wear"};
        private String[] Gender = {"Woman", "Man", "Children", "Uni-Sex"};
        private String[] color =  {"Red", "Orange", "Yellow", "Green", "Blue", "Navy", "Purple", "Black", "White", "Pink", "Gray", "Khaki", "Brown", "Ivory", "Wine", "Charcoal"};
        private String[] Season = {"Spring", "Summer", "Fall", "Winter"};
        private String[] Style ={"Street", "Formal", "Vintage", "Bohemian", "Chic", "Artsy", "Casual", "Sophisticated", "Tomboy", "Rocker", "Preppy"};

	private User user;

	private ButtonGroup tyRadioGroup = new ButtonGroup();
        private ButtonGroup caRadioGroup = new ButtonGroup();
        private ButtonGroup geRadioGroup = new ButtonGroup();
        private ButtonGroup coRadioGroup = new ButtonGroup();
        private ButtonGroup seRadioGroup = new ButtonGroup();
        private ButtonGroup stRadioGroup = new ButtonGroup();

	private JRadioButton[] caBtn;

	public InputClothes(User user){
		
		super("Input Clothes Page");
		
		if(user == null){
			this.dispose();
			JOptionPane.showMessageDialog(null, "Please Login", "Please Login",JOptionPane.WARNING_MESSAGE);
		}
		else
			setInputPage();

		this.setSize(800, 700);
		this.setVisible(true);

	}

	public void setPage(){

		this.getContentPane().setBackground(Color.white);
	}
	public void setInputPage(){

		Color b = Color.white;

		Font myFont1 = new Font("arial", Font.PLAIN, 20);
		Font myFont2 = new Font("arial", Font.PLAIN, 30);

		JLabel pageNameLab = new JLabel("INPUT YOUR CLOTHES!");
		pageNameLab.setHorizontalAlignment(SwingConstants.CENTER);
		pageNameLab.setFont(myFont2);

		JLabel noLab1 = new JLabel("");
		JLabel noLab2 = new JLabel("");
		JLabel noLab3 = new JLabel("");

		JPanel inputPane = new JPanel();
		inputPane.setLayout(new GridLayout(8,2));
		inputPane.setBackground(b);

		JPanel typePane = new JPanel();
		typePane.setLayout(new GridLayout(2, 2, 5, 5));
		typePane.setBackground(b);

		JPanel catePane = new JPanel();
                catePane.setLayout(new GridLayout(3, 3, 5, 5));
		catePane.setBackground(b);

		JPanel genderPane = new JPanel();
                genderPane.setLayout(new GridLayout(2, 2, 5, 5));
		genderPane.setBackground(b);

		JPanel colorPane = new JPanel();
                colorPane.setLayout(new GridLayout(4, 4, 5, 5));
		colorPane.setBackground(b);

		JPanel seasonPane = new JPanel();
                seasonPane.setLayout(new GridLayout(2, 2, 5, 5));
		seasonPane.setBackground(b);

		JPanel stylePane = new JPanel();
                stylePane.setLayout(new GridLayout(4, 4, 5, 5));
		stylePane.setBackground(b);

		JLabel typeLab = new JLabel("TYPE");
		JLabel cateLab = new JLabel("CATEGORY");
		JLabel gendLab = new JLabel("GENDER");
		JLabel coloLab = new JLabel("COLOR");
		JLabel seasLab = new JLabel("SEASON");
		JLabel stylLab = new JLabel("STYLE");

		typeLab.setHorizontalAlignment(SwingConstants.CENTER);
                typeLab.setFont(myFont1);
		cateLab.setHorizontalAlignment(SwingConstants.CENTER);
                cateLab.setFont(myFont1);
		gendLab.setHorizontalAlignment(SwingConstants.CENTER);
                gendLab.setFont(myFont1);
		coloLab.setHorizontalAlignment(SwingConstants.CENTER);
		coloLab.setFont(myFont1);
		seasLab.setHorizontalAlignment(SwingConstants.CENTER);
		seasLab.setFont(myFont1);
		stylLab.setHorizontalAlignment(SwingConstants.CENTER);
		stylLab.setFont(myFont1);

		JRadioButton[] tyBtn = new JRadioButton[Type.length];
		//JRadioButton[] caBtn = new JRadioButton[Cate.length];//private
		JRadioButton[] geBtn = new JRadioButton[Gender.length];
		JRadioButton[] coBtn = new JRadioButton[color.length];
		JRadioButton[] seBtn = new JRadioButton[Season.length];
		JRadioButton[] stBtn = new JRadioButton[Style.length];

		for(int i = 0; i < Type.length; i++){
			tyBtn[i] = new JRadioButton(Type[i]);
			tyRadioGroup.add(tyBtn[i]);
			tyBtn[i].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					for (int i = 0; i < Type.length; i++){

						if (e.getSource() == tyBtn[i]){

								for(int j = 0; j < Type.length; j++){
                        						tyBtn[j] = new JRadioButton(Type[j]);
                        						tyRadioGroup.add(tyBtn[j]);
                        						tyBtn[j].addActionListener(new ActionListener() {

                	                				public void actionPerformed(ActionEvent e) {

        	                                				for (int i = 0; i < Type.length; i++){
	
        	                                        				if (e.getSource() == tyBtn[i]){
											

                        	                        				}
                	                        				}
        	                        				}
	
                        					});
                					}
		
						}
					}
				}
			
			});
		}
		
		for(int i = 0; i < Gender.length; i++){

			geBtn[i] = new JRadioButton(Gender[i]);
			geRadioGroup.add(geBtn[i]);
			geBtn[i].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					for (int i = 0; i < Gender.length; i++){

						if (e.getSource() == geBtn[i]){

							
	
						}
					}
				}			
			});
		}

		for(int i = 0; i < color.length; i++){
				
			coBtn[i] = new JRadioButton(color[i]);
			coRadioGroup.add(coBtn[i]);
			coBtn[i].addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {

					for (int i = 0; i < color.length; i++){

						if (e.getSource() == coBtn[i]){

				
						}
					}
				}
			});
		}
		for(int i = 0; i < Season.length; i++){

                        seBtn[i] = new JRadioButton(Season[i]);
                        seRadioGroup.add(seBtn[i]);
                        seBtn[i].addActionListener(new ActionListener() {

                                public void actionPerformed(ActionEvent e) {

                                        for (int i = 0; i < Season.length; i++){

                                                if (e.getSource() == seBtn[i]){


                                                }
                                        }
                                }
                        });
                }
		for(int i = 0; i < Style.length; i++){

                        stBtn[i] = new JRadioButton(Style[i]);
                        stRadioGroup.add(stBtn[i]);
                        stBtn[i].addActionListener(new ActionListener() {

                                public void actionPerformed(ActionEvent e) {

                                        for (int i = 0; i < Style.length; i++){

                                                if (e.getSource() == stBtn[i]){


                                                }
                                        }
                                }
                        });
                }
		for(int i = 0; i<Type.length; i++)
                	typePane.add(tyBtn[i]);
		//for(int i = 0; i<Type.length; i++)
		//	catePane.add(tyBtn[i]);
		for(int i = 0; i<Gender.length; i++)
			genderPane.add(geBtn[i]);
		for(int i = 0; i<color.length; i++)
			colorPane.add(coBtn[i]);
		for(int i = 0; i<Season.length; i++)
			seasonPane.add(seBtn[i]);
		for(int i = 0; i<Style.length; i++)
			stylePane.add(stBtn[i]);
		inputPane.add(pageNameLab);	
		inputPane.add(noLab1);
		inputPane.add(typeLab);
		inputPane.add(typePane);
		inputPane.add(cateLab);
                inputPane.add(catePane);
		inputPane.add(gendLab);
                inputPane.add(genderPane);
		inputPane.add(coloLab);
                inputPane.add(colorPane);
		inputPane.add(seasLab);
                inputPane.add(seasonPane);
		inputPane.add(stylLab);
                inputPane.add(stylePane);
		inputPane.add(noLab2);
		inputPane.add(noLab3);
		this.add(inputPane);
	}
}
