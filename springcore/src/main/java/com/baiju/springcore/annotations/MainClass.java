package com.baiju.springcore.annotations;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class MainClass {
	
	//example #1. required annotation.
	public static void requiredAnnotation() {
      ApplicationContext context = new ClassPathXmlApplicationContext("employee-annotation.xml");
      Employee emp = context.getBean("employee", Employee.class);
      
      System.out.println("Emp.name: "+emp.getName());
      if (emp.getAddress() != null) {
    	  System.out.println("Emp.address.city: "+emp.getAddress().getCity());  
      }      
	}	
	
	//example #2. Autowired annotation.
	public static void autowiredAnnotation() {
      ApplicationContext context = new ClassPathXmlApplicationContext("employee-autowire-annotation.xml");
      Employee emp = context.getBean("employee", Employee.class);
      
      System.out.println("Emp.name: "+emp.getName());
      if (emp.getAddress() != null) {
    	  System.out.println("Emp.address.city: "+emp.getAddress().getCity());  
      }      
	}	
	public static void main(String[] args) {
		//requiredAnnotation();
		autowiredAnnotation();
	}
}

