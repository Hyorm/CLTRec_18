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

public class CenterPanel extends JPanel{

	private Font myFont1 = new Font("arial", Font.PLAIN, 30);
	private Container CtPane = new Container();
	private String productID = "";
	private int keyFlag=1;
	private int closetFlag=0;
	public static String fetureN = "";
	public static String keywordName = "";
	private String[] keyword = {"Street", "Formal", "Vintage", "Bohemian", "Chic", "Artsy", "Casual", "Sophisticated", "Tomboy", "Rocker", "Preppy"};

        public CenterPanel(int flag, String productId, String menuName){
		setPanel();

		if(flag == 0)
			firstCenterPanel_Main(200, 80);
		else if(flag == 1)
			firstCenterPanel_Main(0, 0);
		else if(flag == 2)
			secondCenterPanel_Show_ClT(productId, 0,0);
		else if(flag == 3)
			thirdCenterPanel(menuName, 0,0, 1);
		else if(flag == 4)
			fourthCenterPanel(menuName, 0,0, 1);
		else if(flag ==5)
			fourthCenterPanel(menuName, 0,0, 2);
	
		

	}
	public void setPanel(){
                this.setLayout(null);
                this.setBounds(200,80,1100,820);

                Random rd = new Random();
                Color b =  new Color(rd.nextInt(10000)%256, rd.nextInt(100000)%256, rd.nextInt(1234)%256);
                //this.setBackground(b);

                this.setBackground(Color.white);

	}
	
