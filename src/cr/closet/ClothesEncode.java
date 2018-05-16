package cr.closet;

import cr.*;

import java.awt.*;
import java.util.*;

public class ClothesEncode{
	public ClothesEncode(){}
	Type del_type;
	Category del_category;
	Gender del_gender;
	Color del_color;
	Season del_season;
	Style del_style;
	
	public ClothesEncode(int[] feature){
		switch(feature[1]){
			case 1:
			del_category = Category.OUTERWEAR;break;
			case 2:
			del_category = Category.DRESSES;break;
			case 3:
			del_category = Category.SHIRTS_BLOUSES;break;
			case 4:
			del_category = Category.KNITWEAR;break;
			case 5:
			del_category = Category.T_SHIRTS;break;
			case 6:
			del_category = Category.PANTS_TROUSERS;break;
			case 7:
			del_category = Category.SKIRTS;break;
			case 8:
			del_category = Category.BAGS;break;
			case 9:
			del_category = Category.WALLETS;break;
			case 10:
			del_category = Category.HAT;break;
			case 11:
			del_category = Category.CAP;break;
			case 12:
			del_category = Category.BONNET;break;
			case 13:
			del_category = Category.DERBY;break;
			case 14:
			del_category = Category.BOOTS;break;
			case 15:
			del_category = Category.DRESSSHOES;break;
			case 16:
			del_category = Category.SNEAKERS;break;	
		}
		switch(feature[0]){
			case 1:
			del_type = Type.ACCESSORIES;break;
			case 2:
			del_type = Type.SHOES;break;
			case 3:
			del_type = Type.HAT;break;
			case 4:
			del_type = Type.WEAR;break;
		}
		switch(feature[2]){
			case 1:
			del_gender = Gender.WOMAN;break;
			case 2:
			del_gender = Gender.MAN;break;
			case 3:
			del_gender = Gender.CHILDREN;break;
			case 4:
			del_gender = Gender.UNI_SEX;break;
		}
		switch(feature[3]){
			case 1:
			del_color = Color.RED;break;
			case 2:
			del_color = Color.ORANGE;break;
			case 3:
			del_color = Color.YELLOW;break;
			case 4:
			del_color = Color.GREEN;break;
			case 5:
			del_color = Color.BLUE;break;
			case 6:
			del_color = Color.NAVY;break;
			case 7:
			del_color = Color.PURPLE;break;
			case 8:
			del_color = Color.BLACK;break;
			case 9:
			del_color = Color.WHITE;break;
			case 10:
			del_color = Color.PINK;break;
			case 11:
			del_color = Color.GRAY;break;
			case 12:
			del_color = Color.KHAKI;break;
			case 13:
			del_color = Color.BROWN;break;
			case 14:
			del_color = Color.IVORY;break;
			case 15:
			del_color = Color.WINE;break;
			case 16:
			del_color = Color.CHARCOAL;break;
		}
		switch(feature[4]){
			case 1:
			del_season = Season.SPRING;break;
			case 2:
			del_season = Season.SUMMER;break;
			case 3:
			del_season = Season.FALL;break;
			case 4:
			del_season = Season.WINTER;break; 
		}
		switch(feature[5]){
			case 1:
			del_style = Style.STREET;break;
			case 2:
			del_style = Style.FORMAL;break;
			case 3:
			del_style = Style.VINTAGE;break;
			case 4:
			del_style = Style.BOHEMIAN;break;
			case 5:
			del_style = Style.CHIC;break;
			case 6:
			del_style = Style.ARTSY;break;
			case 7:
			del_style = Style.CASUAL;break;
			case 8:
			del_style = Style.SOPHISTICATED;break;
			case 9:
			del_style = Style.TOMBOY;break;
			case 10:
			del_style = Style.ROCKER;break;
			case 11:
			del_style = Style.PREPPY;break;
		}
	//Encode file로 넘기기	
	}
	
	private int temp;
	private int type;
	private int category;
	private int gender;
	private int color;
	private int season;
	private int style;
}
