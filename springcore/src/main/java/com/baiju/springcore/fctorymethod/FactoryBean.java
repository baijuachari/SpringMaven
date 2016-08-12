package com.baiju.springcore.fctorymethod;

public class FactoryBean {
	
	private FactoryBean() {
		System.out.println("FactoryMethod() private constructor called....");
	}
	
	public static FactoryBean getInstance() {
		System.out.println("getInstance() called....");
		return new FactoryBean();
	}
}
