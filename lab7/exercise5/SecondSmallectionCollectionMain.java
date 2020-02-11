package com.capg.lab7.exercise5;
import java.util.Scanner;

public class SecondSmallectionCollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		
		int a[]=new int[5];
		System.out.println("enter the array elemets");
		
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=sc.nextInt();
			
			
			
		}
		
		SecondSmallestCollection obj=new SecondSmallestCollection();
		System.out.println("second smallest is   "+obj.getSecondSmallest(a));
		
		
		
		
		sc.close();


	}

}
