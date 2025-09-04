package com.exception;

public class CheckedExceptionExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("Hi");
		try {
		Thread.sleep(3000);
		}catch(Exception e) {}
		System.out.println("Hello");
	}

}