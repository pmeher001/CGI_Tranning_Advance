package com;


public class Employee {
private int id;
private String name;
private float salary;
private String department;
private String location;
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
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, float salary, String department, String location) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.department = department;
	this.location = location;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + ", location="
			+ location + "]";
}

}