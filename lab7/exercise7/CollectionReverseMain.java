package com.capg.lab7.exercise7;
import java.util.*;

public class CollectionReverseMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the elements");
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
			
			
			a[i]=sc.nextInt();
			
			
			
		}
		
		CollectionReverse obj=new CollectionReverse();
		List<Integer>list=obj.reverse(a);
		System.out.println("after sorting");
		System.out.println(list);
		
		
		
		sc.close();
		
		
	}

}
