package runtimepolymorphism;

//public class B extends A {

public class B implements A {
	public void dis1() {
		System.out.println("A class method override by B class");
	}
	public void dis2() {
		System.out.println("B class method");
	}
}