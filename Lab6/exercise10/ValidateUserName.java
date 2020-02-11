package com.capg.Lab6.exercise10;

public class ValidateUserName {
	 public boolean isValid(String input)
	   {
		   boolean isValid=true;
		   if(!input.contains("_job"))
			   return false;
		   String tokens[]=input.split("_job");
		  
		   if(tokens[0].length()<8)
			 isValid=false; 
		   
		   if(tokens.length>1)
		   {
			   isValid=false;
		   }
		   return isValid;
	   }

}
