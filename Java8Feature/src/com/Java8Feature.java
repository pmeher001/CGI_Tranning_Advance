package com;

public interface Java8Feature  {
	void dis1();		// by default abstract 
	default void dis2() {			// default implementation 
		System.out.println("Default implementation for dis2 method");
	}
	default void dis3() {			// default implementation 
		System.out.println("Default implementation for dis3 method");
	}
	static void dis4() {			// static implementation 
		System.out.println("Static implementation for dis4 method");
	}
	static void dis5() {			// static implementation 
		System.out.println("Static implementation for dis5 method");
	}
}

