package com.info;

public class Passenger extends Thread{
TicketWindow tw;

	public Passenger(TicketWindow tw) {
		super();
		this.tw = tw;
	}
	
	@Override
	public void run() {
		try {
			for(int i=0;i<8;i++) {
				tw.collectTicket();
				//Thread.sleep(10000);
			}	
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}