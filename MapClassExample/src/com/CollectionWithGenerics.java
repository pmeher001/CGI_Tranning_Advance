package com;

import java.util.ArrayList;
import java.util.List;

public class CollectionWithGenerics {

	public static void main(String[] args) {
	// Collection without Generics 
//	List ll =new ArrayList();
//	ll.add(10);
//	ll.add(10.20);
//	ll.add("Ravi");
//	ll.add(30);
//	System.out.println(ll);
//	Object obj=ll.get(1);
//	if(obj instanceof Integer) {
//	Integer i = (Integer)obj;	// type casting 
//	int n  = i.intValue();		// primitive value 
//	System.out.println(n);
//	}
//	if(obj instanceof Double) {
//		Double dd = (Double)obj;
//		double d = dd.doubleValue();
//		System.out.println(d);
//	}
	List<Integer> ll = new ArrayList<Integer>();
	ll.add(10);			// auto-boxing : converting primitive to object 
	ll.add(20);
	ll.add(30);
	System.out.println(ll);
	
	int n = ll.get(0);	// auto-unboxing : converting object to primitive 
	System.out.println(n);
	
	List<Object> ll1 = new ArrayList<Object>();
	ll1.add(10);
	ll1.add(10.20);
	ll1.add("Ravi");
	
	}

}