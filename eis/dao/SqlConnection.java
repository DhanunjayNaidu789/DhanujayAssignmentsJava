package com.cg.eis.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnection {
	
	public static Connection getConnection()
	{
		Connection con=null;
		try
		{
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "DHANU","123");
			
		}
		catch(ClassNotFoundException e)
		{
		   e.printStackTrace();
		}
		catch(SQLException e)
		{
			System.out.println("sql error occured"+e);
		}
		return con;
	}


}
