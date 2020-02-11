package com.capg.Lab6.exercise8;

public class PositiveString {

	public boolean postiveString(String s)
	{
		boolean c=false;
		
		char a[]=s.toCharArray();
		int b[]=new int[a.length];
		
        for(int i=0;i<a.length;i++)
        {
        	
        b[i]=a[i];      	
        	
        	
        }
        
        int flag=0;
		for(int j=0;j<b.length-1;j++)
		{
			
          if(b[j]>b[j+1])
          {
        	  
        	  flag=1;
          }
          
			
			
		}
		
		
	   if(flag==0)
	   {
		 c=true;
	   }
		
		
		return c;
		
		
	}
	
	
	
}
