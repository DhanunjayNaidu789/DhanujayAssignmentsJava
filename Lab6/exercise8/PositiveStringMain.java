package com.capg.Lab6.exercise8;
import java.util.*;
public class PositiveStringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string");
		String a=sc.nextLine();
		
		PositiveString obj=new PositiveString();
		boolean b=obj.postiveString(a);
		if(b==true)
		{
			
			System.out.println("positive String");
		}
		else
		{
			System.out.println("no postive String");
		}
		sc.close();
		
	}

}
