package cr.closet;

import cr.*;

import java.util.*;
import java.awt.*;

public class ClothesEncode{
	public static int[] feature = new int[6];

	public static int[] clothesEncode(String type, String category, String gender, String color, String season, String style){
		
		switch(type){
			case "ACCESSORIES":
			feature[0]=0; break;
			case "SHOES":
			feature[0]=1; break;
			case "HAT":
			feature[0]=2; break;
			case "WEAR":
			feature[0]=3; break;
		}	

		switch(category){
			case "OUTERWEAR":
			feature[1]=0;break;
			case "DRESSES":
			feature[1]=1;break;
			case "SHIRTS_BLOUSES":
			feature[1]=2;break;
			case "KNITWEAR":
			feature[1]=3;break;
			case "T_SHIRTS":
			feature[1]=4;break;
			case "PANTS_TROUSERS":
			feature[1]=5;break;
			case "SKIRTS":
			feature[1]=6;break;
			case "BAGS":
			feature[1]=7;break;
			case "WALLETS":
			feature[1]=8;break;
			case "HAT":
			feature[1]=9;break;
			case "CAP":
			feature[1]=10;break;
			case "BONNET":
			feature[1]=11;break;
			case "DERBY":
			feature[1]=12;break;
			case "BOOTS":
			feature[1]=13;break;
			case "DRESSSHOES":
			feature[1]=14;break;
			case "SNEAKERS":
			feature[1]=15;break;
			}
		switch(gender){
			case "WOMAN":
			feature[2]=0;break;
			case "MAN":
			feature[2]=1;break;
			case "CHILDREN":
			feature[2]=2;break;
			case "UNI_SEX":
			feature[2]=3;break;
		}
		switch(color){
			case "RED":
			feature[3]=0;break;
			case "ORANGE":
			feature[3]=1;break;
			case "YELLOW":
			feature[3]=2;break;
			case "GREEN":
			feature[3]=3;break;
			case "BLUE":
			feature[3]=4;break;
			case "NAVY":
			feature[3]=5;break;
			case "PURPLE":
			feature[3]=6;break;
			case "BLACK":
			feature[3]=7;break;
			case "WHITE":
			feature[3]=8;break;
			case "PINK":
			feature[3]=9;break;
			case "GRAY":
			feature[3]=10;break;
			case "KHAKI":
			feature[3]=11;break;
			case "BROWN":
			feature[3]=12;break;
			case "IVORY":
			feature[3]=13;break;
			case "WINE":
			feature[3]=14;break;
			case "CHARCOAL":
			feature[3]=15;break;
		}
		switch(season){
			case "SPRING":
			feature[4]=0;break;
			case "SUMMER":
			feature[4]=1;break;
			case "FALL":
			feature[4]=2;break;
			case "WINTER":
			feature[4]=3;break;
		}
		switch(style){
			case "STREET":
			feature[5]=0;break;
			case "FORMAL":
			feature[5]=1;break;
			case "VINTAGE":
			feature[5]=2;break;
			case "BOHEMIAN":
			feature[5]=3;break;
			case "CHIC":
			feature[5]=4;break;
			case "ARTSY":
			feature[5]=5;break;
			case "CASUAL":
			feature[5]=6;break;
			case "SOPHISTICATED":
			feature[5]=7;break;
			case "TOMBOY":
			feature[5]=8;break;
			case "ROCKER":
			feature[5]=9;break;
			case "PREPPY":
			feature[5]=10;break;
		}

		return feature;
	}
}
