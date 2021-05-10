package cr.closet;

import cr.algorithm.*;
import cr.usr.*;
import cr.file.*;
import cr.gui.*;
import cr.main.*;

import java.awt.*;
import java.util.*;

public class ClothesDecode{

	/*
	private static String clothesInfo[0];
	private static String clothesInfo[1];
	private static String clothesInfo[2];
	private static String clothesInfo[3];
	private static String clothesInfo[4];
	private static String clothesInfo[5];
	*/
	public static String[] clothesInfo;
	
	public static String[] clothesDecode(int[] feature){
		clothesInfo = new String[6];
		//System.out.println(feature[0]);
		switch(feature[1]){
			case 0:
			clothesInfo[1] = "OUTERWEAR";break;
			case 1:
			clothesInfo[1] = "DRESSES";break;
			case 2:
			clothesInfo[1] = "SHIRTS/BLOUSES";break;
			case 3:
			clothesInfo[1] = "KNITWEAR";break;
			case 4:
			clothesInfo[1] = "T-SHIRTS";break;
			case 5:
			clothesInfo[1] = "PANTS/TROUSERS";break;
			case 6:
			clothesInfo[1] = "SKIRTS";break;
			case 7:
			clothesInfo[1] = "BAGS";break;
			case 8:
			clothesInfo[1] = "WALLETS";break;
			case 9:
			clothesInfo[1] = "HAT";break;
			case 10:
			clothesInfo[1] = "CAP";break;
			case 11:
			clothesInfo[1] = "BONNET";break;
			case 12:
			clothesInfo[1] = "DERBY";break;
			case 13:
			clothesInfo[1] = "BOOTS";break;
			case 14:
			clothesInfo[1] = "DRESSSHOES";break;
			case 15:
			clothesInfo[1] = "SNEAKERS";break;	
		}
		switch(feature[0]){
			case 0:
			clothesInfo[0] = "ACCESSORIES";break;
			case 1:
			clothesInfo[0] = "SHOES";break;
			case 2:
			clothesInfo[0] = "HAT";break;
			case 3:
			clothesInfo[0] = "WEAR";break;
		}
		switch(feature[2]){
			case 0:
			clothesInfo[2] = "WOMAN";break;
			case 1:
			clothesInfo[2] = "MAN";break;
			case 2:
			clothesInfo[2] = "CHILDREN";break;
			case 3:
			clothesInfo[2] = "UNI-SEX";break;
		}
		switch(feature[3]){
			case 0:
			clothesInfo[3] = "RED";break;
			case 1:
			clothesInfo[3] = "ORANGE";break;
			case 2:
			clothesInfo[3] = "YELLOW";break;
			case 3:
			clothesInfo[3] = "GREEN";break;
			case 4:
			clothesInfo[3] = "BLUE";break;
			case 5:
			clothesInfo[3] = "NAVY";break;
			case 6:
			clothesInfo[3] = "PURPLE";break;
			case 7:
			clothesInfo[3] = "BLACK";break;
			case 8:
			clothesInfo[3] = "WHITE";break;
			case 9:
			clothesInfo[3] = "PINK";break;
			case 10:
			clothesInfo[3] = "GRAY";break;
			case 11:
			clothesInfo[3] = "KHAKI";break;
			case 12:
			clothesInfo[3] = "BROWN";break;
			case 13:
			clothesInfo[3] = "IVORY";break;
			case 14:
			clothesInfo[3] = "WINE";break;
			case 15:
			clothesInfo[3] = "CHARCOAL";break;
		}
		switch(feature[4]){
			case 0:
			clothesInfo[4] = "SPRING";break;
			case 1:
			clothesInfo[4] = "SUMMER";break;
			case 2:
			clothesInfo[4] = "FALL";break;
			case 3:
			clothesInfo[4] = "WINTER";break; 
		}
		switch(feature[5]){
			case 0:
			clothesInfo[5] = "STREET";break;
			case 1:
			clothesInfo[5] = "FORMAL";break;
			case 2:
			clothesInfo[5] = "VINTAGE";break;
			case 3:
			clothesInfo[5] = "BOHEMIAN";break;
			case 4:
			clothesInfo[5] = "CHIC";break;
			case 5:
			clothesInfo[5] = "ARTSY";break;
			case 6:
			clothesInfo[5] = "CASUAL";break;
			case 7:
			clothesInfo[5] = "SOPHISTICATED";break;
			case 8:
			clothesInfo[5] = "TOMBOY";break;
			case 9:
			clothesInfo[5] = "ROCKER";break;
			case 10:
			clothesInfo[5] = "PREPPY";break;
		}
		return clothesInfo;
	}
}
