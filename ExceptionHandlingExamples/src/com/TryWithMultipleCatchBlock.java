package com;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {
		System.out.println("Hi");
		try {
			int a = 100/Integer.parseInt(args[0]);
			System.out.println("No exceptioin and value is "+a);
		}catch (ArithmeticException e) {
			System.out.println("divided by zero "+e.toString());
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array index "+e.toString());
		}catch(Exception e) {
			System.out.println("Generic exception "+e.toString());
		}

		System.out.println("done!");
	}

}