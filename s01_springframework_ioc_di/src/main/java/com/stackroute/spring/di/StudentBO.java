package com.stackroute.spring.di;

import java.util.List;
import java.util.Map;

public class StudentBO {
	
	Map<Student,List<Course>> studentCoursesMap;

	public StudentBO(Map<Student, List<Course>> studentCoursesMap) {
		
		this.studentCoursesMap = studentCoursesMap;
	}

	@Override
	public String toString() {
		return "StudentBO [studentCoursesMap=" + studentCoursesMap + "]";
	}

	
	

}
