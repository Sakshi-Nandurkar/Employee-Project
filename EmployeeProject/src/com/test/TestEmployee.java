package com.test;

import com.controller.EmployeeController;

public class TestEmployee {

	public static void main(String[] args) {
		//		EmployeeDao obj = new EmployeeDao();
		EmployeeController e1 = new EmployeeController();

		//		
		//		Employee eemp = obj.showEmployeeById(5);
		//		System.out.println(eemp);
		//		System.out.println();
		//
		//		Employee[] eemp1 = obj.showAllEmployee();
		//		for(Employee n : eemp1 ) {
		System.out.println("************* by id  ***************");
		//			System.out.println(n);
		//		}

		
		System.out.println("************* all employee  ***************");
		e1.showAllEmployee();
		System.out.println();
		e1.showEmployeeById(5);
		System.out.println();
		System.out.println("************* by role  ***************");
		e1.showEmployeeByRole("Product Designer");
		System.out.println();
		System.out.println("************* Min Salary  ***************");
		e1.minimumSalaried();
		System.out.println();
		System.out.println("************* Max Salary  ***************");
		e1.maximumSalaried();
		System.out.println();
		System.out.println("************* Ascending  ***************");
		e1.ascending();
		System.out.println();
		System.out.println("************* Descending  ***************");
		e1.descending();
	}

}
