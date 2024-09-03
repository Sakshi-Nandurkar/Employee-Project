package com.entity;

public class Employee {

	private int id;
	private String name;
	private String role;
	private int salary;
	
	
	public Employee() {
		super();
	}

	public Employee(int empid, String name, String role, int salary) {
		super();
		this.id = empid;
		this.name = name;
		this.role = role;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + id + ", name=" + name + ", role=" + role + ", salary=" + salary + "]";
	}
	
	
	
}
