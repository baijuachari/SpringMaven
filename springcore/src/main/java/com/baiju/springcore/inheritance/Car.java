package com.baiju.springcore.inheritance;

public class Car {
	private String id;
	private String name;
	private String engineType;
	private String engineModel;
	private String classType;
	
	public Car() {
		System.out.println("Car..default constructor....");
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public String getEngineModel() {
		return engineModel;
	}
	public void setEngineModel(String engineModel) {
		this.engineModel = engineModel;
	}
	public String getClassType() {
		return classType;
	}
	public void setClassType(String classType) {
		this.classType = classType;
	}
	
	
}
