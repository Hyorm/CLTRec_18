package cr.main;

import cr.*;

import java.awt.*;
import java.util.*;
import java.io.*;

public class ReadFile{
	
	public static String readFile(final String fileName) throws IOException{
			
		StringBuilder sb = new StringBuilder();
		
		BufferedReader br = new BufferedReader(new FileReader(fileName));

		String line;

		int i = 0;

		while((line = br.readLine()) != null){	
			if(i!=0)
				sb.append(line + "%%");

			i++;

		}
		sb.insert(0, String.valueOf(i)+"%%");
		return sb.toString();

	}

}
