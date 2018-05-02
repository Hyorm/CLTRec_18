package cr.main;

import java.util.*;
import java.awt.*;

public class Parser{

	public static String[][] makeMatrix(String str, int num){

		String[] substr = str.split("%%");

		String[][] matrix = new String[Integer.parseInt(substr[0])][num];

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
}
