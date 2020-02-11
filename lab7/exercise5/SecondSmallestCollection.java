package com.capg.lab7.exercise5;
import java.util.*;

public class SecondSmallestCollection {

	int getSecondSmallest(int a[])
	{
		
	 ArrayList <Integer> list=new ArrayList<Integer>();
	 Integer[] boxedArray = new Integer[a.length];

		for (int i = 0; i < boxedArray.length; i++) {
			boxedArray[i] = a[i];
		}
		
		Collections.addAll(list, boxedArray);

        Collections.sort(list);
        return list.get(1);
        
		
	}
	
	
}
