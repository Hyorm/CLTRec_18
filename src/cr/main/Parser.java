package cr.main;

import java.util.*;
import java.awt.*;

public class Parser{
	public static String[][] matrix;

	public static String[][] makeMatrix(String str, int usrNum,int num){

		String[] substr = str.split("%%");

		matrix = new String[usrNum][num];

		int row = 0;

		for(String sub: substr){
	
			try{

				row++;
			
				String[] col = parseCol(sub, num);
			
				for(int i = 0; i < num; i++)
					matrix[row][i] = col[i];

			}catch(Exception e){

				e.printStackTrace();

			}
		}
		return matrix;
	}

	public static String[] parseCol(String str, int num) throws Exception
	{
		String[] sub = str.split(",");

		if(sub.length != num) throw new Exception("Error String");

		/*Object[] arr = new String[num];

		for(int i=0; i<sub.length; i++)
			arr[i] = Object.parseObj(sub[i]);	
		*/
		return sub;
	}
	
	public static String[] findThis(String str, int usrNum, int num, String isUser)throws Exception{
		String nil[] = {"nil", "", "", "", ""};
		
		makeMatrix(str, usrNum, num);
		
		for(int i = 0; i < num; i++)
			if(isUser.equals(matrix[i][0]))
				return matrix[i];
		return nil;
		
	}
}
