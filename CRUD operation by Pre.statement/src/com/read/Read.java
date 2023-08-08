package com.read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Read {
public static void main(String[] args)throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("loaded....");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classroom2","root","root");
	System.out.println("connected....");
	
	PreparedStatement ps=con.prepareStatement("select id,name from sir ");
	ResultSet rs=ps.executeQuery();
	while (rs.next()) {
		System.out.println(rs.getInt(1));
		System.out.println(rs.getString(2));
	}
}
}
