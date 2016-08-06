package com.baiju.springcore;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeAnnotation {
	private long empId;
	private String name;
	private byte age;
	private double salary;
	@Autowired
	private Address address;
	
	EmployeeAnnotation() {
		System.out.println("Employee Annotation...default..constructor...");
	}
	
	public long getEmpId() {
		return empId;
	}
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
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
