package cr.main;
  
import cr.gui.*;
import cr.usr.*;
import cr.closet.*;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.*;

public class CenterPanel extends JPanel{

	private CustomFrame CFrame;
	private User user;
	private Closet dataCloset;
	private Container CtPane = new Container();

        public CenterPanel(CustomFrame CFrame, User user, int flag, Closet dataCloset, String productId, String manuName){
		this.dataCloset = dataCloset;
		if(user != null)
			this.user = user;
		setPanel(CFrame);

		if(flag == 0)
			firstCenterPanel_Main(200, 80);
		else if(flag == 1)
			firstCenterPanel_Main(0, 0);
		else if(flag == 2)
			secondCenterPanel_Show_ClT(productId, 0,0);
		else if(flag == 3)
			thirdCenterPanel(0,0, 1);
		else if(flag == 4){
			fourthCenterPanel(manuName, 0,0, 1);
	
		}

	}
	public void setPanel(CustomFrame CFrame){
		this.CFrame = CFrame;
                this.setLayout(null);
                this.setBounds(200,80,1100,820);

                Random rd = new Random();
                Color b =  new Color(rd.nextInt(10000)%256, rd.nextInt(100000)%256, rd.nextInt(1234)%256);
                //this.setBackground(b);

                this.setBackground(Color.white);

	}
	
	public void firstCenterPanel_Main(int x, int y){
		
		String[] keyword = {"Street", "Formal", "Vintage", "Bohemian", "Chic", "Artsy", "Casual", "Sophisticated", "Tomboy", "Rocker", "Preppy"};

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
					if(user == null)
                                        	CtPane.add(new NorthPanel(CFrame, dataCloset));
                                	else
                                        	CtPane.add(new NorthPanel(CFrame, user,dataCloset));
                                        CtPane.add(new CenterPanel(CFrame,user, 2,dataCloset, "R99999",""));
                                        CtPane.add(new WestPanel(CFrame, dataCloset, user));
                                        CFrame.repaint();
                                        CFrame.setContentPane(CtPane);
                                        CFrame.setVisible(true); 

                                }
			});

		}

		for(int i = 0; i < 11; i++){

			KeyWordBtn[i] = new JButton(keyword[i]);

			KeyWordBtn[i].setBorderPainted(false);

			KeyWordBtn[i].addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent e){
                                        //Logout or Set Circumstance

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
	public void secondCenterPanel_Show_ClT(String productId,int x, int y){

		String[] clothesInfo = new String[6];
		Clothes clt = new Clothes();
		clt = dataCloset.getClothes(productId);
		String[] infoList = {"Age","Type","Category","Gender","Color","Season","Style"};
		
		clothesInfo = ClothesDecode.clothesDecode(clt.getFeature());
		JLabel productIdLab = new JLabel(productId);
		JLabel[] cltInfoLab = new JLabel[7];
		JLabel[] infoLab = new JLabel[7];

		Font newLabelFont=new Font(productIdLab.getFont().getName(),productIdLab.getFont().getStyle(),50);
		productIdLab.setFont(newLabelFont);		
	
		ImageIcon cltImgIcon;
                Image cltImg;
                JLabel cltImgLab;

		cltImgIcon = new ImageIcon("./img/clothes/"+productId+".jpg");
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
	
	public void thirdCenterPanel(int x, int y, int thirdFlag){
		JLabel recomm = new JLabel("Recommend Clothes");
		JButton[] rClothesBtn = new JButton[50];
		ImageIcon[] rClo = new ImageIcon[50];
		
		Image reco_img;
		
		String[] closetPIDlist = new String[50];

                if(thirdFlag==1)
                        closetPIDlist = RecentClothes.recentClothes();
		
		for(int i = 0; i < 50; i++){

                        String productID;
                        Clothes thisCLo = new Clothes();
                        if(closetPIDlist[i].contains("jpeg"))
                                productID = closetPIDlist[i].substring(0, closetPIDlist[i].length()-5);
                        else
                                productID = closetPIDlist[i].substring(0, closetPIDlist[i].length()-4);

                        thisCLo = dataCloset.getClothes(productID);

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
					for(int i=0; i<50; i++)
						if(rClothesBtn[i]==e.getSource()){
                                        	if(user == null)
                                        	        CtPane.add(new NorthPanel(CFrame, dataCloset));
                                        	else
                                        	        CtPane.add(new NorthPanel(CFrame, user,dataCloset));
						CtPane.add(new CenterPanel(CFrame,user, 2, dataCloset, productID, ""));
                                        	CtPane.add(new WestPanel(CFrame, dataCloset, user));
                                        	CFrame.repaint();
                                        	CFrame.setContentPane(CtPane);
                                        	CFrame.setVisible(true); 
					}
                                }
			});

		}
		
		int pos_x = 100;
		int pos_y = 100;

		for(int i = 0; i < 30; i++){
	
			rClothesBtn[i].setBounds(pos_x+x, pos_y+y, 100, 100);

			pos_x += 150;
			if(i % 6 == 0) {
				pos_y += 150;
				pos_x = 100;
			}
		}
		
		for(int i = 0; i < 6; i++){
			this.add(rClothesBtn[i]);
		}
		

	}
	
	public void fourthCenterPanel(String manuName, int x, int y, int fourthFlag){

		Border border = BorderFactory.createEmptyBorder( 0, 0, 0, 0 );
		JLabel menuNameLab = new JLabel(manuName);

		JTable menuTable;
		JScrollPane scrollPane;
		Object[] col = {"","Product ID","Category","Season","Style","Color"};
		Object[][] row = new Object[50][6];
		String[] clothesIn;	
		String[] closetPIDlist = new String[50];

		if(fourthFlag==1)
			closetPIDlist = RecentClothes.recentClothes();

		for(int i = 0; i < 50; i++){
		
			ImageIcon cltImgIcon;	
			String productID;
			Clothes thisCLo = new Clothes();
			clothesIn = new String[6];
			if(closetPIDlist[i].contains("jpeg"))
				productID = closetPIDlist[i].substring(0, closetPIDlist[i].length()-5);
			else
				productID = closetPIDlist[i].substring(0, closetPIDlist[i].length()-4);

			thisCLo = dataCloset.getClothes(productID);
			clothesIn =  ClothesDecode.clothesDecode(thisCLo.getFeature());
			row[i][0] = new ImageIcon("./img/clothes/"+closetPIDlist[i]);/*Product Image label*/
			row[i][1] = productID;/*Product ID label*/
			row[i][2] = clothesIn[0];/*Product Category label*/
			row[i][3] = clothesIn[4];/*Product Season label*/
			row[i][4] = clothesIn[5];/*Product Style label*/
			row[i][5] = clothesIn[3];/*Product Color label*/
		}

		menuTable = new JTable(row, col);
		scrollPane = new JScrollPane(menuTable);
		menuTable.setRowHeight(100);
		menuNameLab.setBounds(100+x, 10+y, 500, 50);
		scrollPane.setBounds(100+x, 100+y, 900, 550);
		scrollPane.setBorder(border);
		this.add(menuNameLab);
		this.add(scrollPane);
	}
}
