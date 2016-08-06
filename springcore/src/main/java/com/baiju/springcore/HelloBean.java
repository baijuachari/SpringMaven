package com.baiju.springcore;


public class HelloBean implements Hello{

	private String message;

	public HelloBean() {
		System.out.println("default constructor...");
    }
    
	public HelloBean(String message) {
		System.out.println("parameterized constructor...");
		this.message = message;
    }
	
	public void setMessage(String message) {
		System.out.println("setter message...");
    	this.message = message;
    }
    
    public String getMessage() {
    	return message;
    }

	public String sayHello() {
		// TODO Auto-generated method stub
		System.out.println("sayHello() method....");
		return this.message;
	}
}
