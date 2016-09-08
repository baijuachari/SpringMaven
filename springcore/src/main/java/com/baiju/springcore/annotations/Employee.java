package com.baiju.springcore.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Employee {
	private long empId;
	private String name;
	private byte age;
	private double salary;
	private Address address;
	
	private Employee() {
		System.out.println("Employee...default..constructor...");
	}
	
	public long getEmpId() {
		return empId;
	}
	@Required
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte getAge() {
		return age;
	}
	//@Required
	//if we use <context:annotation-config></context:annotation-config> in the XML,
	// the @Required will check and make sure the bean is set.
	// if <context:annotation-config></context:annotation-config> not there, then 
	// it doesnt give exception
	public void setAge(byte age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	@Autowired
	@Qualifier("address1")
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
