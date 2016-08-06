package com.baiju.springcore.inheritance;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class MainCarClass {
	//example #1. inheritance example
	public static void inheritanceExample() {
      ApplicationContext context = new ClassPathXmlApplicationContext("inheritance-injection.xml");
//      Car car = context.getBean("swiftCar", Car.class);
      Car car = context.getBean("altoCar", Car.class);
      
      System.out.println("Car.id: "+car.getId());
         
	}
	
	public static void main(String[] args) {
		inheritanceExample();
		
	}
}
