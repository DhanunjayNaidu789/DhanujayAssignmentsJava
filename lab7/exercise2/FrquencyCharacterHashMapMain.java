package com.capg.lab7.exercise2;

import java.util.Scanner;
import java.util.*;

public class FrquencyCharacterHashMapMain {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char a[]=new char[5];
		System.out.println("enter the characters");
		
		for(int i=0;i<a.length;i++)
		{
			
			
			a[i]=sc.next().charAt(0);
			
			
		}
		HashMap<Character ,Integer> map=new HashMap<Character,Integer>();
		FrequencyCharactersHashMap obj=new FrequencyCharactersHashMap();
		map=obj.frequecyCharacter(a);
		for(Map.Entry<Character,Integer> obj1:map.entrySet())
		{
			System.out.println(obj1.getKey()+"   "+obj1.getValue());
		}
		
		
		
		
		sc.close();

	
	
	
	
	
	
	
	
	

}
}
