package com.capg.Lab6.excercise1;
import java.util.Scanner;

public class String1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a;
		System.out.println("enter the number");
		a=sc.nextLine();
		String1 obj=new String1();
		obj.display(a);
		sc.close();

	}

}
