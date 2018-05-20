package cr.closet;
  
import cr.*;

import java.util.*;
import java.awt.*;

public class Clothes{

	public Clothes(){}

	public Clothes(String productId){
	
		this.productId = productId;

	}

	public Clothes(String productId, String type, String category, String gender, String color, String season, String style, String targetAge){
		this.productId = productId;
		this.targetAge = Integer.parseInt(targetAge);
					
		ClothesEncode feature = new ClothesEncode(type, category, gender, color, season, style, targetAge);
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

	private int[] feature = new int[6];

	private String productId;

	private int targetAge;//1010 || 1020 || etc

	public int[] getFeature(){

		return feature;
	}

	public String getProductId(){
		
		return this.productId;
		
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
