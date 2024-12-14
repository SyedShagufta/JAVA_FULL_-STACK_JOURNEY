package com.learning.bean;

public class Employee {
	
	private int id;
	private String empName;
	private double salary;
	
	
	public Employee(int id, double salary, String empName) {
		super();
		this.id = id;
		this.empName = empName;
		this.salary = salary;
	}
	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
