package com.info;

public class Clerk extends Thread{

	TicketWindow tw;
	int numberOfTicket[]= {1,2,3,4,5,6,7,8};
	
	public Clerk(TicketWindow tw) {
		super();
		this.tw = tw;
	}
	@Override
	public void run() {
		try {
			for(int i=0;i<8;i++) {
				tw.issueTicket(numberOfTicket[i]);
				//Thread.sleep(1000);
			}	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}