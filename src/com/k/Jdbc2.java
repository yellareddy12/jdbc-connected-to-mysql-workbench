package com.k;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc2 {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/reddykasa","root","ram123@R");
		Statement s=c.createStatement();
		s.executeUpdate("create table sagar(id int,name varchar(67))");
		s.close();
		c.close();
	}catch(ClassNotFoundException g) {
		System.out.println(g);
	}catch(SQLException h) {
		System.out.println(h);
	}
}
}
