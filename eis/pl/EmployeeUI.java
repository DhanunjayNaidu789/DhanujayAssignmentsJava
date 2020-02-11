package com.cg.eis.pl;
import java.util.*;

import com.cg.eis.bean.Employee1;

import com.cg.eis.service.EmployeeService;

public class EmployeeUI {

	public static void main(String[] args) {
	    
	    // EmployeeDao empDao=new EmployeeDao();	
	     EmployeeService empSer=new EmployeeService();
	     
	     Employee1 emp1=new Employee1();
	     emp1.setEmpId(2);
	     emp1.setEmpName("sai");
	     emp1.setEmpSalary(5000);
	     emp1.setEmpDesignation("clerk");
	     emp1.setEmpInsuranceScheme(empSer.findInsuranceScheme("clerk", 5000.0));
	     
	     empSer.setEmployeeDetailsService(emp1);
	    List<Employee1>list= empSer.getEmployeeDetailsService();
	    
	    for(Employee1 obj:list)
	    {
	    	System.out.println(obj.getEmpId());
	    	System.out.println(obj.getEmpName());
	    	System.out.println(obj.getEmpSalary());
	    	System.out.println(obj.getEmpDesignation());
	    	System.out.println(obj.getEmpInsuranceScheme());
	    }

	}

}
