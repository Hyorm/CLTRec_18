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

		int i = 1;

		while((line = br.readLine()) != null){	
		
			sb.append(line + "%%");

			i++;

		}
		sb.insert(0, String.valueOf(i)+"%%");
		return sb.toString();

	}

}
