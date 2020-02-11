package com.capg.Lab6.exercise5;
import java.util.Scanner;

public class String5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        //String s;
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the number");
				
				int a=sc.nextInt();
				String5 obj=new String5();
				System.out.println(obj.difference(a));
				sc.close();

	}

}
