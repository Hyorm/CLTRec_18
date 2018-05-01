package cr.closet;

import cr.*;

import java.util.*;
import java.awt.*;

public class Closet{

	private Map<int, Clothes> closet = new Map<int, Clothes>();
	
	public Closet(){}

	public Closet(Clothes clothes){
		this.closet.put(clothes.getProductId(), clothes);
	}
	
	public void getClothesMap(){
		
		Set<String> keySet = closet.keySet();

		Iterator<String> iterator = keySet.iterator();

		while(iterator.hasNext()) {
 
			int key = iterator.next();
			Clothes value = closet.get(key);

			System.out.printf("productId : %s , ClothesFeature : %d %n", key, value.getFeature());
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

	@overload
	public void rmClothes(Clothes clothes){
	
		this.closet.remove(clothes.getProductId());

	}

	public void initClothesMap(){
	
		this.closet.clear();
		
	}
}
