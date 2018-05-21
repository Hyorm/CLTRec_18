package cr.closet;

import cr.*;

import java.awt.*;
import java.util.*;

public class ClothesDecode{

	private String del_type;
	private String del_category;
	private String del_gender;
	private String del_color;
	private String del_season;
	private String del_style;
	
	public String[] clothesInfo = new String[6];
	
	public static String[] clothesDecode(int[] feature){
		switch(feature[1]){
			case 0:
			del_category = "OUTERWEAR";break;
			case 1:
			del_category = "DRESSES";break;
			case 2:
			del_category = "SHIRTS_BLOUSES";break;
			case 3:
			del_category = "KNITWEAR";break;
			case 4:
			del_category = "T_SHIRTS";break;
			case 5:
			del_category = "PANTS_TROUSERS";break;
			case 6:
			del_category = "SKIRTS";break;
			case 7:
			del_category = "BAGS";break;
			case 8:
			del_category = "WALLETS";break;
			case 9:
			del_category = "HAT";break;
			case 10:
			del_category = "CAP";break;
			case 11:
			del_category = "BONNET";break;
			case 12:
			del_category = "DERBY";break;
			case 13:
			del_category = "BOOTS";break;
			case 14:
			del_category = "DRESSSHOES";break;
			case 15:
			del_category = "SNEAKERS";break;	
		}
		switch(feature[0]){
			case 0:
			del_type = "ACCESSORIES";break;
			case 1:
			del_type = "SHOES";break;
			case 2:
			del_type = "HAT";break;
			case 3:
			del_type = "WEAR";break;
		}
		switch(feature[2]){
			case 0:
			del_gender = "WOMAN";break;
			case 1:
			del_gender = "MAN";break;
			case 2:
			del_gender = "CHILDREN";break;
			case 3:
			del_gender = "UNI_SEX";break;
		}
		switch(feature[3]){
			case 0:
			del_color = "RED";break;
			case 1:
			del_color = "ORANGE";break;
			case 2:
			del_color = "YELLOW";break;
			case 3:
			del_color = "GREEN";break;
			case 4:
			del_color = "BLUE";break;
			case 5:
			del_color = "NAVY";break;
			case 6:
			del_color = "PURPLE";break;
			case 7:
			del_color = "BLACK";break;
			case 8:
			del_color = "WHITE";break;
			case 9:
			del_color = "PINK";break;
			case 10:
			del_color = "GRAY";break;
			case 11:
			del_color = "KHAKI";break;
			case 12:
			del_color = "BROWN";break;
			case 13:
			del_color = "IVORY";break;
			case 14:
			del_color = "WINE";break;
			case 15:
			del_color = "CHARCOAL";break;
		}
		switch(feature[4]){
			case 0:
			del_season = "SPRING";break;
			case 1:
			del_season = "SUMMER";break;
			case 2:
			del_season = "FALL";break;
			case 3:
			del_season = "WINTER";break; 
		}
		switch(feature[5]){
			case 0:
			del_style = "STREET";break;
			case 1:
			del_style = "FORMAL";break;
			case 2:
			del_style = "VINTAGE";break;
			case 3:
			del_style = "BOHEMIAN";break;
			case 4:
			del_style = "CHIC";break;
			case 5:
			del_style = "ARTSY";break;
			case 6:
			del_style = "CASUAL";break;
			case 7:
			del_style = "SOPHISTICATED";break;
			case 8:
			del_style = "TOMBOY";break;
			case 9:
			del_style = "ROCKER";break;
			case 10:
			del_style = "PREPPY";break;
		}
		setDecodec();
		return clothesInfo;
	}
	public static void setDecodec(){
		
		this.clothesInfo[0] = del_type;
		this.clothesInfo[1] = del_category;
		this.clothesInfo[2] = del_gender;
		this.clothesInfo[3] = del_color;
		this.clothesInfo[4] = del_season;
		this.clothesInfo[5] = del_style;
	
	}
}
