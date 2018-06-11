package cr.gui;
  
import cr.algorithm.*;
import cr.usr.*;
import cr.closet.*;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import javax.swing.border.*;

public class StrategyBoard{

	private String[] closetPIDlist = new String[50];
	private JScrollPane scrollPane = new JScrollPane();
	private JLabel menuNameLab;
	private String menuName;

	protected ConcreteStrategyBoard board;
	protected ConcreteStrategyData data;
	
	public StrategyBoard(String menuName, ConcreteStrategyBoard board, ConcreteStrategyData data){

		this.menuName = menuName;
		this.board = board;
		this.data = data;

	}

	public JLabel getMenuNameLab(){

		this.menuNameLab = new JLabel(menuName);

		return menuNameLab; 

	}

	public String[] setBoardData(){

		this.closetPIDlist = data.setBoardData();
		
		return closetPIDlist;
	}

	public JScrollPane getDisplayBoard(String[] closetPIDlist, int x, int y){

		this.scrollPane = board.getDisplayBoard(closetPIDlist, x, y);

		return scrollPane;
	}
}
