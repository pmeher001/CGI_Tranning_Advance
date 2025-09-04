package com.info;

public class TicketWindow {

	int ticket=0;
	boolean available=false;
	public synchronized void issueTicket(int ticket) throws Exception {
			while(available) {
					wait();
			}
			this.ticket=ticket;
			System.out.println("Clerk issue the ticket "+this.ticket);
			this.available=true;
			notify();
	}
	
	public synchronized void collectTicket() throws Exception{
		while(!available) {
			wait();
		}
		System.out.println("Passenger collect the ticket "+ticket+" after paid the amount");
		this.available=false;
		notify();
	}
}