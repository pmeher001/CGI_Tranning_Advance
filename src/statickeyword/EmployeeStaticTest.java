package statickeyword;
class Employee {			// static memory : only one copy 
	int id;					// mgrId-->0, 200, 300 , 500, 600 
	static int mgrId;
	void display() {
		System.out.println("id is "+id);
		System.out.println("mgrId is "+mgrId);
	}
}
public class EmployeeStaticTest {

	public static void main(String[] args) {
	Employee emp1 = new Employee();		// heap memory 	id --->0, 100
	Employee emp2 = new Employee();		// heap memory id --->0, 400 
	
		emp1.id=100;
		emp1.mgrId=200;
		Employee.mgrId=300;
	
		emp2.id=400;
		emp2.mgrId=500;
		Employee.mgrId=600;
	emp1.display();			// id = 100, mgrId = 600 
	emp2.display();			// id = 400, mgrId = 600 
	}

}