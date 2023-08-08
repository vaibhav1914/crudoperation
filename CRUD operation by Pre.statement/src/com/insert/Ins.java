package com.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Ins {
public static void main(String[] args)throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("loaded...");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employe","root","root");
	System.out.println("Connected...");
	
	PreparedStatement ps=con.prepareStatement("insert into boys values(?,?,?,?)");
	//ps.setInt(1, 1);
	//ps.setString(2, "vaibhav");
	//ps.setString(3, "9891989898");
	//ps.setString(4,"30000");
	
	//ps.execute();
	//ps.setInt(1, 2);
	//ps.setString(2, "Amit");
	//ps.setString(3, "9889898989" );
	//ps.setInt(4, 3000);
	//ps.execute();
	
}
}
