package com.capg.Lab6.exercise6;

import java.io.*; 

public class CountNoLinesWords
{ 
    public static void main(String[] args) throws IOException 
    { 
        File file = new File("C:\\Users\\Dhanunjay naidu\\Desktop\\sandhya.txt"); 
        FileInputStream fileStream = new FileInputStream(file); 
        InputStreamReader input = new InputStreamReader(fileStream); 
        BufferedReader reader = new BufferedReader(input); 
          
        String line; 
          
        // Initializing counters 
        int countWord = 0; 
        int sentenceCount = 0; 
        int characterCount = 0; 
        
        
        while((line=reader.readLine())!=null)
        {
        	
        	characterCount+=line.length();
        	
        	
        	
        	String a[]=line.split("\\s+");
        	countWord=countWord+a.length;
        	
        	
        	
        	String b[]=line.split("[!?.:]+");
            sentenceCount+=b.length;
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        	
        }
        
        System.out.println("no of words"+countWord);
        System.out.println("no of characters"+characterCount);
        System.out.println("no of lines "+sentenceCount);
        
        
        
        
        reader.close();
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
        
    
