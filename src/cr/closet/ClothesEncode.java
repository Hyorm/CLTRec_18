package cr.closet;

import cr.algorithm.*;
import cr.usr.*;
import cr.file.*;
import cr.gui.*;
import cr.main.*;

import java.util.*;
import java.awt.*;

public class ClothesEncode{

	public static int[] clothesEncode(String type, String category, String gender, String color, String season, String style){

		int[] feature = new int[6];

		type = type.toUpperCase();
		category = category.toUpperCase();
		gender = gender.toUpperCase();
		color = color.toUpperCase();
		season = season.toUpperCase();
		style = style.toUpperCase();

		if(type.equals("ACCESSORIES"))
			feature[0]=0;
		else if(type.equals("SHOES"))
			feature[0]=1;
		else if(type.equals("HAT"))
			feature[0]=2;
		else if(type.equals("WEAR"))
			feature[0]=3;	

		if(category.equals("OUTERWEAR"))
			feature[1]=0;
		else if(category.equals("DRESSES"))
			feature[1]=1;
		else if(category.equals("SHIRTS/BLOUSES"))
			feature[1]=2;
		else if(category.equals("KNITWEAR"))
			feature[1]=3;
		else if(category.equals("T-SHIRTS"))
			feature[1]=4;
		else if(category.equals("PANTS/TROUSERS"))
			feature[1]=5;
		else if(category.equals("SKIRTS"))
			feature[1]=6;
		else if(category.equals("BAGS"))
			feature[1]=7;
		else if(category.equals("WALLETS"))
			feature[1]=8;
		else if(category.equals("HAT"))
			feature[1]=9;
		else if(category.equals("CAP"))
			feature[1]=10;
		else if(category.equals("BONNET"))
			feature[1]=11;
		else if(category.equals("DERBY"))
			feature[1]=12;
		else if(category.equals("BOOTS"))
			feature[1]=13;
		else if(category.equals("DRESSSHOES"))
			feature[1]=14;
		else if(category.equals("SNEAKERS"))
			feature[1]=15;
		
		if(gender.equals("WOMAN"))
			feature[2]=0;
		else if(gender.equals("MAN"))
			feature[2]=1;
		else if(gender.equals("CHILDREN"))
			feature[2]=2;
		else if(gender.equals("UNI-SEX"))
			feature[2]=3;

		if(color.equals("RED"))
			feature[3]=0;
		else if(color.equals("ORANGE"))
			feature[3]=1;
		else if(color.equals("YELLOW"))
			feature[3]=2;
		else if(color.equals("GREEN"))
			feature[3]=3;
		else if(color.equals("BLUE"))
			feature[3]=4;
		else if(color.equals("NAVY"))
			feature[3]=5;
		else if(color.equals("PURPLE"))
			feature[3]=6;
		else if(color.equals("BLACK"))
			feature[3]=7;
		else if(color.equals("WHITE"))
			feature[3]=8;
		else if(color.equals("PINK"))
			feature[3]=9;
		else if(color.equals("GRAY"))
			feature[3]=10;
		else if(color.equals("KHAKI"))
			feature[3]=11;
		else if(color.equals("BROWN"))
			feature[3]=12;
		else if(color.equals("IVORY"))
			feature[3]=13;
		else if(color.equals("WINE"))
			feature[3]=14;
		else if(color.equals("CHARCOAL"))
			feature[3]=15;
		
		if(season.equals("SPRING"))
			feature[4]=0;
		else if(season.equals("SUMMER"))
			feature[4]=1;
		else if(season.equals("FALL"))
			feature[4]=2;
		else if(season.equals("WINTER"))
			feature[4]=3;

		if(style.equals("STREET"))
			feature[5]=0;
		else if(style.equals("FORMAL"))
			feature[5]=1;
		else if(style.equals("VINTAGE"))
			feature[5]=2;
		else if(style.equals("BOHEMIAN"))
			feature[5]=3;
		else if(style.equals("CHIC"))
			feature[5]=4;
		else if(style.equals("ARTSY"))
			feature[5]=5;
		else if(style.equals("CASUAL"))
			feature[5]=6;
		else if(style.equals("SOPHISTICATED"))
			feature[5]=7;
		else if(style.equals("TOMBOY"))
			feature[5]=8;
		else if(style.equals("ROCKER"))
			feature[5]=9;
		else if(style.equals("PREPPY"))
			feature[5]=10;
		return feature;
	}
}
