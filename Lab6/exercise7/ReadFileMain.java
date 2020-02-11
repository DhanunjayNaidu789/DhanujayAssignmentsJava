package com.capg.Lab6.exercise7;
import java.util.*;
public class ReadFileMain {

	public static void main(String args[])
	{
		
		
		
		
		Scanner sc=new Scanner(System.in);
		String a;
		System.out.println("enter the file path");
		a=sc.nextLine();
		
		ReadFile obj=new ReadFile();
		try
		{
		obj.read(a);
		
		}
		catch(Exception e)
		{
			
			
			System.out.println("some exception occured");
		}
		
		
		sc.close();
		
	}
	
	
	
}
