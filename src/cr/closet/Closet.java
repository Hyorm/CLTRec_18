package cr.closet;

import cr.*;

import java.util.*;
import java.awt.*;

public class Closet{

	private String closetId = "";

	private HashMap<String, Clothes> closet = new HashMap<String, Clothes>();
	
	public Closet(){}
	
	public Closet(int type, String num){
		String ty = "";
		if(type == 0)
			ty = "r";
		else ty = "u";
		
		this.closetId = ty + num;
	}
	
	public void getClothesMap(){
		
		Set<String> keySet = closet.keySet();

		Iterator<String> iterator = keySet.iterator();

		while(iterator.hasNext()) {
 
			String key = iterator.next();
			Clothes value = closet.get(key);

			System.out.println("productId"+key+" , ClothesFeature : "+value.getFeature());
		}

		//TODO:return
	}

	public Clothes getClothes(int productId){

		return this.closet.get(productId);
	}

	public void setClothesMap(Clothes clothes){

		this.closet.put(clothes.getProductId(), clothes);

	}

	public String getClosetId(){

		return this.closetId;

	}

	public void rmClothes(int productId){

		this.closet.remove(productId);

	}

	//@Overload
	public void rmClothes(Clothes clothes){
	
		this.closet.remove(clothes.getProductId());

	}

	public void initClothesMap(){
	
		this.closet.clear();
		
	}
}
