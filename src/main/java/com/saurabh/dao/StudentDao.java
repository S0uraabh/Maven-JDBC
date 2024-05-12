package com.saurabh.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.saurabh.pojo.Student;

public class StudentDao {

	public static ArrayList<Student> fetchDaoInfo() throws Exception{
		ArrayList<Student> list = new ArrayList<>();
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college" , "root" , "mysqlPASSWORD");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("Select * from student");
		
		while(resultSet.next()) {
			int id = resultSet.getInt(1);
			String name = resultSet.getString(2);
			int age = resultSet.getInt(3);
			
			Student student = new Student(id, name, age);
			list.add(student);
			//System.out.println(list);
//			System.out.println("sid : " + id );
//			System.err.println("name : " + name );
//			System.out.println("age : " + age);
		}
		
		return list; 
		
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	/*
	
	
//	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		System.err.println("One : " + 1);	
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.err.println("Two : " + 2);
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/college" , "root" , "mysqlPASSWORD");
		System.err.println('3');
		Statement statement = connection.createStatement();
		System.err.println('4');
		ResultSet resultSet = statement.executeQuery("Select * from student");
		System.err.println('5');
		
		while(resultSet.next()) {
			int sid = resultSet.getInt(1);
			String name = resultSet.getString(2);
			int age = resultSet.getInt(3);
			
			System.out.println("sid : " + sid );
			System.err.println("name : " + name );
			System.out.println("age : " + age);
//		}
	}
}*/
