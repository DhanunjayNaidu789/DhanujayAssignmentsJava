package com.capg.lab7.exercise4;
import java.util.*;

public class GenerateMedalsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		HashMap<Integer,String> mapp=new HashMap<Integer,String>();
		
	    map.put(1,85);
	    map.put(8,95);
	    map.put(2,75);
	    map.put(3,55);
	    map.put(9,66);
	    
	    
	    GenerateMedals obj=new GenerateMedals();
	    mapp=obj.generatemedals(map);
	    
	   // System.out.println(mapp);
		
	    for(Map.Entry<Integer, String> obj2:mapp.entrySet())
	    {
	    	
	    	
	    System.out.println(obj2.getKey()+"  "+obj2.getValue());
	    	
	    	
	    }
		
		
		
		
		
		
		
		
		
		
		

	}

}
