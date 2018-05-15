package cr.main;

import java.util.*;
import java.awt.*;

public class Parser{
	public static String[][] matrix;

	public static String[][] makeMatrix(String str, int usrNum,int num){


		String[] substr = str.split("%%");

		matrix = new String[usrNum][num];

		int row = 0;
		int ind = 0;

		for(String sub: substr){
			if(ind++ ==0)continue;
			try{
							
				String[] col = parseCol(sub, num);
			
				for(int i = 0; i < num; i++)
					matrix[row][i] = col[i];
				row++;

			}catch(Exception e){

				e.printStackTrace();

			}
		}
		return matrix;
	}

	public static String[] parseCol(String str, int num) throws Exception
	{
		String[] sub = str.split(",");

		String[] bsub = str.split(",");
		if(bsub.length<num){
			for (int j = 0; j < bsub.length; j++){
				sub[j] = bsub[j];
			}
			for(int j = bsub.length; j<num; j++)
				sub[j] = "";
		}else
			sub = str.split(",");

		/*Object[] arr = new String[num];

		for(int i=0; i<sub.length; i++)
			arr[i] = Object.parseObj(sub[i]);	
		*/
		return sub;
	}
	
	public static String[] findThis(String str, int usrNum, int num, String isUserID, String isUserPW)throws Exception{
		String nil[] = {"nil", "", "", "", ""};
		
		makeMatrix(str, usrNum, num);	
	
		for(int i = 0; i < num; i++)
			if(isUserID.equals(matrix[i][0]) && isUserPW.equals(matrix[i][1]))
				return matrix[i];
		return nil;
		
	}
}
