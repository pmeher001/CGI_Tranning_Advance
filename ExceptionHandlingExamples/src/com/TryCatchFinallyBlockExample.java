package com;

public class TryCatchFinallyBlockExample {

	public static void main(String[] args) {
	System.out.println("Hello");
	try {
		int result = 100/1;
		System.out.println("No Exception "+result);
	}catch (Exception e) {
			System.out.println("Catch block");
	}finally {
		System.out.println("finally block");
	}
	System.out.println("Normal statement");
	}

}