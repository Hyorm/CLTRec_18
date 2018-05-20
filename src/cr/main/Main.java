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

import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;

public class Main{

		//Singlton User
		static private User user;

		//FrameLayout
		static CustomFrame CFrame = new CustomFrame("CLTRec_Beta");
		static protected Container contentPane = new Container();	

	public static void main(String[] args){

		//Set LayOut
                
		contentPane = CFrame.getContentPane();
              
                contentPane.add(new NorthPanel(CFrame));

		contentPane.add(new WestPanel(CFrame));

                contentPane.add(new CenterPanel(CFrame, 0));

                CFrame.size(1440,900);
                CFrame.start();

	}

}
