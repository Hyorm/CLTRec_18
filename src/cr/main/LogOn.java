package cr.main;
  
import cr.*;

import java.awt.*;
import java.util.*;

public class LogOn{

	public static String[] logOn(String isUserID){

		String str = "";

                int num = 5;

		String[] regUsers = new String[num];

                try{

                        str = (ReadFile.readFile("data/regUser.csv"));

			StringTokenizer s = new StringTokenizer(str);       

			final int usrNum = Integer.parseInt(s.nextToken("%%"));

                	regUsers = Parser.findThis(str,usrNum,num, isUserID);

		}catch (Exception e){

                        e.printStackTrace();
                }
		return regUsers;
	}	

}
