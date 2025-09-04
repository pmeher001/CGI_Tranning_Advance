package com;
class TicketBook implements Runnable {
	int avl=2;
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("ready to book the ticket "+name);
		synchronized (this) {
			if(avl>0) {
				System.out.println(name+" got the ticket");
				avl=avl-1;
			}else {
				System.out.println(name+" sorry no ticket");
			}
		}
		System.out.println("task done by "+name);
	}
}
public class BookingApp {
	public static void main(String[] args) {
	TicketBook tb1 = new TicketBook();		// avl=2
	//TicketBook tb2 = new TicketBook();		// avl=2
	//TicketBook tb3 = new TicketBook();		// avl=2
	
	Thread t1 = new Thread(tb1,"Ravi");
	Thread t2 = new Thread(tb1,"Raj");
	Thread t3 = new Thread(tb1,"Ajay");

	t1.start();
	t2.start();
	t3.start();
	}

}