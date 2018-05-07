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

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class Main{

	public static void main(String[] args){

		boolean isUser = true;

		int userAttNum = 5; 

		String[] user = new String[userAttNum];
		while(isUser){
		//TODO: Input UserId from GUI and iterate regUsers

		//change input UserId
		user = LogOn.logOn("root");

		/*Debug
		for(int i = 0; i<userAttNum; i++)
			System.out.println(user[i]+" ");
		*/


		if(user[0].equals("nil")){
			isUser = false;
			//System.out.println("invalid userId");
		}
		new CustomFrame();
	
		break;
		//TODO: If usr input another function, then try something

		}
		//new CustomFrame().size(2000, 1500).start();
	}

}
