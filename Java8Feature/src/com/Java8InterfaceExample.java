package com;

public class Java8InterfaceExample {
	public static void main(String[] args) {
		Test1 tt1 = new Test1();
		tt1.dis1();
		tt1.dis2();
		tt1.dis3();
		//tt1.dis4();
		//tt1.dis5();
		Java8Feature.dis4();		// static method we need to call using interface name 
		Java8Feature.dis5();
	}
}
