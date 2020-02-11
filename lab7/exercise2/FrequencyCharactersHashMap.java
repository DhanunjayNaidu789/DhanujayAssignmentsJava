package com.capg.lab7.exercise2;
import java.util.*;
public class FrequencyCharactersHashMap {
	
	
	public HashMap<Character,Integer> frequecyCharacter(char a[])
	{
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		int freq[]=new int[10];
		int visited=-1;
		
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			
			for(int j=i+1;j<a.length;j++)
			{
									
				if(a[i]==a[j])
				{
				
					count++;
					
					freq[j]=visited;
					
					
					
				}
			}
				
				if(freq[i]!=visited)
				{
					freq[i]=count;
				}
		}
				
				
				
				
				
	    for(int k=0;k<a.length;k++)
	    {
	    	
	    	if(freq[k]!=visited)
	    	{
	    		
	    		
	    	 map.put(a[k], freq[k]);
	    	// System.out.println("frequency of "+a[k]+" is"+freq[k]);
	    		
	    		
	    		
	    	}
				
				
				
			
		}
	    
	    return map;
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
