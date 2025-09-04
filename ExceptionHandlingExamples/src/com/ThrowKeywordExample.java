package com;

import java.util.Scanner;

import com.exception.VoteException;

public class ThrowKeywordExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		try {
		if(age>=21) {
			System.out.println("You can vote!");
		}else {
			//System.out.println("You can't vote!");
			//throw new Exception();		// generic exception 
			//throw new Exception("Age must be >= 21");	// generic exception with custom message 
			//throw new VoteException();		// user defined exception no message 
			throw new VoteException("age must be >=21");	// user defined exception with custom message 
			
		}
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}