	public void firstCenterPanel_Main(int x, int y){

		StrategyBoard sb = new StrategyBoard("", new ConcreteStrategyBoard_Grid(), new ConcreteStrategyData_Recent());
		String[] closetPIDlist = sb.setBoardData();
		
		JLabel recoClosetLab = new JLabel("Today's Pick");		
		recoClosetLab.setFont(myFont1);
		JLabel newClothesLab = new JLabel("New Clothes");
		newClothesLab.setFont(myFont1);
		JLabel keyWordLab = new JLabel("Pop KeyWord");
		keyWordLab.setFont(myFont1);
	
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

			nClo[i] = new ImageIcon("./img/clothes/"+closetPIDlist[i]);
			recoRe = nClo[i].getImage();
			recoRe = recoRe.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
			nClo[i] = new ImageIcon(recoRe);

			newClothesBtn[i] = new JButton(nClo[i]);	
	
			newClothesBtn[i].setContentAreaFilled(false);
			newClothesBtn[i].setBorderPainted(false);
			newClothesBtn[i].setFocusPainted(false);

			newClothesBtn[i].addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent e){

					for(int i=0; i<6; i++)
                                                if(newClothesBtn[i]==e.getSource()){
                                                        productID = closetPIDlist[i];
                                                }
                                        CtPane.add(new NorthPanel());
                                        CtPane.add(new CenterPanel( 2, productID, ""));
                                        CtPane.add(new WestPanel());
                                        Main.CFrame.repaint();
                                        Main.CFrame.setContentPane(CtPane);
                                        Main.CFrame.setVisible(true);
				}
                      
			});

		}

		for(int i = 0; i < 11; i++){

			KeyWordBtn[i] = new JButton(keyword[i]);

			KeyWordBtn[i].setBorderPainted(false);

			KeyWordBtn[i].addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent e){
                                        for(int i=0; i<11; i++){
						if(KeyWordBtn[i]==e.getSource()){
						 	keywordName= keyword[i];
							fetureN = "Style";
						}
					}
                                        CtPane.add(new NorthPanel());
                                        CtPane.add(new CenterPanel( 5, "", "Genre Clothes"));
                                        CtPane.add(new WestPanel());
                                        Main.CFrame.repaint();
                                        Main.CFrame.setContentPane(CtPane);
                                        Main.CFrame.setVisible(true);
                                }
                        });

		}

                recoClosetLab.setBounds(100+x, 10+y, 200, 30);
                recoClosetSetBtn[0].setBounds(100+x, 70+y, 400, 200);
                recoClosetSetBtn[1].setBounds(570+x, 70+y, 400, 200);

		newClothesLab.setBounds(100+x, 320+y, 200, 30);

		int num = 100;

		for(int i = 0; i < 6; i++){
	
			newClothesBtn[i].setBounds(num+x,360+y,100,100);

			num += 150;
		}

		int keyWordNum = 100;
		keyWordLab.setBounds(100+x, 490+y, 200, 30);
		for(int i = 0; i < 6; i++){

			KeyWordBtn[i].setBounds(keyWordNum+x,550+y,130,30);
			keyWordNum += 150;

		}
		keyWordNum = 100;
		for(int i = 6; i < 11; i++){

                        KeyWordBtn[i].setBounds(keyWordNum+x,590+y,150,30);
                        keyWordNum += 180;

                }


                this.add(recoClosetLab);
		this.add(newClothesLab);
		this.add(keyWordLab);
	
                for(int i = 0; i< 2; i++){
                        this.add(recoClosetSetBtn[i]);
                }
		for(int i = 0; i < 6; i++){
			this.add(newClothesBtn[i]);
		}
		for(int i = 0; i < 11; i++){
			this.add(KeyWordBtn[i]);

		}
        }
	public void secondCenterPanel_Show_ClT(String productPath,int x, int y){

		String productId="";
		String[] clothesInfo = new String[6];
		Clothes clt = new Clothes();
		String[] infoList = {"Age","Type","Category","Gender","Color","Season","Style"};

		if(productPath.contains("jpeg"))
                	productId = productPath.substring(0, productPath.length()-5);
		else if(productPath.contains("jpg"))
			productId = productPath.substring(0, productPath.length()-4);
		else
			productId = productPath;

		clt = Main.dataCloset.getClothes(productId);
	
		clothesInfo = ClothesDecode.clothesDecode(clt.getFeature());
		
		JLabel productIdLab = new JLabel(productId);
		JLabel[] cltInfoLab = new JLabel[7];
		JLabel[] infoLab = new JLabel[7];

		Font newLabelFont=new Font(productIdLab.getFont().getName(),productIdLab.getFont().getStyle(),50);
		productIdLab.setFont(newLabelFont);		
	
		ImageIcon cltImgIcon;
                Image cltImg;
                JLabel cltImgLab;

		cltImgIcon = new ImageIcon("./img/clothes/"+productPath);
                cltImg = cltImgIcon.getImage();
                cltImg = cltImg.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
                cltImgIcon = new ImageIcon(cltImg);
                cltImgLab = new JLabel(cltImgIcon);

		cltInfoLab[0] = new JLabel(Integer.toString(clt.getTargetAge()));	
		cltInfoLab[0].setBounds(700+x, 150+y, 100, 30);

		int infoListNum = 150;
		for(int i = 0; i< 7; i++){
			infoLab[i] = new JLabel(infoList[i]);
			infoLab[i].setBounds(600+x, infoListNum+y, 100, 30);
			infoListNum += 50;
			this.add(infoLab[i]);
		}


		int cltInfoYnum = 200;
		for(int i = 1; i< 7; i++){

			cltInfoLab[i] = new JLabel(clothesInfo[i-1]);
			cltInfoLab[i].setBounds(700+x, cltInfoYnum+y, 100, 30);
			cltInfoYnum +=50;
		}

		productIdLab.setBounds(100+x, 10+y, 500, 50);
		cltImgLab.setBounds(100+x, 100+y, 400, 400);

		this.add(productIdLab);
		this.add(cltImgLab);
		this.add(cltInfoLab[0]);
		for(int i = 1; i< 7; i++){
			this.add(cltInfoLab[i]);
		}

	}
	
	public void thirdCenterPanel(String menuName, int x, int y, int thirdFlag){

		StrategyBoard sb = new StrategyBoard(menuName, new ConcreteStrategyBoard_Grid(), new ConcreteStrategyData_Recent());

                JLabel menuNameLab = sb.getMenuNameLab();
		String[] closetPIDlist = sb.setBoardData();
		JScrollPane scrollPane = sb.getDisplayBoard(closetPIDlist,x,y);

                menuNameLab.setBounds(100+x, 10+y, 500, 50);	
		scrollPane.setBounds(100+x, 100+y, 900, 550);


                this.add(menuNameLab);
                this.add(scrollPane);

	}
	
	public void fourthCenterPanel(String menuName, int x, int y, int fourthFlag){

		StrategyBoard sb = new StrategyBoard(menuName, new ConcreteStrategyBoard_Line(), new ConcreteStrategyData_Recent());

		if(fourthFlag==2)
			sb = new StrategyBoard(menuName, new ConcreteStrategyBoard_Line(), new ConcreteStrategyData_Style());

		JLabel menuNameLab = sb.getMenuNameLab();
                String[] closetPIDlist = sb.setBoardData();
                JScrollPane scrollPane = sb.getDisplayBoard(closetPIDlist, x, y);
		
		menuNameLab.setBounds(100+x, 10+y, 500, 50);
		scrollPane.setBounds(100+x, 100+y, 900, 550);

		this.add(menuNameLab);
		this.add(scrollPane);
	}
}
