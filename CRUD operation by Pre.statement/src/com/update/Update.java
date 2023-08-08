package com.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {
public static void main(String[] args) throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Loaded...");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classroom2","root","root");
	System.out.println("connected...");
	
	PreparedStatement ps=con.prepareStatement("update girl set name=? where id=?");
	ps.setInt(2, 3);
	ps.setString(1,"drtd");
	ps.execute();
	System.out.println("updated....");
}
}
