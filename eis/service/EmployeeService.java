package com.cg.eis.service;

import java.util.List;

import com.cg.eis.dao.*;
import com.cg.eis.bean.*;


interface EmployeeInsurance
{
	
	public boolean setEmployeeDetailsService(Employee1 empBean);
	public String findInsuranceScheme(String des,Double sal);
	public List<Employee1> getEmployeeDetailsService();
	
	
	
}


public class EmployeeService implements EmployeeInsurance {
	
	
	EmployeeDao empObj=new EmployeeDao();
	public boolean setEmployeeDetailsService(Employee1 empBean)
	{
		
		 boolean result =empObj.setEmployeeDetails(empBean);
		 return result;

	}
	
	public List<Employee1> getEmployeeDetailsService()
	{
		
		return empObj.employeeDetailsDao();
		
	}
	
	public String findInsuranceScheme(String des,Double sal)
	{
		String str=null;
		if(des.equals("system Associate") && sal>5000 && sal<20000)
		{
		   str= "Scheme C";
		}
		else if(des.equals("programmer") && sal>20000 && sal<40000)
		{
			str= "Scheme B";
		}
		else if(des.equals("manager") && sal>=40000)
		{
			str= "SchemeA";
		}
		else if(des.equals("clerk"))
		{
			str= "No Scheme";
		}
		
		return str;
		
	}
	
	

}
