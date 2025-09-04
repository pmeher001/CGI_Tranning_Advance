package com;

public class TryWithFinallyExample {

	public static void main(String[] args) {
		System.out.println("Hello");
		try {
			int result = 100/0;
			System.out.println("No Exception "+result);
		}finally {
			System.out.println("finally block");
		}
		System.out.println("Normal statement");

	}

}