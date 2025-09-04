package com;

public class StringClassesMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=" ";
		String msg = "Welcome\n to Java Training";
		String str2="Hello ";
		System.out.println(str1.length());
		System.out.println(str1.isBlank());	// java 11 methods 
		System.out.println(str1.isEmpty());
		//msg.lin
		msg.lines().forEach(v->System.out.println(v));
		System.out.println(str2.repeat(5));
	}

}