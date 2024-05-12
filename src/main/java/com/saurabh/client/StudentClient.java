package com.saurabh.client;

import java.util.ArrayList;

import com.saurabh.controller.StudentController;
import com.saurabh.pojo.Student;

public class StudentClient {

	public static void main(String[] args) throws Exception {
		ArrayList<Student> arrayList = StudentController.fetchControllerInfo();
		for(Student index : arrayList) {
			System.out.println(index.getId());
			System.out.println(index.getName());
			System.out.println(index.getAge());
		}
	}
}
