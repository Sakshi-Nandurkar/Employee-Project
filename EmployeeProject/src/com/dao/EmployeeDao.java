package com.dao;

import com.entity.Employee;

public class EmployeeDao {

	/********************** Show all employee ***************************/
	public Employee[] EmployeeDetails() {

		Employee e1 = new Employee(5, "Amit Sharma", "Software Engineer", 80000);
		Employee e2 = new Employee(1, "Priya Patel", "Tester", 75000);
		Employee e3 = new Employee(3, "Rajesh Kumar", "Software Engineer", 72000);
		Employee e4 = new Employee(10, "Sneha Reddy", "HR", 70000);
		Employee e5 = new Employee(6, "Vikram Singh", "Product Designer", 68000);
		Employee e6 = new Employee(4, "Anjali Mehta", "Tester", 79000);
		Employee e7 = new Employee(7, "Ravi Desai", "Software Engineer", 65000);
		Employee e8 = new Employee(8, "Neha Gupta", "Tester", 69000);
		Employee e9 = new Employee(9, "Suresh Nair", "Operations Manager", 85000);
		Employee e10 = new Employee(2, "Deepika Menon", "CEO", 90000);

		Employee [] emp = new Employee[10];
		
		emp[0] = e1;
		emp[1] = e2;
		emp[2] = e3;
		emp[3] = e4;
		emp[4] = e5;
		emp[5] = e6;
		emp[6] = e7;
		emp[7] = e8;
		emp[8] = e9;
		emp[9] = e10;

		return emp;
	}

}
	
	
	
	

