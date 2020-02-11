package com.capg.Lab6.exercise3;

public class String3 {
	
	
	
	public StringBuffer  mirrorImage(StringBuffer s)
	{

	 StringBuffer b=new StringBuffer(s);
	 s.append("|");
	 b.reverse();
	// System.out.println(b);
	 s.append(b);	 
	 
	 return s;
		

}
}
