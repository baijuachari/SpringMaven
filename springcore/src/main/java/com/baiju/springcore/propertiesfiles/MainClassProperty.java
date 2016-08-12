package com.baiju.springcore.propertiesfiles;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baiju.springcore.lifecycle.HelloBean;

public class MainClassProperty {

	public static void propertyFileExample() {
		//ApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("properties-xmlfile.xml");
		System.out.println("Main..context is created...");
		//PropertyBean props = context.getBean("propertybean", PropertyBean.class);
		System.out.println("Main..Property bean is created...");
   
	}
	
	public static void main(String[] args) {
		propertyFileExample();	
		
	}

}
