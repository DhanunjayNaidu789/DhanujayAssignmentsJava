package com.capg.lab7.exercise1;
import java.util.*;

public class SortByValue {

	
	
       public static void main(String args[])
       {
    	   
    	 Scanner sc=new Scanner(System.in);
    	   
    	  HashMap <Integer,String> map=new HashMap<Integer,String>();
    	  String a;
    	  int j;
    	  for(int i=1;i<=5;i++)
    	  {
    		 System.out.println("enter key and value1"); 
    		 j=sc.nextInt();
    		 a=sc.nextLine();
    		 map.put(j,a) ;
    		  
    		  
    		  
    	  }
    	  
    	  
    	  ArrayList<String> list=new ArrayList<String>();
    	  
    	  
    	  for(Map.Entry<Integer,String> obj:map.entrySet())
    	  {
    		  
    		  
    		  list.add((String)obj.getValue());
    		 
    		  
    		  
    	  }
    	  Collections.sort(list);
    	  
    	  System.out.println(list);
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  sc.close();
    	  
    	   
    	   
    	   
    	   
    	   
    	   
       }
	
	
	
	
	
	
	
	
	
	
	
}
