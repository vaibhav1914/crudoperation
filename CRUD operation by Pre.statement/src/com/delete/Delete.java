package com.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {
public static void main(String[] args) throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("loaded...");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/classroom2","root","root");
	System.out.println("connected...");
	
	PreparedStatement ps=con.prepareStatement("delete from mam where id=?");
	ps.setInt(1, 2);
	ps.execute();
	System.out.println("deleted...");
}
}
