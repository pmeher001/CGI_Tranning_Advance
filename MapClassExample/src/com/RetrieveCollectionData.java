package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class RetrieveCollectionData {

	public static void main(String[] args) {
	// Set family 
		Set<Integer> ss = new HashSet<Integer>();
		ss.add(10);ss.add(50);ss.add(30);ss.add(80);ss.add(70);ss.add(20);
		System.out.println(ss);   // string format 
		System.out.println("retreive value using for each loop");
		for(int n:ss) {
			System.out.println(n);
		}
		System.out.println("using Iterator");
		  Iterator<Integer> ii = ss.iterator();
		  while(ii.hasNext()) {
			  int n = ii.next();
			  System.out.println(n);
		  }
		// List family 
		  List<String> names = new ArrayList<String>();
		  names.add("Ravi");names.add("Ramesh");names.add("Raj");names.add("Rakesh");
		  System.out.println(names);
		  ListIterator<String> li = names.listIterator();
		  System.out.println("names in forward direction");
		  while(li.hasNext()) {
			  String name = li.next();
			  System.out.println(name);
		  }
		  System.out.println("names in backwad direction");
		  while(li.hasPrevious()) {
			  String name = li.previous();
			  System.out.println(name);
		  }
		  // Map family 
		  Map<Integer, String> mm = new HashMap<Integer, String>();
		  mm.put(2, "Ravi");
		  mm.put(1, "Ajay");
		  System.out.println("retrieve Map details");
		  
		  Set<Integer> ss1= mm.keySet();		// extract key from map to store in set 
		  Iterator<Integer> ii1 = ss1.iterator();
		  while(ii1.hasNext()) {
			  int key = ii1.next();
			  System.out.println("Key is "+key+" Value is "+mm.get(key));
		  }
	}

}