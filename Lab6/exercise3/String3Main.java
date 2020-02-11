package com.capg.Lab6.exercise3;
import java.util.*;

public class String3Main {
	public static void main(String args[])
	{
		String s;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the name");
		s=sc.nextLine();
        StringBuffer sb=new StringBuffer(s);
		
		
		String3 obj=new String3();
		System.out.println(obj.mirrorImage(sb));
		
		
		
		sc.close();
		
		
		
		
	}

}
