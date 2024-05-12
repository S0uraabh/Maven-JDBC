package com.saurabh.service;

import java.util.ArrayList;

import com.saurabh.dao.StudentDao;
import com.saurabh.pojo.Student;

public class StudentService {
	public static ArrayList<Student> fetchServiceInfo() throws Exception{
		ArrayList<Student> arrayList = StudentDao.fetchDaoInfo();
		
		// condition = print the name which starts from "B" .
		
/*		ArrayList<Student> filterList = new ArrayList<>();
		for(Student index : arrayList) {
			if(index.getName().startsWith("B")) {
				filterList.add(index);
			}
		}
		
		return filterList;
*/
		
		return arrayList; 
	}
}
