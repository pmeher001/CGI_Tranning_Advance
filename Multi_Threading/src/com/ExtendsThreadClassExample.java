package com;

class MyThread1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("i "+i);
		}
	}
}
class MyThread2 extends Thread{
	@Override
	public void run() {
		for(int j=0;j<10;j++) {
			System.out.println("j "+j);
		}
	}
}
public class ExtendsThreadClassExample {

	public static void main(String[] args) {
		Thread obj1 = new MyThread1();
		Thread obj2 = new MyThread2();	// object ready of thread class 
		obj1.start();
		obj2.start();		// ready to run 
			// it call run method of thread class. 
	}

}