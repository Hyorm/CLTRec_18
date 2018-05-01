package cr.closet;
  
import cr.*;

import java.util.*;
import java.awt.*;

public class Clothes{

	public Clothes(){}

	public Clothes(int productId){
	
		this.productId = productId;

	}

	public Clothes(int productId, int type, int category, int gender, int color, int season, int style){
		this.feature = this.feature + tenToBin(type);
		this.feature = this.feature + tenToBin(category);
		this.feature = this.feature + tenToBin(gender);
		this.feature = this.feature + tenToBin(color);
		this.feature = this.feature + tenToBin(season);
		this.feature = this.feature + tenToBin(style);

		if((feature.length()>24)||feature.length()<0)
                        System.out.println("Invalid Feature Information");
	}

	private String feature = "";

	private int productId;

	public String getFeature(){

		return this.feature;
	}

	public int getProductId(){
		
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
	
		return bin;
	}
}
