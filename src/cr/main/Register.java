package cr.main;
  
import cr.*;

import java.awt.*;
import java.util.*;
import java.io.*;

/**
*
*@author KimHyoRim
*
*@since 2018.05.04
*class (method) to register user in "data / regUser.csv" file
*
*/

public class Register{

/**
*
*register method
*
*@throws IOException file_isn't_exist
*
*@param String userId
*@param String userPW
*@param String userName
*@param int age
**type is default : user
*
*@return no
*
*@version first
*
*/

	public static void register(String userId, String userPW, String userName,int age) throws IOException{

		BufferedWriter old = new BufferedWriter(new FileWriter("data/regUser.csv", true));
		PrintWriter newReg = new PrintWriter(old, true);

		newReg.write(userId+",");
		newReg.write(userPW+",");
		newReg.write(userName+",");
		newReg.write("user"+",");
		newReg.write(age+"\n");
		newReg.flush();
		newReg.close();

	}
}
