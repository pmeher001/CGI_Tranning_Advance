package bean;

public class Employee implements Comparable<Employee>{
private int id;
private String name;
private float salary;

@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
	//System.out.println("called compare method");
	// if both are equal return 0, if this.id is > oid +ve or -ve 
	//System.out.println(this+" "+o);
	//System.out.println(this.id+" "+o.id);
		//return this.id-o.id;		// Asc order by Id
	//return o.id-this.id;			// Desc order by Id 
	//return this.name.compareTo(o.name);   // Asc order by name here compareTo method of string compare uni code 
	//return o.name.compareTo(this.name);  // Desc order by name
	//return (int)(this.salary-o.salary);		// Asc order by salary
	return (int)(o.salary-this.salary);		// Asc order by salary
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
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, float salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}

}