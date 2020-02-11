package com.capg.lab7.exercise4;
import java.util.*;

public class GenerateMedals {

	
	public HashMap<Integer,String> generatemedals(HashMap<Integer,Integer> map)
	{
		
		
	   HashMap<Integer,String> mapp=new HashMap<Integer,String>();
		
		
	   for(Map.Entry<Integer,Integer > obj:map.entrySet())
	   {
		   
		   
		    if(obj.getValue()>=90)
		    {
		    	
		    	mapp.put(obj.getKey(),"gold");
		    	
		    	
		    }
		    else if(obj.getValue()>=80 && obj.getValue()<90)
		    {
		    	
		    	
		    	mapp.put(obj.getKey(),"bronze");
		    	
		    	
		    }
		    else if(obj.getValue()>=70 && obj.getValue()<80)
		    {
		    	
		    	
		    	mapp.put(obj.getKey(),"silver");
		    }
		    
		    else
		    {
		    	
		    	
		    	mapp.put(obj.getKey(),"No Medal");
		    	
		    }
		   
		   
		   
	   }
	   
	   return mapp;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}

