package cr.main;

import java.util.*;
import java.awt.*;

public class Parser{
	Static String[][] matrix;

	public static String[][] makeMatrix(String str, int num){

		String[] substr = str.split("%%");

		matrix = new String[Integer.parseInt(substr[0])][num];

		int row = 0;

		int first = 0;

		for(String sub: substr){

			if(first++==0)continue;
			
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
	
	public static String[] findThis(String str, int num, String isUser)throws Exception{
		String[] nil = new String[num];
		
		nil = {"nil", "", "", "", "", ""};
		
		makeMatrix(str, num);
		
		for(int i = 0; i < num; i++)
			if(isUser.equals(matrix[i][0])
				return matrix[i];
			else
				return nil;
		
	}
}
