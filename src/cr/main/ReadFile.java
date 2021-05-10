package cr.main;

import cr.algorithm.*;
import cr.usr.*;
import cr.file.*;
import cr.closet.*;
import cr.gui.*;

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
				sb.append(line + "%%");

			i++;

		}


		sb.insert(0, String.valueOf(i)+"%%");
		
		return sb.toString();

	}

}
