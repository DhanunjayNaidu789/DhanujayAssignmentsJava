package com.capg.Lab6.exercise5;

public class String5 {
	
	public StringBuffer difference(int a)
	{
		
	
		String b=String.valueOf(a);
		
	    char c[]=b.toCharArray();
	    int d[]=new int[c.length];
	    
	    for(int i=0;i<c.length;i++)
	    {
	    	
	    	
	    	
	    	d[i]=Character.getNumericValue(c[i]);
	    	
	    	
	    	
	    }
	    
	    
	    StringBuffer sb=new StringBuffer(String.valueOf(d[(c.length)-1]));
	    
	  /*  for(int i:d)
	    {
	    	System.out.println(i);
	    }*/
	    
	    for(int j=(c.length-1);j>0;j--)
	    {
	    	
	    	
	    	int temp=0;
	    	temp=d[j]-d[j-1];
	    	
	    	sb.append(Math.abs(temp));
	    	//d[j-1]=Math.abs(temp);
	    	
	    	
	    }
	    
	    sb.reverse();
	    return sb;
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
	}
	

}
