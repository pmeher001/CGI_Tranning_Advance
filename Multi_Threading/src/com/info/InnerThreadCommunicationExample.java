package com.info;

public class InnerThreadCommunicationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketWindow tw = new TicketWindow();
		
		new Passenger(tw).start();
		new Clerk(tw).start();
	}

}