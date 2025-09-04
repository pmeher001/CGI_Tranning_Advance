package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
class A {}
class B {}
public class SetClassesExamples {

	public static void main(String[] args) {
	
		// 1st Example 
		// Unorder 
//		HashSet hs = new HashSet();
//		int a=10;
//		Integer i = new Integer(a);
//		Integer j = 20;		//auto-boxing : converting primitive to object. 
//		
//		hs.add(i);
//		hs.add(20);			// auto-boxing : converting primitive to object. 
//		hs.add(j);
//		hs.add(20.10);
//		hs.add(true);
//		hs.add("Ravi");
//		hs.add(new A());
//		hs.add(new B());
//		System.out.println(hs);
		
//		// 2nd Example 
//		HashSet hs = new HashSet();
//		System.out.println("Size "+hs.size());
//		System.out.println("is Empty "+hs.isEmpty());
//		hs.add(10);
//		hs.add(50);
//		hs.add(20);
//		hs.add(80);
//		hs.add(90);
//		hs.add(10);
//		System.out.println(hs);
//		System.out.println("Size "+hs.size());
//		System.out.println("is Empty "+hs.isEmpty());
//		System.out.println("Search operation "+hs.contains(10));
//		System.out.println("Search operation "+hs.contains(100));
//		System.out.println("Remove operation "+hs.remove(10));
//		System.out.println("Remove operation "+hs.remove(100));
//		System.out.println(hs);
//		hs.clear();
//		System.out.println(hs);
//		System.out.println("Size "+hs.size());
//		System.out.println("is Empty "+hs.isEmpty());
		
		// 3rd Example 
//				LinkedHashSet hs = new LinkedHashSet();
//				System.out.println("Size "+hs.size());
//				System.out.println("is Empty "+hs.isEmpty());
//				hs.add(10);
//				hs.add(50);
//				hs.add(20);
//				hs.add(80);
//				hs.add(90);
//				hs.add(10);
//				System.out.println(hs);
//				System.out.println("Size "+hs.size());
//				System.out.println("is Empty "+hs.isEmpty());
//				System.out.println("Search operation "+hs.contains(10));
//				System.out.println("Search operation "+hs.contains(100));
//				System.out.println("Remove operation "+hs.remove(10));
//				System.out.println("Remove operation "+hs.remove(100));
//				System.out.println(hs);
//				hs.clear();
//				System.out.println(hs);
//				System.out.println("Size "+hs.size());
//				System.out.println("is Empty "+hs.isEmpty());
		
		// 4th Example 
		TreeSet ts = new TreeSet();
		ts.add(4);
		ts.add(1);
		ts.add(2);
		ts.add(9);
		ts.add(6);
		//ts.add("A");
		System.out.println(ts);
		System.out.println("sub set "+ts.subSet(2, 6));
	}

}