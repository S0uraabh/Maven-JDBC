package com.saurabh.controller;

import java.util.ArrayList;

import com.saurabh.pojo.Student;
import com.saurabh.service.StudentService;

public class StudentController {
	public static ArrayList<Student> fetchControllerInfo() throws Exception{
		
		ArrayList<Student> controllerList = StudentService.fetchServiceInfo();
		
		return controllerList;
	}
}
