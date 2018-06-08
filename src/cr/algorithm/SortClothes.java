package cr.algorithm;
  
import cr.usr.*;
import cr.closet.*;
import cr.main.*;
import cr.gui.*;

import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SortClothes{

	private static String keyword = "";
	private User user = new User();
	private static String fetureN = "";
	private static String[] productIDList = new String[50];
	private static String[] featureNum = {"Type", "Category", "Gender", "Color", "Season", "Style"};
	private static String[] Category = {"Outerwear", "Dresses", "Shirts/Blouses", "Knitwear","T-shirts", "Pants/Trousers", "Skirts", "Bags","Wallets","Hat", "Cap", "Bonnet", "Derby","Boots", "DressShoes", "Sneakers"};
        private static String[] Type = {"Accessories", "Shoes","Hat", "Wear"};
        private static String[] Gender = {"Woman", "Man", "Children", "Uni-Sex"};
        private static String[] color =  {"Red", "Orange", "Yellow", "Green", "Blue", "Navy", "Purple", "Black", "White", "Pink", "Gray", "Khaki", "Brown", "Ivory", "Wine", "Charcoal"};
        private static String[] Season = {"Spring", "Summer", "Fall", "Winter"};
        private static String[] Style ={"Street", "Formal", "Vintage", "Bohemian", "Chic", "Artsy", "Casual", "Sophisticated", "Tomboy", "Rocker", "Preppy"};

	private static Integer[] featAdd = new Integer[2];

	private Closet selectCloset;

	public static String[] sortClothes(int flag, int closetFlag, String fetureN, String keyword){

		keyword = CenterPanel.keywordName;	
		fetureN = CenterPanel.fetureN;

		System.out.println(keyword +"+"+fetureN);

		if(flag == 1)
                        sortClothesKeyword();
                else if(flag == 2)
                        sortClothesPop();
                else /*if(flag == 3)*/
                        sorthClothesNew();

		return productIDList;
	}

	public static String[] sortClothes(User user, int flag,String fetureN, String keyword){

		if(keyword!=null)
                        keyword = keyword;
		if(fetureN!=null)
                        fetureN = fetureN;
		user = user;

		if(flag == 1)
			sortClothesKeyword();
                else if(flag == 2)
			sortClothesPop();
                else if(flag == 3)
                        sorthClothesNew();
	
		return productIDList;

	}

	public static void sortClothesKeyword(){
		
		Set<String> keySet = Main.dataCloset.getKeySet();
		Iterator<String> iterator = keySet.iterator();
		featAdd = findFeature();
		int iter = 0;
		while(iterator.hasNext()) {

			if(iter>=50)
                                break;

			String key = iterator.next();
			Clothes value = Main.dataCloset.getClothes(key);
			if(value.getFeature()[featAdd[0]]==featAdd[1]){
				productIDList[iter++] = key;
			}

		}

	}

	public static void sortClothesPop(){



	}
	public static void sorthClothesNew(){



	}

	public static Integer[] findFeature(){

		keyword = CenterPanel.keywordName;
                fetureN = CenterPanel.fetureN;

                System.out.println(keyword +"+"+fetureN);

		for(int i = 0; i< featureNum.length; i++){
			if(featureNum[i].equals(fetureN))
				featAdd[0] = i;
		}
		
		if(featAdd[0]==0)
			for(int i = 0; i< Category.length; i++){
                	        if(Category[i].equals(keyword))
                        	        featAdd[1] = i;
                }
		else if(featAdd[0]==1)
                        for(int i = 0; i< Type.length; i++){
                                if(Type[i].equals(keyword))
                                        featAdd[1] = i;
                }
		else if(featAdd[0]==2)
                        for(int i = 0; i< Gender.length; i++){
                                if(Gender[i].equals(keyword))
                                        featAdd[1] = i;
                }
		else if(featAdd[0]==3)
                        for(int i = 0; i< color.length; i++){
                                if(color[i].equals(keyword))
                                        featAdd[1] = i;
                }
		else if(featAdd[0]==4)
                        for(int i = 0; i< Season.length; i++){
                                if(Season[i].equals(keyword))
                                        featAdd[1] = i;
                }
		else{

			for(int i = 0; i< Style.length; i++){
                                if(Style[i].equals(keyword))
                                        featAdd[1] = i;
			}
		}
		System.out.println(featAdd[0]);
		System.out.println(featAdd[1]);
		return featAdd;
	}
}
