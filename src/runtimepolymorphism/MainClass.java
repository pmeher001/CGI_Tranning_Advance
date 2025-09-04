package runtimepolymorphism;

public class MainClass {

	public static void main(String[] args) {
//	A obj1 = new A();// super 
//	obj1.dis1();
//	//obj1.dis2();
//	
//	B obj2 = new B();	// sub 
//	obj2.dis1();
//	obj2.dis2();
//	
//	A obj3 = new B();	// creating sub class object and reference of super class 
//	obj3.dis1();		// we can call only super class methods. 
//	//obj3.dis2();
//	
//	Object obj4 = new B();
//	
//	//B obj4 = new A();		// creating super class object and sub class reference not possible 
		
		//A obj1 = new A();// super 
		//obj1.dis1();
		//obj1.dis2();
		System.out.println("--------------------------------------------------------");
		
		B obj2 = new B();	// sub 
		obj2.dis1();
		obj2.dis2();
		
		A obj3 = new B();	// creating sub class object and reference of super class. 
								// it can be abstract class or interface. 
		obj3.dis1();		// we can call only super class methods. 
		//obj3.dis2();
		
		Object obj4 = new B();
		
		//B obj4 = new A();		// creating super class object and sub class reference not possible 
	}

}