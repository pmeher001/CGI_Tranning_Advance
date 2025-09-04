package com;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeStreamAPIOperation {

	public static void main(String[] args) {
	List<Employee> listOfEmp = Arrays.asList(
			new Employee(100, "Ravi", 45000, "IT", "Bangalore"),
			new Employee(101, "Rajesh", 42000, "Non-IT", "Delhi"),
			new Employee(102, "Ram", 41000, "Marketing", "Bangalore"),
			new Employee(103, "Ajay", 49000, "HR", "Bangalore"),
			new Employee(104, "Vijay", 44000, "Non-IT", "Delhi"),
			new Employee(105, "Lokesh", 48000, "Marketing", "Bangalore"),
			new Employee(106, "Mahesh", 42000, "Non-IT", "Mumbai"),
			new Employee(107, "Balaji", 43000, "IT", "Delhi"),
			new Employee(108, "John", 49000, "Marketing", "Bangalore"),
			new Employee(100, "Steven", 41000, "HR", "Mumbai")
			);
	// display all data one by one using stream api 
	//listOfEmp.forEach(e->System.out.println(e));
	
	// display only those employee details salary must be > 45000
	//listOfEmp.stream().filter(e->e.getSalary()>45000).forEach(e->System.out.println(e));
	
	// check nubmer of employee belong to Non-IT department 
//	long count = listOfEmp.stream().filter(e->e.getDepartment().equals("Non-IT")).count();
//	System.out.println("number of employee belong to Non-IT department "+count);
	
	// make group using city or department
	Set<String> groupNames = 
	listOfEmp.stream().collect(Collectors.groupingBy(e->e.getDepartment())).keySet();
	
	System.out.println(groupNames);
	System.out.println("Number of departments is "+groupNames.size());
	// make group and do operation on salary 
	
	Map<String, Long> groupWithCount = 
	listOfEmp.stream().collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.counting()));
	System.out.println(groupWithCount);
	
	Map<String, Double> groupWithSum = 
	listOfEmp.stream().collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.summingDouble(e->e.getSalary())));
	System.out.println(groupWithSum);
			
	}

}