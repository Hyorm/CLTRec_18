/**
*
*@author KimHyoRim
*
*@since 2018.05.04
*
*This is main class
*Manage entire system
*
*/

package cr.main;

import cr.gui.*;
import cr.usr.*;
import cr.closet.*;

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class Main{

		//Singlton User
		static private User user;

		//FrameLayout
		static public CustomFrame CFrame = new CustomFrame("CLTRec_Beta");
		static protected Container contentPane = new Container();	

		//Closet
		static public Closet myCloset = new Closet();
		static public Closet dataCloset = new Closet();
		static public Closet userCloset = new Closet();

		//Closet_Set
		static public Closet_Set recoCloset_Set = new Closet_Set();
		static public Closet_Set myCloset_Set = new Closet_Set();

	public static void main(String[] args){

		String dataStr = "";

		//TODO: Set dataCloset
		try{
			dataStr = ReadFile.readFile("data/data.csv");
		}
		catch(Exception e){
			e.printStackTrace();

		}
		StringTokenizer s = new StringTokenizer(dataStr);
		final int dataNum = Integer.parseInt(s.nextToken("%%"));
		Parser.makeMatrix(dataStr, dataNum, 8);
		for(int i = 1; i< dataNum; i++){
			dataCloset.setClothesMap(new Clothes(Parser.matrix[i]));
		}
		
                //Set LayOut
                contentPane = CFrame.getContentPane();
                contentPane.add(new NorthPanel(CFrame, dataCloset));
                contentPane.add(new WestPanel(CFrame, dataCloset, user));
                contentPane.add(new CenterPanel(CFrame, user ,0, dataCloset, "", ""));

		//Start frame
                CFrame.size(1300,900);
                CFrame.start();

	}

}
