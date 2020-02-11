package com.capg.Lab6.excercise1;
import java.util.StringTokenizer;

public class String1 {
	
	public void display(String s)
	{
		
	  StringTokenizer st=new StringTokenizer(s," ");
	  int a[]=new int[s.length()];
	  int i=0;
	  int count=0;
	  while(st.hasMoreTokens())
	  {
		  
		  
		  
		a[i]=Integer.parseInt( st.nextToken()); 
		  
		i++;
		count=i;
		
		  
	  }
	  
	  
	  int sum=0;
	  System.out.println("elements are");
	  for(int k=0;k<count;k++)
	  {
		  sum=sum+a[k];
		  System.out.println(a[k]);
		  
		  
	  }
	  System.out.println("sum is"+sum);
		
      /* char a[]=s.toCharArray();
       int b[]=new int[a.length];
       
       for(int i=0;i<a.length;i++)
       {
    	   
    	   
    	   
    	   b[i]=Character.getNumericValue(a[i]);
    	   
    	   
       }
       
       
       int sum=0;
       for(int j=0;j<b.length;j++)
       {
    	   System.out.println(b[j]);
    	   
    	   sum=sum+b[j];
    	   
    	   
       }
       
       System.out.println(sum);*/
		
		
		
		
	}
	
	

}
