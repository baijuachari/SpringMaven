package com.baiju.springcore.fctorymethod;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baiju.springcore.inheritance.Car;

public class MainClassFactory {

	//example using factory method
	public static void factoryMethodExample() {
		ApplicationContext context = new ClassPathXmlApplicationContext("factory-method.xml");
		FactoryBean fbean = context.getBean("factoryBean", FactoryBean.class);
         
	}
	
	//get calandar
	public static void getCalanderObj() {
		ApplicationContext context = new ClassPathXmlApplicationContext("factory-method.xml");
		Calendar cabean = context.getBean("calendar", java.util.Calendar.class);
		System.out.println("Data: "+cabean.getFirstDayOfWeek());
         
	}
	
	public static void main(String[] args) {
		//factoryMethodExample();	
		getCalanderObj();
	}
}
