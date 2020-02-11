package com.capg.lab7.exercise8;
import java.util.*;

public class RemoveDuplicates {
	
	
	public Integer[ ]  removeDuplicates(Integer a[])
	{
		
		
		
		Set<Integer> set=new TreeSet<Integer>();
		
		List<Integer>list=new ArrayList<Integer>();
		Collections.addAll(set, a);
		list.addAll(set);
		
		Collections.sort(list,Collections.reverseOrder()); 
		
		
		Integer b[]=list.toArray(new Integer[0]);
		
		
		
		return b;
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
