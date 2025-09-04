package com.exception;

public class VoteException extends Exception{
	public VoteException() {
		super();	// by default present which call super class empty constructor. 
	}
	public VoteException(String msg) {
		super(msg);	// calling super class parameter constructor to set the string message 
	}	
}