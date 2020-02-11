package com.capg.Lab6.exercise2;
import java.io.*;
import java.util.Scanner;

public class String2 {
	public static void main(String args[])throws Exception
	{
		
		
		
		 
		  // method1
		/*  File file = new File("F:\\capgemini sowtwares\\SOFTWARES CAPGEMINI\\sandhya.txt"); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st; 
		  int i=1;
		  while ((st = br.readLine()) != null) 
		  {
			
		    System.out.println(i+" "+st);
		    i++;
		  }
		  
		  
		  br.close();*/
		//method2
		
		/* FileReader fr = 
			      new FileReader("F:\\capgemini sowtwares\\SOFTWARES CAPGEMINI\\sandhya.txt"); 
			  
			  
			    int i; 
			 
			    while ((i=fr.read()) != -1) 
			    {
			      System.out.print((char) i); 
			    }
			    fr.close();*/
		
		
		
	 File file = new File("F:\\capgemini sowtwares\\SOFTWARES CAPGEMINI\\sandhya.txt"); 
			    Scanner sc = new Scanner(file); 
			    int i=1;
			    while (sc.hasNextLine()) 
			    {
			      System.out.println(i+" "+sc.nextLine()); 
			      i++;
			    }
			      
			    sc.close();
		
		
		
		
		
		
		
		  } 

}
