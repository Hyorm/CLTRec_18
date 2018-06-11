package cr.algorithm;
  
import cr.gui.*;
import cr.usr.*;
import cr.closet.*;
import cr.main.*;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.*;

public class ConcreteType extends GenericRecommend{

	private static String[] productIDList = new String[50];
	private static Integer[] featAdd = new Integer[2];

	public ConcreteType(ConcreteStrategyCloset closet){
		super(closet);
	}

	public String[] makeRecommendProductID(){
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

		return productIDList;
	}

	public String[] getPathImagList(){

		return productIDList;

	}

	public static Integer[] findFeature(){

		String[] productIDList = new String[50];
		String[] featureNum = {"Type", "Category", "Gender", "Color", "Season", "Style"};
		String[] Category = {"Outerwear", "Dresses", "Shirts/Blouses", "Knitwear","T-shirts", "Pants/Trousers", "Skirts", "Bags","Wallets","Hat", "Cap", "Bonnet", "Derby","Boots", "DressShoes", "Sneakers"};
        	String[] Type = {"Accessories", "Shoes","Hat", "Wear"};
        	String[] Gender = {"Woman", "Man", "Children", "Uni-Sex"};
        	String[] color =  {"Red", "Orange", "Yellow", "Green", "Blue", "Navy", "Purple", "Black", "White", "Pink", "Gray", "Khaki", "Brown", "Ivory", "Wine", "Charcoal"};
        	String[] Season = {"Spring", "Summer", "Fall", "Winter"};
        	String[] Style ={"Street", "Formal", "Vintage", "Bohemian", "Chic", "Artsy", "Casual", "Sophisticated", "Tomboy", "Rocker", "Preppy"};


		String keyword = CenterPanel.keywordName;
                String fetureN = CenterPanel.fetureN;

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
