package Polymorphism;

class Operation {
	void add() {
		System.out.println(10+20);
	}
	void add(int x) {
		System.out.println(x+20);
	}
	void add(int x, int y) {
		System.out.println(x+y);
	}
	void add(String s1, String s2) {
		System.out.println(s1+s2);
	}
}

public class MethodOverloadingExample {

	public static void main(String[] args) {
	Operation op = new Operation();
	op.add(10);
	op.add("10", "20");
	op.add(10,20);
	op.add();
	}

}