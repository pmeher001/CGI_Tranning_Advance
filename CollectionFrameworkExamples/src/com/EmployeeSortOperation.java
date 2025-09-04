package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bean.Employee;

public class EmployeeSortOperation {

	public static void main(String[] args) {
	List<Employee> listOfEmployees = new ArrayList<Employee>();
	listOfEmployees.add(new Employee(2, "Ajay", 25000));
	listOfEmployees.add(new Employee(1, "Vijay", 28000));
	listOfEmployees.add(new Employee(3, "Mahesh", 22000));
	System.out.println("Employee details before sort");
	for(Employee emp:listOfEmployees) {
		System.out.println(emp);
	}
	System.out.println("-------------");
	Collections.sort(listOfEmployees);
	System.out.println("Employee details after sort");
	for(Employee emp:listOfEmployees) {
		System.out.println(emp);
	}
	}

}