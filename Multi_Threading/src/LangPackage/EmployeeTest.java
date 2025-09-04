package LangPackage;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1st option 
		Employee emp1 = new Employee();
		emp1.setId(100);
		emp1.setName("Ravi");
			emp1.setSalary(12000);
		
//		System.out.println("id is "+emp1.getId());
//		System.out.println("name is "+emp1.getName());
//		System.out.println("salary is "+emp1.getSalary());
		
		// 2nd option 
		Employee emp2 = new Employee(101, "Raj", 14000);
			Employee emp3 = new Employee(102, "Vijay", 12000);
		Employee emp4 = emp1;
		
		System.out.println(emp2); // when we display any reference 
			// it internally call toString method of object class.
		System.out.println(emp1==emp2);
			System.out.println(emp1==emp4);
		System.out.println(emp1.equals(emp2));
			System.out.println(emp1.equals(emp4));
			System.out.println(emp1.equals(emp3));	// equal when both get same salary 
	}

}