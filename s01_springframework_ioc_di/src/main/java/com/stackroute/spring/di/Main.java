package com.stackroute.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		//instantiate Spring core container
		
		//BeanFacotry
		//ApplicationContext
		//WebApplicationContext ( request, session , application)
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		
		/*
		 * Course course1 = context.getBean("course1", Course.class);
		 * System.out.println(course1.hashCode());
		 * 
		 * Course course2 = context.getBean("course2", Course.class);
		 * System.out.println(course2.hashCode()); Course course3 =
		 * context.getBean("course3", Course.class); System.out.println(course3);
		 * 
		 * Course course1obj = context.getBean("course1", Course.class);
		 * System.out.println(course1obj.hashCode());
		 * 
		 * Student student1 = context.getBean("student1",Student.class);
		 * System.out.println(student1); Student student2 =
		 * context.getBean("student2",Student.class); System.out.println(student2);
		 * Student student3 = context.getBean("student3",Student.class);
		 * System.out.println(student3);
		 */
		
		/*
		 * StudentBO studentBO1 = context.getBean("studentBO1", StudentBO.class);
		 * System.out.println(studentBO1);
		 */
		
		MySQLDBConfig mySQLDBConfig = context.getBean("dbConfig", MySQLDBConfig.class);
		System.out.println(mySQLDBConfig);
		
		MySQLConnection mySQLConnection = context.getBean("dbCon1", MySQLConnection.class);
		System.out.println(mySQLConnection);
		
		
	}

}
