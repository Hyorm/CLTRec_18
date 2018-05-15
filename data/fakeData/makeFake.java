//package data.fakedata;

import java.util.*;
import java.awt.*;
import java.io.*;

public class makeFake{

	public static void main(String args[]){

		//TODO: make fake data --> file type: csv, content: user, clothes
		String[] WCate = {"Outerwear", "Dresses", "Shirts/Blouses", "Knitwear","T-shirts", "Pants/Trousers", "Skirts",};
		String[] ACate = { "Bags","Wallets"};
		String[] HCate = {"Hat", "Cap", "Bonnet", "Derby"};
		String[] SCate = {"Boots", "DressShoes", "Sneakers"};
		String[] Type = {"Accessories", "Shoes","Hat", "Wear"};
		String[] Gender = {"Woman", "Man", "Children", "Uni-Sex"};
		String[] Color =  {"Red", "Orange", "Yellow", "Green", "Blue", "Navy", "Purple", "Black", "White", "Pink", "Gray", "Khaki", "Brown", "Ivory", "Wine", "Charcoal"};
		String[] Season = {"Spring", "Summer", "Fall", "Winter"};
		String[] Style ={"Street", "Formal", "Vintage", "Bohemian", "Chic", "Artsy", "Casual", "Sophisticated", "Tomboy", "Rocker", "Preppy"};

		try{		
			register("ProductID", "Type", "Category", "Gender", "Color", "Season", "Style");

			Random rn = new Random();
	
			for(int i = 0; i<100000; i++){
				String productID = "";
				if(i==0)
					productID = "0000";
				for(int j = 0; j<5-(int)(Math.log10(i)+1); j++)
					productID += "0";
				productID = "R"+productID+i;
				String type = Type[rn.nextInt(4)];
				String category;
				if(type.equals("Accessories"))
					category = ACate[rn.nextInt(2)];
				else if(type.equals("Shoes"))
					category = SCate[rn.nextInt(3)];
				else if(type.equals("Hat"))
					category = HCate[rn.nextInt(4)];
				else 
					category = WCate[rn.nextInt(7)];
				String gender = Gender[rn.nextInt(4)];
				String color = Color[rn.nextInt(16)];
				String season = Season[rn.nextInt(4)];
				String style = Style[rn.nextInt(11)];

				register(productID, type, category, gender, color, season, style);
		
			}
		}catch(Exception e){

		}

	}


	public static void register(String productID, String type, String category, String gender, String color, String season, String style) throws IOException{

                BufferedWriter old = new BufferedWriter(new FileWriter("../data.csv", true));
                PrintWriter newReg = new PrintWriter(old, true);

                newReg.write(productID+",");
                newReg.write(type+",");
                newReg.write(category+",");
                newReg.write(gender+",");
		newReg.write(color+",");
		newReg.write(season+ ",");
                newReg.write(style+"\n");

                newReg.flush();
                newReg.close();

        }

}
