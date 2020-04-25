package com.stackroute.spring.di;

public class Course {
	
	private int id;
	private String courseName;
	private int since;
	
	
	
	  public Course(int id, String courseName, int since) {
		 System.out.println("Course()..."); 
		 this.id = id;
	  this.courseName = courseName; this.since = since; }
	 
	
	
	

	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getCourseName() {
		return courseName;
	}




	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}




	public int getSince() {
		return since;
	}




	public void setSince(int since) {
		this.since = since;
	}




	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", since=" + since + "]";
	}
	
	
	
	
	
	

}
