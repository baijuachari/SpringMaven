package com.baiju.springcore;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class MainClass {

	//example #1. This method is used to demonstrate injecting Address object to Employee object.
	public static void mainInjection() {
      ApplicationContext context = new ClassPathXmlApplicationContext("hello-injection.xml");
      Employee emp = context.getBean("employee", Employee.class);
      
      System.out.println("Emp.name: "+emp.getName());
      System.out.println("Emp.address.city: "+emp.getAddress().getCity());
	}
	
	//example #2. This uses student-colelction xml to demo how to use collections.
	public static void mainCollections() {
      ApplicationContext context = new ClassPathXmlApplicationContext("student-collections.xml");
      Student student = context.getBean("student", Student.class);
      
      System.out.println("Student.id:"+student.getId());
      System.out.println("Student.Name: "+student.getName());
      System.out.println("Student.Courses: "+student.getCourses());
      System.out.println("Student.MobileNos:"+student.getMobileNos());
      System.out.println("Student.Fee details:"+student.getFeeDetails());
      System.out.println("Student.Properties:"+student.getProperties());
	}

	//example #3. This uses student-colelction xml to demo 
	// colelction constuctor injection
	public static void studentCollectionsCtrInjection() {
      ApplicationContext context = new ClassPathXmlApplicationContext("student-collections-ctr-inj.xml");
      Student student = context.getBean("student", Student.class);
      
      System.out.println("Student.id:"+student.getId());
      System.out.println("Student.Name: "+student.getName());
      System.out.println("Student.Courses: "+student.getCourses());
      System.out.println("Student.MobileNos:"+student.getMobileNos());
      System.out.println("Student.Fee details:"+student.getFeeDetails());
      System.out.println("Student.Properties:"+student.getProperties());
	}
	
	//example #4. This uses autowire demo
	public static void employeeAddressAutowire() {
      ApplicationContext context = new ClassPathXmlApplicationContext("employee-address-autowire.xml");
      Employee emp = context.getBean("employee", Employee.class);
      
      System.out.println("Emp.name: "+emp.getName());
      if (emp.getAddress() != null) {
    	  System.out.println("Emp.address.city: "+emp.getAddress().getCity());  
      }      
	}
	
	//example #5. This uses autowire demo using annotation
	public static void employeeAddressAutowireAnnotation() {
      ApplicationContext context = new ClassPathXmlApplicationContext("employee-address-autowire-annotation.xml");
      EmployeeAnnotation emp = context.getBean("employeeannotation", EmployeeAnnotation.class);
      
      System.out.println("Emp.name: "+emp.getName());
      if (emp.getAddress() != null) {
    	  System.out.println("Emp.address.city: "+emp.getAddress().getCity());  
      }      
	}
	
	public static void main(String[] args) {
		//mainCollections();
		//studentCollectionsCtrInjection();
		//employeeAddressAutowire();
		employeeAddressAutowireAnnotation();
		
	}
}
