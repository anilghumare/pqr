package com.zensar.practice.spring_core_assignment_autowire_byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.practice.beans.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		  Employee employee = context.getBean("E1", Employee.class);
		  
		  
		  System.out.println(employee); 
	}
		  
}