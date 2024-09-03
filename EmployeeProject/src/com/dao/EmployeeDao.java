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
	
	
	
	

	
	/********************** Show emp by ID ***************************/
//	public Employee showEmployeeById(int id) {
//
//		
//		int index= id-1;
//		return emp[index];
//	}




	/********************** Show max salary ***************************/
//	public void empMaxSalary() {
//
//		emp[0] = e1;
//		emp[1] = e2;
//		emp[2] = e3;
//		emp[3] = e4;
//		emp[4] = e5;
//		emp[5] = e6;
//		emp[6] = e7;
//		emp[7] = e8;
//		emp[8] = e9;
//		emp[9] = e10;
//
//		Employee max = emp[0]; 
//
//		for (Employee employee : emp) {
//			if (employee.getSalary() > max.getSalary()) {
//				max = employee; 
//			}
//		}
//		System.out.println("maximum salary: " + max.getSalary());	
//
//
//		//		//another way
//		//			for(int i=0; i<emp.length; i++) {
//		//				if(emp[0].getSalary() < emp[i].getSalary()) {
//		//					max=emp[i];
//		//				}
//		//			}
//		//			System.out.println(max.getSalary());
//		//			System.out.println(max);
//		//		
//	}




//	/********************** Show min salary ***************************/
//	public void empMinSalary() {
//
//		emp[0] = e1;
//		emp[1] = e2;
//		emp[2] = e3;
//		emp[3] = e4;
//		emp[4] = e5;
//		emp[5] = e6;
//		emp[6] = e7;
//		emp[7] = e8;
//		emp[8] = e9;
//		emp[9] = e10;
//
//		Employee min = emp[0]; 
//
//		for (Employee e : emp) {
//			if (e.getSalary() < min.getSalary()) {
//				min = e; 
//			}
//		}
//		System.out.println("minimum salary: " + min.getSalary());	
//	}
//
//
//
//
//
//	/********************** Show emp by Role ***************************/
//	public void showAllEmployeeByRole( String role) {
//
//		emp[0] = e1;
//		emp[1] = e2;
//		emp[2] = e3;
//		emp[3] = e4;
//		emp[4] = e5;
//		emp[5] = e6;
//		emp[6] = e7;
//		emp[7] = e8;
//		emp[8] = e9;
//		emp[9] = e10;
//
//		for(Employee employee :emp) {
//			if(employee.getRole().equalsIgnoreCase(role)) {
//				System.out.println(employee);
//			}
//		}
//	}
//
//
//
//	public void sortEmployeeAsc() {
//
//		emp[0] = e1;
//		emp[1] = e2;
//		emp[2] = e3;
//		emp[3] = e4;
//		emp[4] = e5;
//		emp[5] = e6;
//		emp[6] = e7;
//		emp[7] = e8;
//		emp[8] = e9;
//		emp[9] = e10;
//
//
//		int temp=0;
//		int i=0;
//		int j=1;
//		for (i= 0; i<emp.length; i++) {
//			for(j=1; j<emp.length-1; j++) {
//				int ei = emp[i].getId();
//				int ej = emp[j].getId();
//				if(ei > ej) {
//					temp = emp[i].getId();
//					ei=emp[j].getId();
//					ej=temp;
//
//				}	
//			}System.out.println(emp[i]);
//		}
//
//	}


