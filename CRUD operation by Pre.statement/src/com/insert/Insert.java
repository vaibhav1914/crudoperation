package com.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {
public static void main(String[] args) throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("loaded...");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classroom2","root","root");
	System.out.println("connecetd...");
	
	PreparedStatement ps=con.prepareStatement("insert into sir values(?,?)");
	//ps.setInt(1, 3);
	//ps.setString(2, "kiran");
//	ps.execute();
	//ps.setInt(1, 4);
	//ps.setString(2, "hjdfgsahj");
//	ps.execute();
	System.out.println("added...");
}
}
