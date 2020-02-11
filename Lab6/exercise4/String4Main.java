package com.capg.Lab6.exercise4;
import java.util.Scanner;

public class String4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s;
	    s=sc.nextLine();
		
		String4 obj=new String4();
		System.out.println(obj.replace(s));
		sc.close();
		

	}

}
