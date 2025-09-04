package com;

public class RuntimeError {

	public static void main(String[] args) {
			System.out.println("Hi");
			int a=10;
			int b=1;
		try {
	    int result = a/b;
		System.out.println("Result is "+result);
		int abc[]= {10,20,30,40,50};
			int result1 = abc[5];
		System.out.println("Result is "+result1);
		}catch(Exception e) {
			//System.out.println("I Take Care!");
			//System.out.println(e.getMessage());	// short message 
			//System.out.println(e.toString());	// name of exception + message 
			System.out.println(e);
			//e.printStackTrace();
		}
		System.out.println("bye...");
		System.out.println("bye...");
		System.out.println("bye...");
	}

}