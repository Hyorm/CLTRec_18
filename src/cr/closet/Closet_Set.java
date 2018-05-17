package cr.closet;

import cr.*;

import java.util.*;
import java.awt.*;

public class Closet_Set{

	private String closet_SetId = "";

	private Map<Integer, Closet> closet_set = new HashMap<Integer, Closet>();
	
	public Closet_Set(int type, int num){
		String ty = "";
		if(type == 0)
			ty = "r";
		else ty = "u";
		
		this.closet_SetId = ty + num;
	}
	
	public void getClosetMap(){
		
		Set<Integer> keySet = closet_set.keySet();

		Iterator<Integer> iterator = keySet.iterator();

		while(iterator.hasNext()) {
 
			Integer key = iterator.next();
			Closet value = closet_set.get(key);

			System.out.printf("closetId : %d , ClosetFeature : %d %n", key, value.getFeature());
		}

		//TODO:return
	}

	public Closet getCloset(int closetId){

		return closet_set.get(closetId);
	}

	public void setClosetMap(Closet closet){

		this.closet_set.put(closet.getClosetId(), closet);

	}

	public void rmCloset(int closetId){

		this.closet_set.remove(closetId);

	}

	//@Overload
	public void rmCloset(Closet closet){
	
		this.closet_set.remove(closet.getClosetId());

	}

	public void initClosetMap(){
	
		this.closet_set.clear();
		
	}
}