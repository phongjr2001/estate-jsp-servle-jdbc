package com.laptrinhjavawed;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelloWorld {
	 static final String DB_URL = "jdbc:mysql://localhost/javasql42022";
	 static final String USER = "root";
	 static final String PASS = "anhyeuem@gmail123";
     public static void main(String[] args) {
    	  System.out.println("Connecting to a selected database...");
          // Open a connection
          try {	
        	  Class.forName("com.mysql.jdbc.Driver");
        	  Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        	  if(conn!=null) {
             System.out.println("Connected database successfully...");
        	  }else {
        		  System.out.println("connected database fail");
        	  }
          } catch (SQLException e) {
             e.printStackTrace();
          } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
}
