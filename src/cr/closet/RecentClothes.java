package cr.closet;

import cr.algorithm.*;
import cr.usr.*;
import cr.file.*;
import cr.gui.*;
import cr.main.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RecentClothes{
        public static String[] recentClothes(){
        	String path = "./img/clothes/";
        	File dirFile = new File(path);
        	File []fileList = dirFile.listFiles();
        	String []FileName = new String[50];
        	String []RealFileName = new String[50];
        	int index=0;
        	for(File tempFile:fileList){
        	        if(tempFile.isFile()){
        	                String tmepPath = tempFile.getParent();
        	                String tempFileName = tempFile.getName();
       	                	FileName[index]=tempFileName;
                        	index++;
                	}
        	}
        	index=0;
        	for(int i = 0; i<FileName.length;i++){
                	if(FileName[i].contains("jpg")||FileName[i].contains("jpeg")){
                	        RealFileName[index] = FileName[i];
                	        index++;
                	}
        	}

        return RealFileName;
        }
}

