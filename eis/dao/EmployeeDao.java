package com.cg.eis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import com.cg.cs.jdbcConnection.dto.UserProfile1;
import com.cg.eis.bean.Employee1;



public class EmployeeDao {
	
	Connection con=null;
	PreparedStatement psInsert;
	PreparedStatement psSelect;
	ResultSet result;
	public EmployeeDao()
	{
		con=SqlConnection.getConnection();
		
	}
	
	public boolean setEmployeeDetails(Employee1 empBean)
	{
		try
		{
		psInsert=con.prepareStatement("insert into Employee1 values(?,?,?,?,?)");
		psInsert.setInt(1, empBean.getEmpId());
		psInsert.setString(2, empBean.getEmpName());
		psInsert.setDouble(3, empBean.getEmpSalary());
		psInsert.setString(4, empBean.getEmpDesignation());
		psInsert.setString(5,empBean.getEmpInsuranceScheme());
		int result=psInsert.executeUpdate();
		
		if(result>0)
		{
			
			System.out.println("data inserted success");
			return true;
		}
		else
		{
			return false;
		}
		
		
		}
		catch(SQLException e)
		{
			
			
			e.printStackTrace();
			return false;
			
		}
		
		
		
	}
	public List<Employee1> employeeDetailsDao()
	{
		List<Employee1> EmpList=new ArrayList<Employee1>();
		try
		{
		psSelect=con.prepareStatement("select * from Employee1");

		result=psSelect.executeQuery();
		while(result.next())
		{
			Employee1 obj=new Employee1();
			obj.setEmpId(result.getInt(1));
			obj.setEmpName(result.getString(2));
			obj.setEmpSalary(result.getDouble(3));
			obj.setEmpDesignation(result.getString(4));
			obj.setEmpInsuranceScheme(result.getString(5));
			EmpList.add(obj);
		}
		
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return EmpList;
		
		
	}
	
	
	
	

}
