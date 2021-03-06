package com.baiju.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.baiju.springcore.inheritance.Car;

public class MainLifeCycle {

	public static void lifecycleExample() {
		//ApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
		System.out.println("Main..context is created...");
		HelloBean hello = context.getBean("hello", HelloBean.class);
		System.out.println("Main..HelloBean is created...");
		System.out.println("Main..HelloBean.message: "+hello.getMessage());   
//		((AbstractApplicationContext) context).close();
		
		//context.registerShutdownHook();
		
		System.out.println("Main..close is called... ");   
	}
	
	public static void main(String[] args) {
		lifecycleExample();		
	}
}
