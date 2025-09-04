package com;

public class DefaultThreadExample {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("My Default thread");
		t.setPriority(1);	// min 1, max 10 
		String name = t.getName();
		int  i = t.getPriority();
		ThreadGroup gt = t.getThreadGroup();
		System.out.println("name of thread "+name);
		System.out.println("priority of thread "+i);
		System.out.println("group of the thread "+gt.getName());
//		System.out.println(t);
//		t.setPriority(Thread.MAX_PRIORITY);
//		System.out.println(t);
//		ThreadGroup tg = t.getThreadGroup();
//		System.out.println(tg);
//		System.out.println(tg.getName());
//		String name = t.getName();
//		System.out.println(name);
	}

}