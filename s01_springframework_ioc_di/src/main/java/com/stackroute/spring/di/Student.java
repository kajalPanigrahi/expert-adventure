package com.stackroute.spring.di;

import java.util.List;

public class Student {
	
	private int id;
	private String name;
	private String emial;
	private int contactNo;
	
	Course course;	
	List<Course> coursesList;
	
	/*
	 * public Student(Course course) { this.course = course; }
	 */

	public Student(int id, String name,  String emial, int contactNo, List<Course> coursesList) {
		System.out.println("Student()..");
		
		this.id = id;
		this.name = name;
		this.emial = emial;
		this.contactNo = contactNo;
		this.coursesList = coursesList;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", emial=" + emial + ", contactNo=" + contactNo
				+ ", coursesList=" + coursesList + "]";
	}
	
	
	
	
	
	
	
	

}
