package com.ts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	String db_url = "jdbc:mysql://127.0.0.1:3306/school_db";
    	String db_username = "root";
    	String db_password = "root";
        Connection connection =	DriverManager.getConnection(db_url, db_username, db_password);
    	Statement statement = connection.createStatement();
    	ResultSet rs = statement.executeQuery("SELECT * FROM student");
    	
    	while (rs.next()) {
        	String resultName = rs.getString("name");
        	System.out.println(resultName);			
    	}
    	connection.close();
    }
}

/*
mobile    driver(mySql connector)
number    --> url, username, password
call	  --> connection
connection --> start
speak	  --> query execute (SELECT * FROM student;)
reply	  --> query_output
cut		 ---> connection close

*/