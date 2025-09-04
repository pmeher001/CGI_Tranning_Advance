package com;

import java.util.ArrayList;
import java.util.List;

public class UnmodifiedCollectionMethods {

	public static void main(String[] args) {
	List<String> ll1 = new ArrayList<String>();
	ll1.add("Ravi");ll1.add("Ramesh");ll1.add("Rajesh");
	System.out.println(ll1);
	List<String> ll2 = ll1;	// copy reference ie deep copy;
	System.out.println(ll2);
	System.out.println(ll1);
	ll2.add("Ajay");
	System.out.println(ll2);
	System.out.println(ll1);
	List<String> ll3 = List.copyOf(ll1);	// shallow copy ie copies only values 
	System.out.println(ll3);
	ll2.add("Vikash");
	System.out.println(ll1);
	System.out.println(ll2);
	System.out.println(ll3);
	}

}