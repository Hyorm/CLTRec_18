package cr.closet;
  
import cr.*;

import java.util.*;
import java.awt.*;

public class Clothes{

	private int[] feature = new int[6];

	private static String productId;

	private static int targetAge;//1010 || 1020 || etc
	
	public Clothes(){}

	public Clothes(String[] data){
	
		this.productId = data[0];
		this.targetAge = Integer.parseInt(data[1]);
		this.feature = ClothesEncode.clothesEncode(data[2], data[3], data[4], data[5], data[6], data[7]);

	}

	public Clothes(String productId, String type, String category, String gender, String color, String season, String style, String targetAge){
		this.productId = productId;
		this.targetAge = Integer.parseInt(targetAge);
					
		this.feature = ClothesEncode.clothesEncode(type, category, gender, color, season, style);
		//Codec Invoke
		/*
		this.feature = this.feature + tenToBin(type);
		this.feature = this.feature + tenToBin(category);
		this.feature = this.feature + tenToBin(gender);
		this.feature = this.feature + tenToBin(color);
		this.feature = this.feature + tenToBin(season);
		this.feature = this.feature + tenToBin(style);
		
		if((feature.length>24)||feature.length<0)
                        System.out.println("Invalid Feature Information");
		*/
	}

	public int[] getFeature(){

		return feature;
	}

	public String getProductId(){
		return this.productId;
		
	}

	public int getTargetAge(){
		return this.targetAge;
	}
	
	public String tenToBin(int ten){

		String bin = "";

		while (ten > 1) {

			bin = ten % 2 + bin;
			ten = ten / 2;
		}
		bin = ten + bin;

		if((bin.length()>4)||bin.length()<0)
			System.out.println("Invalid bin Information");
	
		if(bin.length()<4)
			for(int i = 0; i<4-bin.length(); i++)
				bin = "0" + bin;
		return bin;
	}
}
