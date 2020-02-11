package com.capg.Lab6.exercise7;
//import java.io.*;
//import java.nio.file.Files;
import java.io.File;


public class ReadFile {
	
    public void read(String s) throws Exception
    {
    	
    File f=new File(s);
    System.out.println("Is writeable:"+f.canWrite()); 
    System.out.println("Is readable"+f.canRead()); 
    System.out.println("Is a directory:"+f.isDirectory()); 
    System.out.println("File Size in bytes "+f.length());  
  
   
    System.out.println("File extension is"+getFileExtension(f));
   
   }
    
	
	
    private static String getFileExtension(File file) {
        String fileName = file.getName();
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
        return fileName.substring(fileName.lastIndexOf(".")+1);
        else return "";
	
	
	
	

}
}
