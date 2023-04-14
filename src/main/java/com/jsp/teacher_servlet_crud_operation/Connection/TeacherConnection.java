package com.jsp.teacher_servlet_crud_operation.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TeacherConnection {

public static Connection getTeacherConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/servelt";
			String user = "root";
			String pass = "root";
			
			return DriverManager.getConnection(url, user, pass);
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
			
		}
		return null;
	}
}
