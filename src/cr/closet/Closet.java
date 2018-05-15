package cr.closet;

import cr.*;

import java.util.*;
import java.awt.*;

public class Closet{

	private String closetId = "";

	private Map<Integer, Clothes> closet = new HashMap<Integer, Clothes>();
	
	public Closet(int type, int num){
		String ty = "";
		if(type == 0)
			ty = "r";
		else ty = "u";
		
		this.closetId = ty + num;
	}
	
	public void getClothesMap(){
		
		Set<Integer> keySet = closet.keySet();

		Iterator<Integer> iterator = keySet.iterator();

		while(iterator.hasNext()) {
 
			Integer key = iterator.next();
			Clothes value = closet.get(key);

			System.out.printf("productId : %d , ClothesFeature : %d %n", key, value.getFeature());
		}

		//TODO:return
	}

	public Clothes getClothes(int productId){

		return closet.get(productId);
	}

	public void setClothesMap(Clothes clothes){

		this.closet.put(clothes.getProductId(), clothes);

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
