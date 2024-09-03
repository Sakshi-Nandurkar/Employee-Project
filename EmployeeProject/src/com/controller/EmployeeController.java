package com.controller;

//import java.util.Iterator;

import com.dao.EmployeeDao;
import com.entity.Employee;

public class EmployeeController {
	EmployeeDao dao;
	
	public void showAllEmployee() {
		dao = new EmployeeDao();
		
		Employee[] db = dao.EmployeeDetails();
		
		for (int i = 0; i < db.length; i++) {
			System.out.println(db[i]);
		}	
	}
	
	
	
	
	
	public void showEmployeeById(int id) {
		dao = new EmployeeDao();
		
		Employee[] db = dao.EmployeeDetails();
		for (Employee employee : db) {
			if(employee.getId() == id) {
				System.out.println(employee);
			}
		}
	}
	
	
	
	
	
	public void showEmployeeByRole(String role) {
		dao = new EmployeeDao();
		
		Employee[] db = dao.EmployeeDetails();
		for (Employee employee : db) {
			if(employee.getRole() == role) {
				System.out.println(employee);
			}
		}
	}
	
	
	
	
	
	
	public void minimumSalaried() {
		dao = new EmployeeDao();
		
		Employee[] db = dao.EmployeeDetails();
		int min = db[0].getSalary(); 
		int index = 0;
		for (int i = 0; i < db.length; i++) {
			if(db[i].getSalary() < min) {
				index = i;
				min = db[i].getSalary();
			}
		}
		System.out.println(db[index]);
	}
	
	
	
	
	public void maximumSalaried() {
		dao = new EmployeeDao();
		
		Employee[] db = dao.EmployeeDetails();
		int max = db[0].getSalary(); 
		int index = 0;
		for (int i = 0; i < db.length; i++) {
			if(db[i].getSalary() > max) {
				index = i;
				max= db[i].getSalary();
			}
		}
		System.out.println(db[index]);
	}
	
	
	
	
	
	
	public void ascending() {
		dao = new EmployeeDao();
		Employee[] db = dao.EmployeeDetails();
		
		for (int i = 0; i < db.length; i++) {
			for (int j = i+1; j < db.length; j++) {
				if(db[i].getId() > db[j].getId()) {
					Employee temp = db[i];
					db[i] = db[j];
					db[j] = temp;
				}
			}
		}		
		for (Employee employee : db) {
			System.out.println(employee);
		}
	}
	
	
	public void descending() {
		dao = new EmployeeDao();
		Employee[] db = dao.EmployeeDetails();
		
		for (int i = 0; i < db.length; i++) {
			for (int j = i+1; j < db.length; j++) {
				if(db[i].getId() < db[j].getId()) {
					Employee temp = db[i];
					db[i] = db[j];
					db[j] = temp;
				}
			}
		}		
		for (Employee employee : db) {
			System.out.println(employee);
		}
	}
	
	
}
