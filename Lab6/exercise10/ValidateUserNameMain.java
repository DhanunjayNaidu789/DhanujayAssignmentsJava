package com.capg.Lab6.exercise10;
import java.util.Scanner;

public class ValidateUserNameMain {
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter username");
        String userName=scan.nextLine();
        
        ValidateUserName obj=new ValidateUserName();
       boolean isValid= obj.isValid(userName);
        if(isValid)
        	System.out.println("Valid UserName");
        else
        	System.out.println("Not a Valid UserName!!");
       scan.close();
	}


}
