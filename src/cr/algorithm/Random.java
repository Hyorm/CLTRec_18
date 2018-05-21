package cr.algorithm;

import cr.*;

import java.util.*;
import java.awt.*;

public class Random{
	Map<String, Clothes> closet = new HashMap<String, Clothes>();
	
	public static Clothes randClothes(Closet closet){
		int temp = rand%(map.size());
		this.closet = closet;
		Clothes clothes = closet.get("R"+temp);
	
		return clothes;			
	}
	
	public static Closet randDataCloset(Closet_Set set){
		 	int tempID = rand%(map.size());
			Clothes ID = dataCloset.getClothes("R"+tempID);
			return ID
	}
	
	
	
}
