package cr.algorithm;

import cr.gui.*;
import cr.usr.*;
import cr.closet.*;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.*;

public abstract class GenericRecommend{

	protected ConcreteStrategyCloset csCloset;
	
	private Closet closet;

	private String[] productIDList = new String[50];

	public GenericRecommend(ConcreteStrategyCloset csCloset){

		this.csCloset = csCloset;

	}

	public Closet setCloset(){//Strategy
		
		this.closet = csCloset.setCloset();

		return this.closet;

	} 

	public String[] getProductIDList(){
		return productIDList;
	}

	public abstract String[] makeRecommendProductID();

	public abstract String[] getPathImagList();

}
