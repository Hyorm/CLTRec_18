package cr.algorithm;
  
import cr.gui.*;
import cr.usr.*;
import cr.closet.*;
import cr.main.*;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.*;

public class ConcreteNew extends GenericRecommend{

	private static String[] productIDList = new String[50];

	public ConcreteNew(ConcreteStrategyCloset closet){
                super(closet);
        }

	@Override
	public String[] makeRecommendProductID(){
		Set<String> keySet = Main.dataCloset.getKeySet();
		Iterator<String> iterator = keySet.iterator();
		int iter = 0;
		while(iterator.hasNext()) {

			if(iter>=50)
                                break;

			String key = iterator.next();
			Clothes value = Main.dataCloset.getClothes(key);
			productIDList[iter++] = key;

		}

		return productIDList;
	}

	@Override
	public String[] getPathImagList(){

		return RecentClothes.recentClothes();

	}
}
